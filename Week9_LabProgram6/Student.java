package CIE;
import java.util.*;

public class Student{
	public String name;
	public String usn;
	public int sem;

	public void display(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name:");
		name = sc.next();
		System.out.println("Enter USN:");
		usn = sc.next();
		System.out.println("Enetr Semester:");
		sem = sc.nextInt();
	}

}
