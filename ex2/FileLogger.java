package ex2;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class FileLogger{
    private String name;

    public FileLogger(String name){
        this.name = name;
    }

    public void log(){
        try (// PrintStream mes = new PrintStream(new fileOutPutStream("lista.txt"));
        PrintStream mes = new PrintStream(name)) {
            System.setOut(mes);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}