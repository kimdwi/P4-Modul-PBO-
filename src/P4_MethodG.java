public class P4_MethodG {
    public static void main(String[] args) {
        P4_Orang dosen = getP4_Orang("Depandi Enda", 29);
        cetakP4_Orang(dosen);
    }

    private static void cetakP4_Orang(P4_Orang orang){
        System.out.println("Nama = " + orang.nama);
        System.out.println("Umur = " + orang.umur + " tahun");
    }

    private static P4_Orang getP4_Orang(String nama, int umur) {
        P4_Orang orang = new P4_Orang(nama, umur);
        return orang;
    }
}
