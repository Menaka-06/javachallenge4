package javachallenge;

public class JavaChallenge4c {

	public static void main(String[] args) {
		int[] num = {1};
		int count=0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if(num[i]==num[j])
				{
					System.out.println("the number appears once");
				}
			}
			
		}

	}

}
