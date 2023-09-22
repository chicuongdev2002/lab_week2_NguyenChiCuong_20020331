package vn.edu.iuh.fit.lab_week_2_nguyenchicuong.repositories;

import vn.edu.iuh.fit.lab_week_2_nguyenchicuong.models.Order;

public class OrderRepository extends CRUDRepository<Order> {

    public OrderRepository(Class<Order> entityClass) {
        super(entityClass);
    }
}
