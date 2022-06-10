package _05_dependency_inversion_principle._01_before;

public class Character {

    private final String NAME;
    private int health;
    private OneHandSword weapon;

    /**
     * Character 생성자 함수
     *
     * @param name: [String] 이름
     * @param health: [int] 체력
     * @param weapon: [OneHandSword] 무기
     */
    public Character(String name, int health, OneHandSword weapon) {
        NAME = name;
        this.health = health;
        this.weapon = weapon;
    }

    /**
     * 공격 데미지 반환 함수
     *
     * @return [int] 공격 데미지
     */
    public int attack() {
        return weapon.attack();
    }

    /**
     * 피격 함수
     *
     * @param amount: [int] 피격 데미지
     */
    public void damaged(int amount) {
        health -= amount;
    }

    /**
     * 무기 교체 함수
     *
     * @param weapon: [OneHandSword] 무기
     */
    public void chageWeapon(OneHandSword weapon) {
        this.weapon = weapon;
    }

    /**
     * 캐릭터 정보 출력 함수
     */
    public void getInfo() {
        System.out.println("이름: " + NAME);
        System.out.println("체력: " + health);
        System.out.println("무기: " + weapon);
    }
}
