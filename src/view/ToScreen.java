package view;

import java.util.Scanner;

public class ToScreen {
    public void displayMenu(){
        System.out.println("----Contact Manager----");
        System.out.println("Choose action by number: ");
        System.out.println("1.View all list");
        System.out.println("2.Add");
        System.out.println("3.Update");
        System.out.println("4.Delete");
        System.out.println("5.Search");
        System.out.println("6.ReadFile");
        System.out.println("7.WriteFile");
        System.out.println("8.Exit");
        System.out.println("Your choice: ");
    }
    public void inputName(){
        System.out.print("Enter name: ");
    }
    public void inputAddress(){
        System.out.print("Enter address: ");
    }
    public void inputPhone(){
        System.out.print("Enter phone: ");
    }
    public void inputMail(){
        System.out.print("Enter mail: ");
    }
    public void inputGender(){
        System.out.print("Enter gender: ");
    }
    public void inputDateOfBirth(){
        System.out.println("Enter your Date of birth.");
    }
    public void inputDay(){
        System.out.print("Enter day: ");
    }
    public void inputMonth(){
        System.out.print("Enter month: ");
    }
    public void inputYear(){
        System.out.print("Enter year: ");
    }
    public void displayInvalidAndTryAgain(){
        System.err.print("Invalid! PLease try again: ");
    }
    public void displayCompletion(){
        System.out.println("Complete!");
    }
    public void displayBackToMenu(){
        System.out.println("Press Enter to get back to menu!");
        Scanner input = new Scanner(System.in);
        input.nextLine();
    }
}
