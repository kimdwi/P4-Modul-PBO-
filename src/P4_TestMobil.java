import paketA.P4_Mobil;

public class P4_TestMobil {
    public static void main(String[] args) {
        P4_Mobil avanza = new P4_Mobil("Innova", "BM3210");
        avanza.jmlRoda = 4;
        avanza.bahanBakar = "Solar";
        avanza.fullAC = true;
        System.out.println(avanza.getInfo());
    }
}
