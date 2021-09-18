/*output-
Number of elements in ArrayList: 4
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

public class Example27 {
   public static void main(String[] args) {
      ArrayList<Integer> numbers = new ArrayList<Integer>();
      numbers.add(1);
      numbers.add(7);
      numbers.add(5);
      numbers.add(6);
      System.out.println("Number of elements in ArrayList: "+numbers.size());
   }
}