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
public class TruongPhong extends NhanVien {

    private double trachNhiem;

    public TruongPhong() {
    }

    public TruongPhong(double trachNhiem, String maNV, String hoTen, double luong) {
        super(maNV, hoTen, luong);
        this.trachNhiem = trachNhiem;
    }

    public double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    @Override
    public double getThuNhap() {
        return getLuong() + getTrachNhiem();
    }

    @Override
    public void nhapNhanVien() {
        super.nhapNhanVien();
        Scanner scanner = new Scanner(System.in);
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

    @Override
    public void XuatNhanVien() {
        super.XuatNhanVien(); //To change body of generated methods, choose Tools | Templates.
        System.out.printf("\t%-20.2f\n", super.getThucNhan());
    }

    @Override
    public void XuatNhanVienFull(boolean title) {
        if (title) {
            System.out.printf("%-20s\t%-20s\t%-20s\t%-20s\t%-20s\n", "Mã nhân viên", "Họ và tên", "Lương", "Tiền trách nhiệm", "Thu Nhập");
        }
        super.XuatNhanVienFull(title); //To change body of generated methods, choose Tools | Templates.
        System.out.printf("\t%-20.2f\t%-20.2f\n", getTrachNhiem(), super.getThucNhan());
    }

}
