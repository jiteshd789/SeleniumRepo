package INTERVIEW_QUESTIONS_MAP;

import java.util.HashMap;

import java.util.Set;
/*
 * Input : abcaba
 * Output : a-3, b-2, c-1
 */
public class Count_Duplicate_Character_in_String {
	
	public static void main(String[] args)
	{
		String str = "abcaba";
		HashMap<Character,Integer> mp = new HashMap<Character,Integer>();            //HashMap is used to store key-value pairs.
		
		for(int i=0; i<=str.length()-1; i++)
		{
			char s1 = str.charAt(i);
			
			if(mp.containsKey(s1))                   //containsKey -->Does it has Key(true/false)
			{
				mp.put(s1, mp.get(s1) + 1);         //put(Key,Value) -- Add
			}                                       //get(Key) --> Value for that key
			else 
			{
				mp.put(s1, 1);
			}
		}	
		
		
//PRINT OCCURENCE OF EACH CHARACTER.
		
			Set<Character> keys = mp.keySet();      //keySet()---> it will get all the Keys as Set.		
			
			for(Character key: keys)
			{
				System.out.println(key + ":" + mp.get(key));         //a:3 b:2 c:1
			}
		
//PRINT ONLY DUPLICATE ELEMENTS.
			
			for(Character key: keys)
			{
				if(mp.get(key) > 1)
				{
					System.out.println(key + ":" + mp.get(key));     //a:3 b:2
				}
			}
		
	}	

}


/*
 * --------------------------------------------------------------------------------------------------------------------
 * 
 * HashMap<Character,Integer> mp = new HashMap<Character,Integer>();  
 * This line creates a HashMap called mp to store characters (Character) as keys and their corresponding counts (Integer) as values.
 *  The map will be used to keep track of how many times each character appears in the string.
 * 
 * for(int i=0; i<=str.length()-1; i++)
  {
 * This for loop iterates over each character of the string from index 0 to the last index (length - 1).
 * 
 * 
 * 
 * if(mp.containsKey(s1))      
 * -->This if statement checks whether the character s1 is already a key in the HashMap mp. 
 * The containsKey method returns true if the key is present; otherwise, it returns false. 
 * 
 * mp.put(s1, mp.get(s1) + 1);
 * -->   If the character s1 is already in the map, this line retrieves its current count using mp.get(s1) and increments it by 1. 
 * The updated count is then stored back in the map using put.          
 * 
 *    }
       else 
      {
	    mp.put(s1, 1);
      }
      
      If s1 is not already in the map (i.e., it’s the first occurrence), this block executes.
       It adds the character s1 as a new key in the map with an initial count of 1.
       
       Set<Character> keys = mp.keySet();   
          
       After building the mp hash map, this line retrieves the set of keys (characters) from the map using keySet()
        and stores them in the variable keys.
 * 

 */

