package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {
    static Character[] charArrayOrig = new Character[62];
    static Character[] charArrayKompressed = new Character[62];

    public static void main(String[] args) {




        try
        {
            BufferedReader reader = new BufferedReader( new FileReader("src/com/company/blubb.txt"));
            int c;
            int i=0;
            // Datei auslesen als Stream und dann in eine Character-Sequenz umwandeln
            while ((c = reader.read()) != -1) {
                addOrignalChars((char) c,i++);
            }

        } catch (Exception e) {
            System.out.println(e);
        }



        for(int i=0; i < charArrayOrig.length; i++) {
            System.out.print(charArrayOrig[i]);
        }
    }

    private static void addOrignalChars(char c, int index){
        charArrayOrig[index] = c;
    }

    private static void addKompressedChars(char c, int index){
        charArrayKompressed[index] = c;
    }


    private static int getLength(){
        return charArrayOrig.length;
    }



}
