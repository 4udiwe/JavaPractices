public class Book {
    private String name;
    private String author;
    private int pagesAmount;
    private int currentPage;

    public Book(String name, String author, int pagesAmount){
        this.name = name;
        this.author = author;
        this.pagesAmount = pagesAmount;
        currentPage = 0;
    }
    public void open(int page){
        if (page <= pagesAmount)
            currentPage = page;
        else
            System.out.println("Wrong page!");
    }
    public void turnpages(int pages){
        if (currentPage + pages > pagesAmount){
            System.out.println("It's the end of the book");
            colse();
        }
        else
            currentPage += pages;
    }
    public void colse(){
        currentPage = 0;
    }
    public String toString(){
        return "Name: " + name + ", Author: " + author + ", page: " + currentPage;
    }
}
