package deibert.zach.awtrobotshell;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Scanner;

public class Main {
    public static final ICommand[] commands = new ICommand[] {
        new ExitCommand(),
        new PressCommand(),
        new ReleaseCommand()
    };
    
    public static void main(final String[] args) throws AWTException {
        /*
         * Unused keys:
         * 29 "Muhenkan"
         * 19 "Pause"
         *  3 "Cancel"
         */
        final Scanner in = new Scanner(System.in);
        final Robot robot = new Robot();
        System.out.print("$ ");
        System.out.flush();
        while ( in.hasNextLine() ) {
            final String cmd = in.nextLine();
            final String[] parts = cmd.split(" +");
            for ( final ICommand command : commands ) {
                if ( command.getName().equals(parts[0]) ) {
                    final String[] a = new String[parts.length - 1];
                    System.arraycopy(parts, 1, a, 0, a.length);
                    command.process(a, robot);
                }
            }
            System.out.print("$ ");
            System.out.flush();
        }
        in.close();
    }
}
