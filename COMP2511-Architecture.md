1. A system requring strong consistency across components
	1. strong consistency --> centralizd db
	2. Hence layered / monolithic
2. benefits and challenges
	1. layered
		1. benefit: clear structure, easy maintanance
		2. challenge: latency, internal coupling
	2. monolithic
		1. benefit: simple to build, deploy, fast calls
		2. challenge: hard to scale or modify as it grows
	3. microservices
		1. benefit: independent scalling, tech flexibility
		2. challenge: complex to manage
	4. event driven 
		1. benefit: high scalability, loosely coupled
		2. challenge: debugging, eventual consistency only
3. finding patterns
	1. Sorting collections of records in different orders.
		1. sorting in java: `Collections.sort(list, comparator)`
		2. in comparator, we can put:
			1. comparator.naturalOrder()
			2. comparator.reverseOrder()
			3. Integer.compare(a, b)
		3. In comparator, we use different strategy, hence it is strategy pattern
	2. Listing the contents of a file system.
		1. file system --> tree like
		2. composite pattern
	3. Updating a UI component when the state of a program changes.
		1. notify -> change states
		2. observer pattern
	4. A frozen yogurt shop model which alters the cost and weight of a bowl of frozen yogurt based on the toppings that customers choose to add before checkout.
		1. decorator pattern
	5. You are making a stealth game and want the enemy guards to be alerted when the player produces a loud noise.
		1. notify -> change states
		2. observer pattern
	6. Creating a cross-platform application that needs to generate different types of UI components (buttons, menus, dialogs) that match the look and feel of each operating system (Windows, macOS, Linux).
		1. abstract factory pattern
	7. A text editor application where you can apply multiple formatting options (bold, italic, underline, highlight, different fonts) to text, with the ability to combine these effects and add or remove them dynamically.
		1. decorator pattern
4. tut EQ9
	1. serverless  functions can run inside containers
	2. monitoring is not fully integrated
		1. aws cloundwatch, you still need to set up metrics, logs and alerts
5. monolithic vs modular monolith?
	1. monolithic
		1. easier to govern and audit adn test as all logic is in single unit.
	2. modular monolith
		1. gives some benefits of modularity, but still introduces domain chanllenges
6. tut GQ8
	1. itght coupling between features in a layered onolith
		1. meaning: when we want to create new feature, we need:
			1. change layer1-> business layer -> backend layer -> data layer
	2. so increate maintainbility without splitting into microservices:
		1. "no microservices" --> keep monolith
		2. increase maintainbility --> modular monoliths, module it in business domain instead of tech domain like layered