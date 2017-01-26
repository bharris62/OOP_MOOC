import java.util.ArrayList;

/**
 * Created by blakebharris on 1/25/2017.
 */
public class Library {
    private ArrayList<Book> bookList;

    public Library(){
        this.bookList = new ArrayList<Book>();
    }

    public void addBook(Book newBook) {
        this.bookList.add(newBook);
    }

    public void printBooks(){
        for(Book book : this.bookList) {
            System.out.println(book.toString());
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<>();

        for (Book book : bookList){
            if(StringUtils.included(book.title(), title)) {
                // Book found!
                found.add(book);
            }
        }

        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
            ArrayList<Book> found = new ArrayList<>();

            for (Book book : bookList){
                if(StringUtils.included(book.publisher(), publisher)) {
                    // Book found!
                    found.add(book);
                }
            }

        return found;
        }



    public ArrayList<Book> searchByYear(int year) {
            ArrayList<Book> found = new ArrayList<>();

            for (Book book : bookList){
                if(book.year() == year){
                    found.add(book);
                }
            }

            return found;
        }
    }

