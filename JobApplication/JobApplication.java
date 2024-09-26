package JavaAssignment26;
import java.util.*;
//Assignment 5: Job Application
//Write a program that checks if a person is eligible for a job based on 
//their qualifications. A person is eligible if they have a bachelor’s degree or 
//equivalent experience, and they have a clean criminal record.
//Requirements:
//	•    Use logical operators to combine conditions.
public class JobApplication {
	private String name;
	private boolean degree;
	private boolean experience;
	private boolean criminalRecord;
	
	Scanner sc=new Scanner(System.in);
	
	public void setDetails() {
		System.out.println("Enter name: ");
		name=sc.next();
		
		System.out.println("Do you have a degree? (yes/no): ");
		String ip=sc. next();
		degree=ip.equalsIgnoreCase("yes");
		
		System.out.println("Do you have experience? (yes/no): ");
		String ip1=sc. next();
		degree=ip1.equalsIgnoreCase("yes");
		
		System.out.println("Do you have a criminal record? (yes/no): ");
		String ip2=sc. next();
		degree=ip2.equalsIgnoreCase("no");	
	}
	public void checkEligibility() {
		if((degree || experience) && !criminalRecord) {
			System.out.println("Congratulation! "+name+",you are eligible for job");
		}
		else {
			System.out.println("Oops! "+name+",you are not eligible for job");
		}
	}
	
	
	
	public static void main(String[] args) {
		JobApplication job=new JobApplication();
		job.setDetails();
		job.checkEligibility();

	}

}
