package Javathi;


 public class doantotnghiep  {
        private String madoan;
        private String tendoan;
        private int ngaybatdaudoan;
        private int ngaykethucdoan;
        private sinhvien sinhvien;
        private giangvien giangvien;

        public doantotnghiep(String madoan, String tendoan, int ngaybatdaudoan, int ngaykethucdoan, sinhvien sinhvien, giangvien giangvien) {
            this.madoan = madoan;
            this.tendoan = tendoan;
            this.ngaybatdaudoan = ngaybatdaudoan;
            this.ngaykethucdoan = ngaykethucdoan;
            this.sinhvien = sinhvien;
            this.giangvien = giangvien;
        }

        public doantotnghiep() {
        }

        public String getmadoan() {
            return this.madoan;
        }

        public void setmadoan(String madoan) {
            this.madoan = madoan;
        }

        public String gettendoan() {
            return this.tendoan;
        }

        public void settendoan(String tendoan) {
            this.tendoan = tendoan;
        }

        public int getNgaybatdaudoan() {
            return this.ngaybatdaudoan;
        }

        public void setNgaybatdaudoan(int ngaybatdaudoan) {
            this.ngaybatdaudoan = ngaybatdaudoan;
        }

        public int getNgaykethucdoan() {
            return this.ngaykethucdoan;
        }

        public void setNgaykethucdoan(int ngaykethucdoan) {
            this.ngaykethucdoan = ngaykethucdoan;
        }

        public sinhvien getSinhvien() {
            return this.sinhvien;
        }

        public void setSinhvien(sinhvien sinhvien) {
            this.sinhvien = sinhvien;
        }

        public giangvien getGiangvien() {
            return this.giangvien;
        }

        public void setGiangvien(giangvien giangvien) {
            this.giangvien = giangvien;
        }

        public String toString() {
            return "--ma do an: "+madoan+";"
                    + "ten do an:" + tendoan +";"
                    + "ngay bat dau:" + ngaybatdaudoan +";"
                    + "ngay ket thuc:" +ngaykethucdoan +";"
                    + sinhvien +"\n"
                    + giangvien+"\n"
                    +"------------";
        }
    }

