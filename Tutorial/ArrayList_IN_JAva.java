import java.util.ArrayList;

/*
add() method is used to insert an element in the ArrayList.
add(Index,Object) : Inserts an element at the given index.
remove(); -->delete or remove an element at a given index from the ArrayList.
contain(); --> Return boolean 
size() : return Size on that time ........
addAll(object); ----> By default Add from Last index
addAll(index,object); ---> By given index the adding starting from That index
 indexOf(object)--> return Its index :method prints the index of the first occurrence of a particular number. Returns -1 if the element is not present in the ArrayList.
 lastIndexOf(object) ----> return Its index:  you can also find the index of the last occurrence of an element with the help of the lastIndexOf() method.
 */
public class ArrayList_IN_JAva {
    
    /** 
     * @param args
     */
    public static void main(String[] args)  {
        ArrayList<Integer> Arr1 = new ArrayList<>();
        ArrayList<Integer> Arr2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Arr1.add(i +3);
            Arr2.add(i + 10);
        }
        System.out.println(Arr1);
        Arr1.addAll(2, Arr2);
        System.out.println(Arr1);
        Arr2.remove(2);
        System.out.println(Arr1);
        System.out.println(Arr1.size());
        System.out.println("Is Arr1 list contains 4 : " + Arr1.contains(4));
        System.out.println("The first occurrence of 3 in l1 is at index : " + Arr2.indexOf(3)); // If present the element multiple time then it shown only index of first time Occurrence 
        System.out.println("The last occurrence of 3 in l1 is at index : " + Arr2.lastIndexOf(3)); //It Shown Last Index if that element
    }
}
