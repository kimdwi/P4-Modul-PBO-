public class P4_MethodF {
    public static void main(String[] args) {
        P4_Orang daru = new P4_Orang("Daru Nugroho", 20);
        cetakOrang(daru);
    }

    private static void cetakOrang(P4_Orang orang){
        System.out.println("Nama = " + orang.nama);
        System.out.println("Umur = " + orang.umur + " tahun");
    }
}
