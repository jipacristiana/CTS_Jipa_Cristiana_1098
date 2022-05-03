Bachelor topic title:
    Application for managing reservations of a dance studio

Description of the problem:
    To collect the required information demanded by all users for interacting with the application, 
    I must establish a unique connection to a database.

Advantages:
    - unique instance of the connection to the database
    - easy to manage the access to the data
    - lazy instantiation -> the connection is created only when it's needed

Disadvantages:
    - can affect the synchronizing in multi-threading
    - the pattern may affect the processes of unit testing
    - can be a bottleneck which can affect the performance of the app
