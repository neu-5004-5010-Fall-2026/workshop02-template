# Workshop 02: Object-Oriented Design & Your First Java Class

**Name:** ___________________________  **Date:** Monday, September 21, 2026

---

## Workshop Overview

Two halves, and the join between them is the point.

**First hour, on paper.** Why a class beats a bag of functions, how to read one, and how to design
one before you type anything.

**Second hour, in the IDE.** Build `DigitalClock` from nothing — a validating constructor, methods
that derive values rather than store them, and JUnit tests that prove it.

**Before you start:** you should have read `handouts/python-vs-java-clock.md`. If you have not, skim
it now — it is the same clock in both languages and it will make phase 5 faster.

**Assignment 01 releases at 5:00 PM today.** Its first two classes do exactly what phase 5 does.

---

# PART ONE — ON PAPER

## Phase 1: Function-centric vs object-oriented (15 min)

Read `handouts/oo-python-person.md` — the same "person" built two ways in Python: once as a
dictionary passed between functions, once as a class.

Complete `worksheets/oo-read-python-worksheet.md`.

The question to hold on to:

> In the function-centric version, **what stops someone putting a `yearOfBirth` of `"banana"` into
> that dictionary?**

- [ ] Worksheet complete
- [ ] I can state one thing the class version makes impossible

**My one-sentence answer to "what does the class buy you?"**

<br><br>

---

## Phase 2: Java class anatomy (15 min)

Read `handouts/oo-java-person.md` — `Person.java` and `PersonTest.java`.

Annotate the handout directly. Mark and label:

- [ ] the **fields**
- [ ] the **constructor** (how do you know it is the constructor?)
- [ ] a **getter**
- [ ] every `private` and every `public`
- [ ] the **Javadoc**, and what `@param` and `@return` are for

Complete `worksheets/oo-read-java-worksheet.md`.

**Why are the fields `private` when there is a public getter returning them anyway?**
*(There is a real answer. "Encapsulation" on its own is not it.)*

<br><br><br>

---

## Phase 3: Design a class on paper (20 min)

Complete `worksheets/oo-design-class-worksheet.md`. **No laptop for this phase.**

You will pick something from your own life and design a class for it. Write:

1. The class name
2. Its fields, with types
3. The constructor signature — **and what it should refuse to build**
4. Three method signatures

That third one matters most and is the one people skip. A constructor that accepts anything is a
constructor that has told you nothing.

- [ ] Design drafted
- [ ] I have written down at least **two** things my constructor should reject

**My class:** ____________________________

**Two things it refuses to build:**

1. <br>
2. <br>

---

## Phase 4: Getters, `toString()`, Javadoc — and peer review (15 min)

Complete `worksheets/oo-methods-javadoc-worksheet.md`: write the getters, a `toString()`, and
Javadoc for the class you designed.

Then **swap with the person next to you.** On their design, find:

- [ ] one field that could be `private` and is not
- [ ] one method whose name does not say what it does
- [ ] one thing their constructor should reject and does not

**What my partner found in mine:**

<br><br>

> **This is a rehearsal for the code walks.** Explaining a design to someone who did not write it,
> and having them find the hole in it, is the graded skill this course is built around.

---

# PART TWO — IN THE IDE

> **The hinge.** Everything above was paper. Everything below is the machine. Open
> `DigitalClockRepo/` — **the folder containing `build.gradle`** — and run `./gradlew test`. Red is
> correct: nothing is implemented yet.

## Phase 5: Build `DigitalClock` (25 min)

`handouts/complete-clock.md` shows the finished class — read it before you write.

Complete `worksheets/clock-constructor-worksheet.md`, then
`worksheets/clock-methods-worksheet.md`.

**The class invariant, and the whole idea of the phase:**

```
0 <= secondsSinceMidnight < 86400
```

One field. Everything else is derived.

- [ ] Constructor validates `hour`, `minute`, `second` and throws `IllegalArgumentException`
- [ ] Validation happens **before** anything is assigned
- [ ] `getHour()`, `getMinute()`, `getSecond()` **derive** from the single field
- [ ] `toString()` formats as `HH:MM:SS` — including the leading zeros
- [ ] `./gradlew test` is greener than it was

**Why store one `int` rather than three?**

<br><br>

**Integer division and modulo — fill these in for `secondsSinceMidnight = 45296`:**

| Want | Expression | Value |
|---|---|---|
| hour | `seconds / 3600` | |
| minute | `(seconds / 60) % 60` | |
| second | `seconds % 60` | |

---

## Phase 6: Test it (20 min)

Complete `worksheets/clock-junit-worksheet.md`.

Write tests of your own. At minimum:

- [ ] a **positive** case — a valid time behaves correctly
- [ ] a **boundary** — `00:00:00` and `23:59:59`
- [ ] a **negative** case using `assertThrows` — an invalid time is refused

```java
assertThrows(IllegalArgumentException.class, () -> new DigitalClock(24, 0, 0));
```

- [ ] All my tests pass
- [ ] I tested something the provided suite does *not* check

**Which case did you find that the provided tests missed?**

<br><br>

> `assertThrows` is the idiom every provided test suite in this course uses. You will read it far
> more often than you write it.

### Optional, if you finish early

`worksheets/clock-extend-bonus-worksheet.md` — add `getAMPM()` or `tick()`. Not assessed; take it
home if you would rather.

---

## Wrap-Up (10 min)

Look back at the class you designed in **phase 3** and the class you built in **phase 5**.

**What did you have to decide on paper that the IDE would not have told you?**

<br><br>

**Assignment 01 releases at 5:00 PM today** — Track A, the animal shelter, due Fri Oct 2. Its
`AgeMonths` and `Animal` are the clock's validating constructor applied twice. If phase 5 made
sense, you have already met the idea.

**Before you leave:**

- [ ] `DigitalClock` compiles and my tests pass
- [ ] I have a paper design I could hand to someone else
- [ ] I know what `assertThrows` does

---

## Quick Reference

```java
// validate first, assign second — never the other way round
public DigitalClock(int hour, int minute, int second) {
  if (hour < 0 || hour > 23) {
    throw new IllegalArgumentException("hour must be 0-23, was " + hour);
  }
  ...
  this.secondsSinceMidnight = hour * 3600 + minute * 60 + second;
}
```

```java
String.format("%02d:%02d:%02d", h, m, s)   // "07:04:09", not "7:4:9"
assertThrows(IllegalArgumentException.class, () -> new DigitalClock(24, 0, 0));
```

| | |
|---|---|
| `private` field + `public` getter | Callers read it; nobody can *change* it |
| Derive, don't store | One source of truth cannot disagree with itself |
| Throw in the constructor | An object that exists is an object that is valid |
