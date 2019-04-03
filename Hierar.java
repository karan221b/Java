import java.util.Scanner;

class Person{
	int age;
	long ph;
	String name;
	Scanner sc = new Scanner(System.in);
	
	void getData(){
		System.out.print("Enter Name: ");
		name = sc.next();
		System.out.print("Enter Age: ");
		age = sc.nextInt();
		System.out.print("Enter Contact Number: ");
		ph = sc.nextLong();
	}
}

class Faculty extends Person{
	int exp;
	long sal;
	
	void getData(){
		System.out.println("***Enter Faculty Data***");
		super.getData();
		System.out.print("Enter Experience(years): ");
		exp = sc.nextInt();
		System.out.print("Enter Salary: ");
		sal = sc.nextLong();
	}
	
	void display(){
		System.out.println(name+" "+age+" "+ph+" "+exp+" "+sal);
	}
}

class Student extends Person{
	String grade;
	String subject;
	int sem;
	
	void getData(){
		System.out.println("***Enter Student Data***");
		super.getData();
		System.out.print("Enter grade: ");
		grade = sc.next();
		System.out.print("Enter subject: ");
		subject = sc.next();
		System.out.print("Enter semester(Number): ");
		sem = sc.nextInt();
	}
	
	void display(){
		System.out.println(name+" "+age+" "+ph+" "+grade+" "+subject+" "+sem);
	}
}

class Hierar{
	public static void main(String []args){
		Faculty f = new Faculty();
		f.getData();
		
		Student s = new Student();
		s.getData();
		
		f.display();
		s.display();
	}
}