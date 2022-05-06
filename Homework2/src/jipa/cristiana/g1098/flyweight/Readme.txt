Bachelor topic title:
    Application for managing reservations of a dance studio

Description of the problem:
    There are three elements shared by all subscription types: the name, the price, and the date of the subscription.
    It has been observed that for generating multiple subscriptions with different bonuses and private dance classes, 
    there is a loss of time due to the checking.

Advantages:
    - it minimizes memory use by sharing items across clients or objects of the same kind
    - flyweight objects must be immutable to appropriately handle client and thread sharing

Disadvantages:
    - the implications are obvious for big object solutions
    - classes and context must be examined to find internalizable variables.
    - number of Flyweight object types affects low memory level