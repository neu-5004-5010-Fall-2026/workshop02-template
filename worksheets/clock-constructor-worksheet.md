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

How many tests pass? ___ / 17 (7 should pass — boundary tests need Phase 4 getters)

---

## Checkpoint

If your validation tests all pass, move to Phase 4. If not:

**Common mistakes:**
- Using `&&` instead of `||` in the condition (think: "hour < 0 OR hour > 23" means invalid)
- Forgetting to use `this.` for the field assignment
- Using `=` (assign) instead of `==` (compare) — Java won't compile this in an `if`
