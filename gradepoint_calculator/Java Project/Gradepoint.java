package rough;

import java.util.Scanner;

public class Gradepoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of subjects");
		 
	    Scanner sc=new Scanner(System.in);
	 
	    int m=sc.nextInt();
	 
	    System.out.println("Enter number of tests taken that will be counted for gradepoint");
		 
	    //Scanner classtest=new Scanner(System.in);
	 
	    int n=sc.nextInt();
	    for(int i=0;i<m;i++) {
	    int[] a=new int[n];
	 
	    double avg=0;
	 
	    System.out.println("Enter marks");
	 
	    for( i=0;i<n;i++)
	    {
	       a[i]=sc.nextInt();
	    }
	 
	    for( i=0;i<n;i++)
	    {
	      avg=avg+a[i];
	    }
	 
	    System.out.print("Average of (");
	 
	    for(i=0;i<n-1;i++)
	    {
	      System.out.print(a[i]+",");
	    }
	    System.out.println(a[i]+") ="+avg/n);
	  }
	}

	}


