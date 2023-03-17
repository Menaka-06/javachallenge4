package javachallenge;
public class JavaChallenge4b {
public static void main(String[] args) {
		int [] numarr= {4,1,2,1,2};
		for (int i = 0; i < numarr.length; i++) {
			int count=0;
			for (int j = 0; j < numarr.length; j++) {
				if(numarr[i]==numarr[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println("The number appear once in an array = "+numarr[i]);
			}
			
		}

	}

}
