package vn.edu.iuh.fit.lab_week_2_nguyenchicuong.implement;

import vn.edu.iuh.fit.lab_week_2_nguyenchicuong.sevices.CustomerService;
import vn.edu.iuh.fit.lab_week_2_nguyenchicuong.models.Customer;
import vn.edu.iuh.fit.lab_week_2_nguyenchicuong.repositories.CustomerRepository;

public class CustomerImplement implements CustomerService {
   private CustomerRepository cusRe;
    public CustomerImplement(){
         cusRe=new CustomerRepository(Customer.class);
    }

    @Override
    public Customer findById(Long id) {
        return cusRe.findById(id);
    }

    @Override
    public boolean insert(Customer customer) {
        return cusRe.insert(customer);
    }

    @Override
    public boolean update(Customer customer) {
        return cusRe.update(customer);
    }

    @Override
    public boolean delete(Long id) {
        return cusRe.delete(id);
    }
}
