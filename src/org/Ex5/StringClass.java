package org.Ex5;

import java.util.Arrays;
import java.util.Locale;

public class StringClass {
    //1.Написать метод для поиска самого длинного слова в строке.
    public static String getLongestWord(String string){
        String stringArray[] = string.split(" ");
        int len = 0;
        String longest = "";

        for(String word: stringArray ){
            if(word.length()>len) {
                len = word.length();
                longest = word;
            }
        }
        System.out.println(longest);
        return longest;
    }
    //2.Написать метод, который проверяет является ли слово палиндромом.
    public static void isPalindrome (String string) {
        String s = new StringBuilder(string).reverse().toString();
        String s1 = s.toLowerCase();
        System.out.println(s1);
        String s2 = string.toLowerCase();
        System.out.println(s2);
        if(s2.equals(s1)){
            System.out.println("Это полиндром");
        }
        else {
            System.out.println("Это не полиндром");
        }

    }
    //3. Напишите метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано цензурой]».
    public static void isCensor (String string){
        if (string.contains("бяка") || string.contains("Бяка")){
            String s =  string.replaceAll("бяка" , "[вырезано цензурой]");
            s = s.replaceAll("Бяка", "[вырезано цензурой]");
            System.out.println(s);
        }

    }
    //4. Имеются две строки. Найти количество вхождений одной (являющейся подстрокой) в другую.

    public static int substringCount (String string, String substring){
        return (string.length()-string.replace(substring, "").length())/substring.length();

    }
    //5.Напишите метод, который инвертирует слова в строке. Предполагается,
    // что в строке нет знаков препинания, и слова разделены пробелами.

    public static void invert (String string){
        StringBuilder builder = new StringBuilder();
        String[] stringArray = string.split(" ");
        for (int i = 0; i < stringArray.length; i++) {
            String s = new StringBuilder(stringArray[i]).reverse().toString();
            builder.append(s)
                    .append(" ");
            }
       System.out.println(builder.toString().trim());

    }

}
