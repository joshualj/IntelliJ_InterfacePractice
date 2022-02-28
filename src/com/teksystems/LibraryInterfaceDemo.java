package com.teksystems;

public class LibraryInterfaceDemo {

    public static void main(String[] args) {
        KidUser k = new KidUser(10, "Kids");
        KidUser k2 = new KidUser(18, "Fiction");

        System.out.println(k.registerAccount());
        System.out.println(k.requestBook());

        System.out.println(k2.registerAccount());
        System.out.println(k2.requestBook());

        AdultUser a = new AdultUser(5, "Kids");
        AdultUser a2 = new AdultUser(23, "Fiction");

        System.out.println(a.registerAccount());
        System.out.println(a.requestBook());

        System.out.println(a2.registerAccount());
        System.out.println(a2.requestBook());

    }
}

//    Below this line are notes from class:
//    public static void main(String filename) throws FileNotFoundException{
//        try {
//            FileReader fr = new FileReader(filename);
//        } catch(FileNotFoundException e) {
//        }
//    }
//
//    public static void main(String[] args) {
//        //
//        System.out.println("Hello world");
//        try {
//            throw new Exception("problem!!");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

