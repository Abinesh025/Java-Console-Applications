import java.time.Year;

// Create a class for Book 
class Book {
    private int bookId;
    private String name;
    private String author;
    private String category;
    private Boolean isIssued = true;
    private int totPages;
    final Year published = Year.of(2015);
    
    // Create a Constructor for books
        public Book(int bookId,String name,String author,String category,int totPages){
        if(bookId > 0){
            this.bookId = bookId;   
        }else{
            System.out.println("Enter aVa;lid BookId");
        }
        this.name = name;
        this.author = author;
        this.category = category;
        if(totPages > 0){
            this.totPages = totPages;
        }else{
            System.out.println("Enter a Valid Page Number");
        }
    }
    
    // This will give you a Book Id
        public int getBookId(){
            return this.bookId;
        }

    // This will give you a Book Name;
        public String getBookName(){
            return this.name;
        }
    
    //This will return book Category
        public String getBookCategory(){
            return this.category;
        }

    // This will return Book Author Name;
        public String getAuthor(){
            return this.author;
        }

    // This will give a Book published Year
        public Year getYear(){
            return published;
        }

    // This will issues a Book
        public void issueBook(){
            if(isIssued){
                System.out.println("Book is Already Issued");
            }
            else{
                isIssued = true;
                System.out.println("Book is Issued");
            }
        }

    // This will return a Book
        public void returnBook(){
            if(isIssued){
                isIssued = false;
                System.out.println("Book is Returned");
            }else{
                System.out.println("Book is Already Returned");
            }

        }

    //This will return you a value
        public void checkBookStatus(){
            if(isIssued){
                System.out.println( "Book is Not Available");
            }
            else{
                System.out.println("Book is Available");
            }   
        }

    // This is a Update function of a book
        public void updatePage(int extraPageNum){

            if(extraPageNum > 0){
                this.totPages =  this.totPages +  extraPageNum;
            }else{
                System.out.println("Enter a valid pagenumber for Update");
            }
        }
    
    // This will retuns a tot pages number
        public int getPage(){
            return totPages;
        }
}

public class Library {
    
    public static void main(String args[]){
     
        Book book = new Book(25, "Power of Money", "Cristopher Thomson", "Law of Attraction",50);

        System.out.println("Book Id"+" - " + book.getBookId());
        System.out.println("Book Name"+" - " + book.getBookName());
        System.out.println("Author Name"+" - " + book.getAuthor());
        System.out.println("Total Pages"+" - " + book.getPage());
        System.out.println("Book Category"+" - " + book.getBookCategory());
        System.out.println("Published Year"+" - " + book.getYear());
        
        // Validate a Function

        book.updatePage(50);

        book.issueBook();
        book.returnBook();
        book.checkBookStatus();
    }
}
