package _04_interface_segregation_principle._01_before;

public abstract class SmartPhone {

    /**
     * 통화 함수
     *
     * @param number: [String] 번호
     */
    public void call(String number)
    {
        System.out.println(number + " 통화 연결");
    }

    /**
     * 문자 메시지 전송 함수
     *
     * @param number: [String] 번호
     * @param text: [String] 내용
     */
    public void message(String number, String text)
    {
        System.out.println(number + ": " + text);
    }

    /**
     * 무선충전 함수
     */
    public void wirelessCharge()
    {
        System.out.println("무선 충전");
    }

    /**
     * AR 함수
     */
    public void ar()
    {
        System.out.println("AR 기능");
    }

    /**
     * 생체인식 추상 함수
     */
    abstract public void biometrics();
}
