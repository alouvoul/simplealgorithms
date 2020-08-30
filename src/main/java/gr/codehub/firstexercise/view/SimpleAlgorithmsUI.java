package gr.codehub.firstexercise.view;

import gr.codehub.firstexercise.service.simplealgorithms.*;

import java.util.Scanner;

public class SimpleAlgorithmsUI {

    public void simpleAlgorithmsUI(){
        boolean flag = true;

        while (flag){
            System.out.println("=========================================\n");
            System.out.println("1. Program that calculates the factorial of a number n");
            System.out.println("2. Find the maximum value of n as int so that the calculated output is valid");
            System.out.println("3. Prime number");
            System.out.println("4. Harmonic series");
            System.out.println("5. Count the digits of a long number");
            System.out.println("6. Print decimal part of a float");
            System.out.println("7. Return to main menu");
            System.out.println("Choose a number...");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();

            switch(option) {
                case 1:
                    System.out.println("Write a number to calculate the factorial:");
                    int numberFactorial = scanner.nextInt();
                    Factorial f = new Factorial();
                    System.out.println(f.calculateFactorial(numberFactorial));
                    break;
                case 2:
                    System.out.println(new Factorial().maximumValueFactorial());
                    break;
                case 3:
                    System.out.println("Check a number if it is a prime:");
                    int primeNumber = scanner.nextInt();
                    PrimeNumbers prime = new PrimeNumbers();
                    System.out.println(prime.calculatePrimeNumbersSimpleAlgorithm(primeNumber));
                    break;
                case 4:
                    System.out.println("Calculate the Harmonic series of a number:");
                    int harmonicSeriesNumber = scanner.nextInt();
                    HarmonicSeries hs = new HarmonicSeries();
                    System.out.println(hs.calculateHarmonicSeries(harmonicSeriesNumber));
                    break;
                case 5:
                    System.out.println("Count the total number of digits of a long number:");
                    long number = scanner.nextLong();
                    NumberOfDigitsPerNumber nl = new NumberOfDigitsPerNumber();
                    System.out.println("Number of digits per number: " + "" + nl.numberOfDigitsOfLong(number));
                    break;
                case 6:
                    System.out.println("Count the total number of digits of a long number:");
                    float numberDecimalPart = scanner.nextFloat();
                    System.out.println("Number of decimal digits per number:");
                    CountDecimalPartNumbers cd = new CountDecimalPartNumbers();
                    System.out.println(cd.getDecimalPart((float)numberDecimalPart));
                    break;
                case 7:
                    flag = false;
            }

        }
    }

}
