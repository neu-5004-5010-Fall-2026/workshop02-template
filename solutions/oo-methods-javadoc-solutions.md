# Phase 4 Solutions: Methods, toString(), and Javadoc

---

## Part A: Getter Methods

```java
    /**
     * Get the first name of this student.
     *
     * @return the first name of this student
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Get the last name of this student.
     *
     * @return the last name of this student
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Get the year of enrollment of this student.
     *
     * @return the year this student enrolled
     */
    public int getYearOfEnrollment() {
        return this.yearOfEnrollment;
    }

    /**
     * Get the GPA of this student.
     *
     * @return the grade point average of this student
     */
    public double getGpa() {
        return this.gpa;
    }
```

---

## Part B: toString() Method

```java
    /**
     * Returns a string representation of this student.
     *
     * @return a formatted string describing this student
     */
    @Override
    public String toString() {
        return this.firstName + " " + this.lastName
                + " (enrolled " + this.yearOfEnrollment + ", GPA: " + this.gpa + ")";
    }
```

**What `@Override` means**: It tells the compiler that this method is intentionally replacing (overriding) a method inherited from a parent class — in this case, `Object.toString()`. If you misspell the method name, the compiler will warn you.

---

## Part C: Peer Review Checklist

All items should pass for a well-written Student class:

| Check | Criterion |
|-------|-----------|
| ✓ | All fields are `private` |
| ✓ | Constructor is `public` |
| ✓ | All getter methods are `public` |
| ✓ | Every method has a Javadoc comment |
| ✓ | At least one `@param` tag is present (in constructor) |
| ✓ | At least one `@return` tag is present (in getters) |
| ✓ | `this.` is used to access fields |
| ✓ | `toString()` returns a String (not void) |

---

## Part B Bonus: getFullName()

```java
    /**
     * Get the full name of this student.
     *
     * @return the full name (first + last) of this student
     */
    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
```
