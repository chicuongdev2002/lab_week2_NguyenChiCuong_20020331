package vn.edu.iuh.fit.lab_week_2_nguyenchicuong.sevices;

import vn.edu.iuh.fit.lab_week_2_nguyenchicuong.models.ProductImage;
import vn.edu.iuh.fit.lab_week_2_nguyenchicuong.models.ProductPrice;

public interface ProductImageService {
    public ProductImage findById(Long id);
    public boolean insert(ProductImage customer);
    public boolean update(ProductImage entity);
    public boolean delete(Long id);
}
