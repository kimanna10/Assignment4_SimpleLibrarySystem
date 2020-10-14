package kz.iitu;

public class FactoryProducer {
    final static String BOOK = "BOOK";

    public static AbstractFactory getFactory(String factory){
        if(BOOK.equalsIgnoreCase(factory)){
            return new BookFactory();
        }
        return null;
    }
}
