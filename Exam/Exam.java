package JavaAssignment26;
import java.util.*;

//Assignment 2: Exam Grading System
//Write a program that determines whether a student passes an exam based 
//on three subjects. A student passes if the average score is at least 60, 
//and none of the individual scores is below 40.
//Requirements:
//•    Use logical operators && and || to combine conditions.
public class Exam {
	private String name;
	private int sub1;
	private int sub2;
	private int sub3;
	private int avg;
	private int tot;
	
	
	Scanner sc=new Scanner(System.in);
	
	public void setDetails() {
		System.out.println("Enter your name: ");
		name=sc.next();
		System.out.println("Enter the sub1 marks: ");
		sub1=sc.nextInt();
		System.out.println("Enter the sub2 marks: ");
		sub2=sc.nextInt();
		System.out.println("Enter the sub3 marks: ");
		sub3=sc.nextInt();	
	}
	
	public void calculateAvg() {
		tot=sub1+sub2+sub3;
		avg=tot/3;
		System.out.println("Total of three subject is: "+tot);
		System.out.println("Average is: "+avg);
	}
	
	public void passingStatus() {
		if(avg>60 && sub1>40 && sub2>40 && avg>40) {
			System.out.println("Congratulation!"+name+",you pass the exam");
		}
		else {
			System.out.println("Sorry "+name+", you are failed in exam");
		}
	}
	
}
