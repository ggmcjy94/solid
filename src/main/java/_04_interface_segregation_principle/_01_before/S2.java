package _04_interface_segregation_principle._01_before;

public class S2 extends SmartPhone{

    /**
     * 무선충전 함수
     */
    @Override
    public void wirelessCharge()
    {
        System.out.println("지원 불가능한 기기");
    }

    /**
     * AR 함수
     */
    @Override
    public void ar()
    {
        System.out.println("지원 불가능한 기기");
    }

    /**
     * 생체인식 추상 함수
     */
    @Override
    public void biometrics()
    {
        System.out.println("지원 불가능한 기기");
    }
}
