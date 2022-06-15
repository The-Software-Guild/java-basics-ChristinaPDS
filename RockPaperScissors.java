import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        Boolean playAgain = true;
        System.out.println("Please indicate how many rounds you want to play? ");
        int ties = 0 ;
        int userW = 0 ;
        int computerW = 0;
        int roundsToPlay = scan.nextInt();

        do{
          /* 1 = Rock
              2 = Paper
            3 = Scissors
        2 > 1
        3 > 2
        1 > 3
         */
            for (int i = 1; i <= roundsToPlay; i++) {

                if ((roundsToPlay > 10) || (roundsToPlay < 1)) {
                    System.out.println("Range is 1 to 10 rounds, please enter a valid number ");
                    roundsToPlay = scan.nextInt();
                }
                System.out.println("Enter 1 for Rock, 2 for Paper and 3 for Scissors ");
                int userInput = scan.nextInt();
                int computerQuess = rnd.nextInt(3);

                if ((userInput == 1) && (computerQuess == 3)) {

                    System.out.println("Rock breaks Scissors to win, User wins");
                    userW = userW + 1;
                }
                if ((computerQuess == 1) && (userInput == 3)) {
                    System.out.println("Rock breaks Scissors to win, computer wins");
                    computerW = computerW + 1;

                }
                if ((userInput == 2) && (computerQuess == 1)) {

                    System.out.println("Paper wraps Rock to win, User wins");
                    userW = userW + 1;

                }
                if ((computerQuess == 2) && (userInput == 1)) {
                    System.out.println("Paper wraps Rock to win, computer wins");
                    computerW = computerW + 1;

                }
                if ((userInput == 3) && (computerQuess == 2)) {
                    System.out.println("Scissors cut Paper to win, User wins");
                    userW = userW + 1;


                }
                if ((computerQuess == 3) && (userInput == 2)) {
                    System.out.println("Scissors cut Paper to win, computer wins");
                    computerW = computerW + 1;
                }

                if ((computerQuess == 1) && (userInput == 1)) {
                    System.out.println("It's a tie");
                    ties = ties + 1;
                }
                if ((computerQuess == 2) && (userInput == 2)) {
                    System.out.println("It's a tie");
                    ties = ties + 1;
                }
                if ((computerQuess == 3) && (userInput == 3)) {
                    System.out.println("It's a tie");
                    ties = ties + 1;
                }
            }
        System.out.println("Do you want to keep playing (true/false) ");
        playAgain = scan.nextBoolean();
        if (playAgain == false){
            break;
        }
        System.out.println("Please indicate how many rounds you want to play? ");
        roundsToPlay = scan.nextInt();


        }while (playAgain);

        System.out.println("Computer has this many wins " + computerW);
        System.out.println("User has this many wins " + userW);
        System.out.println("Ties were " + ties);
    }
}
