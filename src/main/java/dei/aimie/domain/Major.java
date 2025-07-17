package dei.aimie.domain;

public enum Major {
    COMPUTER_SCIENCE("컴퓨터공학"),
    CYBER_SECURITY("사이버보안");

    private final String displayName;

    Major(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
