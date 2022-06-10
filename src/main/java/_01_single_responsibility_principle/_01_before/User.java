package _01_single_responsibility_principle._01_before;

import java.util.regex.Pattern;

//사용자 도메인은 사용자 정보를 저장, 변경의 책임이 있지만, 이메일의 유효성을 검사하거나 이메일을 전송하는 책임을 가질 필요는 없다.
public class User {

    private static Pattern EMAIL = Pattern.compile("^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$");
    private Long id;
    private String name;
    private String email;

    public User(Long id, String name, String email) {
        validateEmail(email);
        this.id = id;
        this.name = name;
        this.email = email;
    }

    private void validateEmail(String email) {
        if (!EMAIL.matcher(email).matches()) {
            throw new IllegalArgumentException("이메일 형식이 아닙니다.");
        }
    }

    public void sendMail() {
        System.out.println("send Mail by" + email);
    }
}
