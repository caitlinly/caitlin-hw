import java.sql.SQLOutput;
import java.util.Scanner;

class rock_paper_scissor {
    public static void main(String[] args) {
        //creating scoreboard//
        int draws = 0;
        int wins = 0;
        int looses = 0;

        //assigning variables//
        String cpu_ = "";
        String user_rps = "";
        boolean playAgain = true;
        Scanner input = new Scanner(System.in);

        //User inputs their choice of rock, paper, or scissors//
        while(playAgain) {
            System.out.print("Pick rock (r), paper (p), or scissors (s): ");
            user_rps = input.next();
            user_rps = user_rps.toLowerCase();
            if(!user_rps.equals("r") && !user_rps.equals("p") && !user_rps.equals("s")){
                System.out.println("Invalid Choice");
                while(!user_rps.equals("r") && !user_rps.equals("p") && !user_rps.equals("s")){
                    System.out.print("Pick rock (r), paper (p), or scissors (s): ");
                    user_rps = input.next();
                    user_rps = user_rps.toLowerCase();
                }
            }

            //The computer picks a random number between 0-2. Each number is then assigned to rock, paper, or scissors//
            int randomizer = (int) (Math.random() * 3);
            if (randomizer == 0) {
                cpu_ = "rock";
            } else if (randomizer == 1) {
                cpu_ = "paper";
            } else if (randomizer == 2) {
                cpu_ = "scissors";
            }
            System.out.print("I played " + cpu_ + "\n");

            //Determines if player won or computer won//
            if (cpu_.equals("rock")) {
                if (user_rps.equals("r")) {
                    System.out.print("It's a draw!\n");
                    draws += 1;
                } else if (user_rps.equals("p")) {
                    System.out.print("You Won!\n");
                    wins += 1;
                } else if (user_rps.equals("s")) {
                    System.out.print("You lost\n");
                    looses += 1;
                }
            } else if (cpu_.equals("paper")){
                if (user_rps.equals("p")) {
                    System.out.print("It's a draw!\n");
                    draws += 1;
                } else if (user_rps.equals("s")) {
                    System.out.print("You Won!\n");
                    wins += 1;
                } else if (user_rps.equals("r")) {
                    System.out.print("You lost\n");
                    looses += 1;
                }
            } else if (cpu_.equals("scissors")){
                if (user_rps.equals("s")) {
                    System.out.print("It's a draw!\n");
                    draws += 1;
                } else if (user_rps.equals("r")) {
                    System.out.print("You Won!\n");
                    wins += 1;
                } else if (user_rps.equals("p")) {
                    System.out.print("You lost\n");
                    looses += 1;
                }
            }
            //Prints the score//
            System.out.print("The score is: Wins:"+wins+" Looses:"+looses+" Draws:"+draws +"\n");

            //Asks player if they would like to play again //
            System.out.print("Would you like to play again?\n");
            System.out.print("Yes or No: ");
            String play_again = input.next();
            play_again = play_again.toLowerCase();

            //If the player doesn't want to play anymore, the game ends//
            if (!play_again.equals("yes")) {
                playAgain = false;
                System.out.println("Thank you for playing");
            }
        }
    }
}