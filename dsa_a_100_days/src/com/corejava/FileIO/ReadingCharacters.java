package com.corejava.FileIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingCharacters {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, System.console().charset()));
        char c;
        
        do {
            c = (char) br.read();
            if (c == '\n') { // Ignore newlines (for Windows & Linux)
                continue;
            }
            System.out.println(c);
        } while(c != 'q');
    }
}
