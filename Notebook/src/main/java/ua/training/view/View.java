package ua.training.view;

import java.io.PrintStream;

public class View {
    private PrintStream stream;
    public View(PrintStream out) {
        stream = out;
    }
    public void printMessage(String message){
        stream.println(message);
    }
}
