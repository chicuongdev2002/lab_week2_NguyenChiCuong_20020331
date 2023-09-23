package vn.edu.iuh.fit.lab_week_2_nguyenchicuong.sevices;

import vn.edu.iuh.fit.lab_week_2_nguyenchicuong.models.Customer;
import vn.edu.iuh.fit.lab_week_2_nguyenchicuong.models.Order;

public interface OrderService {
    public Order findById(Long id);
    public boolean insert(Order customer);
    public boolean update(Order entity);
    public boolean delete(Long id);
}
