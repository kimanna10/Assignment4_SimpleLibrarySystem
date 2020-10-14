package kz.iitu;

import java.util.ArrayList;

public abstract class User {
    private int id;
    private  String name;
    private ArrayList<Book> books = new ArrayList<Book>();
    private boolean membership;

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public boolean isMembership() {
        return membership;
    }



    public ArrayList<Book> getBooks() {
        return books;
    }


    public void borrow(){
    }
    public double calculate(){
        return 0;
    }


}
