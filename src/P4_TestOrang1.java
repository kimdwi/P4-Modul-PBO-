public class P4_TestOrang1 {
    public static void main(String[] args) {
        P4_Orang badu = new P4_Orang(); //construktor tanpa parameter
        badu.nama = "Badu";
        badu.umur = 12;
        System.out.println("Nama : " + badu.nama);
        System.out.println("Umur : " + badu.umur + "tahun.");
        badu.tertawa();

        System.out.println();

        P4_Orang dodo = new P4_Orang("Dodo", 10);
        System.out.println("Nama : " + dodo.nama);
        System.out.println("Umur : " + dodo.umur + "tahun.");
        dodo.menangis();

        System.out.println();
        P4_Orang jono = new P4_Orang("jono", 12, 168, 76);
        System.out.println("Nama : " + dodo.nama);
        System.out.println("Umur : " + dodo.umur + "tahun.");
        dodo.menangis();

    }
}
