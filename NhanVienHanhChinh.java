/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASSM_REDDOG;

/**
 *
 * @author DEV
 */
public class NhanVienHanhChinh extends NhanVien {

    public NhanVienHanhChinh() {
    }

    public NhanVienHanhChinh(String maNV, String hoTen, double luong) {
        super(maNV, hoTen, luong);
    }

    @Override
    public double getThuNhap() {
        return getLuong();
    }

    @Override
    public void XuatNhanVien() {
        super.XuatNhanVien(); //To change body of generated methods, choose Tools | Templates.
        System.out.printf("\t%-20.2f\n", super.getThucNhan());
    }

    @Override
    public void XuatNhanVienFull(boolean title) {
        if (title) {
            System.out.printf("%-20s\t%-20s\t%-20s\t%-20s\n", "Mã nhân viên", "Họ và tên", "Lương", "Thu Nhập");
        }
        super.XuatNhanVienFull(title); //To change body of generated methods, choose Tools | Templates.
        System.out.printf("\t%-20.2f\n", super.getThucNhan());
    }

}
