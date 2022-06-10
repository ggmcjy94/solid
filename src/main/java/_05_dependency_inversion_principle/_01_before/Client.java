package _05_dependency_inversion_principle._01_before;

public class Client {


    //게임캐릭터를 구현한 캐릭터 객체다. 게임 캐릭터가 취할 수 있는 기본적인 행동 일부가 구현되어있으며, 인스턴스 생성 시 캐릭터 이름, 체력, 무기를 입력하여 생성한다.
    //하지만 다들 알다시피, 무기엔 한손검만 있는 게 아니다. 근접계열 무기만 하더라도 두손검, 단검, 창, 도끼, 둔기 등 다양한 종류가 존재할 수 있다.
    // 그러나 이 캐릭터 객체. 애초에 한손검 외엔 쓸 수가 없는 구조다. 캐릭의 인스턴스 생성 시 OneHandSword에 의존성을 가지기 떄문.
    // 공격 동작을 담당하는 attact() 메소드 역시 OneHandSword 에 의존성을 가진다.
    //이 상황에서 한손검을 제외한 다른 무기를 사용하려면 캐릭터의 코드를 바꿔야한다. 즉 이전에 다뤘던 개방-폐쇄 원칙을 위바한다.
    //더 큰 문제는 무기가 바뀔 때마다 이 짓을 해줘야한다.
    public static void main(String[] args) {
        OneHandSword oneHandSword = new OneHandSword("dddd", 10);
        Character character = new Character("ttt", 100, oneHandSword);

    }
}
