package com.techja.quicknote.quanly;

import com.techja.quicknote.ghichu.GhiChu;

public class NguoiDung {
    private GhiChu dsGC[];

    public void taoGhiChu(GhiChu ghiChu) {
        // dua ghiChu vao dsGC
    }

    public void xoaGhiChu(String maGC) {
        // tìm trong dsGC nếu GhiChu->getMa() == maGC thi xóa khỏi danh sách
    }

    public GhiChu[] timKiemGC(String gtTieuDe) {
        GhiChu[] kq = null;

        // tìm trong dsGC nếu dsGC->getTieuDe() == gtTieuDe thì thêm vào kq

        return kq;
    }

    public GhiChu[] timKiemGC(String gtTieuDe, String gTriDiaDiem) {
        GhiChu[] kq = null;

        // tìm trong dsGC nếu dsGC->getTieuDe() == gtTieuDe và dsGC->getDiaDiem() == gTriDiaDiem thì thêm vào kq

        return kq;
    }

    public void lietKeSKBoLo() {
        // tìm kiếm trong dsGC, nếu GhiChu instanceof SuKienSapToi
        // ((SuKienSapToi)dsGC[i]))->isXacNhanThoiGian == false
        // thi in GhiChu do ra
    }

    public void xemGhiChu(String maGC) {
        // tim trong dsGC
        // Neu GhiChu->getMa() == macGC thi GhiChu->inTT()
    }
}
