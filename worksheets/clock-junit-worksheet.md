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
