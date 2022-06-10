package _05_dependency_inversion_principle._02_after;

import java.util.Random;

public class TwoHandSword implements AttackAble{

    private final String name;
    private final int damage;

    public TwoHandSword(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    @Override
    public int attack() {
        return this.damage + new Random().nextInt(20) - 5;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
