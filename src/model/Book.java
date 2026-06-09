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

}
