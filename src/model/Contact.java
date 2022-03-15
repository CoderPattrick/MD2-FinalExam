package model;

import java.time.LocalDate;

public class Contact {
    String name;
    boolean gender;
    String address;
    String phone;
    String mail;
    LocalDate dateOfBirth;

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", mail='" + mail + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Contact(String name, boolean gender, String address, String phone, String mail, LocalDate dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
        this.mail = mail;
        this.dateOfBirth = dateOfBirth;
    }

    public Contact() {
    }
}
