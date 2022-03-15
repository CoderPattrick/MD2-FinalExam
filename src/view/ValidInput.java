package view;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidInput {
    CheckValidContactInfo checker = new CheckValidContactInfo();
    ToScreen toScreen = new ToScreen();
    public String inputStringInfo(String regex){
        Scanner input = new Scanner(System.in);
        String info = input.nextLine();
        if(checker.isValidInfo(info, regex))
            return info;
        toScreen.displayInvalidAndTryAgain();
        return inputStringInfo(regex);
    }
    public int inputIntInfo(String regex){
        Scanner input=new Scanner(System.in);
        int numb;
        try{
            numb = input.nextInt();
        }
        catch (InputMismatchException e){
            toScreen.displayInvalidAndTryAgain();
            return inputIntInfo(regex);
        }
        if(checker.isValidInfo(""+numb,regex)){
            return numb;
        }
        toScreen.displayInvalidAndTryAgain();
        return inputIntInfo(regex);
    }
    public String inputAnyThing(){
        Scanner input = new Scanner(System.in);
        String sth = input.nextLine();
        return sth;
    }
    public LocalDate inputDateOfBirth() {
        toScreen.inputDay();
        int day = inputIntInfo(checker.regexDay);
        toScreen.inputMonth();
        int month = inputIntInfo(checker.regexMonth);
        toScreen.inputYear();
        int year = inputIntInfo(checker.regexYear);

        if (checker.isValidDate(day, month, year)) {
            return LocalDate.of(year, month, day);
        }
//        toScreen.inputGender();
//        return inputDateOfBirth();
        toScreen.displayInvalidAndTryAgain();
        return inputDateOfBirth();
    }
    public String inputMenuChoice(){
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();
        switch (choice){
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
                return choice;
            default:
                toScreen.displayInvalidAndTryAgain();
                return inputMenuChoice();
        }
    }
}
