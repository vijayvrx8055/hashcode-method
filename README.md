# hashcode-method
## hashCode() method in Java
-----------------------------------------
1. hashCode() method is used with equals() method to compare objects
2. returns a hash code value for the object
3. hashCode() method should return a unique value for every object
4. If two objects are equal according to equals() method, then their hash code must be same
5. If two objects are unequal according to equals() method, then their hash code may or may not be same
6. default implementation of hashCode() method is not provided in Object class
7. It is a native method (made in C/C++)
8. Until we override the hashCode method in a class, it may or may not generate same hash code
9. After overriding hashCode method in class, we can give our own implementation for hashCode() to save the object => then we can use any collection which stores data based on hash code.
