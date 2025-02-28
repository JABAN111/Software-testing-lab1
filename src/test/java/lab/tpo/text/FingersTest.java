package lab.tpo.text;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FingersTest {

    @Test
    public void testFingersCreation() {
        Fingers fingers = new Fingers();
        assertFalse(fingers.areCurled(), "Пальцы не должны быть скрюченными при создании.");
    }

    @Test
    public void testFingersCurl() {
        Fingers fingers = new Fingers();
        fingers.curl();
        assertTrue(fingers.areCurled(), "Пальцы должны быть скрюченными после скручивания.");
    }
}