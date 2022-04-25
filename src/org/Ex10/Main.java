package org.Ex10;
import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        File file = new File("files/text.txt");
        File file1 = new File("files/text1.txt");
        File file2 = new File("files/text2.txt");
        File file4 = new File("files/text4.txt");
        //item 1
//        JavaIO.fileReaderMethod(file);
        //item 2
//        String string = "Привет как дела?";
//        JavaIO.fileWriterMethod(Arrays.asList("Я", "изучаю", "Java"));
        //item 3
//        JavaIO.mergeFiles(file,file2);
        //item 4
        JavaIO.changeAllNotSymbolChars(file4);





    }
}
