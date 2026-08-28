# Phase 2 Worksheet: Java Class Anatomy, Access Modifiers, Javadoc & JUnit

**Time**: 20 minutes | **Format**: Annotate the handout + answer below | **Work with**: a partner

---

Read **Person.java** and **PersonTest.java** on the Phase 2 handout. Use a pen/pencil to annotate the code, then answer below.

---

## 1. Identify the Parts (annotate on the handout)

On the Person.java code:
- **Circle** all the fields (there are 3)
- **Underline** the constructor
- **Put a star** ★ next to each method
- **Draw a box** around each Javadoc comment block

---

## 2. Fields

List the three fields. For each, write the type and the name:

| # | Type | Name |
|---|------|------|
| 1 | ________________ | ________________ |
| 2 | ________________ | ________________ |
| 3 | ________________ | ________________ |

Why are all fields marked `private`?

> _______________________________________________________________________
>
> _______________________________________________________________________

---

## 3. Constructor

How many parameters does the constructor take? ___________

What does `this.firstName = firstName;` do? (Why is `this` needed here?)

> _______________________________________________________________________
>
> _______________________________________________________________________

---

## 4. Access Modifiers

Why is the constructor marked `public`?

> _______________________________________________________________________

Why are the getter methods marked `public`?

> _______________________________________________________________________

Could another class access `john.firstName` directly? Why or why not?

> _______________________________________________________________________

---

## 5. Javadoc

Find a `@param` tag. What does it document?

> _______________________________________________________________________

Find a `@return` tag. What does it document?

> _______________________________________________________________________

How is a Javadoc comment different from a regular `//` comment?

> _______________________________________________________________________

---

## 6. JUnit Test Class

Look at PersonTest.java:

What does `@BeforeEach` do?

> _______________________________________________________________________

What does `@Test` mark?

> _______________________________________________________________________

What does `assertEquals("John", this.john.getFirstName())` check?

> _______________________________________________________________________

If `yearOfBirth` is 1945, what will `getAge()` return in 2026? ___________

---

## 7. Sketch a Class Diagram

In the box below, draw a UML class diagram for Person. Use `+` for public and `-` for private.

```
┌─────────────────────────────┐
│          Person             │
├─────────────────────────────┤
│                             │
│                             │
│                             │
├─────────────────────────────┤
│                             │
│                             │
│                             │
│                             │
│                             │
│                             │
└─────────────────────────────┘
```
