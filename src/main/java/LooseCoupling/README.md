LOOSE COUPLING
This is ensuring that the application components are not tightly coupled to each other. This is achieved
by creating an interface that different classes implements. Also, a middle man class (Notification service)
manages the interaction between the implementing class and the interface through dependency injection.
In the main method, only classes that implemented the interface can be injected. This promotes loose coupling
such that new classes can be added to implement the interface without any code change to the existing classes
or the middle man. The object of the class will just be injected into the object of the Notification service pointing
to the reference of the interface.

INVERSION OF CONTROL
This involves the object of the classes been managed by a framework (Spring) at run time, instead of
manually managing them. What this means is that, at the point where we do:
NotificationService emailNotification = new NotificationService(new Email());
Spring will automatically manage the object to be passed as parameter to the notification service

DEPENDENCY INJECTION
This is whe the dependency of a class is provided externally rather than being created within the class
itself. In the main method, we are injecting the dependency of the Notification service at the point
of creating an object of the class. The dependency is the object of the class implementing the interface.

BEANS
Beans is an object that is being managed by the framework (Spring). When the objects are managed
by the framework, then inversion of control can happen where Spring injects the dependency in the
notification service