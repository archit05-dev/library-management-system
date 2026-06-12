package model;



public class Book {

    
    
private int bookId;
private String title;
private String author;
private boolean isIssued;

    public Book(int bookId , String title , String author)
          {
            this.bookId=bookId;
            this.title=title;
            this.author=author;
            this.isIssued=false;
          }
           

     public String getTitle()
           {
             return title;
           }
      public void setTitle(String title)
           {
             this.title=title;
           }

      public String getAuthor()
           {
             return author;
           }
      public void setAuthor(String author)
           {
             this.author=author;
           }     

      public boolean isIssued()
           {
             return isIssued;
           }
           
      public int getBookId()
           {
            return bookId;
           }


      public void issueBook()
          {
             if(!isIssued)
               isIssued=true;
             else
               System.out.println("Book is already issued");
          }

      public void returnBook()
          {
               if(isIssued)
                    isIssued=false;
               else
                    System.out.println("Book is not issued");

          }
      
           
      @Override
      public String toString()
           {
            return "Book ID: " + bookId + 
                   "\nTitle: " + title + 
                   "\nAuthor: " + author + 
                   "\nAvailable: " + (isIssued ? "No" : "Yes");             
           }     
           



}
