package INTERVIEW_QUESTIONS_ARRAY;
import java.util.ArrayList;
import java.util.List;

//Input: -12,11,-13,-5,6,-7,5,-3,-6
//Output:-12,-13,-5,-7,-3,-6,11,6,5

public class A1_MoveNegativeNumToBeginingandPositiveMaintainingOrder
{
	    public static void main(String[] args) 
	    {
	        int[] input = {-12, 11, -13, -5, 6, -7, 5, -3, -6};   // Input array
	   
	        List<Integer> output = rearrange(input);              // Calling the rearrange method     
	        System.out.println(output);
	    }

	         // Method to rearrange the array
//This method signature declares a public static method named rearrange that takes an integer array Jitesh_arr as a parameter.
// It returns a List<Integer> which will contain the rearranged elements.
	    
	    public static List<Integer> rearrange(int[] Jitesh_arr)
	    {
	        List<Integer> negatives = new ArrayList<>();    //Two ArrayList instances are created
	        List<Integer> positives = new ArrayList<>();
	        
	        
	  // Separate positive and negative numbers
	        
	        for (int num : Jitesh_arr) 
	        {
	            if (num < 0)
	            {
	                negatives.add(num);                      //negatives: [-12, -13, -5, -7, -3, -6]
	            } 
	             else 
	            {
	                positives.add(num);                      //positives: [11, 6, 5]
	            }
	        }
	        
	  // Combine the negative and positive lists
	        
	        negatives.addAll(positives);
	        return negatives;                 // Return the combined list
	    }
	}



//-------------------------------------------------------------------------------------
/*if below is used,The method would not be reusable for any other array.
Any changes to the input numbers would require modifications directly in the method, 
violating the principle of modularity.

 * public static List<Integer> rearrange(int[] input)
 *     
	        for (int num : input) 
	        {
	            if (num < 0)
	            {
	                negatives.add(num);                      //negatives: [-12, -13, -5, -7, -3, -6]
	            } 
	             else 
	            {
	                positives.add(num);                      //positives: [11, 6, 5]
	            }
	        }
	        
 * 
 */
