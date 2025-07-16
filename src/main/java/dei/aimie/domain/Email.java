package dei.aimie.domain;

public class Email {
    private String email;

    protected Email() {}

    public Email(String email) {
        if (!email.matches("^[\\\\w.-]+@[\\\\w.-]+\\\\.\\\\w+$")) {
            throw new IllegalArgumentException("Invalid email format");
        }

        this.email = email;
    }

    public String getEmail() {
        return email;
    }


}
