import java.util.Random;
import java.util.Scanner;

public class piatraFoarfecaHartie {
    public static void main(String[] args) {
        //Realizați un joc simplu de Piatra, Foarfeca,
        // Hartie între utilizator și computer(computer inseamna folositea lui Random: Random random = new Random(); int alegereCalculator = random.nextInt(3) + 1;)



   Scanner scanner = new Scanner(System.in);
    int playerScore = 0;
    int computerScore = 0 ;
    boolean gamestop=true;
    Random random = new Random();
    int alegereCalculator = random.nextInt((3) + 1);

            do {
                System.out.println("Alege un numer de la 1 la 3, 1 pentru Piatra, 2 pentru Hartie , 3 pentru Foarfeca");
                int alegereJucator = scanner.nextInt();
                if(alegereJucator == 1){
                    System.out.println("Player Choose : Piatra");
                } else if (alegereJucator == 2) {
                    System.out.println("Player Choose : Hartie");

                } else if (alegereJucator ==3) {
                    System.out.println("Player Choose : Foarfeca");
                }
                 alegereCalculator = random.nextInt(3) + 1;
                if(alegereCalculator == 1){
                    System.out.println("Computer Choose : Piatra");
                } else if (alegereCalculator == 2) {
                    System.out.println("Computer Choose : Hartie");

                } else if (alegereCalculator ==3) {
                    System.out.println("Computer Choose : Foarfeca");
        }

                if(alegereJucator == 1 && alegereCalculator == 2){
                    System.out.println("Computer Wins! You Suck");
                    computerScore += 1;
                }else if(alegereJucator ==1 && alegereCalculator ==3){
                    System.out.println("Player Wins! You Rock");
                    playerScore +=1;
                } else if (alegereJucator == 1 && alegereCalculator == 1) {
                    System.out.println("Its a tie ! You both Suck");

                } else if (alegereJucator == 2 && alegereCalculator == 1) {
                    System.out.println("Player Wins! You Rock");
                    playerScore +=1;
                } else if (alegereJucator == 2 && alegereCalculator == 2) {
                    System.out.println("Its a tie ! You both Suck");
                }else if (alegereJucator == 2 && alegereCalculator == 3) {
                    System.out.println("Computer Wins! You Suck");
                    computerScore += 1;
                }else if (alegereJucator == 3 && alegereCalculator == 1) {
                    System.out.println("Computer Wins! You Suck");
                    computerScore += 1;
                } else if (alegereJucator == 3 && alegereCalculator == 1) {
                    System.out.println("Player Wins! You Rock");
                    playerScore +=1;
                }else if (alegereJucator == 3 && alegereCalculator == 3) {
                    System.out.println("Its a tie ! You both Suck");
                }

                if(playerScore == 3){
                    System.out.println("You Win");
                    gamestop = false;
                } else if (computerScore == 3) {
                    System.out.println("Computer Wins");
                    gamestop = false;
                }

    } while(gamestop);

}

}
