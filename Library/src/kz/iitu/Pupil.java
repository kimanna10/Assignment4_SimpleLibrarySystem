package kz.iitu;

import java.util.ArrayList;

public class Pupil extends User {
    private int id;
    private  String name;
    private ArrayList<Book> books = new ArrayList<Book>();
    private boolean membership;

    @Override
    public int getId() {
        return id;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public ArrayList<Book> getBooks() {
        return books;
    }
    @Override
    public boolean isMembership() {
        return membership;
    }

    private Pupil(PupilBuilder builder) {
        this.id=builder.id;
        this.name = builder.name;
        this.membership=builder.membership;

    }

    //Builder Class
    public static class PupilBuilder{

        private int id;
        private  String name;
        private ArrayList<Book> books = new ArrayList<Book>();
        private boolean membership;

        public PupilBuilder(int id, String name){
            this.id=id;
            this.name=name;
        }

        public PupilBuilder setMembership(boolean isMembership) {
            this.membership = isMembership;
            return this;
        }


        public Pupil build(){
            return new Pupil(this);
        }

    }
}

