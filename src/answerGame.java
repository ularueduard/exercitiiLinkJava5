import java.util.Scanner;

public class answerGame {
    //Realizați un joc simplu în care utilizatorul trebuie să răspundă la întrebări cu adevărat sau fals(diferite intrebari pe care le puteti stabili voi).
    // Pentru fiecare raspuns corect, jucatorul primeste 10 puncte, iar pt fiecare raspuns gresit, trebuie sa
    //i se scada 5 puncte. La final, trebuie sa ii afisam jucatorului rezultatul: punctajul total + cate intrebari au fost corecte, si cate gresite.

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int score = 0;



        System.out.println("1.Sharks are mammals");
        int answer1  = 0;
        System.out.println("Alege 1 pentr True sau 0 pentru False");
        int playerAnswer1 = scanner.nextInt();
        if(answer1 == playerAnswer1){
            score += 10;

        }else{
            score -=5;
        }

        System.out.println("2.Sea otters have a favorite rock they use to break open food.");
        int answer2  = 1;
        System.out.println("Alege 1 pentr True sau 0 pentru False");
        int playerAnswer2 = scanner.nextInt();
        if(answer2 == playerAnswer2){
            score += 10;

        }else{
            score -=5;
        }

        System.out.println("3.The blue whale is the biggest animal to have ever lived.");
        int answer3  = 1;
        System.out.println("Alege 1 pentr True sau 0 pentru False");
        int playerAnswer3 = scanner.nextInt();
        if(answer2 == playerAnswer2){
            score += 10;

        }else{
            score -=5;
        }

        System.out.println("Congratulation.Your score is: " + score);

    }

    }






