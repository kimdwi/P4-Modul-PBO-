public class P4_TestFinal {

    int x = 10;
    double PI = 3.14;

    public static void main(String[] args) {
        P4_TestFinal myObj = new P4_TestFinal();
        myObj.x = 50; // will generate an error: cannot assign a value to a final variable
        myObj.PI = 25; // will generate an error: cannot assign a value to final variable
        System.out.println(myObj.x);
    }
}
