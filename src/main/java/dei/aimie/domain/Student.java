package dei.aimie.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name="Students")
@Getter
public class Student extends Member {
    private int admissionYear;

    @Enumerated(EnumType.STRING)
    private Major major;

    @Enumerated(EnumType.STRING)
    private AdmissionStatus admissionStatus;
}
