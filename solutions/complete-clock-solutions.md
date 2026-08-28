# Phase 2 Solutions: Annotate Complete DigitalClock.java

## 1. Annotate
- Field: line 11 (`private int secondsSinceMidnight`)
- Constructor: lines 21-32
- Methods: 5 (getHour, getMinute, getSecond, getDecimal, toString)
- Javadoc blocks: 7 (class + constructor + 5 methods)
- `this.` usage: 7 times
- Exception lines: 22-23, 25-26, 28-29 (6 lines)

## 2. Access Modifiers
- Field is private: prevents outside code from setting invalid values
- Constructor is public: so other code can create DigitalClock objects

## 3. @throws
Documents when `IllegalArgumentException` is thrown — when hour, minute, or second is out of valid range. Important so callers know what inputs are rejected.

## 4. Query vs Command
| Method | Type | Why |
|--------|------|-----|
| getHour() | Query | returns info, no side effects |
| getMinute() | Query | returns info, no side effects |
| getDecimal() | Query | returns info, no side effects |
| toString() | Query | returns info, no side effects |

No command methods — this class is **immutable** (once created, it never changes).

## 5. Integer Arithmetic
- 52245 / 3600 = **14** (integer division drops remainder)
- (52245 % 3600) / 60 = 1845 / 60 = **30**
- 52245 % 60 = **45**
- Verify: 14:30:45 = 14×3600 + 30×60 + 45 = 50400 + 1800 + 45 = 52245 ✓

## 6. String.format
- `%` = format specifier start
- `0` = pad with zeros
- `2` = minimum 2 characters wide
- `d` = decimal integer
- `String.format("%02d", 5)` → `"05"`
- `String.format("%02d", 14)` → `"14"`
