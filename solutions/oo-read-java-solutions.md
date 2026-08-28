# Phase 2 Solutions: Java Class Anatomy, Access Modifiers, Javadoc & JUnit

---

## 1. Identify the Parts

On the Person.java handout:
- **Circled fields**: `private String firstName;`, `private String lastName;`, `private int yearOfBirth;`
- **Underlined constructor**: `public Person(String firstName, String lastName, int yearOfBirth) { ... }`
- **Starred methods**: `getFirstName()`, `getLastName()`, `getYearOfBirth()`, `getAge()`, `getFullName()`
- **Boxed Javadoc**: The `/** ... */` blocks above the class, constructor, and each method

---

## 2. Fields

| # | Type | Name |
|---|------|------|
| 1 | String | firstName |
| 2 | String | lastName |
| 3 | int | yearOfBirth |

**Why all `private`?** To prevent outside code from directly accessing or changing the data. This enforces encapsulation — other classes must use the public getter methods to access the values, which gives the Person class control over how its data is accessed.

---

## 3. Constructor

**Parameters**: 3 (firstName, lastName, yearOfBirth)

**What `this.firstName = firstName;` does**: It assigns the value of the constructor parameter `firstName` to the object's field `this.firstName`. The `this` keyword is needed because the parameter and the field have the same name — `this.` refers to "this object's field" while the bare name refers to the parameter.

---

## 4. Access Modifiers

**Why constructor is `public`?** So that code outside the Person class can create Person objects using `new Person(...)`.

**Why getters are `public`?** So that code outside the class can retrieve the person's data (since the fields themselves are private).

**Can another class access `john.firstName` directly?** No — it's `private`. You must call `john.getFirstName()` instead.

---

## 5. Javadoc

**`@param` documents**: A method parameter — its name and what it represents. Example: `@param firstName the first name of this person`

**`@return` documents**: What the method returns. Example: `@return the first name of this person`

**How Javadoc differs from `//`**: Javadoc comments start with `/**` (two stars) and are processed by the Javadoc tool to generate HTML documentation. Regular `//` comments are only for developers reading the source code.

---

## 6. JUnit Test Class

**`@BeforeEach`**: Runs before each `@Test` method — used to set up fresh test objects so tests are independent.

**`@Test`**: Marks a method as a test case that JUnit will run.

**`assertEquals("John", this.john.getFirstName())`**: Checks that calling `getFirstName()` on the `john` object returns the String `"John"`. If it doesn't, the test fails.

**`getAge()` for yearOfBirth 1945 in 2026**: 2026 - 1945 = **81**

---

## 7. Class Diagram

```
┌───────────────────────────────────┐
│            Person                 │
├───────────────────────────────────┤
│ - firstName: String               │
│ - lastName: String                │
│ - yearOfBirth: int                │
├───────────────────────────────────┤
│ + Person(String, String, int)     │
│ + getFirstName(): String          │
│ + getLastName(): String           │
│ + getYearOfBirth(): int           │
│ + getAge(): int                   │
│ + getFullName(): String           │
└───────────────────────────────────┘
```
