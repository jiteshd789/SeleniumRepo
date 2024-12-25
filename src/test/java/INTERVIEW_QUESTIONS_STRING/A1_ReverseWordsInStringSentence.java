package INTERVIEW_QUESTIONS_STRING;

public class A1_ReverseWordsInStringSentence {
	
	//My Name is Jitesh
	//Jitesh is Name My.
	
	public static void main(String[] args) {
	String str ="My Name is Jitesh";
	
	String a[]= str.split(" ");                
	
	for(int i=0;i<a.length;i++)                     //0<4 1<4 2<4 3<4    
	{
		System.out.print(a[i] + " ");              //My Name is Jitesh
	}                                              //0   1    2   3
	
System.out.println("---------------------------");
	
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.print(a[i]+ " ");              //Jitesh is Name My 
	}                                             //3      2   1   0
}
}