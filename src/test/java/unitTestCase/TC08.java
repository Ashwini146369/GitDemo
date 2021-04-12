package unitTestCase;

import org.testng.annotations.Test;

public class TC08{
	@Test
	public void RS1()
	{
		int counter;
		counter = 3;
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(counter+"\t");
				counter = counter + 3;
			}
		System.out.println();
		}
	}
}
