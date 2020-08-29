package gr.codehub.firstexercise.view;

import gr.codehub.firstexercise.service.collectionexercises.EliminateDuplicates;
import gr.codehub.firstexercise.service.collectionexercises.OrderDigits;
import gr.codehub.firstexercise.service.collectionexercises.ReverseString;
import gr.codehub.firstexercise.service.collectionexercises.Symmetric;
import gr.codehub.firstexercise.service.simplealgorithms.PrimeNumbers;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionsExUI {

    public void collectionsExUI() {
        boolean flag = true;

        while (flag) {
            System.out.println("1. Given a list of integers, return a sub list that contains only the prime numbers");
            System.out.println("2. Eliminating the duplicates from a list");
            System.out.println("3. Returns the digits of number in descending order");
            System.out.println("4. Stack");
            System.out.println("5. Reverse a string using only a stack");
            System.out.println("6. Check if word is symmetric");
            System.out.println("7. Return to main menu");
            System.out.println("Choose a number...");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();

            int[] ids = {3, 0, 1, 5, 5, 50, 55, 55, 100, 111};
            ArrayList<Integer> values = new ArrayList<>();
            for (int id: ids)
                values.add(id);

            switch (option) {
                case 1:
                    PrimeNumbers prime = new PrimeNumbers();
                    System.out.println("Prime numbers in the list are: " + prime.findPrimeNumbersInList(values));
                    break;
                case 2:
                    EliminateDuplicates ed = new EliminateDuplicates();
                    System.out.println("Eliminating duplicates....");
                    System.out.println("List without duplicates:" + ed.eliminateDuplicatesList(values));
                    break;
                case 3:
                    System.out.println("Write a number to count the digits:");
                    int countNumber = scanner.nextInt();
                    OrderDigits od = new OrderDigits();
                    System.out.println("Total number of digits of" + countNumber + ":" + od.descendingOrderInt(countNumber));
                    break;
                case 4:
                    System.out.println("Under Construction!");
                    break;
                case 5:
                    System.out.println("Give a string to reverse:");
                    String textToBeReversed = scanner.nextLine();
                    ReverseString rs = new ReverseString();
                    System.out.println("Reversed string is: " + rs.reverse(textToBeReversed));
                    break;
                case 6:
                    System.out.println("Write a word to check for symmetric word:");
                    String textToCheckSymmetricity = scanner.nextLine();
                    Symmetric symmetric = new Symmetric();
                    System.out.println(symmetric.symmetricString(textToCheckSymmetricity));
                    break;
                case 7:
                    flag = false;
            }
        }
    }

}
