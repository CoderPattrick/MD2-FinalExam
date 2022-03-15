package storage;

import model.Contact;

import java.io.*;
import java.util.ArrayList;

public class IOManager {
    public static IOManager IOtool = new IOManager();
    public static ArrayList<Contact> savedContactList = IOtool.readFile();
    public static final String SAVE_PATH = "src\\storage\\saveFiles\\contactList.dat";



    public ArrayList<Contact> readFile(){
        FileInputStream fis;
        try {
            fis = new FileInputStream(SAVE_PATH);
        } catch (FileNotFoundException e) {
            System.err.println("File not found!");
            return new ArrayList<>();
        }
        try {
            ObjectInputStream reader = new ObjectInputStream(fis);
            ArrayList<Contact> list = (ArrayList<Contact>)reader.readObject();
            reader.close();
            fis.close();
            return list;
        } catch (IOException e) {
            System.err.println("Something wrong, cant read file!");
        } catch (ClassNotFoundException e) {
            System.err.println("Type of data in file is invalid, cant read!");
        }
        return new ArrayList<>();
    }
    public void writeFile(ArrayList<Contact> list){
        FileOutputStream fos ;
        ObjectOutputStream writer ;
        try {
            fos = new FileOutputStream(SAVE_PATH);
        } catch (FileNotFoundException e) {
            System.err.println("File not found, created new one!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            writeFile(list);
            return;
        }
        try {
            writer = new ObjectOutputStream(fos);
            writer.writeObject(list);
            writer.close();
            fos.close();
        } catch (IOException e) {
            System.err.println("Something wrong, cant write file!");
        }
    }
}
