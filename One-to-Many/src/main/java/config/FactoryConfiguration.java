package config;


import entity.Customer;
import entity.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration1;
    private SessionFactory sessionFactory;

    private FactoryConfiguration() {
        Configuration configuration = new Configuration().configure();
        configuration.addAnnotatedClass(Customer.class);
        configuration.addAnnotatedClass(Order.class);

        sessionFactory = configuration.buildSessionFactory();
    }

    public static FactoryConfiguration getInstance() {
        if (factoryConfiguration1 == null) {
            factoryConfiguration1 = new FactoryConfiguration();
        }
        return factoryConfiguration1;
    }

    public Session getSession() {
        return sessionFactory.openSession();
    }
}
















