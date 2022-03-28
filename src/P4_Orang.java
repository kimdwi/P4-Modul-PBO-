public class P4_Orang {
    String nama;
    int umur;
    String warnaRambut;
    String warnaKulit;
    int tinggiBadan;
    int beratBadan;

    public P4_Orang() {
    }

    public P4_Orang(String nama) {
        this.nama = nama;
    }

    public void menangis() {
        System.out.println("ue..ue..TvT");
    }

    public void tertawa() {
        System.out.println("www...www");
    }

    public static void main(String[] args) {
        P4_Orang dido = new P4_Orang();
        dido.nama = "Dido";
        dido.umur = 4;
        System.out.println("Nama : " + dido.nama);
        System.out.println("Umur : " + dido.umur + "tahun.");
        dido.menangis();

        System.out.println();

        P4_Orang dodo = new P4_Orang("Dodo");
        System.out.println("Nama : " + dodo.nama);
        System.out.println("Umur : " + dodo.umur + "tahun.");
        dodo.tertawa();
    }
}
