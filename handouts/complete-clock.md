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
