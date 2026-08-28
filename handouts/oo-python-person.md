# Phase 1 Handout: Function-Centric vs Object-Oriented Design in Python

## Design 1: Function-Centric (Data and Functions Separate)

```python
# create a dictionary that represents a person
def createPerson(firstName, lastName, yearOfBirth):
    """
    This function takes in the various attributes for a person and returns a
    dictionary with keys for first name, last name and year of birth with their
    respective values equal to whatever was passed to this function.
    """
    record = {'firstName': firstName, 'lastName': lastName, 'yearOfBirth': yearOfBirth}
    return record


def getAge(person):
    """ function that returns the age of a person """
    return 2026 - person['yearOfBirth']


def getFullName(person):
    """ function that returns the full name of a person """
    return person['firstName'] + ' ' + person['lastName']
```

### Using Design 1:

```python
# create an instance that represents a person named John Doe
john = createPerson("John", "Doe", 1945)

# get John's age — we pass john TO the function
age = getAge(john)

# get John's full name — we pass john TO the function
name = getFullName(john)
```

---

## Design 2: Object-Oriented (Data and Functions Together)

```python
class Person:
    """
    This class represents a person. A person has the following
    attributes: first name, last name, year of birth.
    """
    def __init__(self, firstName, lastName, yearOfBirth):
        self.firstName = firstName
        self.lastName = lastName
        self.yearOfBirth = yearOfBirth

    def getFirstName(self):
        """ function for a person to return their first name """
        return self.firstName

    def getLastName(self):
        """ function for a person to return their last name """
        return self.lastName

    def getYearOfBirth(self):
        """ function for a person to return their year of birth """
        return self.yearOfBirth

    def getAge(self):
        """ function for a person to return their age """
        return 2026 - self.yearOfBirth

    def getFullName(self):
        """ function for a person to return their full name """
        return self.firstName + ' ' + self.lastName
```

### Using Design 2:

```python
# create an instance that represents a person named John Doe
john = Person("John", "Doe", 1945)

# get John's age — we ASK john for HIS age
age = john.getAge()

# get John's full name — we ASK john for HIS name
name = john.getFullName()
```

---

## The Key Difference

| | Design 1 (Function-Centric) | Design 2 (Object-Oriented) |
|---|---|---|
| **How we get age** | `getAge(john)` | `john.getAge()` |
| **Reads as** | "Function getAge, take this data and return ITS age" | "Object john, get YOUR age" |
| **Data lives** | In a dictionary (separate from functions) | Inside the object (together with functions) |
| **Functions live** | Standalone, separate from data | Inside the class, bundled with data |
