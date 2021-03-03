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
//lớp con : NhanVienTiepThi
public class NhanVienTiepThi extends NhanVien {

    private double doanhSo;
    private double hoaHong;
    // Hàm tạo có đối số
    public NhanVienTiepThi() {
    }
    // Hàm tạo có đối số
    public NhanVienTiepThi(double doanhSo, double hueHong, String maNV, String hoTen, double luong) {
        super(maNV, hoTen, luong);
        this.doanhSo = doanhSo;
        this.hoaHong = hueHong;
    }
    // Các phương thức getter - setter
    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHueHong() {
        return hoaHong;
    }

    public void setHueHong(double hueHong) {
        this.hoaHong = hueHong;
    }
    // Kế thừa hàm getThuNhap() từ lớp NhanVien
    @Override
    public double getThuNhap() {
        return getLuong() + getDoanhSo() * getHueHong();
    }
    // Kế thừa hàm nhapNhanVien() từ lớp NhanVien
    @Override
    public void nhapNhanVien() {
        super.nhapNhanVien();
        Scanner scanner = new Scanner(System.in);
        // Chỉ cho phép nhập số
        while (true) {
            System.out.print("Nhập Doanh số bán hàng: ");
            try {
                setDoanhSo(Double.parseDouble(scanner.nextLine()));
                if (getDoanhSo() <= 0) {
                    System.out.println("Doanh số phải lớn hơn 0! Vui lòng nhập lại!");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Doanh số bán hàng vừa nhập không hợp lệ! Vui lòng nhập lại!");
            }
        }
        // Chỉ cho phép nhập số
        while (true) {
            System.out.print("Nhập Tỉ lệ hoa hồng: ");
            try {
                setHueHong(Double.parseDouble(scanner.nextLine()));
                if (getHueHong() <= 0 || getHueHong() >=100) {
                    System.out.println("Tỉ lệ hoa hoa hồng phải lớn hơn 0 và nhỏ hơn 100! Vui lòng nhập lại!");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Tỉ lệ hoa hồng vừa nhập không hợp lệ! Vui lòng nhập lại!");
            }
        }
    }
     // Kế thừa hàm xuatNhanVien() từ lớp NhanVien
    @Override
    public void xuatNhanVien() {
        super.xuatNhanVien(); 
        System.out.printf("\t%-20.2f\n", super.getThucNhan());
    }
    // Kế thừa hàm xuatNhanVienFull() từ lớp NhanVien
    @Override
    public void xuatNhanVienFull() {
        super.xuatNhanVienFull();
    }   
     // Kế thừa hàm xuatNhanVienFull(boolean title) từ lớp NhanVien
    @Override
    public void xuatNhanVienFull(boolean title) {
        if (title) {
            System.out.printf("%-20s\t%-20s\t%-20s\t%-20s\t%-20s\t%-20s\n", "Mã nhân viên", "Họ và tên", "Lương", "Doanh thu", "Hoa hồng", "Thu Nhập");
        }
        super.xuatNhanVienFull(title); 
        System.out.printf("\t%-20.2f\t%-20.2f\t%-20.2f\n", getDoanhSo(), getHueHong(), super.getThucNhan());
    }

}
