package unitTestCase;

import org.testng.annotations.Test;

public class TC07{
	@Test
	public void RS1()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+"\t");
			}
		System.out.println();
		}
	}
}
