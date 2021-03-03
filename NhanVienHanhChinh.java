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
//lớp con : NhanVienHanhChinh
public class NhanVienHanhChinh extends NhanVien {
    // Hàm tạo không đối số
    public NhanVienHanhChinh() {
    }
    // Hàm tạo có đối số
    public NhanVienHanhChinh(String maNV, String hoTen, double luong) {
        super(maNV, hoTen, luong); //Gọi lại constructor của lớp cha
    }
    // Kế thừa hàm getThuNhap() từ lớp NhanVien
    @Override
    public double getThuNhap() {
        return getLuong();
    }
    // Kế thừa hàm xuatNhanVien() từ lớp NhanVien
    @Override
    public void xuatNhanVien() {
        super.xuatNhanVien(); 
        System.out.printf("\t%-20.2f\n", super.getThucNhan()); //Gọi lại constructor của lớp cha
    }
    // Kế thừa hàm xuatNhanVienFull() từ lớp cha NhanVien
    @Override
    public void xuatNhanVienFull() {
        super.xuatNhanVienFull();
    }
    // Kế thừa hàm xuatNhanVienFull(boolean title) từ lớp cha NhanVien
    @Override
    public void xuatNhanVienFull(boolean title) {
        if (title) {
            System.out.printf("%-20s\t%-20s\t%-20s\t%-20s\n", "Mã nhân viên", "Họ và tên", "Lương", "Thu Nhập");
        }
        super.xuatNhanVienFull(title);
        System.out.printf("\t%-20.2f\n", super.getThucNhan());
    }

}
