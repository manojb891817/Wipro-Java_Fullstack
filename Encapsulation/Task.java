
// Author class
class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    // toString() method for easy display

    public String Author_dis() {
        return "\nAuthor [Name: " + name + ", Email: " + email + ", Gender: " + gender + "]";
    }
}

// Book class
class Book {
    // Member variables
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    // Parameterized constructor
    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    // toString() method

    public String Book_dis() {
        return "Book [Name: " + name + ", Price: " + price + ", Quantity: " + qtyInStock + "], " + author.Author_dis() ;
    }
}

// Main class
public class Task {
    public static void main(String[] args) {
        // Create an Author object
        Author author = new Author("J.K. Rowling", "jkrowling@example.com", 'F');

        // Create a Book object
        Book book = new Book("Harry Potter and the Philosopher's Stone", author, 499.99, 100);

        // Print book details (including author details)
        System.out.println(book.Book_dis());
    }
}