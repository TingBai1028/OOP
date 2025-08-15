## Business

1. Use Composite pattern

   - Leaf: variables / constants

     - LOOKUP
     - CONSTANT

   - Composite:
     - group operators
       - AND
       - OR
     - rule
       - GREATER_THAN
       - IS_NOT_BLANK

2. design:

- interface:

  - BusinessRule --> evaluate return boolean
  - BusinessOperator --> evaluate return object (int)

- And, Or:
  - implement BusinessRule
  - contain 2 BusinessRule

- GreaterThan, IsNotBlank:
  - implement BusinessRule
  - contain 1-2 businessOperator --> to compare num

- LookUp, Constant:
  - implement BusinessOperator
  - evaluate, return object(num)
