import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int angles = scanner.nextInt();
        int anglesPerHour = 30;
        int anglePerMin = 12;
        int angleRemainder;
        int angleMultipliedMin;

        /*
         *  your code goes here
         */

        angleRemainder = angles % anglesPerHour;
        angleMultipliedMin = angleRemainder * anglePerMin;

        System.out.print(angleMultipliedMin);

        // closing the scanner object
        scanner.close();
    }
}