package JavaAssignment26;
import java.util.*;
//Assignment 1: Validating Age and Income
//Write a program that checks if a person is eligible for a loan based 
//on their age and income.
//Requirements:
//•    A person is eligible if their age is between 18 and 60 
//and their income is above $25,000.
//•    Use logical && to combine these conditions.
public class Person {
	private String name;
	private int age;
	private double income;
	
	Scanner sc=new Scanner(System.in);
	
	public void setDetails() {
		System.out.println("Enter person name: ");
		name=sc.next();
		System.out.println("Enter person age: ");
		age=sc.nextInt();
		System.out.println("Enter person income: ");
		income=sc.nextDouble();
	}
	public void validateAgeAndIncome() {
		if((age>18) && (age<60) && (income>25000)) {
			System.out.println("person is eligible for a loan");
		}
		else {
			System.out.println("Person not eligible for loan");
		}
	}
	
	public void checkDetails() {
		System.out.println("Name: "+ name);
		System.out.println("Age: "+ age);
		System.out.println("Income: "+ income);
	}

}
