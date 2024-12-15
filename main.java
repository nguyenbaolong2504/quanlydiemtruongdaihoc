package Javathi;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        quanlydoan quanlydoan = new quanlydoan();

        while(true) {
            System.out.println("------------bang chuc nang---------------");
            System.out.println("1.nhap thong tin do an tot nghiep truong dai hoc cong nghe dong a");
            System.out.println("2.xoa do an tot nghiep truong dai hoc cong nghe dong a");
            System.out.println("3.tim do an tot nghiep truong dai hoc cong nghe dong a");
            System.out.println("4.in thong tin do an tot nghiep truong dai hoc cong nghe dong a");
            System.out.println("5.Luu thong tin do an tot nghiep truong dai hoc cong nghe dong a vao file");
            System.out.println("0.thoat chuong trinh");
            System.out.println("chon chuc nang");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.println("nhap ma sinh vien:");
                    String masinhvien = sc.nextLine();
                    System.out.println("nhap ten sinh vien:");
                    String tensinhvien = sc.nextLine();
                    System.out.println("nhap khoa hoc:");
                    String khoahoc = sc.nextLine();
                    System.out.println("nhap lop hoc:");
                    String lophoc = sc.nextLine();
                    System.out.println("nhap ma giang vien:");
                    String magiangvien = sc.nextLine();
                    System.out.println("nhap ten giang vien:");
                    String tengiangvien = sc.nextLine();
                    System.out.println("nhap khoa:");
                    String khoa = sc.nextLine();
                    System.out.println("nhap chuyen nganh:");
                    String chuyennganh = sc.nextLine();
                    System.out.println("nhap ma do an");
                    String madoan = sc.nextLine();
                    System.out.println("nhap ten do an:");
                    String tendoan = sc.nextLine();
                    System.out.println("nhap ngay bat dau");
                    int ngaybat = sc.nextInt();
                    System.out.println("nhap ngay ket thuc:");
                    int ketthuc = sc.nextInt();
                    sinhvien Sinhvien = new sinhvien(masinhvien, tensinhvien, khoahoc, lophoc);
                    giangvien Giangvien = new giangvien(magiangvien, tengiangvien, khoa, chuyennganh);
                    doantotnghiep doantotnghiep = new doantotnghiep(madoan, tendoan,ngaybat,ketthuc, Sinhvien, Giangvien);
                    quanlydoan.themDoan(doantotnghiep);
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("nhap so ma do an");
                    String xoamadoan = sc.nextLine();
                    quanlydoan.xoadoan(xoamadoan);
                    System.out.println("Xoa do an thanh cong!");
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("nhap ma do an can tim");
                    String Madoan = sc.nextLine();
                    doantotnghiep doantim = quanlydoan.timdoan(Madoan);
                    if (doantim != null) {
                        System.out.println("Do an tim thay:" + doantim);
                    } else {
                        System.out.println("Khong tim thay do an!");
                    }
                    break;
                case 4:
                    quanlydoan.hienthidanhsach();
                    break;
                case 5:
                    quanlydoan.ghixuongtufile("D:/javaeaut/mydata/baithinhom89.txt");
                    System.out.println("Luu file thanh cong!");
                    break;
                case 0:
                    System.out.println("thoat chuong trinh");
                    break;
            }
        }
    }
}
