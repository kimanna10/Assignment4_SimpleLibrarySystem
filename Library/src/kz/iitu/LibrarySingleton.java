package kz.iitu;

public class LibrarySingleton {
    private static LibrarySingleton instance;
    public String value;

    private LibrarySingleton(String value) {
        this.value = value;
    }
    public static LibrarySingleton getInstance(String value) {
        // If there is no any instances, new Singleton will created, otherwise return existing instance
        if (instance==null) {
            instance=new LibrarySingleton(value);
        }
        return instance;
    }


}
