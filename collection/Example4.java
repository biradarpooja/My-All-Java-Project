/*output
pooja
Rutuja
Ankita
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
public class Example4{  
public static void main(String[] args) {  
//Creating Deque and adding elements  
Deque<String> deque = new ArrayDeque<String>();  
deque.add("pooja");  
deque.add("Rutuja");  
deque.add("Ankita");  
//Traversing elements  
for (String str : deque) {  
System.out.println(str);  
}  
}  
}  
