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
public abstract class NhanVien {

    private String maNV;
    private String hoTen;
    private double luong;

    //Hàm tạo không đối số
    public NhanVien() {
    }

    //Hàm tạo có đối số
    public NhanVien(String maNV, String hoTen, double luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    // Các phương thức getter - setter
    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    // Hàm tính thuế thu nhập
    public double getThueTN() {
        return (getThuNhap() < 9000000) ? (double) 0 : ((getThuNhap() <= 15000000) ? getThuNhap() * 0.1 : getThuNhap() * 0.12);

    }

    // Hàm trừu tượng
    public abstract double getThuNhap();

    // Hàm lương thực nhận
    public double getThucNhan() {
        return getThuNhap() - getThueTN();
    }

    // Hàm nhập nhân viên
    public void nhapNhanVien() {
        Scanner scanner = new Scanner(System.in);
        // Nhập tên nhân viên
        while (true) {
            System.out.print("Nhập Họ tên: ");
            setHoTen(scanner.nextLine());
            if (getHoTen().isEmpty()) { // kiểm tra chuỗi rỗng
                System.out.println("Nhập dữ liệu sai! Chỉ được nhập ký tự chữ cái!! Mời nhập lại!!!");
            } else {
                break;
            }
        }
        // Nhập lương nhân viên
        while (true) {
            System.out.print("Nhập Mức lương cơ bản: ");
            // Chỉ cho phép nhập số
            try {
                setLuong(Double.parseDouble(scanner.nextLine()));
                if (getLuong() <= 0) {
                    System.out.println("Mức lương phải lớn hơn 0! Vui lòng nhập lại!");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Mức lương vừa nhập không hợp lệ! Vui lòng nhập lại!");
            }
        }
    }
    // Hàm xuất thông tin cơ bản của nhân viên
    public void xuatNhanVien() {
        System.out.printf("%-20s\t%-20s\t%-20.2f", getMaNV(), getHoTen(), getLuong());
    }
    // Hàm xuất thông tin đầy đủ của nhân viên không đối số
    public void xuatNhanVienFull() {
    }
    // Hàm xuất thông tin đầy đủ của nhân viên có đối số
    public void xuatNhanVienFull(boolean title) {
        System.out.printf("%-20s\t%-20s\t%-20.2f", getMaNV(), getHoTen(), getLuong());
    }
}
