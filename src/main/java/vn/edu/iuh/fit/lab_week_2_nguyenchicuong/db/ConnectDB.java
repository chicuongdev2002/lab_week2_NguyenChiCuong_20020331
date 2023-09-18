package vn.edu.iuh.fit.lab_week_2_nguyenchicuong.db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import vn.edu.iuh.fit.lab_week_2_nguyenchicuong.models.Product;
import vn.edu.iuh.fit.lab_week_2_nguyenchicuong.models.ProductImage;

public class ConnectDB {
    private static ConnectDB instance = null;
    private SessionFactory sessionFactory;
    private Session session;

    public ConnectDB() {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure()
                .build();
        Metadata metadata = new MetadataSources(registry)
                .addAnnotatedClass(Product.class)
                .addAnnotatedClass(ProductImage.class)
                .getMetadataBuilder()
                .build();
        sessionFactory = metadata.getSessionFactoryBuilder().build();
        session = sessionFactory.getCurrentSession();
    }

    public static ConnectDB getInstance() {
        if (instance == null)
            instance = new ConnectDB();
        return instance;

    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
