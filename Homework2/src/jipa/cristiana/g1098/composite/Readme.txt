Bachelor topic title:
    Application for managing reservations of a dance studio

Description of the problem:
    In my application, the mobile app will be used by not just the Dancing Studio's customers,
    but also by the administration and dance teachers. So, in order to aggregate the employees of the 
    Dance Studio, I should use a pattern which allows me to easy manage class hierarchies that contain both
	primitives as well as composite objects.

Advantages:
    - the framework is not rewritten
    - because the items in the hierarchy are viewed as unitary, the code becomes easier
    - the code is easier since the hierarchy objects are handled as unitary

Disadvantages:
    -  all classes in the hierarchy must follow the abstract interface it can lead to overly general classes

