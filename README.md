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

AbstractSequentialList methods:
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
