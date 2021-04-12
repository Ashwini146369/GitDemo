package unitTestCase;

import org.testng.annotations.Test;

public class TC06{

	@Test
	public void RS1()
	{
		int counter;
		counter = 1;
		for(int i=4;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(counter+" ");
				counter++;
			}
		System.out.println();
		}
	}
}
