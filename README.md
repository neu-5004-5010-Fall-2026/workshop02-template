# Workshop 02: Object-Oriented Design & Your First Java Class

**Course**: CS 5004/5010 — Object-Oriented Design
**Date**: Monday, September 21, 2026 (Week 2)
**Duration**: 2 hours
**Format**: Paper first, then IDE — bring a laptop *and* a pen

---

## Overview

The first workshop with real content. It runs in two halves that answer two different questions:

- **On paper (first hour):** *why* objects — what a class buys you over a bag of functions, and how
  to design one before touching a keyboard.
- **In the IDE (second hour):** *how* — implement `DigitalClock` from scratch, with validation and
  JUnit tests, as the first project students build themselves.

Designing on paper before coding is the habit the whole term rests on. Doing both in one session is
deliberate: students see a design they made in phase 3 turn into code they run in phase 5.

> **Module 01** — *Java Fundamentals & Designing Objects*. Quiz 01 is due Sun Sep 20.
> **Assignment 01** (Track A, the animal shelter) releases at **5:00 PM today**, and its value
> objects are the same idea as the clock's constructor validation.

---

## Learning Objectives (Module 01)

By the end of this workshop, students should be able to:

- [ ] Distinguish function-centric from object-oriented design, and say what the class buys
- [ ] Read and annotate a Java class — fields, constructor, methods
- [ ] Explain `private` vs `public`, and why fields are private by default here
- [ ] Read and write Javadoc, including `@param` and `@return`
- [ ] Design a class on paper: fields, constructor, method signatures
- [ ] Implement a Java class with a private field, a validating constructor, and methods
- [ ] Enforce a class invariant by throwing `IllegalArgumentException`
- [ ] Use integer division and modulo to derive components from a stored value
- [ ] Write JUnit 5 tests, including `assertThrows`

---

## Workshop Structure

| Phase | Duration | Type | Activity |
|-------|----------|------|----------|
| 1 | 15 min | Read (paper) | Function-centric vs object-oriented, in Python |
| 2 | 15 min | Read (paper) | Java class anatomy — `Person.java` |
| 3 | 20 min | Design (paper) | Design a class of your own: fields, constructor, methods |
| 4 | 15 min | Design (paper) | Getters, `toString()`, Javadoc — then peer review |
| 5 | 25 min | Code (IDE) | `DigitalClock`: validating constructor, getters, `toString()` |
| 6 | 20 min | Code (IDE) | JUnit 5 tests, including `assertThrows` |
| — | 10 min | Wrap-up | Paper design → running code; what Assignment 01 asks |

**The hinge is between phases 4 and 5.** Everything before it is pen and paper; everything after is
the machine. Say so explicitly when you get there.

### Pre-read, not a live phase

`handouts/python-vs-java-clock.md` puts the Python and Java DigitalClock side by side. It is
**assigned reading before the session**, not workshop time — it is syntax translation, and syntax
is better absorbed alone than in a room. Students who skip it can still follow phase 5.

### Optional / take-home

**Extend the clock** — add `getAMPM()` or `tick()`. Genuinely optional, for anyone who finishes
phase 6 early. Solutions provided.

---

## Materials Needed

### Print per student
- `Student-Workbook.md`
- Handouts: `oo-python-person.md`, `oo-java-person.md`
- Worksheets: `oo-read-python-worksheet.md`, `oo-read-java-worksheet.md`,
  `oo-design-class-worksheet.md`, `oo-methods-javadoc-worksheet.md`

### On machines
- `DigitalClockRepo/` — the Gradle project for phases 5–6.

### Instructor materials
- `Instructor-Guide.md`
- `solutions/` — every worksheet and the complete `DigitalClock`
- Whiteboard for the phase-4 peer review and the phase-3 design share

---

## Connection to Course

- **Phases 1–4 came from the old Workshop 01**, which taught this Module 01 material a week early on
  Module 00's date. See `PlanningDocuments/125-timeline-analysis.md` §F2.
- **Phase 5's validating constructor is Assignment 01 in miniature.** The shelter's `AgeMonths` and
  `Animal` do exactly this: check first, assign second, make invalid states impossible to build.
- **Phase 6's `assertThrows`** is the idiom every provided test suite in this course uses.
- Reading a class before writing one is the habit the graded **code walks** are built on.

---

## Notes

- **This workshop absorbed the old Workshop 01.** Nothing was cut except live time on the
  Python-vs-Java syntax comparison, which became pre-reading.
- **`Workshop02-Student-Packet.docx` is now stale** — it predates the merge and needs regenerating
  from `Student-Workbook.md`.
