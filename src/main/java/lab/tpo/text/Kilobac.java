package lab.tpo.text;

public class Kilobac {
    private boolean isBeingHeld;

    public Kilobac() {
        this.isBeingHeld = false;
    }

    public void hold() {
        this.isBeingHeld = true;
        System.out.println("Килобац сжат...");
    }

    public boolean isBeingHeld() {
        return isBeingHeld;
    }
}
