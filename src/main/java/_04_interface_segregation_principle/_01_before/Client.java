package _04_interface_segregation_principle._01_before;

public class Client {

    public static void main(String[] args) {
        SmartPhone s2 = new S2();
        // s2는 무선충전 ar 생체인식이 지원되 않는 기기다. 그럼에도 불구하고 smartphone 의 상속을로 인해 해당 기능의 메소드를 강제로 상속
        // 받게된다. 더군다나 biometrics() 의 경우 추상 메소드 이므로 필요하지도 않은 기능을 구현까지 해야한다.
        //  이러한 상속의 특징은 부모 객체의 규모가 매우 클 경우 개발 편의성의 극심한 저하로 이뤄진다.
        s2.biometrics();
        s2.ar();

    }
}
