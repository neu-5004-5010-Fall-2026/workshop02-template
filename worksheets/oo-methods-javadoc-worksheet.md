# Phase 4 Worksheet: Methods, toString(), and Javadoc

**Time**: 15 minutes | **Format**: Independent coding (on paper) | **Work with**: same partner

---

## Part A: Write Getter Methods

Add getter methods to your Student class. Follow the Person.java pattern (`public`, return type, method name, `return this.fieldName`).

```java
    /**
     * Get the __________ of this student.
     *
     * @return __________________________________________
     */
    public _________ get_________() {
        return this.________________;
    }

    /**
     * Get the __________ of this student.
     *
     * @return __________________________________________
     */
    public _________ get_________() {
        return this.________________;
    }

    /**
     * Get the __________ of this student.
     *
     * @return __________________________________________
     */
    public _________ get_________() {
        return this.________________;
    }
```

---

## Part B: Write a toString() Method

The `toString()` method returns a human-readable String representation of the object. Example for Person: `"John Doe (born 1945)"`

Write a `toString()` for your Student:

```java
    /**
     * Returns a string representation of this student.
     *
     * @return a formatted string describing this student
     */
    @Override
    public String toString() {
        return ______________________________________________;
    }
```

What does `@Override` mean?

> _______________________________________________________________________

---

## Part C: Peer Review Checklist

Swap your code with your partner. Check each item:

| Check | Criterion | Pass? |
|-------|-----------|-------|
| [ ] | All fields are `private` | |
| [ ] | Constructor is `public` | |
| [ ] | All getter methods are `public` | |
| [ ] | Every method has a Javadoc comment | |
| [ ] | At least one `@param` tag is present | |
| [ ] | At least one `@return` tag is present | |
| [ ] | `this.` is used to access fields | |
| [ ] | `toString()` returns a String (not void) | |

One thing your partner did well:

> _______________________________________________________________________

One suggestion for improvement:

> _______________________________________________________________________
