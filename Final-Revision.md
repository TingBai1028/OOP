1. Tut10-E
   - C
   - D
   - C
   - D
   - C
   - C
   - C
   - C
   - D
   - D
   - B
   - C
   - C --> should be B
     - Serverless: best for short-lived, event-driven tasks
     - don't need persistent connections
     - don't require complex long-running state
     - can scale automatically with usage
     - micro billing
   - B
   - D
2. Tut10-G

   - D --> should be C
     - Modular monolith --> Large systems
     - Layered --> small systems
   - B --> should be A
     - netflix --> microservice
   - C
   - D --> should be A
     - microservices is not necessary
   - B
   - B
   - C
   - modular monolith
     - loose coupling between features --> change from technical domain to business domain.
     - without splitting into microservices --> rule out microservies
     - and modular monolith is what we left.
   - EDA
   - EDA --> should be microservice
     - high-traffic --> EDA support high traffic through
     - indenpendently --> EDA deal (Wrong because EDA separate code by technical domain, whereas the question is asking for separate code by business domain)

3. Tut10-H

   - A static method does not require an instance to be invoked. That is, if we want to use a method in class, we do not need to create an instance instead we can just className.methodName()
   - constructor is not inherited from its super class
   - modifier:
     - protected: visible to package + subclasses(can be in differnt package)
     - default: Visible to only classes in the same pacakge
   - cohesion:
     - how closely related and focused teh responsibilities of a class are
     - high cohesion: class does one job
     - low cohesion: class has too many unrelated responsbilities
   - which design pattern allows you to assign extra behaviours to object at runtime?
     - decorator
       - is the answer
       - decorater add extra functionality layer
     - strategy
       - change algo used, not add extra behaviours to objects
   - divergent change:
     - one class changed for many unrelated reasons
     - violates single responsibility principle
   - shotgun surgery:
     - one change spreads across many classes

4. Rev-MCQ
   - A
   - B
   - B
   - B
   - D
   - B ? --> D
     - overriden method can be more permissive in subclass instead of more.
   - B
   - B
   - D
   - C
   - A
