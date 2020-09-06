import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int classA = scanner.nextInt();
        int classB = scanner.nextInt();
        int classC = scanner.nextInt();
        int divideA;
        int divideB;
        int divideC;
        int remainderA;
        int remainderB;
        int remainderC;
        int addAll;

        /*
         *  your code goes here
         */
          divideA = classA / 2;
          remainderA = divideA % 2;

          divideB = classB / 2;
          remainderB = divideB % 2;

          divideC = classC / 2;
          remainderC = divideC % 2;

          addAll = divideA + divideB + divideC + remainderA + remainderB + remainderC;
          System.out.print(addAll);

        // closing the scanner object
        scanner.close();
    }
}