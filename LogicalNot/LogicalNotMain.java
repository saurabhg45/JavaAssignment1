package JavaAssignment26;
import java.util.*;
//Assignment 6: Logical NOT (!) for Negation
//Write a program that determines whether a number is not between 10 and 20 (inclusive).
//Requirements:
//•    Use logical ! to negate conditions.

public class LogicalNotMain {
	private int num;
	
	Scanner sc=new Scanner(System.in);
	
	public void CheckNo() {
		System.out.println("Enter the num: ");
		num=sc.nextInt();
		
		if(!(num>10 && num<20)) {
			System.out.println(num+ " is not between 10 and 20");
		}
		else {
			System.out.println(num+ " is between 10 and 20");
		}
	}
	
	public static void main(String[] args) {
		LogicalNotMain obj=new LogicalNotMain();
		obj.CheckNo();

	}

}
