import java.util.ArrayList;
public class SortingCustomer20 {
    public static void main(String[] args) {

        ArrayList<Customer20> customers = new ArrayList<>();

        customers.add(new Customer20(1, "Zainab"));
        customers.add(new Customer20(2, "Andi"));
        customers.add(new Customer20(3, "Rara"));

        customers.sort((c1, c2) -> c1.name.compareTo(c2.name));

        System.out.println(customers);
    }
}