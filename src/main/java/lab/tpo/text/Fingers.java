package lab.tpo.text;

public class Fingers {
    private boolean areCurled;

    public Fingers() {
        this.areCurled = false;
    }

    public void curl() {
        this.areCurled = true;
        System.out.println("Пальцы скрючены...");
    }

    public boolean areCurled() {
        return areCurled;
    }
}
