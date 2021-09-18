/*output
[A, B, C, D]
[A, B, C, D, A, A]
[C, D, A, A]
C
D
A
A
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author biradar bharat
 */
import java.util.LinkedList;
import java.util.ListIterator;
 
public class Example22 
{
    public static void main(String[] args) 
    {
        //Create linked list
        LinkedList<String> linkedList = new LinkedList<>();
         
        //Add elements
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
         
        System.out.println(linkedList);
         
        //Add elements at specified position
        linkedList.add(4, "A");
        linkedList.add(5, "A");
         
        System.out.println(linkedList);
         
        //Remove element
        linkedList.remove("A");     //removes A
        linkedList.remove(0);       //removes B
         
        System.out.println(linkedList);
         
        //Iterate
        ListIterator<String> itrator = linkedList.listIterator();
 
        while (itrator.hasNext()) {
            System.out.println(itrator.next());
        }
    }
}