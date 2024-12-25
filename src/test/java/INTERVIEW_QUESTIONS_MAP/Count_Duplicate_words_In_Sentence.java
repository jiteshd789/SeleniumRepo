package INTERVIEW_QUESTIONS_MAP;

import java.util.HashMap;
import java.util.Set;

public class Count_Duplicate_words_In_Sentence {
	
	
	public static void main(String[] args)
	{
		String str = "My Name Name is Jitesh";
		 String ar[]= str.split(" ");                 // [ My Name Name  is Jitesh]
		 	                                          // [ 0   1    2    3    4  ]
		 HashMap<String,Integer> mp = new HashMap<String,Integer>();
		 
		 for(int i=0; i<ar.length-1; i++)
		 {
		    String s1= ar[i];                 //Within the loop, each word in the array is assigned to the variable s1.
		                                    //It allows the program to work with one word at a time rather than the entire array.
		    if(mp.containsKey(s1))
		    {
		    	mp.put(s1, mp.get(s1) + 1);
		    }
		    else
		    {
		    	mp.put(s1,1);
		    }
		 }
		 
//PRINT OCCURENCE OF EACH CHARACTER.	
		     Set<String> keys = mp.keySet();
		     
		     for(String key: keys)
		     {
		    	 System.out.println(key +":" + mp.get(key));     //is:1 My:1 Name:2
		     }
		 
//PRINT ONLY DUPLICATE ELEMENTS.	
		     
		     for(String key: keys)
		     {   
		    	 if(mp.get(key)>1)
		    	 {
		    		 System.out.println(key + ":" + mp.get(key));    //Name:2
		    	 }
		    	
		     }	 
	}

}
/*-------------------------------------------------------------------------------------------
 * 
 * 
 * String ar[] = str.split(' '); // [ My, Name, Name, is, Jitesh]
 * The split(' ') method is called on the string str, which splits it into an array of words (ar) using a space as the delimiter. This results in an array with each word as an element:

[0] My
[1] Name
[2] Name
[3] is
[4] Jitesh

HashMap<String, Integer> mp = new HashMap<String, Integer>();
A new HashMap mp is instantiated that will be used to store words as keys and their corresponding counts (occurrences) as values.
 The String is the type of key, and Integer is the type of value.
 * 
 * 
 * Loop Through Array of Words
 * 
 * Word Assignment
 * String s1 = ar[i];
 * Within the loop, each word in the array is assigned to the variable s1.
 * 
 * Extracting Individual Words:

The array ar is created by splitting the original string str using spaces as delimiters. 
Each element of ar contains one word from the string. 
The line String s1 = ar[i]; assigns the current word (which is the i-th element of the array) to the variable s1. 
It allows the program to work with one word at a time rather than the entire array.
 */
 
