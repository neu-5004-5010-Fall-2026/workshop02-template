package clock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * JUnit 5 tests for the DigitalClock class.
 * Students: make these tests pass by implementing the TODOs in DigitalClock.java.
 */
public class DigitalClockTest {

    private DigitalClock midnight;
    private DigitalClock afternoon;
    private DigitalClock endOfDay;

    @BeforeEach
    public void setUp() {
        this.midnight = new DigitalClock(0, 0, 0);
        this.afternoon = new DigitalClock(14, 30, 45);
        this.endOfDay = new DigitalClock(23, 59, 59);
    }

    // ===== Phase 3: Constructor Validation Tests =====

    @Test
    public void testValidConstruction() {
        // If no exception is thrown, construction succeeded
        DigitalClock clock = new DigitalClock(12, 0, 0);
        assertEquals(12, clock.getHour());
    }

    @Test
    public void testInvalidHourNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            new DigitalClock(-1, 0, 0);
        });
    }

    @Test
    public void testInvalidHourTooHigh() {
        assertThrows(IllegalArgumentException.class, () -> {
            new DigitalClock(24, 0, 0);
        });
    }

    @Test
    public void testInvalidMinuteNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            new DigitalClock(12, -1, 0);
        });
    }

    @Test
    public void testInvalidMinuteTooHigh() {
        assertThrows(IllegalArgumentException.class, () -> {
            new DigitalClock(12, 60, 0);
        });
    }

    @Test
    public void testInvalidSecondNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            new DigitalClock(12, 30, -1);
        });
    }

    @Test
    public void testInvalidSecondTooHigh() {
        assertThrows(IllegalArgumentException.class, () -> {
            new DigitalClock(12, 30, 60);
        });
    }

    // ===== Phase 4: Getter Tests =====

    @Test
    public void testGetHour() {
        assertEquals(0, this.midnight.getHour());
        assertEquals(14, this.afternoon.getHour());
        assertEquals(23, this.endOfDay.getHour());
    }

    @Test
    public void testGetMinute() {
        assertEquals(0, this.midnight.getMinute());
        assertEquals(30, this.afternoon.getMinute());
        assertEquals(59, this.endOfDay.getMinute());
    }

    @Test
    public void testGetSecond() {
        assertEquals(0, this.midnight.getSecond());
        assertEquals(45, this.afternoon.getSecond());
        assertEquals(59, this.endOfDay.getSecond());
    }

    // ===== Phase 4: Format Tests =====

    @Test
    public void testGetDecimalMidnight() {
        assertEquals("00:00:00", this.midnight.getDecimal());
    }

    @Test
    public void testGetDecimalAfternoon() {
        assertEquals("14:30:45", this.afternoon.getDecimal());
    }

    @Test
    public void testGetDecimalEndOfDay() {
        assertEquals("23:59:59", this.endOfDay.getDecimal());
    }

    @Test
    public void testGetDecimalSingleDigits() {
        DigitalClock early = new DigitalClock(9, 5, 3);
        assertEquals("09:05:03", early.getDecimal());
    }

    @Test
    public void testToString() {
        assertEquals("DigitalClock[00:00:00]", this.midnight.toString());
        assertEquals("DigitalClock[14:30:45]", this.afternoon.toString());
        assertEquals("DigitalClock[23:59:59]", this.endOfDay.toString());
    }

    // ===== Phase 3: Boundary Tests =====

    @Test
    public void testBoundaryMidnight() {
        DigitalClock clock = new DigitalClock(0, 0, 0);
        assertEquals(0, clock.getHour());
        assertEquals(0, clock.getMinute());
        assertEquals(0, clock.getSecond());
    }

    @Test
    public void testBoundaryMaxValid() {
        DigitalClock clock = new DigitalClock(23, 59, 59);
        assertEquals(23, clock.getHour());
        assertEquals(59, clock.getMinute());
        assertEquals(59, clock.getSecond());
    }
}
