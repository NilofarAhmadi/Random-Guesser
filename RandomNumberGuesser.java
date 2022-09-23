import java.util.Scanner;

public class RandomNumberGuesser {
	/*
	 * Class: CMSC203 
	 * Instructor: grinberg
	 * Description: guess the number until user got it
	 * Due: 9/23/22
	 * Platform/compiler: eclipse
	 * I pledge that I have completed the programming assignment independently.
	   I have not copied the code from a student or any source.
	   I have not given my code to any student.
	   Print your Name here: Nilofar Ahmadi
	*/
	
	
	   public static void main(String[] args) {
	      Scanner scan=new Scanner(System.in);
	      String answer;
	      final int limitedGuess = 7;
	      
	      int correctAnswer;
	      
	      do {
	    	  int nextGuess = 0;
		      int lowGuess = 0; 
		      int highGuess = 100;
	         RNG.resetCount();
	         correctAnswer= RNG.rand();
	        // correctAnswer= 83;

	         //System.out.println(correctAnswer);
	         System.out.print("Enter your first guess ");
	         while ( RNG.getCount() < limitedGuess ) {
	            nextGuess = scan.nextInt();
	            RNG.inputValidation(nextGuess, lowGuess, highGuess);
	            System.out.println("Number of guess is " + RNG.getCount());
	            if (nextGuess == correctAnswer){
	               System.out.println("Congratulation, your guess is correct");
	               break;
	               }
	            else if (nextGuess < correctAnswer) {
	               System.out.println("Your guess is too low");
	               lowGuess=nextGuess;
	               System.out.print("Enter your number between " + lowGuess +" and " +highGuess + "\n");
	               }
	            else if (nextGuess > correctAnswer) {
	               System.out.println("Your guess is too high");
	               highGuess=nextGuess;
	               System.out.print("Enter your number between " + lowGuess +" and " + highGuess + "\n");
	               }
	         }
	         
	         if(RNG.getCount() == limitedGuess) {
	            System.out.println("You out of tries");
	            System.out.println("The correct answer is " + correctAnswer);
	            }
	         
	         System.out.print("Try again? (yes or no) ");
	         answer= scan.next();
	      } while (!answer.equalsIgnoreCase("no"));
	     
	      scan.close();
	      System.out.println("Thanks for playing!!!");
	      
	      }
	}

	


