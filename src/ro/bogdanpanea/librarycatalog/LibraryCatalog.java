package ro.bogdanpanea.librarycatalog;


import java.util.ArrayList;

public class LibraryCatalog {

    private ArrayList<Book> booklist = new ArrayList<Book>();
    private String[] bookProperties;

    public void addNewBook(String[] bookProperties) {

        Book obj = new Book();

        obj = createNewBook(bookProperties[0]);
        obj.createBook(bookProperties);
        booklist.add(obj);
    }

    private Book createNewBook(String category) {

        Book[] books = new Book[]{
                new Novel(),
                new Album(),
        };

        for (Book book :
                books) {
            if (book.getBookCategory(category)) {
                return book;
            }
        }

        return null;
    }

    public void listBook() {
        System.out.println(rightPadding("Title", 20) + "  " + "Number of pages" + "\n");
        for (Book book : booklist) {
            System.out.println(book.toString());
        }
        System.out.println("\n");
    }

    public void listBook(int i) {
        System.out.println(rightPadding("Title", 20) + "  " + "Number of pages" + "\n");
        Book book = booklist.get(i);
        System.out.println(book.toString());
        System.out.println("\n");
    }

    public void deleteBook(int i) {
        booklist.remove(i);
    }

    public void deleteBook() {

        int listSize = booklist.size();

        for (int i = 0; i < listSize; i++) {
            booklist.remove(0);
        }
    }

    public static String rightPadding(String str, int num) {
        return String.format("%1$-" + num + "s", str);
    }

}