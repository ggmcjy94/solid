package _04_interface_segregation_principle._01_before;

// s20
public class S20 extends SmartPhone{
    /**
     * 생체인식 함수
     */
    @Override
    public void biometrics() {
        System.out.println("S20 생체인식 기능");
    }
}
