import java.util.LinkedList;

/*
 
In java LinkList are like Doubly linklist .... And Predefine.. we don't have to traverse by Ourself.... Its implements Queue interface
Its All method are same as ArrayList ,Only have some Extra method.... like
addFirst(Objects); ---> like NameSuggest
addLast(Objects); ---> like NameSuggest
get(index) --> Get element on that index
clear()  : clear all elements;
 */

public class linkList_ {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0, 5);
        l1.add(5, 1);
       
        l1.addAll(0, l2);
        l1.addLast(676);
        l1.addFirst(788);
        System.out.println("L1 Linked list : "+ l1);
        System.out.println(l1.contains(27));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));
        //l1.clear();
        l1.set(1, 566);
        for(int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
