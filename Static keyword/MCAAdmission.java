package Package1;
/*
 * Write a class MCAAdmission having method getAdmissions().create multiple objects of 
 * MCAAdmissions class. On invoking getAdmissio() on the object the total the total no. of the students admitted to MCA
 * should increase by one. use totalAdmissio() to check how many admissions are full.
 */
import java.io.*;
import java.lang.*;

public class MCAAdmission {
	int admId;
	String stName;
	int gradMks;
	static int totalAdmn = 0;
	
	//non- parameterized constructor
	public MCAAdmission() 
	{
		System.out.println("One more admission done!!");
	}
	
	public void getAdmission() {
		totalAdmn++;
	}
	public int totalAdmissions() {
		return totalAdmn;
	}
}
