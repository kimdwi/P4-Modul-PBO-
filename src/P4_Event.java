import java.awt.*;

public class P4_Event {

    int tglKegiatan;
    int blnKegiatan;
    int tahunKegiatan;
    protected int maxPeserta;
    protected int jmlPeserta;
    public String namaEvent;
    final int biayaPendaftaran = 50000;
    String tempatEvent;

    public P4_Event(String nama, int m) {
        namaEvent = nama;
        maxPeserta = m;
    }

    void infoEvent() {
        System.out.println("Nama event : " + namaEvent);
        System.out.println("Maksimal Peserta : " + maxPeserta);
        System.out.println("Biaya Pendaftaran : " + biayaPendaftaran);
    }
}
