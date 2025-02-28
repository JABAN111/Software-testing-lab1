package lab.tpo.text;

public class Body {
    private boolean isLyingStill;
    private Fingers fingers;
    private Kilobac kilobac;

    public Body(Fingers fingers, Kilobac kilobac) {
        this.isLyingStill = true;
        this.fingers = fingers;
        this.kilobac = kilobac;
    }

    public void approach() {
        System.out.println("Подходит к телу...");
    }

    public boolean isLyingStill() {
        return isLyingStill;
    }

    public Fingers getFingers() {
        return fingers;
    }

    public Kilobac getKilobac() {
        return kilobac;
    }
}
