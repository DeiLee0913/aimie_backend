package dei.aimie.domain;

public enum AdmissionStatus {
    ENROLLED("재학 중"),
    ON_LEAVE("휴학 중"),
    GRADUATED("졸업");

    private final String displayName;

    AdmissionStatus(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
