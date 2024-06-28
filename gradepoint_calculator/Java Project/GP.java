package rough;

import java.util.Scanner;

public class GP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("       CGPA CALCULATION\n   ========================");
	      System.out.println("Enter average of your marks (less than 100):");
	      
	      double average = sc.nextDouble();
	      

	      if(average>=80){
	         
	         System.out.println("Your Grade is A+ and gardepoint is 4.0");
	      }else if(average>=75 && average<80){
	         
	         System.out.println("Your Grade is A and gradepoint is 3.75");
	      }
	      else if(average>=70 && average<75){
	        
	         System.out.println("Your Grade is A- and gradepoint is 3.50");
	         
	      }
	      else if(average>=65 && average<70){
		         
		         System.out.println("Your Grade is B+ and gradepoint is 3.25");
		         
		      }
	      else if(average>=60 && average<65){
		        
		         System.out.println("Your Grade is B and gradepoint is 3.00");
		         
		      }
	      else if(average>=55 && average<60){
		        
		         System.out.println("Your Grade is B- and gradepoint is 2.75");
		         
		      }
	      else if(average>=50 && average<55){
		         
		         System.out.println("Your Grade is C+ and gradepoint is 2.50");
		         
		      }
	      else if(average<50) {
	    	  System.out.println("Failed");
	    	  
	      }
	      else
	    	  System.out.println("Invalid average");

	}

}
