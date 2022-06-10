package _01_single_responsibility_principle._02_after;

public class Email {
    private final String email;

    public Email(String email) {
        validateEmail(email);
        this.email = email;
    }


    private void validateEmail(String email) {
        if (!EmailString.isValidEmailString(email)) {
            throw new IllegalArgumentException("이메일 형식이 아닙니다.");
        }
    }

    public void sendMail() {
        System.out.println("send Mail by" + email);
    }
}
