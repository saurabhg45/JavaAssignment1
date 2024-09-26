package JavaAssignment26;
import java.util.*;
//Assignment 4: Voting Eligibility
//Write a program that checks if a person is eligible to vote. 
//A person can vote if they are a citizen and their age is 18 or above.
//Requirements:
public class Voting {
	private int age;
	private boolean citizen;
	
	Scanner sc=new Scanner(System.in);
	public void setDetails() {
		System.out.println("Enter the age: ");
		age=sc.nextInt();
		System.out.println("Enter citizen: ");
		String input=sc.next();
		citizen=input.equals("india");
		
		}
	
	public void votingEligibility() {
		if(age>18 && citizen) {
			System.out.println("Person is eligible to Vote");
		}
		
		else {
			System.out.println("Person is not eligible to Vote");
		}
	}
	
}
