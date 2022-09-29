package com.sytanx.class11;

public class Student {
	
	String name;
	String id;
	int age;
	double weight;
	char gender;
	
	void study () {
		System.out.println("Student is studying");
	} 
	
	void deleteMessage() {
		
		
		System.out.println("Delating is from discord");
	}
	
	void eat () {
		System.out.println("Drinking tea");
	}
	
	public static void main(String[]args) {
	
		// new student();=> create the object of student class.
		
		Student MollikObject= new Student();
		MollikObject.name="Miah";
		MollikObject.id="1234";
		MollikObject.age=21;
	
		System.out.println(MollikObject.name);
		System.out.println(MollikObject.id);
		System.out.println(MollikObject.age);
		
		MollikObject.deleteMessage();
		
		System.out.println("***********");
		Student student2= new Student();
		student2.name="Jubiha";
	System.out.println(student2.name);	
		student2.eat();
		
	}
	
	

}
