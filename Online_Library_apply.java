import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* You have to implement a library using Java Class "Library"
        Methods: addBook, issueBook, returnBook, showAvailableBooks
        Properties: Array to store the available books,
        Array to store the issued books
*/

// In this way we cant modify the size of array so failed this idea
/* 
//  Library
class Library1{
public String booksInLibrary[] ={"chainsaw man","MHA","JJK","One pice","Naruto"};

// The main Problem is Array ka size not changeable -------< Also have not add and other methods

public int numberOFRentedBooks, numberOfBooksPresent, bookTracking ;

void showAvailableBooks(){
    for (String book : booksInLibrary) {
        System.out.print(book +" ");
    }
    System.out.println();
}

void addBook(String book){

}
// check Whether the book is present or not : for that use "Arrays.asList(a).contains("any"): ----> return boolean true or false
} 
*/

// Copy and Idea As In Beginner Level
/*
 class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+ " has been added!");
    }

    void showAvailableBooks(){
        System.out.println("Available Books are:");
        for (String book : this.books) {
            if (book == null){
                continue;
            }
            System.out.println("* " + book);
        }
    }

    void issueBook(String book){
            for (int i=0;i<this.books.length;i++){
            if (this.books[i].equals(book)){
                System.out.println("The book has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist");
    }

    void returnBook(String book){
        addBook(book);
    }

}
 */

/**
 * Library
 */
class Library2 {
    ArrayList<String> books = new ArrayList<String>();
    ArrayList<String> issuedBooks = new ArrayList<String>();
    public int bookTracking;

    Library2() {
        books.add("chainsaw man");
        books.add("MHA");
        books.add("JJK");
        books.add("One pice");
        books.add("Naruto");
        bookTracking = books.size();
        System.out.println("!! Welcome to Our Library !!");
    }

    void showAvailableBooks() {
        Collections.sort(books);
        for (String book : books) {
            System.out.print("'" + book + "'" + " ");
        }
        System.out.println();
        System.out.println("Total Number of Books in Library : " + bookTracking);
    }

    
    /** 
     * @param book
     */
    void addBook(String book) {
        books.add(book);
        bookTracking++;
        System.out.println(book + " added");
    }

    
    /** 
     * @param book
     */
    void issueBook(String book) {
        if (books.contains(book)) {
            books.remove(book);
            issuedBooks.add(book);
            bookTracking--;
            System.out.println("Issued this" + book + "On your name");
            System.out.println("Kindly return the book under 7 days");
        } else {
            System.out.println("Sorry! Book not present");
        }
    }

    
    /** 
     * @param book
     */
    void returnBook(String book) {
        if (issuedBooks.contains(book)) {
            books.add(book);
            bookTracking--;
            System.out.println("Thank You FOr returning the book");
        } else {
            System.out.println("Something Might be wrong that book is not from our library");
        }

    }
}

public class Online_Library_apply {
    public static void main(String[] args) {
        Library2 library = new Library2();

        System.out.println("Follow the instruction >>>>>>>>>");
        System.out.println(
                "\tpress1 : Show the Available Books\n\tpress2 : For Issue a Book\n\tpress3 : For Return Rented Book\n\tpress4 : Donate book");

        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter your choice : ");
                int Choice = sc.nextInt();
                switch (Choice) {
                    case 1:
                        library.showAvailableBooks();
                        break;
                    case 4:
                        System.out.print("Enter Book : ");
                        library.addBook(sc.next());
                        break;
                    case 2:
                        System.out.print("Which Book you want to issued : ");
                        library.issueBook(sc.next());
                        break;
                    case 3:
                        System.out.print("Enter the name of returned book: ");
                        library.returnBook(sc.next());
                        break;
                    default:
                        System.out.println("Invalid Choice");
                }
            }
        }
    }

}
