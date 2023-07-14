import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame{
    public static void main(String[] args){
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = rand.nextInt(100)+1;
        System.out.println("Random number is:"+randomNumber); //To cheat the GAME
        int tryCount=0;
        while(true){ 
        System.out.println("Enter your guess (1-100):");
        int playerGuess = scanner.nextInt();
        tryCount++;
        if(playerGuess == randomNumber){
System.out.println("Correct! You did it !");
System.out.println("It's took-"+tryCount+"_tries");
break;
        }
        else if(randomNumber > playerGuess){
            System.out.println("ohh! The number is Higher.Guess again");
        }
        else{
         System.out.println("ohh! The number is Lower.Guess again");   
        }
        }
        scanner.close();
    }
}