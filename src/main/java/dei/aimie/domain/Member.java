package dei.aimie.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name="member_type")
@Table(name="Members")
@Getter
public class Member {
    @Id
    @Column(updatable = false, nullable = false)
    private String memberId;

    private String name;

    @Embedded
    private Email email;

    private String password;
}
