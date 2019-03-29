package ro.bogdanpanea.librarycatalog;


public class Album extends Book {

    private String paperQuality;

    public void createBook(String[] bookProperties) {
        this.setName(bookProperties[1]);
        this.setPagesNumber(Integer.parseInt(bookProperties[2]));
        this.paperQuality = bookProperties[3];
    }

    public String getPaperQuality() {
        return paperQuality;
    }

    public boolean getBookCategory(String category) {
        return category == "album";
    }

    @Override
    public String toString() {
        return rightPadding(this.getName(), 20) + "  " + rightPadding(Integer.toString(this.getPagesNumber()), 20) + "  " + rightPadding("Paper quality:", 20) + " " + this.getPaperQuality();
    }
}
