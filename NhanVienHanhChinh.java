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
        return getLuong() - getThueTN();
    }

    @Override
    public void XuatNhanVien() {
        super.XuatNhanVien(); //To change body of generated methods, choose Tools | Templates.
        System.out.printf("\t%-20.2f\n", getThuNhap());
    }

    @Override
    public void XuatNhanVienFull() {
        super.XuatNhanVienFull(); //To change body of generated methods, choose Tools | Templates.
        System.out.printf("\t%-20.2f\n", getThuNhap());
    }

}
