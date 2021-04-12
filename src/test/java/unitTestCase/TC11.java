package unitTestCase;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class TC11{
	@Test
	public void RS1()
	{
		int ash[] = {4,6,3,2,5,2,1,4,2,3,6,9,9,8,7,5,1,4,2,3,6,6};
		int count;
		ArrayList<Integer> baba = new ArrayList<Integer>();
		
		for(int i=0;i<ash.length;i++)
		{
			if(!baba.contains(ash[i]))
			{
				baba.add(ash[i]);
				count=1;
				
				for(int j=i+1;j<ash.length;j++)
				{
					if(ash[j]==ash[i])
					{
						count++;
					}
				}
				
				System.out.println(ash[i]+" - "+count);
			}
		}
	}
}
