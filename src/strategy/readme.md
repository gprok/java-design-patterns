# Strategy Pattern

**Case study**:
The Order class may use a payment method which might 
be Cash, Bank Transfer, Credit Card, PayPal, or many others
that will be introduced in the future.

An interface ```PaymentTypeStrategy``` is provided and 
each payment type becomes a class implementing this interface.
In the Order class there is a reference to a 
PaymentTypeStrategy object making it is possible to inject any 
of the interface's implementations, even those that 
will be created in the future.

Order details of products have been omitted for simplicity.
