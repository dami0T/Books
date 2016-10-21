package Repo;

import Model.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hp on 20.10.2016.
 */

public class BookRepo {

    private List<Book> books = new ArrayList<>();
    private Integer key = 1;
    private int bookHa;

    public Book createBook(String author, String title, Integer price) {
        Book b = new Book();
        b.setBookId(key++);
        b.setAuthor(author);
        b.setTitle(title);
        b.setPrice(price);
        books.add(b);
        return b;
    }
    public void removeBook(int key){
        books.remove(key);
    }

    public Book findBookForKey(Integer key) {
        for (Book b : books) {
            if (b.getBookId().equals(key)) return b;
        }
        return null;
    }

    public List<Book> findBookTitleStartingWith(String prefixTitle) {
        List<Book> prefix = new ArrayList<>();
        for (Book b : books) {
            if (b.getTitle().startsWith(prefixTitle)) prefix.add(b);
        }
        return prefix;
    }

    public List<Book> writeAll() {
      return books ;
    }

    public List<Book> findWithAuthor(String author) {
        List<Book> authorName = new ArrayList<>();
        for (Book b : books) {
            if (b.getAuthor().equals(author)) authorName.add(b);
        }
        return authorName;
    }

    public Boolean hasBook(Book book) {
        for (Book b:books) {
            if (b.equals(book)&&
                        b.hashCode() == book.hashCode()&&
                            books.contains(b))return true;
        }
        return false;
    }
}
