package deibert.zach.awtrobotshell;

import java.awt.Robot;

public class ExitCommand implements ICommand {
    @Override
    public String getName() {
        return "exit";
    }
    
    @Override
    public void process(final String[] args, final Robot robot) {
        System.exit(0);
    }
}
