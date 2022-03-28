import java.awt.*;

public class P4_TestEVent {
    public static void main(String[] args) {
        P4_Event even = new P4_Event("Yuk Ngaji", 200);
        even.tglKegiatan = 10;
        even.blnKegiatan = 11;
        even.tahunKegiatan = 2018;
        even.infoEvent();
        System.out.println("=========================");
        System.out.println("Tanggal Kegiatan : " + even.tglKegiatan + "/" + even.blnKegiatan + "/" + even.tahunKegiatan);
        even.jmlPeserta = 100;
        System.out.println("Jumlah Peserta : " +even.jmlPeserta);
    }
}
