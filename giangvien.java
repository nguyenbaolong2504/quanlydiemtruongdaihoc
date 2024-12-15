package Javathi;

public class giangvien  {
    private String magiangvien;
    private String tengiangvien;
    private String khoa;
    private String chuyennganh;

    public giangvien(String magiangvien, String tengiangvien, String khoa, String chuyennganh) {
        this.magiangvien = magiangvien;
        this.tengiangvien = tengiangvien;
        this.khoa = khoa;
        this.chuyennganh = chuyennganh;
    }
    public giangvien() {

    }

    public String getMagiangvien() {
        return this.magiangvien;
    }

    public void setMagiangvien(String magiangvien) {
        this.magiangvien = magiangvien;
    }

    public String getTengiangvien() {
        return this.tengiangvien;
    }

    public void setTengiangvien(String tengiangvien) {
        this.tengiangvien = tengiangvien;
    }

    public String getKhoa() {
        return this.khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getChuyennganh() {
        return this.chuyennganh;
    }

    public void setChuyennganh(String chuyennganh) {
        this.chuyennganh = chuyennganh;
    }

    public String toString() {
        return "--ten giang vien:" + tengiangvien +""
                + "ma giang vien:" + magiangvien +""
                + "khoa:" + khoa  +""
                +  "chuyen nganh:"+chuyennganh;
    }
}
