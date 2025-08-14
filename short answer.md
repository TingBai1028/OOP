Question 1

- part A:

  1. logic error: in this.views.equls(other.views), views can potentially be int or long
     as a primitive type in java, instead of Integer object, hence, if we compare primitive
     type using .equal, it can cause compilation error. Hence we should use == to compare

  2. Failling test: assertFalse(new Article("title", 5).equals(new Article("title", 10)));

- part B:
  1. logic error: modifying list when iterating over will cause concurrentModificationException.

  2. test: assertThrows(ConcurrentModificationException.class,
     () -> withoutOddNumbers(List.of(1, 2, 3)));

Question 2
- the first is better cohesion.
- reason: 
    1. class angle has better cohesion because the fields in class is related
    and workds together, fits single responsibility principle 
    2. class math helper is not good cohesion because it is loose cohesion.
    it have count distance and is visible as two major field in the class,
    they are not related and violates single responsibility principle.

Question 3
a)
covariance: return type can be more specific
contravariance: params type can be more general

    b)
        it breaks covariance
        as it return arrayList but in overriden method it return list, which is more general

    c)
        because it weakened the post condition

    d)
        compile-time error is more desireable, reasons:
        - detects the lsp violation before run time, preventing latent defects
        - reduces the risk avoiding deploying code with type incompatibilities that would faile
        unpredictably at run time

Question 4 
design smell: inappropriate intimacy??
1. design smell: violates open close principle 2. difference: shotgun surgery is one change can spread across a lot of classes. means that
if we made changes it can be hard to do because it related to too many classes, whereas this
smells makes change impossibly to do because inventory item class always break, which violates
open close principle.

Question 5
a) code smells: 1. feature envy 2. long method

    b) underlying design problem: poor ploymorphic design, the behaviour changes are handled via instance of checks
    instead of letting each class handle its own loading logic
        improvemnet: use polymorphism to move it into their own class.

Question 6
observer pattern
key characteristics: there is subject and observer (pm and stakeholders), then pm notify stakeholders
and has attribute to register, unregister, then update, which fits into observer pattern

Question 7
valid.
the postcondition become more strict which does not violates LSP.

Question 8
the test takes too much memeory, potentially slow, and have the possible that won't encournter a power up.
make the probability 100% to test
