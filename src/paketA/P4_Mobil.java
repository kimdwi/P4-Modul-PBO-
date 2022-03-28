package paketA;

public class P4_Mobil {
    public String nama;
    public String noBM;
    public int jmlRoda;
    public String bahanBakar;
    public boolean fullAC;

    public P4_Mobil(String nama, String noBM) {
        this.nama = nama;
        this.noBM = noBM;
        this.jmlRoda = 4;
        this.bahanBakar = "Bensin";
        this.fullAC = true;
    }

    public String getInfo() {
        String info = "Mobil : " + nama +
                "\nNomor BM : " + noBM +
                "\nJumlah Roda : " + jmlRoda +
                "\nJenis Bahan Bakar : " + bahanBakar +
                "\nFull AC : " + fullAC;
        return  info;
    }
}
