/*
 1) Find lenght of String if > 128 then false

2) sort string

3) compare current variable with previous variable 

4)  if step 3 is true then return false else cont.

5) return true if no duplication found


 */

package StringArray;

import java.util.Arrays;
import java.util.Collections;

public class isUnique {
	
	public static void main(String args[])
	{
		 String s = "abc*&^sd";  // enter any value in string s
		  // call isUnique method
		  
		  System.out.println(""+isUnique(s));
	}


public static boolean isUnique(String s)
{
  if(s.length()>128)
  {
   return false;
  }
  
  char[] myaray = s.toCharArray();
  Arrays.sort(myaray);
  String s1 = new String(myaray);
  s = s1;
  char prev = '\0';
  for(int i=0;i<s.length();i++)
  {
    if(prev == s.charAt(i))
	 {
	   return false;
	 }
     prev = s.charAt(i);
  }
  return true;

}
}