package lab.tpo.text;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class KilobacTest {

    @Test
    public void testKilobacCreation() {
        Kilobac kilobac = new Kilobac();
        assertFalse(kilobac.isBeingHeld(), "Килобац не должен быть сжат при создании.");
    }

    @Test
    public void testKilobacHold() {
        Kilobac kilobac = new Kilobac();
        kilobac.hold();
        assertTrue(kilobac.isBeingHeld(), "Килобац должен быть сжат.");
    }
}