import model.*;

public class Main
{
    public static void main(String[] args)
    {
        Library library = new Library();

        // Create Users
        User u1 = new User(1, "Archit");
        User u2 = new User(2, "Rahul");

        // Add Users
        library.addUser(u1);
        library.addUser(u2);

        // Create Books
        Book b1 = new Book(
                101,
                "Merchant Of Venice",
                "William Shakespeare"
        );

        Book b2 = new Book(
                102,
                "Atomic Habits",
                "James Clear"
        );

        // Add Books
        library.addBook(b1);
        library.addBook(b2);

        // Display Initial State
        System.out.println("\n===== BOOKS BEFORE ISSUE =====");
        library.displayBooks();

        // Issue Book
        System.out.println("\n===== ISSUE BOOK =====");
        library.issueBook(
                1,              // transactionId
                1,              // userId
                101,            // bookId
                "2026-06-12"    // issueDate
        );

        // Display Books After Issue
        System.out.println("\n===== BOOKS AFTER ISSUE =====");
        library.displayBooks();

        // Display Transactions
        System.out.println("\n===== TRANSACTIONS =====");
        library.displayTransactions();

        // Return Book
        System.out.println("\n===== RETURN BOOK =====");
        library.returnBook(
                1,
                "2026-06-20"
        );

        // Display Books After Return
        System.out.println("\n===== BOOKS AFTER RETURN =====");
        library.displayBooks();

        // Display Transactions Again
        System.out.println("\n===== TRANSACTIONS AFTER RETURN =====");
        library.displayTransactions();

        // Try Returning Again
        System.out.println("\n===== RETURN SAME BOOK AGAIN =====");
        library.returnBook(
                1,
                "2026-06-21"
        );
    }
}