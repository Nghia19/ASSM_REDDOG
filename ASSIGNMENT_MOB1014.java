/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASSM_REDDOG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author DEV
 */
public class ASSIGNMENT_MOB1014 {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<NhanVien> danhSachNhanVien = new ArrayList<NhanVien>();
    static ArrayList<String> listMaNV = new ArrayList<String>();

    public static void main(String[] args) {

        System.out.print("+++========================================================+++\n");
        System.out.print("|       BÀI GIAI ĐOẠN 2 MÔN MOB1014 - LẬP TRÌNH JAVA 1       |\n");
        System.out.print("|                   Nhóm thực hiện: REDDOG                   |\n");
//        System.out.print("|                       MSSV: PS17048                        |\n");
        System.out.print("+++========================================================+++\n\n");
        mainMenu();
    }

    public static void mainMenu() {

        int select;
        System.out.print("---------------------------[ MENU ]---------------------------\n");
        System.out.println("+------------------------------------------------------------+");
        System.out.println("| 1. Nhập danh sách nhân viên                                |");
        System.out.println("| 2. Xuất danh sách nhân viên                                |");
        System.out.println("| 3. Tìm Mã NV và hiện thị nhân viên                         |");
        System.out.println("| 4. Xóa nhân viên                                           |");
        System.out.println("| 5. Cập nhật thông tin nhân viên                            |");
        System.out.println("| 6. Tìm theo khoảng thu nhập                                |");
        System.out.println("| 7. Sắp xếp nhân viên theo họ tên                           |");
        System.out.println("| 8. Sắp xếp nhân viên theo thu nhập                         |");
        System.out.println("| 9. Sắp xếp 5 nhân viên có thu nhập cao nhất                |");
        System.out.println("| 10.Thoát                                                   |");
        System.out.println("+------------------------------------------------------------+");
        do {
            System.out.print("Chọn chức năng từ 1-10: ");
            select = (int) nhapSo();
        } while (select < 1 || select > 10);
        switch (select) {
            case 1 -> {
                NhapNhanVienMoi();
            }
            case 2 -> {
                xuatDS();
            }
            case 3 -> {
                timNhanVienTheoMS();
            }
            case 4 -> {
                xoaNhanVien();
            }
            case 5 -> {
                searchAndUpdate();
            }
            case 6 -> {
                timKhoangThuNhap();
            }
            case 7 -> {
                sapXepTheoTen();
            }
            case 8 -> {
                sapXepTheoThuNhap();
            }
            case 9 -> {
                sapXepTheoThuNhapCaoNhat();
            }
            case 10 -> {
                System.out.println("Thoát chương trình");
                System.exit(0);
            }
        }

    }

    public static void NhapNhanVienHanhChinh() {
        System.out.println("\n======== NHÂN VIÊN HÀNH CHÍNH ========");
        String maNV;
        do {
            NhanVien nv = new NhanVienHanhChinh();
            while (true) {
                System.out.print("Nhập Mã số Nhân viên (VD: HC123): HC");
                try {
                    maNV = "HC" + Integer.parseInt(scanner.nextLine());
                    if (listMaNV.contains(maNV)) {
                        System.out.println("Mã Nhân viên đã tồn tại! Mời nhập lại!!");
                        continue;
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Chỉ nhập số! Mời nhập lại mã số!!");
                }
            }
            listMaNV.add(maNV);
            nv.setMaNV(maNV);
            nv.nhapNhanVien();
            danhSachNhanVien.add(nv);
            System.out.println("\n-------------------------------------------------------");
            System.out.print("Bạn có muốn tiếp tục? (C/K)");
            if (scanner.nextLine().equalsIgnoreCase("K")) {
                break;
            }
        } while (true);
    }

    public static void NhapNhanVienTiepThi() {
        System.out.println("\n======== NHÂN VIÊN TIẾP THỊ ========");
        String maNV;
        do {
            NhanVien nv = new NhanVienTiepThi();
            while (true) {
                System.out.print("Nhập Mã số Nhân viên (VD: TT123): TT");
                try {
                    maNV = "TT" + Integer.parseInt(scanner.nextLine());
                    if (listMaNV.contains(maNV)) {
                        System.out.println("Mã Nhân viên đã tồn tại! Mời nhập lại!!");
                        continue;
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Chỉ nhập số! Mời nhập lại mã số!!");
                }
            }
            listMaNV.add(maNV);
            nv.setMaNV(maNV);
            nv.nhapNhanVien();
            danhSachNhanVien.add(nv);
            System.out.println("\n-------------------------------------------------------");
            System.out.print("Bạn có muốn tiếp tục? (C/K)");
            if (scanner.nextLine().equalsIgnoreCase("K")) {
                break;
            }
        } while (true);
    }

    public static void NhapTruongPhong() {
        System.out.println("\n======== TRƯỞNG PHÒNG ========");
        String maNV;
        do {
            NhanVien nv = new TruongPhong();
            while (true) {
                System.out.print("Nhập Mã số Nhân viên (VD: TP123): TP");
                try {
                    maNV = "TP" + Integer.parseInt(scanner.nextLine());
                    if (listMaNV.contains(maNV)) {
                        System.out.println("Mã Nhân viên đã tồn tại! Mời nhập lại!!");
                        continue;
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Chỉ nhập số! Mời nhập lại mã số!!");
                }
            }
            listMaNV.add(maNV);
            nv.setMaNV(maNV);
            nv.nhapNhanVien();
            danhSachNhanVien.add(nv);
            System.out.println("\n-------------------------------------------------------");
            System.out.print("Bạn có muốn tiếp tục? (C/K)");
            if (scanner.nextLine().equalsIgnoreCase("K")) {
                break;
            }
        } while (true);
    }

    public static void NhapNhanVienMoi() {
        int select;
        System.out.print("++-------------------------------------------------------++\n");
        System.out.print("|                 Nhập danh sách nhân viên                |\n");
        System.out.print("++-------------------------------------------------------++\n");
        do {
            System.out.println("\n-------------------------------------------------------");
            System.out.println("1. Nhập Nhân viên Hành chính");
            System.out.println("2. Nhập Nhân viên tiếp thị");
            System.out.println("3. Nhập Trưởng phòng");
            System.out.println("-------------------------------------------------------");
            System.out.println("0. Quay lại menu chính");
            do {
                System.out.print("Chọn chức năng từ 0-3: ");
                select = (int) nhapSo();
            } while (select < 0 || select > 3);
            switch (select) {
                case 0 -> {
                    mainMenu();
                }
                case 1 -> {
                    NhapNhanVienHanhChinh();
                }
                case 2 -> {
                    NhapNhanVienTiepThi();
                }
                case 3 -> {
                    NhapTruongPhong();
                }
            }
        } while (true);
    }

    public static void xuatDS() {
        int chon;
        int i;
        do {
            System.out.print("++-------------------------------------------------------++\n");
            System.out.print("|                 Xuất danh sách nhân viên                |\n");
            System.out.print("++-------------------------------------------------------++\n\n");
            if (danhSachNhanVien.size() > 0) {
                boolean nvhc = false;
                for (i = 0; i < listMaNV.size(); i++) {
                    if (listMaNV.get(i).substring(0, 2).equals("HC")) {
                        nvhc = true;
                        break;
                    }
                }
                if (nvhc) {
                    System.out.println("\n======== NHÂN VIÊN HÀNH CHÍNH ========");
                    System.out.printf("%-20s\t%-20s\t%-20s\t%-20s\n", "Mã nhân viên", "Họ và tên", "Lương", "Thu Nhập");
                    for (; i < listMaNV.size(); i++) {
                        if (listMaNV.get(i).substring(0, 2).equals("HC")) {
                            danhSachNhanVien.get(i).XuatNhanVienFull(false);
                        }
                    }
                }
                boolean nvtt = false;
                for (i = 0; i < listMaNV.size(); i++) {
                    if (listMaNV.get(i).substring(0, 2).equals("TT")) {
                        nvtt = true;
                        break;
                    }
                }
                if (nvtt) {
                    System.out.println("\n======== NHÂN VIÊN TIẾP THỊ ========");
                    System.out.printf("%-20s\t%-20s\t%-20s\t%-20s\t%-20s\t%-20s\n", "Mã nhân viên", "Họ và tên", "Lương", "Doanh thu", "Hoa hồng", "Thu Nhập");
                    for (; i < listMaNV.size(); i++) {
                        if (listMaNV.get(i).substring(0, 2).equals("TT")) {
                            danhSachNhanVien.get(i).XuatNhanVienFull(false);
                        }
                    }
                }
                boolean tP = false;
                for (i = 0; i < listMaNV.size(); i++) {
                    if (listMaNV.get(i).substring(0, 2).equals("TP")) {
                        tP = true;
                        break;
                    }
                }
                if (tP) {
                    System.out.println("\n======== TRƯỞNG PHÒNG ========");
                    System.out.printf("%-20s\t%-20s\t%-20s\t%-20s\t%-20s\n", "Mã nhân viên", "Họ và tên", "Lương", "Tiền trách nhiệm", "Thu Nhập");
                    for (; i < listMaNV.size(); i++) {
                        if (listMaNV.get(i).substring(0, 2).equals("TP")) {
                            danhSachNhanVien.get(i).XuatNhanVienFull(false);
                        }
                    }
                }
            } else {
                System.out.println("Chưa có nhân viên nào trong danh sách\n");
            }
            chon = quayLai();
        } while (chon == 1);
    }

    public static void timNhanVienTheoMS() {
        int chon;
        do {
            System.out.print("++-------------------------------------------------------++\n");
            System.out.print("|              Tìm Mã NV và hiện thị nhân viên            |\n");
            System.out.print("++-------------------------------------------------------++\n\n\n");
            if (danhSachNhanVien.size() > 0) {
                String maNV;
                System.out.print("Nhập Mã số Nhân viên: ");
                maNV = scanner.nextLine();
                if (listMaNV.contains(maNV)) {
                    System.out.println("\nĐã tìm thấy!!!\n");
                    danhSachNhanVien.get(listMaNV.indexOf(maNV)).XuatNhanVienFull(true);
                } else {
                    System.out.println(maNV + " Mã số không tìm thấy");
                }
            } else {
                System.out.println("Chưa có nhân viên nào trong danh sách\n");
            }
            chon = quayLai();
        } while (chon == 1);
    }

    public static void xoaNhanVien() {
        int chon;
        do {
            System.out.print("++-------------------------------------------------------++\n");
            System.out.print("|                       Xóa nhân viên                     |\n");
            System.out.print("++-------------------------------------------------------++\n\n\n");
            if (danhSachNhanVien.size() > 0) {
                String maNV;
                System.out.print("Nhập mã nhân viên cần xóa: ");
                maNV = scanner.nextLine();
                if (listMaNV.contains(maNV)) {
                    danhSachNhanVien.get(listMaNV.indexOf(maNV)).XuatNhanVienFull(true);
                    System.out.print("\nBạn có muốn xóa (C/K)");
                    if (scanner.nextLine().equalsIgnoreCase("C")) {
                        danhSachNhanVien.remove(listMaNV.indexOf(maNV));
                        listMaNV.remove(listMaNV.indexOf(maNV));
                        System.out.println("\nĐã xóa thành công");
                    }
                } else {
                    System.out.println(maNV + " Mã số không tìm thấy");
                }
            } else {
                System.out.println("Chưa có nhân viên nào trong danh sách\n");
            }
            chon = quayLai();
        } while (chon == 1);
    }

    public static void searchAndUpdate() {
        int chon;
        do {
            System.out.print("++-------------------------------------------------------++\n");
            System.out.print("|              Cập nhật thông tin nhân viên               |\n");
            System.out.print("++-------------------------------------------------------++\n\n\n");
            if (danhSachNhanVien.size() > 0) {
                String maNV;
                System.out.print("Nhập mã nhân viên cần cập nhật: ");
                maNV = scanner.nextLine();
                if (listMaNV.contains(maNV)) {
                    System.out.println("`````````` Thông tin nhân viên vừa tìm thấy ``````````");
                    danhSachNhanVien.get(listMaNV.indexOf(maNV)).XuatNhanVienFull(true);
                    System.out.print("\nBạn có muốn cập nhật thông tin (C/K)");
                    if (scanner.nextLine().equalsIgnoreCase("C")) {
                        System.out.println("/nCập nhật lại thông tin nhân viên");
                        danhSachNhanVien.get(listMaNV.indexOf(maNV)).nhapNhanVien();
                        System.out.println("/nĐã cập nhật thành công");
                        danhSachNhanVien.get(listMaNV.indexOf(maNV)).XuatNhanVienFull(true);
                    }
                } else {
                    System.out.println(maNV + " Mã số không tìm thấy");
                }
            } else {
                System.out.println("Chưa có nhân viên nào trong danh sách\n");
            }
            chon = quayLai();
        } while (chon == 1);
    }

    public static void timKhoangThuNhap() {
        int chon;
        do {
            System.out.print("++-------------------------------------------------------++\n");
            System.out.print("|                 Tìm theo khoảng thu nhập                 |\n");
            System.out.print("++-------------------------------------------------------++\n\n\n");
            if (danhSachNhanVien.size() > 0) {
                System.out.println("Nhập khoảng thu nhập cần tìm [min - max]");
                double min, max;
                int i;
                boolean flag = false;
                System.out.print("min = ");
                min = nhapSo();
                System.out.print("max = ");
                max = nhapSo();
                for (i = 0; i < danhSachNhanVien.size(); i++) {
                    if (danhSachNhanVien.get(i).getThuNhap() >= min) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    System.out.println("\n======== DANH SÁCH NHÂN VIÊN THEO THU NHẬP TỪ " + min + " đến " + max + " ========");
                    System.out.printf("%-20s\t%-20s\t%-20s\t%-20s\n", "Mã nhân viên", "Họ và tên", "Lương", "Thu Nhập");
                    for (; i < danhSachNhanVien.size(); i++) {
                        if (danhSachNhanVien.get(i).getThuNhap() >= min && danhSachNhanVien.get(i).getThuNhap() <= max) {
                            danhSachNhanVien.get(i).XuatNhanVien();
                        }
                    }
                } else {
                    System.out.println("Không tìm thấy nhân viên theo khoảng thu nhập từ" + min + " đến " + max);
                }
            } else {
                System.out.println("Chưa có nhân viên nào trong danh sách\n");
            }
            chon = quayLai();
        } while (chon == 1);
    }

    public static void sapXepTheoTen() {
        int chon;
        do {
            System.out.print("++-------------------------------------------------------++\n");
            System.out.print("|             Sắp xếp nhân viên theo họ tên             |\n");
            System.out.print("++-------------------------------------------------------++\n\n\n");
            if (danhSachNhanVien.size() > 0) {
                ArrayList<NhanVien> danhSachNhanVienClone = new ArrayList<>(danhSachNhanVien);
                Collections.sort(danhSachNhanVienClone, (a, b) -> b.getHoTen().compareTo(a.getHoTen()));
                System.out.printf("%-20s\t%-20s\t%-20s\t%-20s\n", "Mã nhân viên", "Họ và tên", "Lương", "Thu Nhập");
                danhSachNhanVienClone.forEach(nhanVien -> {
                    nhanVien.XuatNhanVien();
                });
            } else {
                System.out.println("Chưa có nhân viên nào trong danh sách\n");
            }
            chon = quayLai();
        } while (chon == 1);
    }

    public static void sapXepTheoThuNhap() {
        int chon;
        do {
            System.out.print("++-------------------------------------------------------++\n");
            System.out.print("|             Sắp xếp nhân viên theo thu nhập             |\n");
            System.out.print("++-------------------------------------------------------++\n\n\n");
            if (danhSachNhanVien.size() > 0) {
                ArrayList<NhanVien> danhSachNhanVienClone = new ArrayList<>(danhSachNhanVien);
                Collections.sort(danhSachNhanVienClone, (a, b) -> Double.compare(b.getThuNhap(), a.getThuNhap()));
                System.out.printf("%-20s\t%-20s\t%-20s\t%-20s\n", "Mã nhân viên", "Họ và tên", "Lương", "Thu Nhập");
                danhSachNhanVienClone.forEach(nhanVien -> {
                    nhanVien.XuatNhanVien();
                });
            } else {
                System.out.println("Chưa có nhân viên nào trong danh sách\n");
            }
            chon = quayLai();
        } while (chon == 1);
    }

    public static void sapXepTheoThuNhapCaoNhat() {
        int chon;
        do {
            System.out.print("++-------------------------------------------------------++\n");
            System.out.print("|         Sắp xếp 5 nhân viên có thu nhập cao nhất        |\n");
            System.out.print("++-------------------------------------------------------++\n\n\n");
            if (danhSachNhanVien.size() > 0) {
                ArrayList<NhanVien> danhSachNhanVienClone = new ArrayList<>(danhSachNhanVien);
                Collections.sort(danhSachNhanVienClone, (a, b) -> Double.compare(b.getThuNhap(), a.getThuNhap()));
                System.out.printf("%-4s\t%-20s\t%-20s\t%-20s\t%-20s\n", "TOP", "Mã nhân viên", "Họ và tên", "Lương", "Thu Nhập");
                for (int i = 0; i < danhSachNhanVienClone.size();) {
                    danhSachNhanVienClone.get(i).XuatNhanVien();
                    if (++i > 5) {
                        break;
                    }
                }
            } else {
                System.out.println("Chưa có nhân viên nào trong danh sách\n");
            }
            chon = quayLai();
        } while (chon == 1);
    }

    public static int quayLai() {
        int chon;
        System.out.print("\n++-------------------------------------------------------++\n");
        System.out.print("| Bạn có muốn tiếp tục ?                                  |\n");
        System.out.print("| 1. Để tiếp tục                                          |\n");
        System.out.print("| 0. Quay lại menu                                        |\n");
        System.out.print("++-------------------------------------------------------++\n");
        do {
            System.out.print("Bạn chọn (0,1): ");
            chon = (int) nhapSo();
        } while (chon < 0 || chon > 1);
        switch (chon) {
            case 0 -> {
                mainMenu();
            }
            case 1 -> {
                return chon;
            }

        }
        return 0;
    }

    public static double nhapSo() {
        double so;
        while (true) {
            String str = scanner.nextLine();
            try {
                so = Double.parseDouble(str);
            } catch (NumberFormatException ex) {
                System.out.println("Bạn vui lòng một số từ bàn phím: ");
                continue;
            }
            return so;
        }
    }

}
