package lab.tpo.text;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FingersTest {

    Fingers fingers;

    @BeforeEach
    void setUp() {
        fingers = new Fingers();
    }

    @Test
    public void testFingersCreation() {
        assertFalse(fingers.areCurled(), "Пальцы не должны быть скрюченными при создании.");
    }

    @Test
    public void testFingersCurl() {
        fingers.curl();
        assertTrue(fingers.areCurled(), "Пальцы должны быть скрюченными после скручивания.");
    }
}