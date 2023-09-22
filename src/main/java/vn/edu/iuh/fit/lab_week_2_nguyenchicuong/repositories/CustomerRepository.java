package vn.edu.iuh.fit.lab_week_2_nguyenchicuong.repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;
import vn.edu.iuh.fit.lab_week_2_nguyenchicuong.db.ConnectDB;
import vn.edu.iuh.fit.lab_week_2_nguyenchicuong.models.Customer;

public class CustomerRepository extends  CRUDRepository<Customer> {

    public CustomerRepository(Class<Customer> entityClass) {
        super(entityClass);
    }
}
