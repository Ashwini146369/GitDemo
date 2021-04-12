package unitTestCase;

import org.testng.annotations.Test;

public class TC09{
	@Test
	public void RS1()
	{
		int ash[][] = {{7,6,1},{5,3,7},{4,8,9}};
		
		int min = ash[0][0];
		int max = 0;
		int lowerindex=0;
		
		for(int i=0;i<ash.length;i++)
		{
			for(int j=0;j<ash[i].length;j++)
			{
				if(ash[i][j]<min)
					{
					min = ash[i][j];
					lowerindex = j;
					}
			}
			
		}
		for(int k=0;k<ash.length;k++)
		{
			if(ash[k][lowerindex]>max)
				max=ash[k][lowerindex];
		}
		int col = lowerindex + 1;
		System.out.println("maximum value found in column "+ col +" as : "+max);
	}
}
