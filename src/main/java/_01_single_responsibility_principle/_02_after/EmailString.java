package _01_single_responsibility_principle._02_after;

import java.util.regex.Pattern;

public class EmailString {

    private static Pattern EMAIL = Pattern.compile("^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$");

    public EmailString() {
    }
    public static boolean isValidEmailString(String emailString) {
        return EMAIL.matcher(emailString).matches();
    }
}
