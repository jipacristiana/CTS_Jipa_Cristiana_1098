Bachelor topic title:
    Application for managing reservations of a dance studio

Description of the problem:
    The Dance application will let administrators to get booking-related statistics, and instead of wasting
    time while establishing new reservations, I may cut waiting time by using the clone approach. This is a 
    reuse of previously created objects.

Advantages:
    - by cloning objects, we can quickly generate identical copies of them
    - avoiding the explicit call of the builder
    - can add or remove objects at runtime

Disadvantages:
    - shallow copies can be made