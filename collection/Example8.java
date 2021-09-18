/*output
After removing first and last element from linked list: [c++]
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
    
import java.util.*;
class Example8 {
  public static void main(String[] args) {
     LinkedList<String> list1= new LinkedList<String>();
          list1.add("c");
          list1.add("c++");
          list1.add("mysql");
    Object first = list1.removeFirst();
    Object last = list1.removeLast();
    System.out.println("After removing first and last element from linked list: " + list1);
  }
}
