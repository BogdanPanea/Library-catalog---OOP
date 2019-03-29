package ro.bogdanpanea.librarycatalog;


public class Main {
    public static void main(String... args) {
        LibraryCatalog catalog = new LibraryCatalog();

        //catalog.addNewBook(new String[]{"novel", "title", "number of pages", "type", "year"});
        catalog.addNewBook(new String[]{"novel", "Ion", "435", "Istoric", "1965"});
        catalog.addNewBook(new String[]{"novel", "Morometii", "257", "Realism", "1970"});

        //catalog.addNewBook(new String[]{"album", "title", "number of pages", "paper quality"});
        catalog.addNewBook(new String[]{"album", "Bucuresti", "67", "Extra"});
        catalog.addNewBook(new String[]{"album", "Muntii Vrancei", "57", "Medie"});

        catalog.listBook();
        catalog.deleteBook();

        catalog.addNewBook(new String[]{"album", "Bucuresti", "67", "Extra"});

        catalog.listBook();
    }
}