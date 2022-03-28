public class P4_Orang {
    String nama;
    int umur;
    String warnaRambut;
    String warnaKulit;
    int tinggiBadan;
    int beratBadan;

    public P4_Orang() {
    }

    public P4_Orang(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public P4_Orang(String nama, int umur, int tinggiBadan, int beratBadan){
        this(nama, umur);
        this.tinggiBadan = tinggiBadan;
        this.beratBadan = beratBadan;
    }

    public void menangis() {

        System.out.println("ue..ue..TvT");
    }

    public void tertawa() {

        System.out.println("www...www");
    }
}
