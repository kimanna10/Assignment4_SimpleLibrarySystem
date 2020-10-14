package kz.iitu;

public class BookFactory extends AbstractFactory{
    final String ELECTRONIC_BOOK = "ELECTRONIC";
    final String ORIGINAL_BOOK = "ORIGINAL";

    @Override
    Book getBook(String bookName) {
        if(ELECTRONIC_BOOK.equalsIgnoreCase(bookName)){
            return new ElectronicBook();
        } else if(ORIGINAL_BOOK.equalsIgnoreCase(bookName)){
            return new OriginalBook();
        }
        return null;
    }
}
