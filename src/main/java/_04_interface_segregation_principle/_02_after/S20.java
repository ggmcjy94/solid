package _04_interface_segregation_principle._02_after;

public class S20 extends SmartPhone implements ARAble, BiometricsAble, WirelessCharGable{
    /**
     * 무선충전 함수
     */
    @Override
    public void wirelessCharge() {
        System.out.println("무선충전 기능");
    }

    /**
     * AR 함수
     */
    @Override
    public void ar() {
        System.out.println("AR 기능");
    }

    /**
     * 생체인식 함수
     */
    @Override
    public void biometrics() {
        System.out.println("생체인식 기능");
    }
}
