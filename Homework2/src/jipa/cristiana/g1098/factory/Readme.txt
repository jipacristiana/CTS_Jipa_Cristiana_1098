Bachelor topic title:
    Application for managing reservations of a dance studio

Description of the problem:
    In order to offer the best experience of the user, I want to give them the ability to purchase 
    online the subscriptions for the dance classes through the use of a single class and a factory that 
    encapsulates the process of creating objects. There are three sorts of subscriptions: basic, which 
    includes simply the name, price and date of the subscription, silver, which has private dance 
    classes in plus and gold with a bonus.

Advantages:
    - the client will not break if anything changes in the code.
    - straightforward testability of the factory components
    - implements the dependency inversion principle

Disadvantages:
    - can't be generated any other new objects
    - high number of required classes
    - extension of the application is very elaborate