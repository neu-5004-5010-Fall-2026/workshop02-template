# Phase 1 Solutions: Function-Centric vs Object-Oriented Design

---

## 1. Data Representation

**Design 1**: A person's data is stored in a Python dictionary with keys `'firstName'`, `'lastName'`, `'yearOfBirth'`.

**Design 2**: A person's data is stored as attributes of a class instance (`self.firstName`, `self.lastName`, `self.yearOfBirth`).

---

## 2. Calling Convention

**Design 1**: `getAge(john)`

**Design 2**: `john.getAge()`

**Difference**: In Design 1, the function "takes" the data and operates on it (the function owns the operation). In Design 2, the object "owns" the operation — you ask the object to perform it on itself.

---

## 3. Where Do Functions Live?

**Design 1**: Outside the data structure — they are standalone functions defined at the module level.

**Design 2**: Inside the class — they are methods defined within the `Person` class definition.

---

## 4. Encapsulation

**Which design groups data and functions together?** Design 2 (object-oriented).

**What is this grouping called?** Encapsulation.

---

## 5. Adding a New Operation

**Design 1**: Add a new standalone function anywhere in the file: `def getInitials(person): ...`

**Design 2**: Add a new method inside the Person class: `def getInitials(self): ...`

**Which keeps related code together?** Design 2 — the new operation lives alongside the data it operates on and the other operations.

---

## 6. Reflection

Object-oriented design keeps data and the operations that work on that data bundled together in one unit, making code easier to understand, maintain, and extend because related logic isn't scattered across the program.
