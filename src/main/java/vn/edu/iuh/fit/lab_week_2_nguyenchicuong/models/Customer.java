package vn.edu.iuh.fit.lab_week_2_nguyenchicuong.models;


import jakarta.persistence.*;
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cust_id", unique = true, nullable = false)
    private Long custId;

    @Column(name = "cust_name", columnDefinition = "varchar(255)")
    private String custName;

    @Column(name = "email", columnDefinition = "varchar(255)")
    private String email;

    @Column(name = "phone", columnDefinition = "varchar(20)")
    private String phone;

    @Column(name = "address", columnDefinition = "text")
    private String address;

    // Getters and setters
}
