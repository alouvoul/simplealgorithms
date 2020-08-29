package gr.codehub.firstexercise;

import gr.codehub.firstexercise.service.*;
import gr.codehub.firstexercise.service.collectionexercises.*;
import gr.codehub.firstexercise.service.simplealgorithms.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        testing();
    }


    public static void testing(){
        Factorial f = new Factorial();
        System.out.println(f.calculateFactorial(0));
        System.out.println(f.calculateFactorial(1));
        System.out.println(f.calculateFactorial(-2));
        System.out.println(f.calculateFactorial(5));
        System.out.println(f.randomNumberCalculateFactorial());

        PrimeNumbers prime = new PrimeNumbers();

        System.out.println(prime.calculatePrimeNumbersSimpleAlgorithm(0));
        System.out.println(prime.calculatePrimeNumbersSimpleAlgorithm(1));
        System.out.println(prime.calculatePrimeNumbersSimpleAlgorithm(2));
        System.out.println(prime.calculatePrimeNumbersSimpleAlgorithm(-5));
        System.out.println(prime.calculatePrimeNumbersSimpleAlgorithm(1693));
        System.out.println(prime.calculatePrimeNumbersSimpleAlgorithm(1700));

        HarmonicSeries hs = new HarmonicSeries();
        System.out.println(hs.calculateHarmonicSeries(0));
        System.out.println(hs.calculateHarmonicSeries(1));
        System.out.println(hs.calculateHarmonicSeries(10));
        System.out.println(hs.calculateHarmonicSeries(-1));


        NumberOfDigitsPerNumber nl = new NumberOfDigitsPerNumber();
        System.out.println("Number of digits per number: ");
        System.out.println(nl.numberOfDigitsOfLong(000));
        System.out.println(nl.numberOfDigitsOfLong(1000));
        System.out.println(nl.numberOfDigitsOfLong(50000L));
        System.out.println(nl.numberOfDigitsOfLong(-1000));


        System.out.println("Number of decimal digits per number:");
        CountDecimalPartNumbers cd = new CountDecimalPartNumbers();
        System.out.println(cd.getDecimalPart((float)13.1555));
        System.out.println(cd.getDecimalPart((float)13.0));
        System.out.println(cd.getDecimalPart((float)13.1));
        System.out.println(cd.getDecimalPart((float)0.44041111111));

        int[] ids = {3, 0, 1, 5, 5, 50, 55, 55, 100, 111};
        ArrayList<Integer> values = new ArrayList<>();

        // Add all the ints as Integers with add.
        // ... The ints are cast to Integer implicitly.
        for (int id: ids) {
            values.add(id);
        }
        System.out.println(prime.findPrimeNumbersInList(values));


        EliminateDuplicates ed = new EliminateDuplicates();
        System.out.println("Eliminating duplicates....");
        System.out.println(ed.eliminateDuplicatesList(values));

        OrderDigits od = new OrderDigits();
        System.out.println(od.descendingOrderInt(31056431));


        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(4);
        stack.push(8);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


        ReverseString rs = new ReverseString();
        System.out.println(rs.reverse("Tasos123456789"));

        Symmetric symmetric = new Symmetric();
        System.out.println(symmetric.symmetricString("TASOS"));
        System.out.println(symmetric.symmetricString("abba"));
        System.out.println(symmetric.symmetricString("123454321"));
        System.out.println(symmetric.symmetricString("12398"));


        Password password = new Password();
        System.out.println("Validation...");
        password.validation("Tasos");
        password.validation("asosav1@");
        password.validation("Tasosabc");
        password.validation("Taaaasos123@");
    }
}
