package _05_dependency_inversion_principle._02_after;

import java.util.Random;

public class OneHandSword implements AttackAble{

    private final String NAME;
    private final int DAMAGE;

    /**
     * OneHandSword 생성자 함수
     *
     * @param name: [String] 무기 이름
     * @param damage: [int] 데미지
     */
    public OneHandSword(String name, int damage) {
        NAME = name;
        DAMAGE = damage;
    }

    /**
     * 공격 데미지 반환 함수
     *
     * @return [int] 공격 데미지 (데미지 +-5)
     */
    @Override
    public int attack() {
        return DAMAGE + new Random().nextInt(10) - 5;
    }

    /**
     * 객체 문자열 반환 함수
     *
     * @return [String] 이름
     */
    @Override
    public String toString() {
        return NAME;
    }

}
