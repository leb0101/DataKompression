package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        StringBuilder line = new StringBuilder();

        try
        {
             BufferedReader reader = new BufferedReader( new FileReader("src/txt/blubb"));
            int c;

            while ((c = reader.read()) != -1) {
                line.append((char) c);

            }

        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(line);

    }
}
