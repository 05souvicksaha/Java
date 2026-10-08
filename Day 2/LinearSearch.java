import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Book {
    private final String isbn;
    private final String title;

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }  
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }
}

class Library {
    private final List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }


    public Book findBook(Book targetBook) {
        for (Book currentBook : books) {
            if (currentBook != null && currentBook.equals(targetBook)) {
                return currentBook;
            }
        }
        return null; 
    }
}


public class Main {
    public static void main(String[] args) {
    
        Library library = new Library();

        
        library.addBook(new Book("978-0134685991", "Effective Java"));
        library.addBook(new Book("978-0132350884", "Clean Code"));

       
        Book searchCriteria = new Book("978-0132350884", "");


        Book foundBook = library.findBook(searchCriteria);

        if (foundBook != null) {
            System.out.println("Book Found! Title: " + foundBook.getTitle());
        } else {
            System.out.println("Book not found in the library.");
        }
    }
}
