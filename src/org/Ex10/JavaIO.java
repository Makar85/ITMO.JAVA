package org.Ex10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaIO {

    //1.Написать метод, который читает текстовый файл и возвращает его в виде списка строк.
    public static void fileReaderMethod(File file) {

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String input = null;
            while ((input = reader.readLine()) != null) {
                System.out.println(input);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    //2.Написать метод, который записывает в файл строку, переданную параметром.

    public static void fileWriterMethod(List<String> stringList) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("files/text1.txt"))) {
            for (String str : stringList) {
                writer.write(str + "\n");
            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    //перегружаю метод
    public static void fileWriterMethod(String string) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("files/text1.txt"))) {
            if (string.length() != 0) {
                writer.write(string);
                System.out.println("ваш текст успешно добавлен в файл");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    //перегружаю метод
    public static void fileWriterMethod(File file) {
        File file1 = new File("files/text1.txt");
        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream(file);
            os = new FileOutputStream(file1);

            while (is.available() > 0) {
                os.write(is.read());

            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
                if (os != null) {
                    os.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    //3.Используя решение 1 и 2, напишите метод, который склеивает два текстовых файла в один.

    public static void mergeFiles(File file1, File file2) {
        File output = new File("files/output.txt");
        try(BufferedReader reader1 = new BufferedReader(new FileReader(file1));
            BufferedReader reader2 = new BufferedReader(new FileReader(file2))) {
            try(BufferedWriter writer = new BufferedWriter(new FileWriter("files/output.txt"))){
                String input1;
                String input2;
                while ( (input1 = reader1.readLine())!=null){
                    writer.write(input1 + "\n");
                }
                writer.write("\n");
                while ((input2 = reader2.readLine())!=null){
                    writer.write(input2 + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // 4.	Написать метод который заменяет в файле все не символьные знаки на знак ‘$’



    public static void changeAllNotSymbolChars(File file){
        List<String> stringList = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
        String input = null;
            while((input = reader.readLine()) !=null){
                stringList.add(input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                for(String str: stringList){
                    writer.append(str.replaceAll("\\W", "\\$") + "\n");
                }
            }
         catch (IOException e) {
            e.printStackTrace();
        }

    }


}
