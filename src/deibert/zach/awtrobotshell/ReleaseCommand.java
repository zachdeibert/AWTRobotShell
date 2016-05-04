package deibert.zach.awtrobotshell;

import java.awt.Robot;
import java.awt.event.InputEvent;

public class ReleaseCommand implements ICommand {
    @Override
    public String getName() {
        return "release";
    }
    
    @Override
    public void process(final String[] args, final Robot robot) {
        if ( args[0].equals("key") ) {
            for ( int i = 1; i < args.length; i++ ) {
                robot.keyRelease(Integer.parseInt(args[i]));
            }
        } else if ( args[0].equals("mouse") ) {
            for ( int i = 1; i < args.length; i++ ) {
                robot.mouseRelease(InputEvent.getMaskForButton(Integer.parseInt(args[i])));
            }
        } else {
            System.err.println("Unknown device");
        }
    }
}
