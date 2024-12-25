package INTERVIEW_QUESTIONS_STRING;

public class A2_ReverseWordsInSamePlaceInString {
	
	//I/P - My Name is Jitesh
	//O/P- yM emaN si hsetiJ 
	
	public static void main (String[] args)
	{
		String str = "My Name is Jitesh";
		String words[] = str.split(" ");
		
		String revString="";                       //empty string
		
		for(int i=0;i<words.length;i++)
		{
			 String word = words[i];              //My(0)  Name(1)...
			 String revword="";                   //empty string
			 
			 
			 for(int j=word.length()-1;j>=0;j--)
			 {
				 revword=revword + word.charAt(j);    //tseT
			 }
			 
			 revString = revString + revword + " ";
			 	 		 
		}
		
		
		System.out.println(revString);
	}

}
