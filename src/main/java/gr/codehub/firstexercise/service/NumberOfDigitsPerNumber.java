package gr.codehub.firstexercise.service;

public class NumberOfDigitsPerNumber {

    public int numberOfDigitsOfLong(long number){

        int numberOfDigitsOfLong = 0;
        long positiveNumber = Math.abs(number);
        while (positiveNumber > 0){
            positiveNumber /= 10;
            numberOfDigitsOfLong++;
        }
        return numberOfDigitsOfLong;
    }
}
