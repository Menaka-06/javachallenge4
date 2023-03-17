package javachallenge;
public class JavaChallenge4 {
public static void main(String[] args) {
int[] nums= {2,2,1};

for (int i = 0; i < nums.length; i++) 
{
	int count=0;
	for (int j = 0; j < nums.length; j++)
	{
		if(nums[i]==nums[j])
		{
			count++;
		}
	}
		if(count==1)
		{
			 System.out.println("The number appear once in an array =  "+nums[i]);
		}
}
}
}


