import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();
        int deltaHours;
        int deltaMin;
        int deltaSec;
        int hours;
        int min;
        int sec;
        int add;


        /*
         *  your code goes here
         */
        deltaHours = hours2-hours1;
        deltaMin = minutes2-minutes1;
        deltaSec = seconds2-seconds1;
        hours = deltaHours * 3600;
        min = deltaMin * 60;
        sec = deltaSec * 1;
        add = hours + min + sec;
        System.out.print(add);
        // closing the scanner object
        scanner.close();
    }
}