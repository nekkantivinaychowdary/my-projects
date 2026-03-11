import java.util.*;

class Library {

    List<Book> books = new ArrayList<>();

    void addBook(int id, String title) {
        books.add(new Book(id, title));
        System.out.println("Book added successfully");
    }

    void showBooks() {
        if(books.isEmpty()){
            System.out.println("No books available");
            return;
        }

        for(Book b : books) {
            System.out.println(b.id + " " + b.title + " " +
            (b.issued ? "Issued" : "Available"));
        }
    }
}