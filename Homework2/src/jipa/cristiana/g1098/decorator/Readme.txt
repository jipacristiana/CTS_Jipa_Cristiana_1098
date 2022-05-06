Bachelor topic title:
    Application for managing reservations of a dance studio

Description of the problem:
    When a booking is generated via the abstract method, the app will display the booking date,
    the client's name, and the instructor's name, along with a string indicating the dance style
    of the class, without changing the original booking class code.

Advantages:
    - the extension of certain objects is dynamically made, at run-time
    - the decoration is made on several levels, but transparent for user
    - multiple decoration can be easily implemented

Disadvantages:
    - a decorator only wraps an item
    - excessive use creates objects that look alike but behave differently, making code difficult to understand and verify
