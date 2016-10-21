import Model.Book;
import Repo.BookRepo;

/**
 * Created by hp on 20.10.2016.
 */
public class TestBooks {

    public static void main(String[] args) {
        BookRepo br = new BookRepo();


        Book b1 = br.createBook("Bonda Katarzyna", "Cztery zywioly", 102);
        Book b2 = br.createBook("Hawkins Paul", "Dziewczyna z pociagu", 67);
        Book b3 = br.createBook("Puzyńska Katarzyna", "Dom czwarty", 45);
        Book b4 = br.createBook("Mroz Remigiusz", "Behawiorysta", 54);
        Book b5 = br.createBook("Krajewski Marek", "Mock", 102);
        Book b6 = br.createBook("Mroz Remigiusz", "Behawiorysta", 54);
        br.removeBook(5);
       
        br.removeBook(1);



        System.out.println(br.hasBook(b1));
        System.out.println(br.hasBook(b2));
        System.out.println(br.hasBook(b3));
        System.out.println(br.hasBook(b4));
        System.out.println(br.hasBook(b5));
        System.out.println(br.hasBook(b6));


    }
}
