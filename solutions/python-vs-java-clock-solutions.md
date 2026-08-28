# Phase 1 Solutions: Python vs Java Observation

## 1. Type Declarations
1. `private int secondsSinceMidnight` — Java declares the field type
2. `int hour` — parameter types required in constructor
3. `public int getHour()` — return type declared on method

## 2. Self vs This
Java equivalent of `self.seconds_since_midnight`: `this.secondsSinceMidnight`

Why `this` is needed: the constructor parameter `hour` has the same name as what would be a field — `this.` disambiguates "this object's field" from the parameter.

## 3. Class Invariant
"The stored seconds must always be >= 0 and < 86400 (total seconds in one day)."

- In Python: raises `ValueError`
- In Java: throws `IllegalArgumentException`

## 4. Naming Conventions
| Element | Python | Java |
|---------|--------|------|
| Class | DigitalClock | DigitalClock |
| Method | get_hour | getHour |
| Field | seconds_since_midnight | secondsSinceMidnight |

Java uses **camelCase** for methods and fields.

## 5. Structural Differences
Two things Java requires that Python doesn't:
1. Semicolons at end of statements
2. Curly braces `{}` to delimit blocks (instead of indentation)

Python `__init__` → Java replaces with constructor named same as class.

## 6. Why One Field?
Storing one number guarantees the invariant can never be violated — you can't independently set hour=25 if all you store is total seconds in [0, 86400). It also simplifies validation to a single range check.
