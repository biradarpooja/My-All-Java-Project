/*output
[Lucy, Jack, Ajeet, Chaitanya]
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
public class Example24 {
   public static void main(String[] args) {
      ArrayList<String> names = new ArrayList<String>();
      names.add("Jim");
      names.add("Jack");
      names.add("Ajeet");
      names.add("Chaitanya");
      names.set(0, "Lucy");
      System.out.println(names);
   }
}