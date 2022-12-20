package com.bridgelabz.regexpattern;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class UserInputValidation {

    public static boolean isValidFirstName(String firstName) {

        String firstNameRegex = "[A-Z]{1}[a-z]{2,}";  //Declaring regex pattern to check the firstName

        Pattern pattern = Pattern.compile(firstNameRegex);
        Matcher matcher = pattern.matcher(firstName);

        return matcher.matches();
    }

    public static boolean isValidLastName(String lastName) {
        String lastNameRegex = "[A-Z]{1}[a-z]{2,}";

        Pattern pattern = Pattern.compile(lastNameRegex);

        Matcher matcher = pattern.matcher(lastName);

        return matcher.matches();
    }

    public static boolean isValidEmail(String email) {

        String emailRegex = "^[a-zA-Z0-9_+-]+(?:\\.[a-zA-Z0-9_+-]+)*@" +
                "([a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}" +
                "(?:(\\.([A-Za-z]{2})))?$";
        ;

        Pattern pattern = Pattern.compile(emailRegex);

        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}