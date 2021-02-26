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
public class NhanVienTiepThi extends NhanVien {

    private double doanhSo;
    private double hueHong;

    public NhanVienTiepThi() {
    }

    public NhanVienTiepThi(double doanhSo, double hueHong, String maNV, String hoTen, double luong) {
        super(maNV, hoTen, luong);
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHueHong() {
        return hueHong;
    }

    public void setHueHong(double hueHong) {
        this.hueHong = hueHong;
    }

    @Override
    public double getThuNhap() {
        return getLuong() + getDoanhSo() * getHueHong();
    }

    @Override
    public void nhapNhanVien() {
        super.nhapNhanVien();
        Scanner scanner = new Scanner(System.in);
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
        while (true) {
            System.out.print("Nhập Tỉ lệ huê hồng: ");
            try {
                setHueHong(Double.parseDouble(scanner.nextLine()));
                if (getHueHong() <= 0) {
                    System.out.println("Tỉ lệ hoa hêu hồng phải lớn hơn 0! Vui lòng nhập lại!");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Tỉ lệ huê hồng vừa nhập không hợp lệ! Vui lòng nhập lại!");
            }
        }
    }

    @Override
    public void XuatNhanVien() {
        super.XuatNhanVien(); //To change body of generated methods, choose Tools | Templates.
        System.out.printf("\t%-20.2f\n", super.getThucNhan());
    }


    @Override
    public void XuatNhanVienFull() {
        super.XuatNhanVienFull(); //To change body of generated methods, choose Tools | Templates.
        System.out.printf("\t%-20.2f\t%-20.2f\t%-20.2f\n", getDoanhSo(), getHueHong(), super.getThucNhan());
    }

}
