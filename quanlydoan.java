package Javathi;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class quanlydoan {
    private List<doantotnghiep> danhsachdoan = new ArrayList();

    public quanlydoan() {
    }

    public void themDoan(doantotnghiep Doantotnghiep) {
        danhsachdoan.add(Doantotnghiep);
    }

    public void xoadoan(String madoan) {
        danhsachdoan.removeIf((doantotnghiep) -> doantotnghiep.getmadoan().equals(madoan));
    }

    public doantotnghiep timdoan(String maDoan) {
        for(doantotnghiep Doantotnghiep : danhsachdoan) {
            if (Doantotnghiep.getmadoan().equals(maDoan)) {
                return Doantotnghiep;
            }
        }

        return null;
    }

    public void ghixuongtufile(String fileName) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName,true))) {
            for (doantotnghiep Doantotnghiep : this.danhsachdoan) {
                bw.write(
                        "ma do an:"+Doantotnghiep.getmadoan() + "," +
                                "ten do an:"+Doantotnghiep.gettendoan() + "," +
                                "ngay bat dau:"+Doantotnghiep.getNgaybatdaudoan() + "," +
                                "ngay ket thuc:"+Doantotnghiep.getNgaykethucdoan() + "," +
                                "ma sinh vien:"+Doantotnghiep.getSinhvien().getMasinhvien() + "," +
                                "ten sinh vien:"+Doantotnghiep.getSinhvien().getTensinhvien() + "," +
                                "ten giang vien:"+Doantotnghiep.getGiangvien().getTengiangvien()
                );
                bw.newLine();
            }
            System.out.println("Lưu dữ liệu thành công vào file: " + fileName);
        } catch (Exception e) {
            System.out.println("Lỗi khi ghi file: " + e.getMessage());
        }
    }


    public void doctufile(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            danhsachdoan = (List<doantotnghiep>) ois.readObject();
            System.out.println("Đọc dữ liệu từ file thành công.");
        } catch (Exception e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }

    public void hienthidanhsach() {
        for(doantotnghiep Doantotnghiep : danhsachdoan) {
           System.out.println( "ma do an:"+Doantotnghiep.getmadoan() + "\n" +
                   "ma sinh vien:"+Doantotnghiep.getSinhvien().getMasinhvien() + "\n" +
                   "ten sinh vien:"+Doantotnghiep.getSinhvien().getTensinhvien() + "\n" +
                   "ten do an:"+Doantotnghiep.gettendoan() + "\n" +
                    "ngay bat dau:"+Doantotnghiep.getNgaybatdaudoan() + "\n" +
                    "ngay ket thuc:"+Doantotnghiep.getNgaykethucdoan() + "\n" +
                    "ten giang vien:"+Doantotnghiep.getGiangvien().getTengiangvien()+"\n"+
                   "---------------------------------");
        }
    }
}
