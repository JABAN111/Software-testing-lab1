package lab.tpo.text;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BodyTest {

    @Test
    public void testBodyCreation() {
        Fingers fingers = new Fingers();
        Kilobac kilobac = new Kilobac();
        Body body = new Body(fingers, kilobac);
        assertTrue(body.isLyingStill(), "Тело должно лежать тихо.");
        assertFalse(fingers.areCurled(), "Пальцы не должны быть скрюченными при создании.");
        assertFalse(kilobac.isBeingHeld(), "Килобац не должен быть сжат при создании.");
    }

    @Test
    public void testBodyApproach() {
        Fingers fingers = new Fingers();
        Kilobac kilobac = new Kilobac();
        Body body = new Body(fingers, kilobac);
        body.approach();
        assertTrue(body.isLyingStill(), "Тело должно оставаться в покое при подходе.");
    }

    @Test
    public void testBodyStateAfterApproach() {
        Fingers fingers = new Fingers();
        Kilobac kilobac = new Kilobac();
        Body body = new Body(fingers, kilobac);
        body.approach();
        assertTrue(body.isLyingStill(), "Тело должно оставаться тихим после подхода.");
    }

    @Test
    public void testBodyWithCurledFingers() {
        Fingers fingers = new Fingers();
        Kilobac kilobac = new Kilobac();
        Body body = new Body(fingers, kilobac);
        body.getFingers().curl();
        assertTrue(fingers.areCurled(), "Пальцы должны быть скрюченными.");
        assertFalse(kilobac.isBeingHeld());
    }
}