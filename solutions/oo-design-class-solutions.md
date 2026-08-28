# Phase 3 Solutions: Design a Student Class

---

## Part A: OO Introductions

Example: "I am an object of type **GradStudent**. My properties are: firstName, program, startYear, caffeineLevel. My behaviors include: study(), submitAssignment(), drinkCoffee()."

(Answers will vary — any reasonable properties + behaviors are acceptable.)

---

## Part B: Design a Student Class

### Fields

| Access | Type | Name | What it represents |
|--------|------|------|--------------------|
| private | String | firstName | The student's first name |
| private | String | lastName | The student's last name |
| private | int | yearOfEnrollment | The year the student enrolled |
| private | double | gpa | The student's grade point average |

### Constructor signature

```java
public Student(String firstName, String lastName, int yearOfEnrollment, double gpa)
```

---

## Part C: Java Code

```java
/**
 * This class represents a student. A student has a first name,
 * last name, year of enrollment, and GPA.
 */
public class Student {

    // Fields
    private String firstName;
    private String lastName;
    private int yearOfEnrollment;
    private double gpa;

    // Constructor
    /**
     * Constructs a Student object.
     *
     * @param firstName       the first name of this student
     * @param lastName        the last name of this student
     * @param yearOfEnrollment the year this student enrolled
     * @param gpa             the grade point average of this student
     */
    public Student(String firstName, String lastName, int yearOfEnrollment, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfEnrollment = yearOfEnrollment;
        this.gpa = gpa;
    }
}
```
