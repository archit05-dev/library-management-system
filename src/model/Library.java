package model;


import java.util.*;
public class Library {



    private ArrayList<Book> books;
    private ArrayList<User> users;
    private ArrayList<Transaction> transactions;

    public Library()
    {
        books=new ArrayList<>();
        users=new ArrayList<>();
        transactions=new ArrayList<>();
    }


    public void addBook(Book book)
    {
        books.add(book);
    }

    public void addUser(User user)
    {
        users.add(user);
    }

    public void displayBooks()
    {
        System.out.println("Books in the Library:");
        for(Book book : books)
        {
            System.out.println(book);
            System.out.println("-------------------");
            
        }
    }

    public void displayUsers()
    {
        System.out.println("Users in Library:");
        for(User user : users)
        {
            System.out.println(user);
            System.out.println("-------------------");
        }
    }

    public void displayTransactions()
    {
        System.out.println("Transactions");
        for(Transaction transaction : transactions)
        {
            System.out.println(transaction);
            System.out.println("-------------------");
        }
    }


    public void issueBook(int transactionId , int userId , int bookId , String issueDate)
    {
       boolean userFound=false;
       for(User user : users)
       {
        if(user.getUserId()==userId)
        {
            userFound=true;
            break;
        }
       }
       if(!userFound)
       {
         System.out.println("User is not registered in the library Please register the user first");
         return;
       }

       boolean transactionExists=false;
       for(Transaction transaction : transactions)
       {
        if(transaction.getTransactionId()==transactionId)
        {
            transactionExists=true;
            break;
        }
       }
         if(transactionExists)
         {
          System.out.println("Transaction ID already exists Please use a unique transaction ID");
          return;
         }

        boolean bookFound=false;
        for(Book book : books)
        {
            if(book.getBookId()==bookId)
            {
                bookFound=true;
                if(!book.isIssued())
                {
                    System.out.println("The Book is Available\nIssuing the book...");
                    book.issueBook();
                    Transaction transaction = new Transaction(transactionId, userId, bookId, issueDate);
                    transactions.add(transaction);
                    System.out.println("Book is issued");
                }
                else
                {
                    System.out.println("Book is already issued");
                }
                break;
            }

        }
        if(!bookFound)
        {
            System.out.println("Book is not available in the library");
        }
    }


    public void returnBook(int transactionId , String returnDate)
    {
        boolean transactionFound=false;
        for(Transaction transaction : transactions)
        {
            if(transaction.getTransactionId()==transactionId)
            {
                transactionFound=true;
                if(transaction.getReturnDate()==null)
                {
                    transaction.returnBook(returnDate);
                    for(Book book : books)
                    {
                        if(book.getBookId()==transaction.getBookId())
                        {
                            book.returnBook();
                            System.out.println("Book is returned successfully");
                            return;
                        }
                    }
                }
                else
                {
                    System.out.println("Book is already returned");
                }
            }
        }
        if(!transactionFound)
        {
            System.out.println("Transaction ID not found");
        }
    }

    
}
