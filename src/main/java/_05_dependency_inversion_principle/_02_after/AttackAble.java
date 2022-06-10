package _05_dependency_inversion_principle._02_after;

// 공격 인터페이스
public interface AttackAble {

    /**
     * 공격 추상 함수
     *
     * @return [int] 공격 데미지
     */
    int attack();

    /**
     * 객체 문자열 반환 추상 함수
     *
     * @return [String] 이름
     */
    @Override
    String toString();
}
