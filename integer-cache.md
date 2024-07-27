# Integer Cache

JVM uses a caching mechanism referred to as `Integer cache` to improve performance and reduce memory consumption.

The caching range is set between `-128 to 127`.

Check this example:
```java
Integer a = Integer.valueOf(10);
Integer b = 10;

System.out.println((a == b));          // true
System.out.println(a.equals(b));       // true
```

But

```java
Integer a = Integer.valueOf(350);
Integer b = 350;

System.out.println((a == b));          // false
System.out.println(a.equals(b));       // true
```

This is due to integer cache.

The `==` operator checks for reference equality, while the equals() method compares the actual values.

When `Integer.valueOf()` method is called the first time, the value is cached only if it is within the range and any subsequent calls will return the cached `Integer` rather than creating a new one. 
Meaning both references will point to the same object, which is why the comparison returns true.

Integer Cache mechanism only works with auto-boxing or the Integer.valueOf()method. It is not applicable when creating a wrapper object using the constructor:

```java
Integer a = new Integer(12);
Integer b = new Integer(12);

System.out.println((a == b));          // false
System.out.println(a.equals(b));       // true
```
