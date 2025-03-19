package com.corejava.FileIO.ReadWriteBytesChars;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingConsoleInput {
    public static void main(String[] args) throws IOException {
        Console con = System.console();
        if(con==null) {
            return;
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, con.charset()));
        System.out.println("Enter something: ");
        String input = br.readLine();
        System.out.println(input);
    }
}
