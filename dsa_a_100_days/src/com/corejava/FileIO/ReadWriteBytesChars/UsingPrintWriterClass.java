package com.corejava.FileIO.ReadWriteBytesChars;

import java.io.PrintWriter;

public class UsingPrintWriterClass {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);

        pw.println("This is a string.");
        double d = 4.5e-7;
        pw.println(d);
    }
}
