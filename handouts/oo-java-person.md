# Phase 2 Handout: Our First Java Class — Person.java + PersonTest.java

## Person.java (with Javadoc)

```java
/**
 * This class represents a person. The person has a first
 * name, last name and a year of birth.
 */
public class Person {
    private String firstName;
    private String lastName;
    private int yearOfBirth;

    /**
     * Constructs a Person object and initializes it
     * to the given first name, last name and year of birth.
     *
     * @param firstName the first name of this person
     * @param lastName  the last name of this person
     * @param yearOfBirth the year of birth of this person
     */
    public Person(String firstName, String lastName, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    /**
     * Get the first name of this person.
     *
     * @return the first name of this person
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Return the last name of this person.
     *
     * @return the last name of this person
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Return the year of birth of this person.
     *
     * @return the year of birth of this person
     */
    public int getYearOfBirth() {
        return this.yearOfBirth;
    }

    /**
     * Return the age of this person in the current year.
     *
     * @return the age of this person
     */
    public int getAge() {
        return 2026 - this.yearOfBirth;
    }

    /**
     * Return the full name of this person.
     *
     * @return the full name of this person
     */
    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
}
```

---

## PersonTest.java (JUnit 5)

```java
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A JUnit test class for the Person class.
 */
public class PersonTest {

    private Person john;
    private Person sally;

    @BeforeEach
    public void setUp() {
        this.john = new Person("John", "Doe", 1945);
        this.sally = new Person("Sally", "Ride", 1951);
    }

    @Test
    public void testGetFirstName() {
        assertEquals("John", this.john.getFirstName());
        assertEquals("Sally", this.sally.getFirstName());
    }

    @Test
    public void testGetLastName() {
        assertEquals("Doe", this.john.getLastName());
        assertEquals("Ride", this.sally.getLastName());
    }

    @Test
    public void testGetAge() {
        assertEquals(81, this.john.getAge());
        assertEquals(75, this.sally.getAge());
    }

    @Test
    public void testGetFullName() {
        assertEquals("John Doe", this.john.getFullName());
        assertEquals("Sally Ride", this.sally.getFullName());
    }
}
```

---

## Quick Reference: Java Class Anatomy

```
┌─────────────────────────────────────────────────────┐
│  /** Javadoc comment for the class */               │  ← Class documentation
│  public class Person {                              │  ← Class declaration
│                                                     │
│      private String firstName;                      │  ← Fields (private)
│      private String lastName;                       │
│      private int yearOfBirth;                       │
│                                                     │
│      public Person(String fn, String ln, int yob) { │  ← Constructor (public)
│          this.firstName = fn;                       │
│          ...                                        │
│      }                                              │
│                                                     │
│      public String getFirstName() {                 │  ← Methods (public)
│          return this.firstName;                     │
│      }                                              │
│      ...                                            │
│  }                                                  │
└─────────────────────────────────────────────────────┘
```
