package _05_dependency_inversion_principle._02_after;

public class Client {

    public static void main(String[] args) {
        OneHandSword so1 = new OneHandSword("so1", 40);
        TwoHandSword to1 = new TwoHandSword("to1", 60);
        Character hy = new Character("hy", 200, so1);
        Character hy1 = new Character("hy", 200, to1);

    }
}
