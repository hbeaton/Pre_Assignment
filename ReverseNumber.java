//Pre-Assignment 1 #5

//importing a predefined class for taking inputs from user
import java.util.Scanner;

public class ReverseNumber {
	public static void main(String args[]) {
	    
		 int num = 0;
		 int reversenum = 0;
		 System.out.println("Input your number and press enter: ");
		   //this statement will capture the user input
		 Scanner in = new Scanner(System.in);
		   //captured input and stored in num
		 num = in.nextInt( );
		  //while loop, to find the reverse number
		 
		 while (num != 0) {
			 
			 reversenum = reversenum * 10;
			 reversenum = reversenum + num % 10;
			 num = num/10;
			 
		 }
		 System.out.println("Reverse of input number is: " + reversenum);
	}	 
}
