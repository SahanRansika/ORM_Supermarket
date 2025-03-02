import config.FactoryConfiguration;
import entity.Customer;
import entity.Order;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Session session=FactoryConfiguration.getInstance().getSession();

        Customer customer = new Customer();
        customer.setName("Sahan");

        List<Order> orders = new ArrayList<>();
        Order order1 = new Order();
        order1.setOrderDate("2025-02-20");
        order1.setCustomer(customer);

        Order order2 = new Order();
        order2.setOrderDate("2025-02-21");
        order2.setCustomer(customer);

        Order order3 = new Order();
        order3.setOrderDate("2025-02-22");
        order3.setCustomer(customer);

        orders.add(order1);
        orders.add(order2);
        orders.add(order3);

        customer.setOrders(orders);

        Transaction transaction = session.beginTransaction();
        session.save(customer);
        transaction.commit();
        session.close();
    }
}
