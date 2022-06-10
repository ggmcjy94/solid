package _04_interface_segregation_principle._02_after;

public class S2 extends SmartPhone{

    /**
     * 문자 메시지 전송 함수
     *
     * @param number: [String] 번호
     * @param text: [String] 내용
     */
    @Override
    public void message(String number, String text) {
        System.out.println("In S2");
        super.message(number, text);
    }
}
