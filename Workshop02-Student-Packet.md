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
# Phase 1 Worksheet: Python vs Java — Observation

**Time**: 15 minutes | **Format**: Read the handout, answer below | **Work with**: a partner

---

Read the Python DigitalClock and the Java DigitalClock skeleton on the Phase 1 handout.

---

## 1. Type Declarations

In the Java version, find THREE places where a type is explicitly declared that Python does NOT require:

1. > _______________________________________________________________________

2. > _______________________________________________________________________

3. > _______________________________________________________________________

---

## 2. Self vs This

In Python, we write `self.seconds_since_midnight`. What is the Java equivalent?

> _______________________________________________________________________

Why is `this` needed in the Java constructor on line 31?

> _______________________________________________________________________

---

## 3. Class Invariant

Both versions state a "class invariant." Write it in your own words:

> _______________________________________________________________________

What happens if someone tries to create `DigitalClock(25, 0, 0)`?

> In Python: _______________________________________________________________

> In Java: ________________________________________________________________

---

## 4. Naming Conventions

| Element | Python style | Java style |
|---------|-------------|------------|
| Class name | ____________ | ____________ |
| Method name | `get_hour` | ____________ |
| Field name | `seconds_since_midnight` | ____________ |

What naming convention does Java use for methods and fields? (hint: camelCase or snake_case?)

> _______________________________________________________________________

---

## 5. Structural Differences

List TWO things Java requires that Python does NOT:

1. > _______________________________________________________________________

2. > _______________________________________________________________________

List ONE thing Python has that Java replaces with a different mechanism:

> Python: _________________ → Java replacement: _________________

---

## 6. The Big Question

Both versions store ONE integer field (`seconds_since_midnight` / `secondsSinceMidnight`).

Why store one number instead of three separate fields (hour, minute, second)?

> _______________________________________________________________________
>
> _______________________________________________________________________
# Phase 2 Handout: Complete DigitalClock.java (Reference for Annotation)

Use this code for the Phase 2 worksheet. Annotate directly on this page.

```java
 1  package clock;
 2
 3  /**
 4   * This class represents a digital clock. A digital clock stores
 5   * time as the number of seconds since midnight.
 6   *
 7   * <p>Class invariant: 0 &lt;= secondsSinceMidnight &lt; 86400</p>
 8   */
 9  public class DigitalClock {
10
11      private int secondsSinceMidnight;
12
13      /**
14       * Constructs a DigitalClock with the given hour, minute, and second.
15       *
16       * @param hour   the hour (0-23)
17       * @param minute the minute (0-59)
18       * @param second the second (0-59)
19       * @throws IllegalArgumentException if any parameter is out of range
20       */
21      public DigitalClock(int hour, int minute, int second) {
22          if (hour < 0 || hour > 23) {
23              throw new IllegalArgumentException("Invalid hour: " + hour);
24          }
25          if (minute < 0 || minute > 59) {
26              throw new IllegalArgumentException("Invalid minute: " + minute);
27          }
28          if (second < 0 || second > 59) {
29              throw new IllegalArgumentException("Invalid second: " + second);
30          }
31          this.secondsSinceMidnight = hour * 3600 + minute * 60 + second;
32      }
33
34      /**
35       * Returns the hour component of this clock (0-23).
36       *
37       * @return the hour
38       */
39      public int getHour() {
40          return this.secondsSinceMidnight / 3600;
41      }
42
43      /**
44       * Returns the minute component of this clock (0-59).
45       *
46       * @return the minute
47       */
48      public int getMinute() {
49          return (this.secondsSinceMidnight % 3600) / 60;
50      }
51
52      /**
53       * Returns the second component of this clock (0-59).
54       *
55       * @return the second
56       */
57      public int getSecond() {
58          return this.secondsSinceMidnight % 60;
59      }
60
61      /**
62       * Returns the time in "HH:MM:SS" format (24-hour, zero-padded).
63       *
64       * @return the time as a formatted string
65       */
66      public String getDecimal() {
67          return String.format("%02d:%02d:%02d",
68                  this.getHour(), this.getMinute(), this.getSecond());
69      }
70
71      /**
72       * Returns a string representation of this clock.
73       * Format: "DigitalClock[HH:MM:SS]"
74       *
75       * @return a string representation
76       */
77      @Override
78      public String toString() {
79          return "DigitalClock[" + this.getDecimal() + "]";
80      }
81  }
```

---

## Annotation Guide

Use these symbols on the code above:

- **Circle** the field declaration(s)
- **Underline** the constructor (lines ___ to ___)
- **Put a star ★** next to each method
- **Draw a box** around each Javadoc comment block
- **Highlight** every `this.` usage
- **Mark with ✗** the lines that throw exceptions
# Phase 2 Worksheet: Annotate the Complete DigitalClock.java

**Time**: 15 minutes | **Format**: Annotate the handout + answer below | **Work with**: a partner

---

Use the Phase 2 handout (complete DigitalClock.java with line numbers). Annotate it, then answer.

---

## 1. Annotate the Code

On the handout:
- **Circle** the field declaration (which line?)  Line ___
- **Underline** the constructor (lines ___ to ___)
- **Star ★** each method (how many methods total?) ___
- **Box** each Javadoc block (how many Javadoc blocks total?) ___
- **Highlight** every use of `this.` (how many times?) ___
- **Mark ✗** the lines that throw exceptions (how many?) ___

---

## 2. Access Modifiers

The field on line 11 is `private`. The constructor on line 21 is `public`. Why?

> Field is private because: ________________________________________________
>
> Constructor is public because: ____________________________________________

---

## 3. The @throws Tag

Find the `@throws` Javadoc tag (line 19). What does it document?

> _______________________________________________________________________

When does this exception actually get thrown? (describe the condition)

> _______________________________________________________________________

---

## 4. Query vs Command Methods

A **query** method returns information (no side effects). A **command** method changes state.

Classify each method:

| Method | Query or Command? | Why? |
|--------|-------------------|------|
| `getHour()` | ____________ | ________________________________ |
| `getMinute()` | ____________ | ________________________________ |
| `getDecimal()` | ____________ | ________________________________ |
| `toString()` | ____________ | ________________________________ |

Does this class have ANY command methods? ___________

What does that tell you about this class? (hint: once created, can it change?)

> _______________________________________________________________________

---

## 5. Integer Arithmetic

Line 40: `return this.secondsSinceMidnight / 3600;`

If `secondsSinceMidnight = 52245`, what does `getHour()` return? Show your work:

> _______________________________________________________________________

Line 48: `return (this.secondsSinceMidnight % 3600) / 60;`

For the same value (52245), what does `getMinute()` return? Show your work:

> _______________________________________________________________________

Line 58: `return this.secondsSinceMidnight % 60;`

What does `getSecond()` return?

> _______________________________________________________________________

Verify: does 14:30:45 == 52245 seconds since midnight? ___________

---

## 6. String.format

Line 67: `String.format("%02d:%02d:%02d", ...)`

What does `%02d` mean?

> `%` = _________, `0` = _________, `2` = _________, `d` = _________

What would `String.format("%02d", 5)` produce? ___________

What would `String.format("%02d", 14)` produce? ___________

---

## 7. Sketch a UML Class Diagram

Draw the class diagram for DigitalClock:

```
┌─────────────────────────────────────┐
│                                     │
├─────────────────────────────────────┤
│                                     │
│                                     │
├─────────────────────────────────────┤
│                                     │
│                                     │
│                                     │
│                                     │
│                                     │
│                                     │
│                                     │
└─────────────────────────────────────┘
```
# Phase 3 Worksheet: Implement the Constructor

**Time**: 15 minutes | **Format**: Code in your IDE | **Work with**: a partner

---

Open `DigitalClockRepo/src/main/java/clock/DigitalClock.java` in your IDE.

Your task: implement the constructor so that the validation tests pass.

---

## Step 1: Validation Guards

Write three `if` statements that throw `IllegalArgumentException` when a parameter is invalid.

**Pattern:**
```java
if (hour < 0 || hour > 23) {
    throw new IllegalArgumentException("Invalid hour: " + hour);
}
```

What are the valid ranges?
- hour: ___ to ___
- minute: ___ to ___
- second: ___ to ___

---

## Step 2: Calculate secondsSinceMidnight

After validation passes, store the total seconds in the field.

**Formula**: `secondsSinceMidnight = hour * ____ + minute * ____ + second`

Fill in the blanks:
- 1 hour = _______ seconds
- 1 minute = _______ seconds

Write the assignment statement:

> `this.secondsSinceMidnight = ` _________________________________________________;

---

## Step 3: Run the Tests

Run: `./gradlew test` (or use your IDE's test runner)

Which tests should pass now?

- [ ] `testValidConstruction`
- [ ] `testInvalidHourNegative`
- [ ] `testInvalidHourTooHigh`
- [ ] `testInvalidMinuteNegative`
- [ ] `testInvalidMinuteTooHigh`
- [ ] `testInvalidSecondNegative`
- [ ] `testInvalidSecondTooHigh`
- [ ] `testBoundaryMidnight`
- [ ] `testBoundaryMaxValid`

How many tests pass? ___ / 17

---

## Checkpoint

If your validation tests all pass, move to Phase 4. If not:

**Common mistakes:**
- Using `&&` instead of `||` in the condition (think: "hour < 0 OR hour > 23" means invalid)
- Forgetting to use `this.` for the field assignment
- Using `=` (assign) instead of `==` (compare) — Java won't compile this in an `if`
# Phase 4 Worksheet: Implement toString() and getDecimal()

**Time**: 20 minutes | **Format**: Code in your IDE | **Work with**: a partner

---

## Step 1: Implement getHour(), getMinute(), getSecond()

You stored everything as one number (`secondsSinceMidnight`). Now extract the parts.

**Integer division reminder**: In Java, `int / int` drops the remainder. `int % int` gives the remainder.

| Operation | Formula | Example (52245) | Result |
|-----------|---------|-----------------|--------|
| Get hour | `secondsSinceMidnight / 3600` | 52245 / 3600 | ___ |
| Get minute | `(secondsSinceMidnight % 3600) / 60` | (52245 % 3600) / 60 | ___ |
| Get second | `secondsSinceMidnight % 60` | 52245 % 60 | ___ |

Implement all three methods. Run tests — which new tests pass?

- [ ] `testGetHour`
- [ ] `testGetMinute`
- [ ] `testGetSecond`

---

## Step 2: Implement getDecimal()

The format is `"HH:MM:SS"` — always two digits, zero-padded.

**String.format cheat sheet:**
- `%d` = integer
- `%02d` = integer, at least 2 digits wide, padded with zeros
- Example: `String.format("%02d", 5)` → `"05"`
- Example: `String.format("%02d", 14)` → `"14"`

Write the implementation:

```java
return String.format("%02d:%02d:%02d", __________, __________, __________);
```

What methods do you call to get the three values?

> _______________________________________________________________________

Run tests — which new tests pass?

- [ ] `testGetDecimalMidnight`
- [ ] `testGetDecimalAfternoon`
- [ ] `testGetDecimalEndOfDay`
- [ ] `testGetDecimalSingleDigits`

---

## Step 3: Implement toString()

Format: `"DigitalClock[HH:MM:SS]"`

Hint: you already have a method that returns `"HH:MM:SS"`. Reuse it!

```java
return "DigitalClock[" + ______________ + "]";
```

Run tests — `testToString` should now pass.

---

## Step 4: Run ALL Tests

Run the full test suite. How many pass? ___ / 17

If all 17 pass — congratulations! Your DigitalClock is complete. Move to Phase 5.

**Common mistakes:**
- Forgetting parentheses in modulo: `secondsSinceMidnight % 3600 / 60` (wrong!) vs `(secondsSinceMidnight % 3600) / 60` (right!)
- Using `this.getHour` without `()` — methods need parentheses to call them
- Returning `null` instead of the formatted String
# Phase 5 Worksheet: Write JUnit 5 Tests

**Time**: 15 minutes | **Format**: Code in your IDE | **Work with**: individually

---

Now YOU write tests. Open `DigitalClockTest.java` and add new test methods at the bottom.

---

## Part A: Write assertThrows Tests

Write 3 tests that verify invalid inputs throw `IllegalArgumentException`.

**Pattern:**
```java
@Test
public void testMyInvalidCase() {
    assertThrows(IllegalArgumentException.class, () -> {
        new DigitalClock(/* invalid args */);
    });
}
```

### Test 1: Hour exactly 24 (boundary — just past valid)

```java
@Test
public void test_________________________________() {
    assertThrows(IllegalArgumentException.class, () -> {
        new DigitalClock(______, ______, ______);
    });
}
```

### Test 2: Negative minute

```java
@Test
public void test_________________________________() {
    assertThrows(IllegalArgumentException.class, () -> {
        new DigitalClock(______, ______, ______);
    });
}
```

### Test 3: Second exactly 60 (boundary — just past valid)

```java
@Test
public void test_________________________________() {
    assertThrows(IllegalArgumentException.class, () -> {
        new DigitalClock(______, ______, ______);
    });
}
```

---

## Part B: Write a Boundary Test

Write a test that verifies a **valid** boundary case works correctly:

```java
@Test
public void test_________________________________() {
    DigitalClock clock = new DigitalClock(______, ______, ______);
    assertEquals(____________, clock.getDecimal());
}
```

Which boundary did you choose? (e.g., midnight 00:00:00, end of day 23:59:59, noon 12:00:00)

> _______________________________________________________________________

---

## Part C: Reflection

What is the difference between these two approaches?

```java
// Approach A: test that construction succeeds
@Test
public void testValidClock() {
    DigitalClock c = new DigitalClock(12, 0, 0);
    assertEquals(12, c.getHour());
}

// Approach B: test that construction fails
@Test
public void testInvalidClock() {
    assertThrows(IllegalArgumentException.class, () -> {
        new DigitalClock(25, 0, 0);
    });
}
```

When do you use Approach A vs Approach B?

> _______________________________________________________________________
>
> _______________________________________________________________________

---

## Part D: Run All Tests

Run the full test suite including your new tests.

Total tests passing: ___ (should be 17 original + your new ones)

If any fail, what went wrong?

> _______________________________________________________________________
