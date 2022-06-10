package _01_single_responsibility_principle._02_after;

public class User {

    private Long id;
    private String name;
    private Email email;

    public User(Long id, String name, Email email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }



    public void sendMail() {
        System.out.println("send Mail by" + email);
    }
}
