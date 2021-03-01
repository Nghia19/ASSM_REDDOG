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

    public NhanVien() {
    }

    public NhanVien(String maNV, String hoTen, double luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luong = luong;
    }

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

    public double getThueTN() {
        return (getThuNhap() < 9000000) ? (double) 0 : ((getThuNhap() <= 15000000) ? getThuNhap() * 0.1 : getThuNhap() * 0.12);

    }

    public abstract double getThuNhap();

    public double getThucNhan() {
        return getThuNhap() - getThueTN();
    }

    public void nhapNhanVien() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Nhập Họ tên: ");
            setHoTen(scanner.nextLine());
            if (getHoTen().isEmpty()) { //isAlpha(getHoTen())
                System.out.println("Nhập dữ liệu sai! Chỉ được nhập ký tự chữ cái!! Mời nhập lại!!!");
            } else {
                break;
            }
        }

        while (true) {
            System.out.print("Nhập Mức lương cơ bản: ");
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

    public void XuatNhanVien() {
        System.out.printf("%-20s\t%-20s\t%-20.2f", getMaNV(), getHoTen(), getLuong());
    }

    public void XuatNhanVienFull(){
    }
    public void XuatNhanVienFull(boolean title) {
        System.out.printf("%-20s\t%-20s\t%-20.2f", getMaNV(), getHoTen(), getLuong());
    }
}
