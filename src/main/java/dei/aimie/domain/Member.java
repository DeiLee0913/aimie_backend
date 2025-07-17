package dei.aimie.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name="member_type")
@Table(name="Members")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@SuperBuilder
@Getter
public abstract class Member {
    @Id
    @Column(updatable = false, nullable = false)
    private String memberId;

    @Column(length = 50, nullable = false)
    private String name;

    @Embedded
    private Email email;

    @Column(nullable=false)
    private String password;
}
