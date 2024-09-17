## Comparable

Comparable is used when we need to sort using a <b>single property</b>. <br>
Class implements Comparable and the compareTo() method is overridden

![image](https://github.com/user-attachments/assets/6ad6968f-623a-4e9c-9d53-24578bdf07be)

and then, `Collections.sort(<arraylist>)` is to be invoked


## Comparator
Comparator is used when we need to sort using multiple properties <br>
No need to modify the actual class


How to use?
1. Create a new class ex IdComparator which will implement Comparator
2. Override compare method which will take 2 obj as args
3. To invoke - `Collections.sort(emps, new IdComparator())`
