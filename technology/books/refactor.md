# Refactoring 

Refactoring is the process of changing the software system in a way that does not alter the external behavior of code yet improves its internal structure

When you have to add a feature to a program but the code is not structured in a convenient way, first refactor the program to make it easy to add the feature, then add the feature.

Whenever I do refactoring, the first step is always the same. I need to ensure I have a solid set of tests for that section of code. The tests are essential because even though I will follow refactorings structured to avoid most of the opportunities for introducing bugs

Refactor start from the deepest branch because yo need less context
Testing start from the shortest and branch and specialized the test

add understading through functions that reveal intention

small changes and testing after each change

It’s my coding standard to always call the return value from a function “result”. That way I always know its role. Again, I compile, test, and commit. Then I move onto the first argument.

Any fool can write code that a computer can understand. Good programmers write code that humans can understand.

Naming is both important and tricky. Breaking a large function into smaller ones only adds value if the names are good

When programming, follow the camping rule: Always leave the code base healthier than when you found it.

The true test of good code is how easy it is to change it.

## Principles in refactoring

Refactoring (noun): a change made to the internal structure of software to make it easier to understand and cheaper to modify without changing its observable behavior.

- Two hats
    * Refactoring
    * New Features

- Refactoring improves the design of the software
- Refactorign makes software easy to understand
- Refactoring helps me find bugs
- Refactoring helps me program faster
- Refactoring in code review

### When should we refactor?

- Rule of three (Duplication)
- Making easy to add a feature
- Making code easier to understand
- Oportunistic refactoring (is part of programming tasks)

Refactoring is part of our job as a software professionals is not neccesary to tell the managers

### When should I not refactor?

- **If I run across code that is a mess, but I don’t need to modify it, then I don’t need to refactor it.**
- **Its easy to rewrite**

### Problems with refactors

- Slow down the features? : Producing more value with less effort
- Code ownership
- Continous integration to slow down the complexity of the merge 
- Testing
- Architecture and Design process must be flexible and refactored constantly

## Bad Smells in Code

- Mysterious name
- Duplicated code
- Long function
- Long parameter list
- Global data
- Mutable data
- Shotgun surgery : Orthogonality
- feature envy: The fundamental rule of thumb is to put things together that change together
- Data clumps: group data
- Primitive obsession: use value objects when apply
- Repetead switches: Use polymorphism
- Loops
- Lazy element
- Speculative generality: "Oh, I think we’ll need the ability to do this kind of thing someday"
- Temporary field
- Message chains : You see message chains when a client asks one object for another object, which the client then asks for yet another object, which the client then asks for yet another another object, and so on
- Middle man
- Large classes
- Data classes : setter?
- Comments: often a consequence of bad code