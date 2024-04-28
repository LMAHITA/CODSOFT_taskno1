import java.util.Random;
import java.util.Scanner;
public class generateRandom{
   
    static int checknumber(int rand_int1){
        int score=0;
        System.out.println("There will be 6 attempts given to guess the random number");
        for(int i=0;i<6;i++){
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter a number");

            int mynumber = myObj.nextInt();
            if (mynumber==rand_int1){
                System.out.println("correct guess");
                score=score+1;

				
                break;
            }
            else if(mynumber>rand_int1){
                System.out.println("It is too high");
                score=0;
            }
            else if(mynumber<rand_int1){
                System.out.println("It is too low");
                score=0;
            }
        }
		return score;
    }
    public static void main(String args[])
    {
        // create instance of Random class
        int score=0;
        Random rand = new Random();
        Scanner myObj = new Scanner(System.in); 

        int answer = 1; // Assume the user wants to play initially.
        while (answer == 1) {
            int rand_int1 = rand.nextInt(100); // Generate a new number each game.
            score+=checknumber(rand_int1); 
            System.out.println("Your score: " + score);
            System.out.println("Do you want to play again? (1 for yes, 0 for no)");
            answer = myObj.nextInt(); 
        }
        System.out.println("Game over");
    }
        // Print random integers
}