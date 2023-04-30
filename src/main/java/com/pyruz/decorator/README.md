**Java design patterns**

Java design patterns are reusable solutions to common software design problems. These patterns provide proven solutions to recurring design problems, making it easier for developers to create robust, maintainable, and scalable Java applications. Here are some of the most common Java design patterns:
___

**Decorator pattern:** 

This pattern allows behavior to be added to an individual object, either statically or dynamically, without affecting the behavior of other objects from the same class.
___

**Pros:**
- Flexibility: The Decorator pattern allows you to add functionality to an object dynamically without changing the original object or the code that uses it. This provides greater flexibility and scalability to the code.


- Open-Closed Principle: The pattern supports the Open-Closed Principle by allowing you to add new behavior to an object without modifying the existing code.


- Single Responsibility Principle: By separating the responsibility for different features into different decorators, the pattern helps you follow the Single Responsibility Principle.


- Easy to combine: It is easy to combine multiple decorators to achieve complex functionality.

**Cons:**

- Complexity: The pattern can increase the complexity of the code as it requires the creation of many classes for each individual decorator.


- Hard to remove: Since decorators are added dynamically, it can be difficult to remove them without modifying the code.


- Performance: The Decorator pattern can add overhead to the application due to the additional layers of abstraction it creates.

___

Here's a **use case** for the Decorator pattern:

Suppose the pizza shop offers a variety of pizzas, but customers also have the option to customize their pizzas with additional toppings. The pizza shop uses the Decorator pattern to allow customers to dynamically add toppings to their pizzas, without having to create separate classes for each possible combination of toppings.
