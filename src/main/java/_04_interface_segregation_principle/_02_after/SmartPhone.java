package _04_interface_segregation_principle._02_after;

public class SmartPhone {

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
}
