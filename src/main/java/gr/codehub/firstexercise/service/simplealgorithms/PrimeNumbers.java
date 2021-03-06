package gr.codehub.firstexercise.service.simplealgorithms;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;


public class PrimeNumbers {

    public boolean calculatePrimeNumbersSimpleAlgorithm(int n){

        int prime = abs(n);
        for(int i = 2; i < prime/2; i++){
            if(prime % i == 0){
                return false;
            }
        }

        return true;
    }

    public List<Integer> findPrimeNumbersInList(ArrayList<Integer> primeList){
        List<Integer> primes = new ArrayList<>();

        for (int number: primeList) {
            if(calculatePrimeNumbersSimpleAlgorithm(number))
                primes.add(number);
        }

        return primes;
    }

    public boolean calculatePrimeNumbersEuclideanAlgorithm(int n){

        //  TODO

        return true;
    }

}
