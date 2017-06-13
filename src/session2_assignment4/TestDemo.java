package session2_assignment4; // package declaration

import java.util.Scanner;

/*
 * This class helps to print whether the Entered number ftom user is Zero or Postive value or Negative value
 * This class also helps to find the Grade of the student using his 3 marks which will be entered by the user.
 */

public class TestDemo {

	public static void main(String[] args) { //Main-Method declaration
		
		Scanner s = new Scanner(System.in); //Scanner to take Input from the user.
		
		System.out.println("Enter any number");
		
		int n = s.nextInt(); //declaring and initializing the integer number
		
		if(n == 0){
			System.out.println("You Have Entered Zero");
			String ch;
			int i = n;
			ch = new Character((char)i).toString(); //This method used to get ASCII values
			System.out.println(ch);
		}
		
		else if(n > 0){
			System.out.println("You You Have Entered Positive Value");
			String ch;
			int i = n;
			ch = new Character((char)i).toString();
			System.out.println(ch);
		}
		
		else if(n < 0){
			System.out.println("You You Have Entered Negative Value");
			String ch;
			int i = n;
			ch = new Character((char)i).toString();
			System.out.println(ch);
		}
		
		System.out.println("Please Enter 3 Subjects Marks : ");
		
		float physics = s.nextFloat(); //declaring and initializing the 1st float number
		
		float chemistry = s.nextFloat(); //declaring and initializing the 2nd float number
		
		float mathematics = s.nextFloat(); //declaring and initializing the 3rd float number
		
		float average = ((physics+chemistry+mathematics)/3);
		
		if(average > 70){
			
			System.out.println("Grade of the student = 'A'"); //Prints the Grade of the Student
			
		}
		
		else if(average >= 61 && average <= 70){
			
			System.out.println("Grade of the student = 'B'");

		}
		
		else if(average < 61){
			
			System.out.println("Grade of the student = 'c'");

		}
		
		s.close(); //Closing the Scanner class
		
		
}
}
