package com.teksystems;

public class AdultUser implements LibraryUserI {
    public int age;
    public String bookType;

    public AdultUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    @Override
    public String registerAccount() {
        if (age > 12) {
            return "You have successfully registered under an Adult Account";
        } else {
            return "Sorry, Age must be greater than 12 to register as an adult.";
        }
    }

    @Override
    public String requestBook() {
        if(bookType.equals("Fiction")){
            return "Book issued successfully, please return the book within 7 days";
        } else{
            return "Oops, you are allowed to take only adult Fiction books";
        }
    }
}