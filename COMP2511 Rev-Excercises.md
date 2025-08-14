1. Java functional interfaces
	1. Function<T, R>
		1. takes an input and returns a value
	2. Consumer\<T\>
		1. takes an input and returns nothing
	3. Predicate\<T\>
		1. takes an input and returns boolean
	4. Supplier\<T\>
		1. takes no input and returns a value
2. method overloading vs overriding
	![[Screenshot 2025-08-14 at 10.42.28 AM.png]]
	1. Overloaded methods are resolved at compile time, while overriden methods are resolved at run time.
		1. compiler finds the correct methods (overload)
		2. run time resolved the overriden methods
	2. overloaded can have different method signature, while overriden methods cannot
	3. overloaded can have differnt access modifiers, in overriden we can decrease the access 
3. Access modifier
	1. public --> protected --> default --> private
4. A design pattern used to enhance a component’s functionality dynamically at run-time is:
	1. **enhance ..functionality dynamically at run-time** --> means can add new behaviour when program is running --> decorator
	2. structure obejct hierarchies --> composite
5. checked vs unchecked exceptions
	1. question: Which of the following exceptions must be handled by a try-catch block or declared?
	2. ==checked exceptions must be handled by try-catch block or declared
		1. example: io exception, malformedURL exception, sql exception
	3. ==unchecked exceptions not
		1. example: null pointer exception, class cast exception, arthmetic exception
