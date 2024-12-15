package Javathi;



public class sinhvien   {
    private String masinhvien;
    private String tensinhvien;
    private String khoahoc;
    private String lop;

    public sinhvien() {
    }

    public sinhvien(String masinhvien, String tensinhvien, String khoahoc, String lop) {
        this.masinhvien = masinhvien;
        this.tensinhvien = tensinhvien;
        this.khoahoc = khoahoc;
        this.lop = lop;
    }

    public String getMasinhvien() {
        return this.masinhvien;
    }

    public void setMasinhvien(String masinhvien) {
        this.masinhvien = masinhvien;
    }

    public String getTensinhvien() {
        return this.tensinhvien;
    }

    public void setTensinhvien(String tensinhvien) {
        this.tensinhvien = tensinhvien;
    }

    public String getKhoahoc() {
        return this.khoahoc;
    }

    public void setKhoahoc(String khoahoc) {
        this.khoahoc = khoahoc;
    }

    public String getLop() {
        return this.lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String toString() {
        return "--ma sinh vien:" + masinhvien +""
                + "ten sinh vien:" + tensinhvien +""
                + "khoa hoc:" + khoahoc +""
                + "lop:" + lop;
    }

}
