package com.techja.quicknote.ghichu;

public class SuKienSapToi extends GhiChu {
    String amBT, thoiGianBT;
    int soLanBT;
    boolean xacNhanTG;

    public SuKienSapToi(String ma, String tieuDe, String noiDung, String thoiGian, String diaDiem, String amBT, String thoiGianBT, int soLanBT) {
        super(ma, tieuDe, noiDung, thoiGian, diaDiem);
        this.amBT = amBT;
        this.thoiGianBT = thoiGianBT;
        this.soLanBT = soLanBT;
    }

    private void keuBT() {
        // kêu lên amBT bằng soLanBT khi thời gian = thoiGianBT
    }

    public void xacNhanTG(boolean gTriXacNhanTG) {
        // gán giá trị cho xacNhanTG
    }

    @Override
    public void inTT() {
        super.inTT();
        System.out.println("Am bao thuc: " + amBT);
        System.out.println("Thoi gian bao thuc: " + thoiGianBT);
        System.out.println("So lan bao thuc: " + soLanBT);
    }
}
