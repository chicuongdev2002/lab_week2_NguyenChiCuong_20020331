package vn.edu.iuh.fit.lab_week_2_nguyenchicuong.models;

import java.time.LocalDateTime;
import java.util.List;
import jakarta.persistence.*;
public class Order {
    private LocalDateTime orderDate;
    private Customer customer;
    private long order_id;
    private Employee employee;
    private List<OrderDetail> orderDetails;
}
