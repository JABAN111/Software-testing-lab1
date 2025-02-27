import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import lab.tpo.Arctg;

public class ArctgTest {
    @Test 
    void testZero() {
        assertEquals(Math.atan(0), Arctg.calculate(0, 10), 1e-6);
    }
    
    @Test
    void testValues() {
        assertEquals(Math.atan(0.5), Arctg.calculate(0.5, 20), 1e-6);
        assertEquals(Math.atan(-0.5), Arctg.calculate(-0.5, 20), 1e-6);
    }
    
    @Test
    void testInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> Arctg.calculate(1.5, 10));
        assertThrows(IllegalArgumentException.class, () -> Arctg.calculate(-1.5, 10));
    }
}
