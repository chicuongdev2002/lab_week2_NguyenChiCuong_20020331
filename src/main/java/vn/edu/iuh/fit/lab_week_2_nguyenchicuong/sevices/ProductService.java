package vn.edu.iuh.fit.lab_week_2_nguyenchicuong.sevices;

import vn.edu.iuh.fit.lab_week_2_nguyenchicuong.models.Customer;
import vn.edu.iuh.fit.lab_week_2_nguyenchicuong.models.Product;
//Lớp hiện thực
public interface ProductService {
    public Product findById(Long id);
    public boolean insert(Product product);
    public boolean update(Product product);
    public boolean delete(Long id);
}
