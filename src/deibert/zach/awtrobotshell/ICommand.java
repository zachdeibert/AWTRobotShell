package deibert.zach.awtrobotshell;

import java.awt.Robot;

public interface ICommand {
    String getName();
    void process(String[] args, Robot robot);
}
