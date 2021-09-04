/*output
GRWPLatur
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
//How to remove all duplicates from a given string? (solution)
//Write a program to remove all the duplicate characters from a given input String, like, if the given String is "Java" then the output should be "Java". The second or further occurrence of duplicates should be removed.
    import java.util.*;
 
 public class String2
{
    static String removeDuplicate(char str[], int n)
    {
        // Used as index in the modified string
        int index = 0;
 
        // Traverse through all characters
        for (int i = 0; i < n; i++)
        {
 
            // Check if str[i] is present before it
            int j;
            for (j = 0; j < i; j++)
            {
                if (str[i] == str[j])
                {
                    break;
                }
            }
 
            // If not present, then add it to
            // result.
            if (j == i)
            {
                str[index++] = str[i];
            }
        }
        return String.valueOf(Arrays.copyOf(str, index));
    }
 
    // Driver code
    public static void main(String[] args)
    {
        char str[] = "GRWPLLatur".toCharArray();
        int n = str.length;
        System.out.println(removeDuplicate(str, n));
    }
 }