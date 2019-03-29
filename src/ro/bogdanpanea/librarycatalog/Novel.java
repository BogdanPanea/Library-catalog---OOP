package ro.bogdanpanea.librarycatalog;


public class Novel extends Book {

    private String type;
    private String year;

    public void createBook(String[] bookProperties) {
        this.setName(bookProperties[1]);
        this.setPagesNumber(Integer.parseInt(bookProperties[2]));
        this.type = bookProperties[3];
        this.year = bookProperties[4];
    }

    public String getType() {
        return type;
    }

    public String getYear() {
        return year;
    }

    public boolean getBookCategory(String category) {
        return category == "novel";
    }

    @Override
    public String toString() {
        return rightPadding(this.getName(), 20) + "  " + rightPadding(Integer.toString(this.getPagesNumber()), 20) + "  " + "Type :" + " " + rightPadding(this.getType(), 20) + " " + "Year :" + " " + this.getYear();
    }
}
