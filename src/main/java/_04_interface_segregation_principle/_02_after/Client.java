package _04_interface_segregation_principle._02_after;

public class Client {

    public static void main(String[] args) {
        S2 s2 = new S2();
        s2.call("011");
        s2.message("011", "asd");
        S20 s20 = new S20();
        s20.call("010");
        s20.ar();

    }
}
