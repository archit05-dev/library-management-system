package model;



public class Transaction {
    private int transactionId;
    private int userId;
    private int bookId;
    private String issueDate;
    private String returnDate;


    public Transaction(int transactionId , int userId , int bookId , String issueDate)
            {
                this.transactionId=transactionId;
                this.userId=userId;
                this.bookId=bookId;
                this.issueDate=issueDate;
                this.returnDate=null;
            }

            public int getTransactionId()
            {
                return transactionId;
            }

            public int getUserId()
            {
                return userId;
            }

            public int getBookId()
            {
                return bookId;
            }

            public String getIssueDate()
            {
                return issueDate;
            }

            public String getReturnDate()
            {
                return returnDate;
            }

            public void returnBook(String returnDate)
            {
                this.returnDate=returnDate;
            }

            @Override
            public String toString()
            {
                return "Transaction ID: " + transactionId +
                       "\nUser ID: " + userId +
                       "\nBook ID: " + bookId +
                       "\nIssue Date: " + issueDate +
                       "\nReturn Date: " + (returnDate != null ? returnDate : "Not returned yet");
            }


            







    
}
