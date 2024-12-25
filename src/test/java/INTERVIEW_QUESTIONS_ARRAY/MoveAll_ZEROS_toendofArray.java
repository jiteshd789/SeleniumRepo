package INTERVIEW_QUESTIONS_ARRAY;

public class MoveAll_ZEROS_toendofArray {
	
	public static void main(String[] args) 
	{
		int[] ar = {1,0,2,0,3,0,4,0,5};
		int count = 0;
		
		
		for(int i=0; i<=ar.length-1;i++)
		{
			if(ar[i]!=0)
			{
				ar[count]=ar[i];
				count++;		
			}
		}
		
		
		while(count<ar.length)
		{
			ar[count]=0;
			count++;
		}
		
		
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}

}


/*=========================================================================================================
 * 
 * 
 * 
 * 
 */

