# Phase 6 Worksheet: Extend the Clock

**Time**: 10 min | **Format**: Code in IDE | **Work with**: individually

---

Choose ONE task (different groups can pick different ones):

## Option A: getAMPM()

Returns `"AM"` if hour < 12, `"PM"` otherwise.

```java
public String getAMPM() {
    if (this.getHour() < ___) {
        return "___";
    }
    return "___";
}
```

Write a test: `assertEquals("PM", new DigitalClock(14, 0, 0).getAMPM());`

## Option B: tick()

Returns a NEW DigitalClock one second later. Wraps at 23:59:59 → 00:00:00.

```java
public DigitalClock tick() {
    int newSeconds = this.secondsSinceMidnight + 1;
    if (newSeconds >= ___________) {
        newSeconds = ___;
    }
    // construct from total seconds: hours, mins, secs
    return new DigitalClock(
        newSeconds / 3600,
        (newSeconds % 3600) / 60,
        newSeconds % 60
    );
}
```

Write a test:
```java
DigitalClock end = new DigitalClock(23, 59, 59);
DigitalClock wrapped = end.tick();
assertEquals("00:00:00", wrapped.getDecimal());
```

---

Does your test pass? ___

**Key insight**: tick() returns a NEW clock (immutability). The original doesn't change.
