public class exercitiiJavaCurs5 {
    public static void main(String[] args) {
        //1.Sa se afiseze urmatorul pattern pe ecran, fara a folosi in mod repetat instructiunea System.out.println():

//        for(int i=0; i<8; i++){
//            for(int j=0; j<8; j++){
//                System.out.print("# ");
//            }
//            System.out.println();
//        }


        //2.Sa se afiseze urmatorul pattern pe ecran, fara a folosi in mod repetat instructiunea System.out.println():
//
//        for(int i=0; i<8;i++){
//            if(i==0 || i==7) {
//                for (int j = 0; j < 6; j++) {
//                    System.out.print("#");
//                }
//            } else {
//                System.out.println("#    #");
//               }
//
////            }
//        int rows = 7;
//        int columns = 6;
//
//        for(int i= 0; i< rows; i++) {
//            for(int j=0; j< columns; j++) {
//                if (i == 0 || i == rows - 1 || j == 0 || j == columns - 1) {
//                    System.out.print("# ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

        //3.Sa se declare o variabila de tip Boolean cu valoarea initiala “true”si inainte de a fi printata, valoarea sa fie schimbata in “false”.

//        boolean myVariable = true;
//        System.out.println(!myVariable);


    //4. Sa se declare 3 variabile a, b si c si sa li se atribuie valorile 10, 20.3 si 3.14785. Afisati suma acestora, prin folosirea unei altei variabile suma.
//
//    int a = 10;
//    float b = 20.3F;
//    float c = 3.14785F;
//    float total = a+b+c;
//    System.out.println("Total ="+total);


        //5.Fie numarul 565, sa se calculeze suma cifrelor acestuia.

//        int sum = 0;
//        int myNumber = 565;
//
//        while(myNumber != 0 ){
//            int myDigit = myNumber % 10;
//            sum +=myDigit;
//            myNumber /= 10;
//        }
//        System.out.println("The total of the digits is: "+sum);


        //6.Determina si afiseaza cea mai mare cifră care apare in numarul întreg 37680.

//        int myBiggestNumber = 0;
//        int myNumber = 37680 ;
//
//        while(myNumber != 0){
//            int mydigit = myNumber % 10;
//            if(mydigit>myBiggestNumber){
//                myBiggestNumber = mydigit;
//            }
//            myNumber /=10;
//        }
//        System.out.println("Cifra cea mai mare din 37680 este: "+myBiggestNumber);

        //7.Sa se realizeze un program care aduna toate numerele de la 0 la 100 mai putin acele numere care sunt multipli de 11.
//
//        int myTotal = 0;
//        for(int i = 0; i <=100; i++){
//            if(i%11 != 0){
//                myTotal +=i;
//            }
//        }
//        System.out.println("Suma numerelo nedivisizibile cu 11 este :"+myTotal);

       //8.Sa se citeasca de la tastura un numar intreg pana cand se va introduce un numar intreg par, cuprins intre 0 si 10.
        //Hint: se va folosi instructiunea do-while
//
//        Scanner scanner = new Scanner(System.in);
//        int myNumber;
//
//        do {
//            System.out.println("Introdu un numar intreg par intre 1 si 10");
//            myNumber = scanner.nextInt();
//            if (myNumber % 2 != 0 || myNumber < 0 || myNumber > 10) {
//                System.out.println("Numarul introdus nu este un numar intreg par sau nu se afla in intervalul [0, 10].");
//            }
//        }while(myNumber % 2 !=0 || myNumber < 0 || myNumber >10);
//        System.out.println("Ai introdus " + myNumber + " acesta este intreg par in intervalul [0, 10]. Programul s-a incheiat.");

        //9.Sa se realizeze un program care citeste 2 numere de la tastatura a si b si afiseaza toate numerele cuprinse in intervalul [a,b].
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Introdu primul numar");
//        int myFirstNumber = scanner.nextInt();
//        System.out.println("Introdu al doilea numar");
//        int mySecondNumber = scanner.nextInt();
//        int start, end ;
//
//        if(myFirstNumber<mySecondNumber){
//            start = myFirstNumber;
//            end = mySecondNumber;
//        }else{
//            start = mySecondNumber;
//            end = myFirstNumber;
//        }
//
//        for(int i = start; i<=end; i++){
//            System.out.println(i);
//        }

        //10.Sa se realizeze un program care citeste un numar de la tastatura si afiseaza un mesaj daca numarul respectiv este numar par sau impar.
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Introdu numarul pentru verificare:");
//        int myNumber = scanner.nextInt();
//        if(myNumber%2 == 0){
//            System.out.println("Numarul "+ myNumber+" este un numar par");
//        }else {
//            System.out.println("Numarul "+ myNumber + " este un numar impar");
//        }


        //11.Sa se afiseze numerele de la 0 la 30 tinand cont de urmatoarele reguli: daca numarul este multiplu de 3 atunci se va afisa "fizz" in locul numarului, daca numarul este multiplu de 5 atunci se va afisa "buzz" in locul numarului,
        // iar daca numarul este multiplu si de 3 si de 5 atunci se afisa "fizz buzz".
        // Pentru restul numerelor se va afisa valoarea lor.

//        for(int i = 0; i <=30; i++){
//            if(i%3 == 0 && i%5 == 0){
//                System.out.println("Fizz Buzz");
//            } else if (i%3 == 0) {
//                System.out.println("Fizz");
//            } else if (i%5 == 0) {
//                System.out.println("Buzz");
//            }else {
//                System.out.println(i);
//            }
//            }


        // 12.Determină și afișează cel mai mare numar dintre două numere citite de la tastatură.

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Introdu primul numar");
//        int myFirstNumber = scanner.nextInt();
//        System.out.println("Introdu al doilea numar");
//        int mySecondNumber = scanner.nextInt();
//
//        if(myFirstNumber > mySecondNumber){
//            System.out.println(myFirstNumber);
//        }else {
//            System.out.println(mySecondNumber);
//        }
//

        //13.Sa se realizeze un program care citeste de la tastatura 3 numere si afiseaza urmatoarele rezultate:
        //a+b+c
        //2*a + 3*b+4*c
        //(a+b)/c =>(sa fie afisat ca si double )

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Introdu un numar a :");
//        int a = scanner.nextInt();
//        System.out.println("Introdu un numar b :");
//        int b = scanner.nextInt();
//        System.out.println("Introdu un numar c :");
//        int c = scanner.nextInt();
//
//        int sum = a + b + c;
//        System.out.println("Valoarea lui a + b + c este: " + sum);
//
//        int subExercitiu2 = 2*a + 3*b + 4*c;
//        System.out.println("Valoarea lui 2*a+3*b+4*c este :"+ subExercitiu2);
//
//        double subExercitiu3 =(a +  b) / (double) c;
//        System.out.println("Valoarea lui (a+b)/c este:"+subExercitiu3);

        //14.Avand 2 numere intregi, sa se afiseze suma acestora. Suma in intervalul [10,19] inclusiv, nu trebuie afisata, se va afisa 20.
        //Suma(3,4) -> 7
        //Suma(9,4) -> 20
        //Suma(10,11)-> 21
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Introdu un numar a :");
//        int a = scanner.nextInt();
//        System.out.println("Introdu un numar b :");
//        int b = scanner.nextInt();
//
//        int sum = a + b;
//
//        if(sum < 10 || sum > 20){
//            System.out.println(sum);
//        } else if (sum >= 10 || sum <=19){
//            System.out.println(20);
//        }

        //Avand 2 numere intregi, a si b, sa se returneze true daca numerele, suma sau diferenta acestora este egala cu 6, si false in celalalte cazuri.
        //Calcul(6, 4) -> true
        //Calcul(4, 5) -> false
        //Calcul(1, 5) -> true
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Introdu un numar a :");
//        int a = scanner.nextInt();
//        System.out.println("Introdu un numar b :");
//        int b = scanner.nextInt();
//
//        if(a == 6 || b==6 || a+b == 6 || a-b == 6){
//            System.out.println("True");
//        }else {
//            System.out.println("False");
//        }

//16.Sa se realizeze un program pentru a implementa jocul "Ghicirea numarului".
// Programul va detine intr-o variabila un numar cuprins intre 0 si 100. Utilizatorul este rugat sa introduca de la tastatura
// numere in mod repetitiv pana cand reuseste sa ghiceasca numarul.
//
//        Random rand = new Random();
//        int randomNumber = rand.nextInt(100);
//        System.out.println("My magic Number is "+randomNumber);
//        Scanner scanner = new Scanner(System.in);
//        boolean youWin = true;
//        do {
//            System.out.println("Introdu numarul magic:");
//            int guessNumber = scanner.nextInt();
//            if(guessNumber == randomNumber){
//                System.out.println("You guessed!!");
//                youWin = false;
//            }
//        }while (youWin);


    //17.Scrieți un program care să calculeze și să afișeze cel mai mare divizor comun al două numere(numerele se pot citi de la tastatura0
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Introdu primul numar");
//        int myFirstNumber = scanner.nextInt();
//        System.out.println("Introdu al doilea numar");
//        int mySecondNumber = scanner.nextInt();
//
//        if(myFirstNumber == 0){
//            System.out.println("The greatesc common divisor of"+myFirstNumber + " and "+ mySecondNumber+ "is"+ mySecondNumber);
//        }else if (mySecondNumber == 0){
//            System.out.println("The greatesc common divisor of"+myFirstNumber + " and "+ mySecondNumber+ "is"+ myFirstNumber);
//        }
//
//        while(mySecondNumber != 0){
//            int temp = mySecondNumber;
//            mySecondNumber = myFirstNumber % mySecondNumber;
//            myFirstNumber = temp;
//        }
//        System.out.println(myFirstNumber);

        }

        }









