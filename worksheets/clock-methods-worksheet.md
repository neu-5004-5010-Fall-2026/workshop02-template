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
