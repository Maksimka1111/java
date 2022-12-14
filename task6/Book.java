package task6;

public class Book implements Printable {
    String bookName, author;
    public Book(String Name, String Author){
        bookName = Name;
        author = Author;
    }
    @Override
    public void print() {
        System.out.println("Book name: " + bookName + "\n" + "Author: " + author);
    }
}
