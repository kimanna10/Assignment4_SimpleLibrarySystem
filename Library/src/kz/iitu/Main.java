package kz.iitu;

public class Main {

    public static void main(String[] args) {
	// write your code here


        //singleton
        LibrarySingleton singleton = LibrarySingleton.getInstance("Main Library");

        //Absrtact create book
        BookFactory bookFactory = new BookFactory();
        Book electronicBook = bookFactory.getBook("ELECTRONIC");
        electronicBook.getName();
        Book originalBook = bookFactory.getBook("ORIGINAL");
        originalBook.getName();

        //builder
        Student student = new Student.StudentBuilder(
                23934, "Anna").setMembership(true).build();
        Pupil pupil = new Pupil.PupilBuilder(
                12452, "Elena").setMembership(false).build();
    }
}
