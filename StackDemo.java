import java.util.Stack;
public class StackDemo {
    public static void main(String[] args) {

        Book20 book1 = new Book20("Laskar Pelangi", "Andrea Hirata");
        Book20 book2 = new Book20("Bumi", "Tere Liye");
        Book20 book3 = new Book20("Negeri 5 Menara", "Ahmad Fuadi");

        Stack<Book20> books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);

        Book20 temp = books.pop();

        if (temp != null) {
            System.out.println(temp.toString());
        }

        Book20 temp2 = books.pop();

        if (temp2 != null) {
            System.out.println(temp2.toString());
        }

        for (Book20 book : books) {
            System.out.println(book.toString());
        }

        System.out.println(books);
    }
}
