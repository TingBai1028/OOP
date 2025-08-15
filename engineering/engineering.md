- refused bequest

  - sign:
    - inherited methods not used
    - override and do nothing
    - partially use or implements the features from parent class
    - violates LSP
    - confusing hierarchy
  - smell:
    - field salesTarget and salesArchieved shouldn't in employee super class
      because it does not make sense for engineer to have sales related field.
  - solution: move sales related field to salesPerson class

- duplicated code

  - in enginnering class and sales person class, they shared the same logic
    calculating salary
  - solution: create abstract method to get "bonus/commison" and make geenral
    calculate salary in employee class

- excessive coupling between classes

  - excessive: more than necessary = immoderate
  - In salesHistory class, it depends too much to Employee class
  - solution: move it to salesPerson class

- lazy class
  - salesHistory class only do one log responsibility
  - solution: move salesHistory logging logic to salesperson class
