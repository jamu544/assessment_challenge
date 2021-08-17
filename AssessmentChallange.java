package com.testing;

import java.util.Scanner;


/*
Create a function that would take in 2 parameters. 
Parameter 1- would be the amount you put into the machine.
Parameter 2- would be the amount the machine would deduct for parking.
   
The function should also then return the leftover amount after deductions,
broken down to denominations in Rand currency. The way you return said
denomination breakdown from the function is up to you.  

*/


public class AssessmentChallange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			//notes(in Rands) available in parking machine
		  final int[] randDenominations =  {200, 100, 50, 20, 10, 5, 2, 1 };
	       
	      Scanner userInput = new Scanner(System.in);
	      
	      //handle user input656
	      System.out.println("Enter amount (in Rands): ");

	      while(!userInput.hasNextInt()){
		      System.out.println("Input is a not valid number ");
		      System.out.println("Enter amount (in Rands): ");

		      userInput.nextLine();
	    	  
	      }
	       
	      // Get the amount to breakdown from user
	       
	      int amount = userInput.nextInt();
	       
	      // Determine how many of each denomination are required
	       
	      int[] count = parkingMeterAmountPayable(randDenominations, amount);
	       
	      // Output the results
	      for (int i=0; i<randDenominations.length; i++) {
	         if (count[i]>0) {
	            System.out.println(randDenominations[i]+ " : "+  count[i]);
	         }
	      }

	}

private static int[] parkingMeterAmountPayable(int[] denominations, int amount) {
    int[] count = new int[denominations.length];
     
    // Loop through each denomination (starting at largest)
   
     
    for (int i=0; i<denominations.length; i++) {
        
       // Use one of that denomination until we need something smaller
        
       while (amount>=denominations[i]) {
          count[i]++;
          amount -= denominations[i];
       }
    }
    System.out.println("Notes Payable:");

    return count;
 }









}
