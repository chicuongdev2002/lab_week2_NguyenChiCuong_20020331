package vn.edu.iuh.fit.lab_week_2_nguyenchicuong.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "product_price")
public class ProductPrice implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_price_id", unique = true, nullable = false)
    private LocalDateTime price_date_time;
    private String note;
    private double price;
}
