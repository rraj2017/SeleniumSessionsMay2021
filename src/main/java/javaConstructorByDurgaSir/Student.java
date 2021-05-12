package javaConstructorByDurgaSir;

public class Student {
	
	//creating instance variables:
	String name;
	int rollno;
	
	//Constructor:
	
	Student(String name , int rollno){
		this.name = name;
		this.rollno = rollno;
	}

	public static void main(String[] args) {
		//object creation and constructor calling for initialization of the objects:
		Student s1 = new Student("Durga",101);
		Student s2 = new Student("Ravi",102);
		System.out.println(s1.name + "......" + s1.rollno);
		System.out.println(s2.name + "........" + s2.rollno);

	}

}
