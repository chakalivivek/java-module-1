public class Book {

    String title;
    String author;
    double price;

   
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

   
    void showDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs " + price);
        System.out.println();
    }

   
    void showDetails(String title) {
        System.out.println("Book Title: " + title);
    }


    public static void main(String[] args) {
        Book b1 = new Book("The Alchemist", "Paulo Coelho", 499.99);

        System.out.println("Showing full details:");
        b1.showDetails();

        System.out.println("Showing only title:");
        b1.showDetails(b1.title);
    }
}
