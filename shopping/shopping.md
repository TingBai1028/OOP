## Smells

- long method

  - checkout method is long and contain a lot of hard coding

- duplicated code

  - logic for coles and woolies is the same

- divergent change

  - checkoutSystem class violates single responsibility priciple
  - hard to maintain due to one change affect everything
  - hard to extend(for example, add one more shop aldi)

- feature envy
  - scanItems method is depends on items class too much while it is in
    CheckoutSystem class.

## low-level refactoring

- extract method to according class

## high-level refactoring

- strategy pattern
