package INTERVIEW_QUESTIONS_STRING;

// I/P - My Name is Jitesh
// O/P- hs etiJ si emaNyM

public class A3_ReverseStringPreservingSpacePosition {
	
           // driver function
        public static void main(String[] args)
        {
           reverses("My Name is Jitesh");                  //calls the reverses method, passing the test string 'My Name is Jitesh' as an argument. 
        }
    
 // Function to reverse the string and preserve the space position
	    static void reverses(String str)
	    {
	 
	        char[] inputArray = str.toCharArray();
	        char[] result = new char[inputArray.length];   //creating a separate result array
	 
	 // Mark spaces in separate result array
	        
	        for (int i = 0; i < inputArray.length; i++) 
	        {
	            if (inputArray[i] == ' ') 
	            {
	                result[i] = ' ';
	            }
	        }
	 
	 // Traverse input string from beginning and put characters in result from end
	        
	        int j = result.length - 1;
	        
	        for (int i = 0; i < inputArray.length; i++)
	        {	
	            if (inputArray[i] != ' ')           // Ignore spaces in input string
	            {
	            	
	                if (result[j] == ' ')              // ignore spaces in result.
	                {
	                    j--;
	                }
	                result[j] = inputArray[i];
	                j--;
	            }
	        }
	        
	        System.out.println(String.valueOf(result));
	    }
	 

	}
	

//================================================================================================================================================

//The program effectively reverses the characters of a given string while ensuring that all spaces remain in their original positions. 
//It does this by creating a separate result array, marking space positions, and filling in the remaining characters in reverse order, 
//thereby achieving the desired functionality.


//static void reverses(String str): 
//This line declares a static method named reverses that takes a single parameter str of type String.
// The static keyword means that this method belongs to the class itself rather than instances of the class.
// It does not return any value (void).

/*
 * char[] inputArray = str.toCharArray();
 * This line converts the input string str into a character array called inputArray. Each character in the string can now be accessed individually through this array.This line converts the input string str into a character array called inputArray. 
 * Each character in the string can now be accessed individually through this array.
 * 
 * char[] result = new char[inputArray.length];   //creating a separate result array
 * Here, a new character array named result is created, with the same length as inputArray. 
 * This array will ultimately hold the reversed characters while preserving the spaces.
 * 
 * for (int i = 0; i < inputArray.length; i++) {
 * This line starts a for loop that iterates over each character in inputArray, using the variable i as the index.
 
 *Inside the loop, this if statement checks if the current character in inputArray is a space.
 *If the character is a space, it is added to the corresponding position in the result array, ensuring that the space's position is preserved.
 *
 *
 *int j = result.length - 1;
 *A variable j is initialized to the index of the last position in the result array. This variable will be used to insert characters in reverse order.
 *
 *
 *for (int i = 0; i < inputArray.length; i++) {
 *This line starts another for loop, again iterating through each character in inputArray using index i.
 *
 *
 *
 *if (inputArray[i] != ' ') {           // Ignore spaces in input string
 *
 *Inside the loop, this if statement checks if the current character is not a space, 
 *allowing the program to focus only on non-space characters for reversal.
 *
 *if (result[j] == ' ') {              // ignore spaces in result.
 *The nested if statement checks if the character at index j of the result array is a space.
 *
 *j--;
 *If the position j points to a space in the result array, 
 *
 *result[j] = inputArray[i];
 *This line assigns the current non-space character (from inputArray[i]) to the correct position (tracked by j) in the result array.
 *it decrements j to move to the previous index, effectively skipping over spaces.
 *
 *j--;
 *After placing the character in result, j is decremented again, preparing for the next character insertion.
 *
 *}
 *This closes the if statement for checking non-space characters.
 *}
 *This closes the for loop that processes inputArray.
 *
 *System.out.println(String.valueOf(result));
 *This line converts the character array result back into a string using String.valueOf(result) and prints it to the console. 
 *This will display the final reversed string with preserved space positions.
 *
 *}
 *This closes the reverses method.
 *}
 *This closes the class definition.
 */
 
