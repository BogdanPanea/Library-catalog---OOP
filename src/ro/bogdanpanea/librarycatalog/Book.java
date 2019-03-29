package ro.bogdanpanea.librarycatalog;


public class Book {

    private String name;
    private Integer pagesNumber;

    public void createBook(String[] bookProperties) {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPagesNumber(Integer pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    public String getName() {
        return name;
    }

    public Integer getPagesNumber() {
        return pagesNumber;
    }

    public boolean getBookCategory(String category) {
        return false;
    }

    @Override
    public String toString() {
        return rightPadding(this.getName(), 20) + "  " + rightPadding(Integer.toString(this.getPagesNumber()), 20);
    }

    public static String rightPadding(String str, int num) {
        return String.format("%1$-" + num + "s", str);

    }
}