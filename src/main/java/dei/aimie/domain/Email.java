package dei.aimie.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Email {
    @Column(nullable=false)
    private String email;

    protected Email() {}

    public Email(String email) {
        if (!email.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$")) {
            throw new IllegalArgumentException("Invalid email format");
        }

        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
