import java.util.HashSet;

/*
HashSet in Java ::
    HashSet class uses a hash table for storing the elements.
    It implements the set interface.
    Duplicate values are not allowed.
    Before storing any object, the hashset uses the hashCode() and equals() method to check any duplicate entry in the hash table.
    Allows null value.
    Best suited for search operations.

Constructors Of HashSet :
    HashSet(): This constructor is used to create a new empty HashSet that can store 16 elements and have a load factor of 0.75.
    HashSet(int initialCapacity): This constructor is used to create a new empty HashSet which has the capacity to store the specified number of elements and having a load factor of 0.75.
    HashSet(int initialCapacity, float loadFactor): This constructor is used to create a new empty HashSet with the capacity & load factor equal to specified integer and float value.

METHOD ::
    Inserting elements : add() 
    Removing elements from the HashSet : remove() 
    Checking if the HashSet is empty or not :  isEmpty()
    Removing all the elements from the HashSet : clear() 
    Printing the size of the HashSet :size()

    *************** fOR MORE method Visit java 14 documentation ******************
 */
public class hashset {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f); // If 0.5 means  50 % full then its capacity increase to maintain
        myHashSet.add(6);
        myHashSet.add(8);
        System.out.println("size:: " + myHashSet.size());
        myHashSet.add(3);
        myHashSet.add(11);
        myHashSet.add(11); // Only One Will be Added
        System.out.println("size:: " + myHashSet.size()); 
        System.out.println(myHashSet);
        myHashSet.remove(3);
        System.out.println("Is It Empty:: " +myHashSet.isEmpty());
        System.out.println(myHashSet);
        myHashSet.clear();
        System.out.println(myHashSet.isEmpty());
        System.out.println(myHashSet);
    }
}
