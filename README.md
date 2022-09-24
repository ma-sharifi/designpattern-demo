# Design Pattern Demo
This is a demo for the most used of them

# Design patterns

Design patterns are typical (reusable) solutions to common problems in software design. Each pattern is like a blueprint that you can customize to solve a particular design problem in your code.
In software engineering, a software design pattern is a general, reusable solution to a commonly occurring problem within a given context in software design.

# Benefits of patterns
Patterns are a toolkit of solutions to common problems in software design. They define a common language that helps your team communicate more efficiently.

# Classification
Design patterns differ by their complexity, level of detail, and scale of applicability. In addition, they can be categorized by their intent and divided into three groups.

# Classification of patterns
* Creational patterns provide various object creation mechanisms that increase flexibility and reuse of existing code.
* Structural patterns explain how to assemble objects and classes into larger structures, while keeping these structures flexible and efficient.
  (Structural patterns are concerned with how classes and objects are composed to form larger structures. ) https://www.cs.unc.edu/~stotts/GOF/hires/chap4fso.htm
* Behavioral patterns take care of effective communication and the assignment of responsibilities between objects.
  (Behavioral patterns are concerned with algorithms and the assignment of responsibilities between objects. ). Behavioral patterns describe not just patterns of objects or classes but also the patterns of communication between them.


  
# Behavioral Design Patterns:
##Strategy

The strategy pattern allows us to change the behavior of an algorithm at runtime.
Strategy: is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.
Strategy pattern is also known as Policy Pattern. We define multiple algorithms and let client application pass the algorithm to be used as a parameter.
One of the best examples of a strategy pattern is the Collections.sort() method that takes Comparator parameter. Based on the different implementations of Comparator interfaces, the Objects are getting sorted in different ways.
￼
PROS:
* You can swap algorithms used inside an object at runtime.
* You can isolate the implementation details of an algorithm from the code that uses it.
* You can replace inheritance with composition.
* Open/Closed Principle. You can introduce new strategies without having to change the context.

CONS:
* If you only have a couple of algorithms and they rarely change, there’s no real reason to overcomplicate the program with new classes and interfaces that come along with the pattern.
* Clients must be aware of the differences between strategies to be able to select a proper one.
* A lot of modern programming languages have functional type support that lets you implement different versions of an algorithm inside a set of anonymous functions. Then you could use these functions exactly as you’d have used the strategy objects, but without bloating your code with extra classes and interfaces.

