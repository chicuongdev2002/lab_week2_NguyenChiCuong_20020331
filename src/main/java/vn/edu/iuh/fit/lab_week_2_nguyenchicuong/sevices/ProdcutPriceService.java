package vn.edu.iuh.fit.lab_week_2_nguyenchicuong.sevices;

import vn.edu.iuh.fit.lab_week_2_nguyenchicuong.models.Employee;
import vn.edu.iuh.fit.lab_week_2_nguyenchicuong.models.ProductPrice;

public interface ProdcutPriceService {
    public ProductPrice findById(Long id);
    public boolean insert(ProductPrice customer);
    public boolean update(ProductPrice entity);
    public boolean delete(Long id);
}
