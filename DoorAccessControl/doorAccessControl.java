package JavaAssignment26;
import java.util.*;

//Assignment 3: Door Access Control
//Write a program that simulates an access control system. 
//A person is allowed access if they have both a valid ID 
//and a valid access card, or if they are an admin.
//Requirements:
//•    Use logical operators &&, ||, and !.
public class doorAccessControl {
	private String name;
	private boolean id;
	private boolean  card;
	private boolean  admin;
	
	Scanner sc=new Scanner(System.in);
	
	public void SetDetails() {
		System.out.println("Enter your name: ");
		name=sc.next();
		System.out.println("Please, type 'Yes' if you have Valid ID: ");
		String input=sc.next();
		id=input.equals(input);
		
		System.out.println("Please, type 'Yes' if you have Valid Access card: ");
		String input2=sc.next();
		card=input2.equalsIgnoreCase("Yes");
		System.out.println("Please, type 'Yes' if you are a Admin: ");
		String input3=sc.next();
		admin=input3.equalsIgnoreCase("Yes");
	}
	
	public void CheckAccessContro() {
		if((id && card) || admin) {
			System.out.println("Verified!"+name+" Please enter in the room");
		}
		else {
			System.out.println("Declined! Sorry"+name+" dyour not access to enter in the room");
		}
	}
	
}
