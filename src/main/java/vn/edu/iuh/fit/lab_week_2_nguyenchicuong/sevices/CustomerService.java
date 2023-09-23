package vn.edu.iuh.fit.lab_week_2_nguyenchicuong.sevices;

import vn.edu.iuh.fit.lab_week_2_nguyenchicuong.models.Customer;

public interface CustomerService {
    public Customer findById(Long id);
    public boolean insert(Customer customer);
    public boolean update(Customer product);
    public boolean delete(Long id);
}
