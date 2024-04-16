package com.techja.quicknote.ghichu;

public class GhiChu {
    private String ma, tieuDe, noiDung, thoiGian, diaDiem;

    public GhiChu(String ma, String tieuDe, String noiDung, String thoiGian, String diaDiem) {
        this.ma = ma;
        this.tieuDe = tieuDe;
        this.noiDung = noiDung;
        this.thoiGian = thoiGian;
        this.diaDiem = diaDiem;
    }

    public String getMa() {
        return ma;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public String getDiaDiem() {
        return diaDiem;
    }

    public void inTT() {
        System.out.println("Ma: " + ma);
        System.out.println("Tieu de: " + tieuDe);
        System.out.println("Noi dung: " + noiDung);
        System.out.println("Thoi gian: " + thoiGian);
        System.out.println("Dia diem: " + diaDiem);
    }
}
