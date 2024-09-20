import java.util.ArrayList;
import java.util.List;

public class App {

    private List<String> bookList;

    public App () {
        bookList = new ArrayList<String>();
    }

    public void addBook(String book) {
        bookList.add(book);
    }

    public void removeBook(String book) {
        bookList.remove(book);
    }

    public List<String> listBooks(){
        return new ArrayList<>(bookList);
    }



}
