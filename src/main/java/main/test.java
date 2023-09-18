package main;

import vn.edu.iuh.fit.lab_week_2_nguyenchicuong.db.ConnectDB;

public class test {
    public static void main(String[] args) {
        try {
            ConnectDB con=new ConnectDB();
            System.out.println("Connect thành công");
        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
