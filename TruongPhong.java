/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASSM_REDDOG;

import java.util.Scanner;

/**
 *
 * @author DEV
 */
//lớp con : TruongPhong
public class TruongPhong extends NhanVien {

    private double trachNhiem;
    // Hàm tạo có đối số
    public TruongPhong() {
    }
    // Hàm tạo có đối số
    public TruongPhong(double trachNhiem, String maNV, String hoTen, double luong) {
        super(maNV, hoTen, luong);
        this.trachNhiem = trachNhiem;
    }
    // Các phương thức getter - setter
    public double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }
    // Kế thừa hàm getThuNhap() từ lớp NhanVien
    @Override
    public double getThuNhap() {
        return getLuong() + getTrachNhiem();
    }
    // Kế thừa hàm nhapNhanVien() từ lớp NhanVien
    @Override
    public void nhapNhanVien() {
        super.nhapNhanVien();
        Scanner scanner = new Scanner(System.in);
        // Chỉ cho phép nhập số
        while (true) {
            System.out.print("Nhập Lương trách nhiệm: ");
            try {
                setTrachNhiem(Double.parseDouble(scanner.nextLine()));
                if (getTrachNhiem() <= 0) {
                    System.out.println("Lương phải lớn hơn 0! Vui lòng nhập lại!");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Lương trách nhiệm vừa nhập không hợp lệ! Vui lòng nhập lại!");
            }
        }
    }
    // Kế thừa hàm xuatNhanVien() từ lớp NhanVien
    @Override
    public void xuatNhanVien() {
        super.xuatNhanVien(); //To change body of generated methods, choose Tools | Templates.
        System.out.printf("\t%-20.2f\n", super.getThucNhan());
    }
     // Kế thừa hàm xuatNhanVienFull() từ lớp NhanVien
    @Override
    public void xuatNhanVienFull() {
        super.xuatNhanVienFull(); //To change body of generated methods, choose Tools | Templates.
    }
     // Kế thừa hàm xuatNhanVienFull(boolean title) từ lớp NhanVien
    @Override
    public void xuatNhanVienFull(boolean title) {
        if (title) {
            System.out.printf("%-20s\t%-20s\t%-20s\t%-20s\t%-20s\n", "Mã nhân viên", "Họ và tên", "Lương", "Tiền trách nhiệm", "Thu Nhập");
        }
        super.xuatNhanVienFull(title); //To change body of generated methods, choose Tools | Templates.
        System.out.printf("\t%-20.2f\t%-20.2f\n", getTrachNhiem(), super.getThucNhan());
    }

}
