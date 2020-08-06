package SepPapers;

public class AlternateAdd {

	public static void main(String[] args) 
	{

		int a[] = {-1,-2,3,4,-5,7,-3,8,-9,10,11,12,13,};
		int b[] = new int[a.length];
		
		for(int i = 0; i < a.length;i++)
			System.out.print(a[i]+ " ");
		
		System.out.println();
	
		int p = 0, n = 0, c = 0;
		
		for(int i = 0; i < a.length;)
		{
			if(i % 2 == 0)
			{
				for(int j = i; j < a.length ;i++)
				{
					if(a[j] >= 0)
					{
						//b[]
					}
				}
			}
			else
			{
				
			}
		}
		
	}

}
