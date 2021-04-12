package unitTestCase;

import org.testng.annotations.Test;

public class TC10{
	@Test
	public void RS1()
	{
		int ash[][] = new int[3][3];
		
		ash[0][0] = 1;
		ash[0][1] = 2;
		ash[0][2] = 3;
		
		ash[1][0] = 4;
		ash[1][1] = 5;
		ash[1][2] = 6;
		
		ash[2][0] = 7;
		ash[2][1] = 8;
		ash[2][2] = 9;
		
		for(int i=0;i<ash.length;i++)
		{
			for(int j=0;j<ash[i].length;j++)
			{
				System.out.print(ash[i][j]+"\t");
			}
			
			System.out.println();
		}
	}
}
