import java.io.*;
import model.*;


public class Main
{
    public static void main(String[] args) throws IOException
    {
        Library library = new Library();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int choice = 0;
        do
        {
                System.out.println("\n===== Library Management System =====");
                System.out.println("1. Add Book");
                System.out.println("2. Add User");
                System.out.println("3. Issue Book");
                System.out.println("4. Return Book");
                System.out.println("5. Display Books");
                System.out.println("6. Display Users");
                System.out.println("7. Display Transactions");
                System.out.println("8. Exit");
        
                System.out.println("Enter your choice: ");

                try
                {
                        choice = Integer.parseInt(br.readLine());

                }
                catch(IOException e)
                {
                        System.out.println("Error reading input. Please try again.");
                        continue;
                }
                catch(NumberFormatException e)
                {
                        System.out.println("Invalid input. Please enter a number.");
                        continue;
                }

                switch(choice)
                {
                    case 1:
                        System.out.println("Enter Book ID: ");
                        int bookId = Integer.parseInt(br.readLine());
                        System.out.println("Enter Book Title: ");
                        String title = br.readLine();
                        System.out.println("Enter Book Author: ");
                        String author = br.readLine();
                        Book book = new Book(bookId, title, author);
                        library.addBook(book);
                        System.out.println("Book added successfully.");
                        break;
                        
                    case 2:
                        System.out.println("Enter User ID: ");
                        int userId = Integer.parseInt(br.readLine());
                        System.out.println("Enter User Name: ");
                        String name = br.readLine();
                        User user = new User(userId, name);
                        library.addUser(user);
                        System.out.println("User added successfully.");
                        break;

                    case 3:
                        System.out.println("Enter Transaction ID: ");
                        int transactionId = Integer.parseInt(br.readLine());
                        System.out.println("Enter User ID: ");
                        int issueUserId = Integer.parseInt(br.readLine());
                        System.out.println("Enter Book ID: ");
                        int issueBookId = Integer.parseInt(br.readLine());
                        System.out.println("Enter Issue Date (YYYY-MM-DD): ");
                        String issueDate = br.readLine();
                        library.issueBook(transactionId, issueUserId, issueBookId, issueDate);
                        break;
                    case 4:
                        System.out.println("Enter Transaction ID: ");
                        int returnTransactionId = Integer.parseInt(br.readLine());
                        System.out.println("Enter Return Date (YYYY-MM-DD): ");
                        String returnDate = br.readLine();
                        library.returnBook(returnTransactionId, returnDate);
                        break;
                    case 5:     
                        library.displayBooks();
                        break;
                    case 6:
                        library.displayUsers();
                        break;
                    case 7:    
                        library.displayTransactions();
                        break; 
                    case 8:
                        System.out.println("Thank you for using the Library Management System. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        
                        
                }
        }
        while(choice != 8);

    }
}