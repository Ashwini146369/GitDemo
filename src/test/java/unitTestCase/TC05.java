package unitTestCase;

import org.testng.annotations.Test;

public class TC05{

	@Test
	public void RS1()
	{
		int counter;
		counter = 1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(counter+"\t");
				counter++;
			}
		System.out.println();
		}
	}
}
