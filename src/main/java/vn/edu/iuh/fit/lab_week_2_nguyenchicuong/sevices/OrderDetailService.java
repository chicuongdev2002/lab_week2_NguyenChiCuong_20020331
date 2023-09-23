package vn.edu.iuh.fit.lab_week_2_nguyenchicuong.sevices;

import vn.edu.iuh.fit.lab_week_2_nguyenchicuong.models.Order;
import vn.edu.iuh.fit.lab_week_2_nguyenchicuong.models.OrderDetail;

public interface OrderDetailService {
    public OrderDetail findById(Long id);
    public boolean insert(OrderDetail customer);
    public boolean update(OrderDetail entity);
    public boolean delete(Long id);
}
