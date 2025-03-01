package com.corejava.Exceptions;

public class ExceptionsDemo {
    public static void main(String[] args) {
        sayHello(null); // Creates NullPointerException
    }

    public static void sayHello(String name) {
        System.out.println(name.toUpperCase());
        // Java runtime looks for exception handler here, it doesn't find it, and goes to sayHello method 
        // above. If not found there, it goes to main method.
    }
}

// Types of Exceptions:
/*
 * 1. Checked -> Developers should anticipate and handle properly. They are checked at compile time.
 * E.g. FileNotFoundException
 * 
 * 2. Unchecked -> Not checked by compilers at compile time. They occur because of programming errors.
 * It is a run-time exception. Use good coding practices and testing.
 * E.g. NullPointerException, ArithmeticException, IllegalArgumentException, IndexOutOfBoundsException
 * 
 * 3. Error -> Errors external to our application. Eg. StackOverflowError, OutOfMemoryError
 * There is nothing we can do about them.
 */

 // Exceptions Hierarchy
 /*
  * Throwable class -> Defines common characterstics for all exceptions or error. Has error msg and stack
  trace.

  Error class -> Represent errors that are external to our application.

  Exception class -> Parent for all checked and unchecked exceptions.

  RuntimeException class -> Unchecked exception (runtime).
  */
