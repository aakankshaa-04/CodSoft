package Com.Codesoft.Task1;
import java.util.Scanner;

public class NumberGuess{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int total=0;
		while(true) {
			int attempt=0;
			int maxattempt=5;
			int myNumber=(int)(Math.random()*100);
			boolean guess=false;
			System.out.println("New round started! Guess the number between 1 and 100.");
            
            while (attempt < maxattempt && !guess) {
                System.out.print("Enter your guess: ");
                int userGuess = sc.nextInt();
                attempt++;
                
                if (userGuess == myNumber) {
                    System.out.println("Congratulations! You've guessed the correct number.");
                    guess = true;
                } else if (userGuess < myNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }
            if (!guess) {
                System.out.println("Sorry, you've used all your attempts. The correct number was: " + myNumber);
            }
            if (guess) {
            	total += 1;
            }
            System.out.println("Your total score: " + total);
            System.out.print("Do you want to play another round? (y/n): ");
            char choice = sc.next().charAt(0);
            if (choice != 'y' && choice != 'Y') {
                break;
            }
		}
		 System.out.println("Thanks for playing! Your final score is: " + total);
	}
}
