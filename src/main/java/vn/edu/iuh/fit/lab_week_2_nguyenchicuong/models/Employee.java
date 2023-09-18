package vn.edu.iuh.fit.lab_week_2_nguyenchicuong.models;

import vn.edu.iuh.fit.lab_week_2_nguyenchicuong.enums.EmployeeStatus;

import java.time.LocalDateTime;
import jakarta.persistence.*;
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id", unique = true, nullable = false)
    private Long empId;

    @Column(name = "full_name", columnDefinition = "varchar(255)")
    private String fullName;

    @Column(name = "dob", columnDefinition = "date")
    private LocalDateTime dob;

    @Column(name = "email", columnDefinition = "varchar(255)")
    private String email;

    @Column(name = "phone", columnDefinition = "varchar(20)")
    private String phone;

    @Column(name = "address", columnDefinition = "text")
    private String address;

    @Column(name = "status", columnDefinition = "int(11)")
    private Integer status;

    // Getters and setters

}
