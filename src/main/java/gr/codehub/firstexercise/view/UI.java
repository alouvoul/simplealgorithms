package gr.codehub.firstexercise.view;

import gr.codehub.firstexercise.service.Password;
import gr.codehub.firstexercise.service.collectionexercises.EliminateDuplicates;
import gr.codehub.firstexercise.service.collectionexercises.OrderDigits;
import gr.codehub.firstexercise.service.collectionexercises.ReverseString;
import gr.codehub.firstexercise.service.collectionexercises.Symmetric;
import gr.codehub.firstexercise.service.simplealgorithms.*;

import java.util.ArrayList;
import java.util.Scanner;

public class UI {

    public void exerciseChoose(){
        boolean flag = true;

        while (flag){
            System.out.println("1. Exercise 1 - Simple algorithms");
            System.out.println("2. Exercise 2 - Arrays and collections");
            System.out.println("3. Exercise 3 - Password validation");
            System.out.println("4. Exit");
            System.out.println("Choose a number...");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();

            switch(option) {
                case 1:
                    SimpleAlgorithmsUI simpleAlgorithmsUI = new SimpleAlgorithmsUI();
                    simpleAlgorithmsUI.simpleAlgorithmsUI();
                case 2:
                    CollectionsExUI collectionsExUI = new CollectionsExUI();
                    collectionsExUI.collectionsExUI();
                case 3:
                    PasswordUI passwordUI = new PasswordUI();
                    passwordUI.passwordValidity();
                case 4:
                    flag = false;
            }

        }
    }

}
