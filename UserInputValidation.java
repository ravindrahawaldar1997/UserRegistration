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
}
