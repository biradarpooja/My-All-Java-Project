/*output
pooja
Ankita
bharat
sanika
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
public class Example2{  
public static void main(String args[]){  
Vector<String> v=new Vector<String>();  
v.add("pooja");  
v.add("Ankita");  
v.add("bharat");  
v.add("sanika");  
Iterator<String> itr=v.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  

