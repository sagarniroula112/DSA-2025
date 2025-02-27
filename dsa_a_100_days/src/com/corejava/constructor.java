package com.corejava;

class Pen {
	String color;
	String type; // ballpoint or gel
	
	public void write() {
		System.out.println("Writing something!");
	}
	
	public void printColor() {
		System.out.println(this.color);
	} // "this" keyword tells which object has called this function
	
	// data and members (functions) of the class Pen
}

class Student {
	String name;
	int age;
	
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	Student(String name, int age){
		this.name = name; // when making that new object, take name and age from parameters and set object's data.
		this.age = age;
	}
	
	// Copy Constructor
	Student(Student s2){
		this.name = s2.name;
		 this.age = s2.age;
	}

}

public class constructor {
	public static void main(String[] args) {
		Pen pen1 = new Pen();
		pen1.color = "blue";
		pen1.type = "gel";
		
		Pen pen2 = new Pen();
		pen2.color = "black";
		pen2.type = "ballpoint";
		
		pen1.printColor();
		pen2.printColor();
		
		Student s1 = new Student("Hari", 24);
		// "new" keyword: space is allocated inside memory heap to store our object
		// but why parenthesis? it is called a constructor, to construct java objects
		
		// CONSTRUCTOR
		// no return type, called only once, can be parameterized or non-parameterized
		
		// Why did the code run before without creating constructor then?
		// ANs: Java by default makes a constructor, if we make one, it will use the one we defined.
		
		// 1. Parameterized, Non-parameterized, Copy constructor
		// Copy Constructor - Used to copy objects
		
		Student s2 = new Student(s1);
		s2.printInfo();
		
		s1.printInfo();
	}
}
