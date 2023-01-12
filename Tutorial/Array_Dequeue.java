import java.util.ArrayDeque;

/*
 
ArrayDeque = Resizable array + Deque interface. :::: implements the Queue & Deque interface.
It is faster than Linked list and stack.

Constructors of ArrayDeque class :
    ArrayDeque(): Used to create an empty array deque that has "the capacity to hold 16 elements".
    ArrayDeque(int numElements): Used to create an empty array deque that has the capacity to hold the specified number of elements.

    Insertion at front :---------------> add(), offerFirst() and addFirst()
    Insertion At End:------------------> addLast() and offerLast() 
    Accessing first element:------------> getFirst() & peekFirst() 
    Accessing the last element:--------> getLast() or peekLast() 
    Removing the first element:-------> removeFirst() : Throw an exception if it empty & 
                               ------> pollFirst() : returns null if the queue is empty.
    Removing the last element:-------> removeLast() & pollLast() 

    /// /////////////// FOR READ THIS IT WOULD BE BETTER TO VISIT JAVA 14 DOCUMENTATION \\\\\\\\\\\\\\\
 */

public class Array_Dequeue {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(9);
        ad1.add(12);
        ad1.add(39);
        ad1.addFirst(5);
        ad1.offerFirst(10);
        ad1.addLast(24);
        ad1.addLast(13);
        ad1.addLast(56);
        ad1.offerLast(310);
        System.out.println(ad1);  //[10, 5, 9, 12, 39, 24, 13, 56, 310]
        System.out.println(ad1.getFirst());
        System.out.println(ad1);
        System.out.println(ad1.peekFirst());
        System.out.println(ad1.getLast());
        System.out.println(ad1.peekLast());
        ad1.pollFirst(); //deletes 9
        ad1.removeFirst(); //deletes 5
        ad1.pollLast(); //deletes 310
        ad1.removeLast(); 
        System.out.println(ad1); // [9, 12, 39, 24, 13]
    }
}
