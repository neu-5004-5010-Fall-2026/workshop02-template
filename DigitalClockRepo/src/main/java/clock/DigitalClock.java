package clock;

/**
 * This class represents a digital clock. A digital clock displays time
 * as hours, minutes, and seconds derived from a single internal field:
 * the number of seconds since midnight.
 *
 * <p>Class invariant: 0 &lt;= secondsSinceMidnight &lt; 86400</p>
 */
public class DigitalClock {

    private int secondsSinceMidnight;

    /**
     * Constructs a DigitalClock object with the given hour, minute, and second.
     *
     * @param hour   the hour (0-23)
     * @param minute the minute (0-59)
     * @param second the second (0-59)
     * @throws IllegalArgumentException if any parameter is out of valid range
     */
    public DigitalClock(int hour, int minute, int second) {
        // TODO: Phase 3 — Implement validation and field initialization
        // 1. Validate hour is in [0, 23], throw IllegalArgumentException if not
        // 2. Validate minute is in [0, 59], throw IllegalArgumentException if not
        // 3. Validate second is in [0, 59], throw IllegalArgumentException if not
        // 4. Calculate and store secondsSinceMidnight from the three parameters
    }

    /**
     * Returns the hour component of this clock (0-23).
     *
     * @return the hour
     */
    public int getHour() {
        // TODO: Phase 4 — return hour extracted from secondsSinceMidnight
        return 0;
    }

    /**
     * Returns the minute component of this clock (0-59).
     *
     * @return the minute
     */
    public int getMinute() {
        // TODO: Phase 4 — return minute extracted from secondsSinceMidnight
        return 0;
    }

    /**
     * Returns the second component of this clock (0-59).
     *
     * @return the second
     */
    public int getSecond() {
        // TODO: Phase 4 — return second extracted from secondsSinceMidnight
        return 0;
    }

    /**
     * Returns the time in "HH:MM:SS" format (24-hour, zero-padded).
     * Example: "09:05:03" or "23:59:59".
     *
     * @return the time as a formatted string
     */
    public String getDecimal() {
        // TODO: Phase 4 — use String.format with %02d for zero-padding
        return "";
    }

    /**
     * Returns a human-readable string representation of this clock.
     * Format: "DigitalClock[HH:MM:SS]"
     * Example: "DigitalClock[14:30:00]"
     *
     * @return a string representation of this clock
     */
    @Override
    public String toString() {
        // TODO: Phase 4 — return "DigitalClock[" + getDecimal() + "]"
        return "";
    }
}
