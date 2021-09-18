/*output
Apple
Banana
Orange
Pineapple
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
    import java.util.ArrayList;
import java.util.Collections;

public class Example28 {
   public static void main(String[] args) {
      ArrayList<String> fruits = new ArrayList<String>();
      fruits.add("Orange");
      fruits.add("Apple");
      fruits.add("Banana");
      fruits.add("Pineapple");
      Collections.sort(fruits);

      for (String str : fruits) {
         System.out.println(str);
      }
   }
}