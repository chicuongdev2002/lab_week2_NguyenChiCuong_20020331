package vn.edu.iuh.fit.lab_week_2_nguyenchicuong.repositories;

import vn.edu.iuh.fit.lab_week_2_nguyenchicuong.models.Product;

public class ProductRepository extends CRUDRepository<Product> {
    public ProductRepository(Class<Product> entityClass) {
        super(entityClass);
    }
}
