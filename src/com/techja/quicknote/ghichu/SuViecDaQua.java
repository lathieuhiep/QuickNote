package com.techja.quicknote.ghichu;

public class SuViecDaQua extends GhiChu {
    String tenNLQ, ketQua, danhGia;

    public SuViecDaQua(String ma, String tieuDe, String noiDung, String thoiGian, String diaDiem, String tenNLQ, String ketQua, String danhGia) {
        super(ma, tieuDe, noiDung, thoiGian, diaDiem);
        this.tenNLQ = tenNLQ;
        this.ketQua = ketQua;
        this.danhGia = danhGia;
    }

    @Override
    public void inTT() {
        super.inTT();
        System.out.println("Ten nguoi lien quan: " + tenNLQ);
        System.out.println("Ket qua: " + ketQua);
        System.out.println("Danh gia: " + danhGia);
    }
}
