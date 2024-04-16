package com.techja.quicknote.main;

import com.techja.quicknote.ghichu.SuKienSapToi;
import com.techja.quicknote.ghichu.SuViecDaQua;

public class Main {
    public static void main(String[] args) {
        // su viec da qua
        SuViecDaQua suViecDaQua = new SuViecDaQua(
                "SVDQ 001",
                "SVDQ 1",
                "Tham gia event",
                "Cach day 3 ngay",
                "Ha Noi",
                "Ten NLQ",
                "Da tham gia",
                "Tot"
        );

        System.out.println("=> Thong tin su viec da qua:");
        suViecDaQua.inTT();

        // su viec sap toi
        SuKienSapToi suKienSapToi = new SuKienSapToi(
                "SKST 001",
                "SKST 1",
                "Tham gia event",
                "Sap dien ra",
                "TP HCM",
                "Ring Ring",
                "Ngay mai",
                5
        );
        System.out.println("=> Thong tin su kien sap toi:");
        suKienSapToi.inTT();
    }
}
