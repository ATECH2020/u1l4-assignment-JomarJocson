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
        int remainder
        int divideB;
        int divideC;
        int addAll;

        /*
         *  your code goes here
         */
          divideA = classA / 2;

          divideB = classB / 2;

          divideC = classC / 2;

          addAll = divideA + divideB + divideC;
          System.out.print(addAll);

        // closing the scanner object
        scanner.close();
    }
}