package com.teksystems;

public class KidUser implements LibraryUserI {
    public int age;
    public String bookType;

    public KidUser(int age, String bookType){
        this.age = age;
        this.bookType = bookType;
    }

    @Override
    public String registerAccount() {
        if (age < 12) {
            return "You have successfully registered under a Kids Account";
        } else {
            return "Sorry, age must be less than 12 to register as a Kid.";
        }
    }

    @Override
    public String requestBook() {
        if(bookType.equals("Kids")){
            return "Book issued successfully, please return the book within 10 days";
        } else{
            return "Oops, you are allowed to take only kids books";
        }
    }
}
