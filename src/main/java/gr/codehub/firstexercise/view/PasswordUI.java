package gr.codehub.firstexercise.view;

import gr.codehub.firstexercise.service.Password;

import java.util.Scanner;

public class PasswordUI {

    public void passwordValidity() {
        System.out.println("Write a password to check the validity:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        Password password = new Password();
        System.out.println("Validation...");
        password.validation(text);
    }

}
