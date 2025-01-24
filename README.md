# Java

# Collections
Any group of individual objects that are represented as a single unit is known as a Java Collection of Objects.

“Collection Framework” has been defined in JDK 1.2 which holds all the Java Collection Classes and Interface in it. 

<img width="393" alt="image" src="https://github.com/user-attachments/assets/c824ac06-e482-484c-8ab8-c943aa2e5a53" />

# AbstractCollection 
The AbstractCollection class in Java is a part of the Java Collection Framework and implements the Collection interface.

It is used to implement an unmodifiable collection, for which one needs to only extend this AbstractCollection Class and implement only the iterator and the size methods.

# AbstractSequentialList
The AbstractSequentialList class in Java is a part of the Java Collection Framework and implements the Collection interface and the AbstractCollection class(AbstractList Class).

![image](https://github.com/user-attachments/assets/79eebcb2-e42d-45f6-8d71-b4f1957b3410)

Declaration: public abstract class AbstractSequentialList<E> extends AbstractList<E>

Constructor: AbstractSequentialList<E> asl = new LinkedList<E>();  

<img width="553" alt="image" src="https://github.com/user-attachments/assets/2479cefa-bcd8-4aaa-beba-edb760faf9a0" />

<img width="512" alt="image" src="https://github.com/user-attachments/assets/0475c2fc-0210-46fb-9a20-729024556770" />

<img width="380" alt="image" src="https://github.com/user-attachments/assets/013b0fc1-50f5-47bc-8255-2595003d18a5" />

<img width="385" alt="image" src="https://github.com/user-attachments/assets/b5b29612-9039-441b-99ea-e75125e6754a" />

<img width="257" alt="image" src="https://github.com/user-attachments/assets/3d275c28-7b83-4634-a0bc-4374cd033dcf" />

# AbstractSequentialList methods:
1. size() -> used to get the size for this instance [arr.size()].
2. conatinsAll() -> used to check whether two Collections contain the same elements or not [abs.containsAll(abs2)].
3. lastIndexOf() ->  used to return the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element 
[arrlist.lastIndexOf(E)].
4. hashCode() -> used to get the hashCode value for this instance of the AbstractSequentialList[arr.hashCode()].
5. retainAll() ->  used to retain from this list all of its elements that are contained in the specified collection[arrlist1.retainAll(arrlist2)].
6. subList() ->  used to get a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive. (If fromIndex and toIndex are equal, the returned list is empty.) The returned list is backed by this list, so non-structural changes in the returned list are reflected in this list, and vice-versa. The returned list supports all of the optional list operations supported by this list[sublist(int start, int end)].
7. toArray() ->  used to form an array of the same elements as that of the AbstractSequentialList [Object[] arr = AbstractSequentialList.toArray()].
8. toArray(T[]) ->  It returns an array containing all of the elements in this AbstractSequentialList in the correct order; the run-time type of the returned array is that of the specified array[abs_col.toArray(arr)].
9. contains() ->  used to check whether an element is present in a Collection or not[abs.contains(E)].
10. toString() ->  used to return a string representation of the elements of the Collection[abs.toString()].
11. clear() -> used to remove all the elements from a list[arr.clear()].
12. indexOf() -> used to return the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element[arrlist.indexOf(E)].
13. set() -> used to replace any particular element in the list created using the AbstractSequentialList class with another element[list.set(index, E)].
14. removeAll() -> used to remove from this list all of its elements that are contained in the specified collection[arrlist1.removeAll(arrlist2)].
15. isEmpty() -> used to check whether this AbstractSequentialList is empty or not[arr.isEmpty()].
16. equals() -> used to check if this AbstractSequentialList object is equal to the object passed as the parameter[arrlist1.equals(arrlist2)].
17. get() -> used to fetch or retrieve an element at a specific index from a AbstractSequentialList[list.get(index)].
18. remove() -> used to remove an element from an abstract sequential list from a specific position or index[remove(index)].
19. addAll() -> used to append all of the elements from the collection passed as a parameter to this function at a specific index or position of a abstract sequential list[addAll(index, C)].


# ArrayList

It is a part of collections framework (class of java.util). we don’t need to mention the size when creating ArrayList. It automatically adjusts its capacity as elements are added or removed.
 ![image](https://github.com/user-attachments/assets/0e9deba2-c94d-4035-b0a9-10166f6ff307)

Syntax of ArrayList : ArrayList<type> arr = new ArrayList<type>();
![image](https://github.com/user-attachments/assets/3bceeef3-8021-4434-b7c2-f54b696d2335)

1. AbstractList: This class is used to implement an unmodifiable list, for which one needs to only extend this AbstractList Class and implement only the get() and the size() methods.
2. CopyOnWriteArrayList: This class implements the list interface. It is an enhanced version of ArrayList in which all the modifications(add, set, remove, etc.) are implemented by making a fresh copy of the list.
3. AbstractSequentialList: : This class implements the Collection interface and the AbstractCollection class. This class is used to implement an unmodifiable list(linkedlist), for which one needs to only extend this AbstractList Class and implement only the get() and the size() methods.

# Constructors
<img width="503" alt="image" src="https://github.com/user-attachments/assets/20093788-0b17-4dc9-8192-3d6b55e8d34c" />

# Methods
| Method     | Description  |
|--------------|--------------|
|add(int index, Object element) |	This method is used to insert a specific element at a specific position index in a list. |
|add(Object o)	| This method is used to append a specific element to the end of a list. |
|addAll(Collection C)	| This method is used to append all the elements from a specific collection to the end of the mentioned list, in such an order that the values are returned by the specified collection’s iterator. |
|addAll(int index, Collection C) |	Used to insert all of the elements starting at the specified position from a specific collection into the mentioned list. |
|clear()	| This method is used to remove all the elements from any list. |
|clone()	| This method is used to return a shallow copy of an ArrayList in Java. |
|contains(Object o)	| Returns true if this list contains the specified element. |
|ensureCapacity(int minCapacity) |	Increases the capacity of this ArrayList instance, if necessary, to ensure that it can hold at least the number of elements specified by the minimum capacity argument. |
|forEach(Consumer<? super E> action) |	Performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception. |
|get(int index) |	Returns the element at the specified position in this list. |
|indexOf(Object O) |	The index the first occurrence of a specific element is either returned or -1 in case the element is not in the list. |
|isEmpty() |	Returns true if this list contains no elements. |
|lastIndexOf(Object O) |	The index of the last occurrence of a specific element is either returned or -1 in case the element is not in the list. |
|listIterator() |	Returns a list iterator over the elements in this list (in proper sequence). |
|listIterator(int index) |	Returns a list iterator over the elements in this list (in proper sequence), starting at the specified position in the list. |
|remove(int index) |	Removes the element at the specified position in this list. |
|remove(Object o) |	Removes the first occurrence of the specified element from this list, if it is present. |
|removeAll(Collection c) |	Removes from this list all of its elements that are contained in the specified collection. |
|removeIf(Predicate filter) |	Removes all of the elements of this collection that satisfy the given predicate. |
|removeRange(int fromIndex, int toIndex) |	Removes from this list all of the elements whose index is between fromIndex, inclusive, and toIndex, exclusive. |
|retainAll(Collection<?> c) |	Retains only the elements in this list that are contained in the specified collection. |
|set(int index, E element) |	Replaces the element at the specified position in this list with the specified element. |
|size() |	Returns the number of elements in this list. |
|spliterator?() |	Creates a late-binding and fail-fast Spliterator over the elements in this list. |
|subList(int fromIndex, int toIndex) |	Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive. |
|toArray() |	This method is used to return an array containing all of the elements in the list in the correct order. |
|toArray(Object[] O) |	It is also used to return an array containing all of the elements in this list in the correct order same as the previous method. |
|trimToSize() |	This method is used to trim the capacity of the instance of the ArrayList to the list’s current size. |

# Complexity
| Operation  | Time Complexity  | Space Complexity     |
|--------------|--------------|--------------|
|Inserting Element in ArrayList |O(1) |O(N) |
|Removing Element from ArrayList |O(N) |O(1) |
|Traversing Elements in ArrayList |O(N) |O(N) |
|Replacing Elements in ArrayList |O(1) |O(1) |

# Advantages
Dynamic size, Easy to use, Fast access, Ordered collection, Supports null values.

# Disadvantages
Slower than arrays, Increased memory usage, Not thread-safe,Performance degradation.





> 💡 ArrayList is not synchronized. Use Collections.synchronizedList(new ArrayList<>()) for thread-safe operations.

> 💡 ArrayList can store null elements.

> 💡 ArrayList can store data till the ArrayList size is full, after that the size of ArrayList is doubled if we want to store any more elements.




|Spliterator Methods| Usage |
|-------------------|---------|
| tryAdvance(Consumer<? super T> action)| Performs the given action on the next element if available and returns true. Otherwise, it returns false. |
| forEachRemaining(Consumer<? super T> action) | Performs the given action for each remaining element until all elements are processed. |
| trySplit() | Attempts to partition the elements, returning a new Spliterator for the first half of the elements, leaving the current Spliterator with the second half. |
| estimateSize() | Returns an estimate of the number of elements remaining. |
| characteristics() | Returns a set of characteristics about the Spliterator.|




# Vector Class

The Vector class implements a growable array of objects.

<img width="203" alt="image" src="https://github.com/user-attachments/assets/8b87273a-030b-43f6-8a45-a0495c332ae9" />



If the increment is specified, Vector will expand according to it in each allocation cycle. Still, if the increment is not specified, then the vector’s capacity gets doubled in each allocation cycle. Vector defines three protected data members:

int capacityIncrement: Contains the increment value.

int elementCount: Number of elements currently in vector stored in it.

Object elementData[]: Array that holds the vector is stored in it.


Vector throws errors :
1. IllegalArgumentException if the InitialSize of the vector defined is negative.
2. NullPointerException if the specified collection is null.

# Constructors
1. Vector(): Creates a default vector of the initial capacity is 10.
Vector<E> v = new Vector<E>();

2. Vector(int size): Creates a vector whose initial capacity is specified by size.
Vector<E> v = new Vector<E>(int size);

3. Vector(int size, int incr): Creates a vector whose initial capacity is specified by size and increment is specified by incr. It specifies the number of elements to allocate each time a vector is resized upward.
Vector<E> v = new Vector<E>(int size, int incr);

4. Vector(Collection c): Creates a vector that contains the elements of collection c.
Vector<E> v = new Vector<E>(Collection c);

# Methods

| **Method**                                      | **Description** |
|------------------------------------------------|-----------------|
| `add(E e)`                                     | Appends the specified element to the end of this Vector. |
| `add(int index, E element)`                    | Inserts the specified element at the specified position in this Vector. |
| `addAll(Collection<? extends E> c)`            | Appends all elements in the specified Collection to the end of this Vector, in the order returned by the Collection's Iterator. |
| `addAll(int index, Collection<? extends E> c)` | Inserts all elements in the specified Collection into this Vector at the specified position. |
| `addElement(E obj)`                            | Adds the specified component to the end of this Vector, increasing its size by one. |
| `capacity()`                                   | Returns the current capacity of this Vector. |
| `clear()`                                      | Removes all elements from this Vector. |
| `clone()`                                      | Returns a clone of this Vector. |
| `contains(Object o)`                           | Returns `true` if this Vector contains the specified element. |
| `containsAll(Collection<?> c)`                | Returns `true` if this Vector contains all elements in the specified Collection. |
| `copyInto(Object[] anArray)`                  | Copies the components of this Vector into the specified array. |
| `elementAt(int index)`                        | Returns the component at the specified index. |
| `elements()`                                   | Returns an enumeration of the components of this Vector. |
| `ensureCapacity(int minCapacity)`             | Increases the capacity of this Vector, if necessary, to ensure it can hold at least the specified number of components. |
| `equals(Object o)`                             | Compares the specified Object with this Vector for equality. |
| `firstElement()`                               | Returns the first component (the item at index 0) of this Vector. |
| `forEach(Consumer<? super E> action)`         | Performs the given action for each element of the Iterable until all elements are processed or an exception is thrown. |
| `get(int index)`                               | Returns the element at the specified position in this Vector. |
| `hashCode()`                                   | Returns the hash code value for this Vector. |
| `indexOf(Object o)`                           | Returns the index of the first occurrence of the specified element in this Vector, or `-1` if not found. |
| `indexOf(Object o, int index)`                | Returns the index of the first occurrence of the specified element in this Vector, searching forwards from the specified index. |
| `insertElementAt(E obj, int index)`           | Inserts the specified object as a component in this Vector at the specified index. |
| `isEmpty()`                                   | Tests if this Vector has no components. |
| `iterator()`                                   | Returns an iterator over the elements in this list in proper sequence. |
| `lastElement()`                                | Returns the last component of this Vector. |
| `lastIndexOf(Object o)`                       | Returns the index of the last occurrence of the specified element in this Vector, or `-1` if not found. |
| `lastIndexOf(Object o, int index)`            | Returns the index of the last occurrence of the specified element in this Vector, searching backward from the specified index. |
| `listIterator()`                              | Returns a list iterator over the elements in this list (in proper sequence). |
| `listIterator(int index)`                     | Returns a list iterator over the elements in this list (in proper sequence), starting at the specified position. |
| `remove(int index)`                           | Removes the element at the specified position in this Vector. |
| `remove(Object o)`                            | Removes the first occurrence of the specified element in this Vector. |
| `removeAll(Collection<?> c)`                 | Removes from this Vector all elements contained in the specified Collection. |
| `removeAllElements()`                         | Removes all components from this Vector and sets its size to zero. |
| `removeElement(Object obj)`                  | Removes the first occurrence of the specified object from this Vector. |
| `removeElementAt(int index)`                 | Deletes the component at the specified index. |
| `removeIf(Predicate<? super E> filter)`      | Removes all elements of this collection that satisfy the given predicate. |
| `removeRange(int fromIndex, int toIndex)`    | Removes all elements whose index is between `fromIndex` (inclusive) and `toIndex` (exclusive). |
| `replaceAll(UnaryOperator<E> operator)`      | Replaces each element of this list with the result of applying the operator to that element. |
| `retainAll(Collection<?> c)`                 | Retains only the elements in this Vector contained in the specified Collection. |
| `set(int index, E element)`                  | Replaces the element at the specified position in this Vector with the specified element. |
| `setElementAt(E obj, int index)`             | Sets the component at the specified index of this Vector to the specified object. |
| `setSize(int newSize)`                       | Sets the size of this Vector. |
| `size()`                                      | Returns the number of components in this Vector. |
| `sort(Comparator<? super E> c)`              | Sorts this list according to the order induced by the specified Comparator. |
| `spliterator()`                               | Creates a late-binding and fail-fast Spliterator over the elements in this list. |
| `subList(int fromIndex, int toIndex)`        | Returns a view of the portion of this List between `fromIndex` (inclusive) and `toIndex` (exclusive). |
| `toArray()`                                   | Returns an array containing all elements in this Vector in the correct order. |
| `toArray(T[] a)`                             | Returns an array containing all elements in this Vector in the correct order; the runtime type of the returned array is that of the specified array. |
| `toString()`                                  | Returns a string representation of this Vector, containing the String representation of each element. |
| `trimToSize()`                                | Trims the capacity of this Vector to its current size. |


# Operations
1. Adding elements :
  * add(Object): This method is used to add an element at the end of the Vector.
  * add(int index, Object): This method is used to add an element at a specific index in the Vector.
2. Updating Elements :
  * set(int index, Object): this method takes an index and the updated element to be inserted at that index.
3. Removing elements :
  * remove(Object): This method is used to remove an object from the Vector. If there are multiple such objects, then the first occurrence of the object is removed.
  * remove(int index): Since a Vector is indexed, this method takes an integer value which simply removes the element present at that specific index in the Vector. After removing the element, all the elements are moved to the left to fill the space and the indices of the objects are updated.
4. Iterating over elements :
  *  get(int index): to get the element at a specific index.

 **Advantages**
Thread-Safe: All methods are synchronized, making it suitable for multi-threaded environments. However, this can lead to performance overhead in single-threaded scenarios.

Allows Nulls: Can store null elements.

Enumeration Support: Provides backward compatibility with Enumeration, a legacy way of iterating over elements.

**Disadvantages**
It gives a poor performance in adding, searching, deleting, and updating its elements.

The Iterators returned by the Vector class are fail-fast. In the case of concurrent modification, it fails and throws the ConcurrentModificationException.
 
