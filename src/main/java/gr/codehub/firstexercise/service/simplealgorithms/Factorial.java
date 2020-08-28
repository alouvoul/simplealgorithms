package gr.codehub.firstexercise.service.simplealgorithms;

import java.util.Random;

import static java.lang.Math.abs;

/**
 * This class used to calculate the factorial number of a given number.
 */
public class Factorial {

    /**
     * Method to calculate the factorial of a given number. If the number is negative automatically reverts it to positive.
     * @param n The specified number to calculate the factorial
     * @return The factorial of the given number
     */
    public int calculateFactorial(int n){

        // Convert negative number to positive
        int positiveNumber = abs(n);

        if (n == 0 || positiveNumber == 1)
            return 1;

        int factorial = 1;
        for (int i = 1; i <= positiveNumber; i++){
            factorial *= i;
        }
        return factorial;
    }

    /**
     * Method that doesn't need a given number to calculate the results. Chooses a random number. The random number range
     * limited to 0-10 due to the overflow of the variables.
     * @return The factorial of the random number
     */
    public int randomNumberCalculateFactorial(){
        Random r = new Random();
        int randomNumber = r.nextInt(10);
        return calculateFactorial(randomNumber);
    }

}
