package JiteshTestScripts;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class javaProgram {
	
	 public static void main(String[] args) {
	        // Example input: array of numbers sent to the server
	        int[] numbers = {1, 2, 4, 6, 7, 10}; // Modify this array based on your data
	        
	        // Call the method to find missing numbers
	        Set<Integer> missingNumbers = findMissingNumbers(numbers);
	        
	        // Display the result
	        System.out.println("Missing numbers: " + missingNumbers);
	    }

	    public static Set<Integer> findMissingNumbers(int[] numbers) {
	        Set<Integer> missingNumbers = new HashSet<>();
	        
	        // Find the maximum number in the provided array
	        int maxNumber = Arrays.stream(numbers).max().orElse(0);
	        
	        // Create a set for the provided numbers for fast lookup
	        Set<Integer> numbersSet = new HashSet<>();
	        for (int number : numbers) {
	            numbersSet.add(number);
	        }
	        
	        // Check for missing numbers from 1 to maxNumber
	        for (int i = 1; i <= maxNumber; i++) {
	            if (!numbersSet.contains(i)) {
	                missingNumbers.add(i);
	            }
	        }
	        
	        return missingNumbers;
	    }
	
	

}
