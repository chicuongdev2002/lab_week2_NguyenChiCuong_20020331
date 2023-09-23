package vn.edu.iuh.fit.lab_week_2_nguyenchicuong.sevices;

import vn.edu.iuh.fit.lab_week_2_nguyenchicuong.models.Employee;
import vn.edu.iuh.fit.lab_week_2_nguyenchicuong.models.Order;

public interface EmployeeService {
    public Employee findById(Long id);
    public boolean insert(Employee customer);
    public boolean update(Employee entity);
    public boolean delete(Long id);
}
