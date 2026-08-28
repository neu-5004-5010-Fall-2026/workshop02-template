# Phase 1 Handout: Python DigitalClock vs Java DigitalClock

## Python Version (complete)

```python
class DigitalClock:
    """
    This class represents a digital clock. A digital clock stores
    time as the number of seconds since midnight.

    Class invariant: 0 <= seconds_since_midnight < 86400
    """

    def __init__(self, hour, minute, second):
        """
        Create a new DigitalClock.

        Args:
            hour: the hour (0-23)
            minute: the minute (0-59)
            second: the second (0-59)

        Raises:
            ValueError: if any argument is out of range
        """
        if hour < 0 or hour > 23:
            raise ValueError(f"Invalid hour: {hour}")
        if minute < 0 or minute > 59:
            raise ValueError(f"Invalid minute: {minute}")
        if second < 0 or second > 59:
            raise ValueError(f"Invalid second: {second}")

        self.seconds_since_midnight = hour * 3600 + minute * 60 + second

    def get_hour(self):
        """Return the hour (0-23)."""
        return self.seconds_since_midnight // 3600

    def get_minute(self):
        """Return the minute (0-59)."""
        return (self.seconds_since_midnight % 3600) // 60

    def get_second(self):
        """Return the second (0-59)."""
        return self.seconds_since_midnight % 60

    def get_decimal(self):
        """Return the time in HH:MM:SS format."""
        return f"{self.get_hour():02d}:{self.get_minute():02d}:{self.get_second():02d}"

    def __str__(self):
        """Return a string representation."""
        return f"DigitalClock[{self.get_decimal()}]"
```

### Using the Python version:

```python
clock = DigitalClock(14, 30, 45)
print(clock.get_hour())      # 14
print(clock.get_decimal())   # "14:30:45"
print(clock)                 # "DigitalClock[14:30:45]"

# This raises ValueError:
bad = DigitalClock(25, 0, 0)  # ValueError: Invalid hour: 25
```

---

## Java Version (skeleton — you will implement this!)

```java
/**
 * This class represents a digital clock. A digital clock stores
 * time as the number of seconds since midnight.
 *
 * <p>Class invariant: 0 <= secondsSinceMidnight < 86400</p>
 */
public class DigitalClock {

    private int secondsSinceMidnight;

    /**
     * Constructs a DigitalClock with the given hour, minute, and second.
     *
     * @param hour   the hour (0-23)
     * @param minute the minute (0-59)
     * @param second the second (0-59)
     * @throws IllegalArgumentException if any parameter is out of range
     */
    public DigitalClock(int hour, int minute, int second) {
        // TODO
    }

    public int getHour() {
        // TODO
        return 0;
    }

    public int getMinute() {
        // TODO
        return 0;
    }

    public int getSecond() {
        // TODO
        return 0;
    }

    public String getDecimal() {
        // TODO
        return "";
    }

    @Override
    public String toString() {
        // TODO
        return "";
    }
}
```

---

## Side-by-Side Comparison

| Aspect | Python | Java |
|--------|--------|------|
| Type declarations | None (`hour` — no type) | Required (`int hour`) |
| Self reference | `self` | `this` |
| Field declaration | Implicit in `__init__` | Explicit: `private int secondsSinceMidnight;` |
| Access modifiers | Convention only (`_name`) | Enforced: `private`, `public` |
| Constructor name | `__init__` | Same as class name: `DigitalClock(...)` |
| String formatting | `f"{value:02d}"` | `String.format("%02d", value)` |
| Exception type | `ValueError` | `IllegalArgumentException` |
| toString method | `__str__` | `toString()` with `@Override` |
| Documentation | Docstrings (`""" """`) | Javadoc (`/** */` with `@param`, `@return`) |
| Braces/indentation | Indentation only | Braces `{ }` required |
| Semicolons | None | Required at end of statements |
