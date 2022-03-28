public class P4_TestStatic {

    // Static Method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    //public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    //Main methods
    public static void main(String[] args) {
        myStaticMethod(); //memanggil static method
        //myPublicMethod(); outputnua akan error

        P4_TestStatic myObj = new P4_TestStatic(); //membuat objek dari myclass
        myObj.myPublicMethod(); // memanggil public method
    }
}
