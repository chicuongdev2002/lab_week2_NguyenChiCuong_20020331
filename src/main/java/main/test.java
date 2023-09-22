package main;

import vn.edu.iuh.fit.lab_week_2_nguyenchicuong.db.ConnectDB;
import vn.edu.iuh.fit.lab_week_2_nguyenchicuong.models.Customer;
import vn.edu.iuh.fit.lab_week_2_nguyenchicuong.repositories.CustomerRepository;

public class test {
    public static void main(String[] args) {
        try {
            //Test connect thành công hay không
//             ConnectDB con=new ConnectDB();
//            System.out.println("Connect thành công");
            //Test insert dữ liệu
//            CustomerRepository cusRe=new CustomerRepository();
//            Customer c=new Customer("Nguyen Van Teo","abc@gmail.com","0367483370","Lê Lợi");
//            boolean rs=cusRe.insert(c);
//            if(rs==true){
//                System.out.println("Them thanh cong");
//            }else {
//                System.out.println("Them that bai");
//            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
