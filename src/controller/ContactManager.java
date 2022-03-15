package controller;

import model.Contact;
import storage.IOManager;
import view.CheckValidContactInfo;
import view.ToScreen;
import view.ValidInput;

import java.time.LocalDate;
import java.util.ArrayList;

public class ContactManager{
    private static ArrayList<Contact> savedContactList = IOManager.savedContactList;
    private ToScreen toScreen = new ToScreen();
    private ValidInput input = new ValidInput();
    private CheckValidContactInfo checker = new CheckValidContactInfo();

    public void exe(){
        toScreen.displayMenu();
        String choice = input.inputMenuChoice();
        switch (choice){
            case "1":

            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
        }
    }
    private void addContact() {
        toScreen.inputName();
        String name = input.inputStringInfo(checker.regexName);
        toScreen.inputPhone();
        String phone = input.inputStringInfo(checker.regexPhone);
        toScreen.inputGender();
        String gender = input.inputStringInfo(checker.regexGender);
        boolean gender1 = false;
        if(gender.equals("male")){
            gender1 = true;
        }
        toScreen.inputAddress();
        String address = input.inputStringInfo(checker.regexAddress);
        toScreen.inputMail();
        String mail = input.inputStringInfo(checker.regexMail);
        toScreen.inputDateOfBirth();
        LocalDate dob = input.inputDateOfBirth();

        Contact newContact = new Contact(name,gender1,address,phone,mail,dob);
        savedContactList.add(newContact);
        toScreen.displayCompletion();
        toScreen.displayBackToMenu();

    }
    private void addContact(Contact contact){
        savedContactList.add(contact);
    }

    public void viewAllContact() {
        for (Contact c:savedContactList
             ) {
            System.out.println(c);
        }
    }

    public void deleteContact() {

    }
    private void deleteContact(Contact contact){
        savedContactList.remove(contact);
    }

    public void updateContact() {

    }

    public void searchContact() {

    }

    public void readFile() {

    }

    public void writeFile() {

    }
}
