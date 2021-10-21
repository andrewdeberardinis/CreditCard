import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class LuhnChecker
	{

		
		public static void reader() throws IOException
			{
				
				Scanner Searcher = new Scanner(new File("CreditCardFile.txt"));
						
				
					
					while(Searcher.hasNext())
							{
							String sentence = Searcher.nextLine();
							System.out.println(sentence);
							
						
							}
			
			
			}
		
		
		public static void algorithm()
			{

		int sum = 0;
		
		int [] ccnumber = {5,4,2,4,1,8,0,1,2,3,4,5,6,7,8,9};
		int [] ccnumbereven = {4,4,8,1,3,5,7,9};
		
		for(int i = 0; i < ccnumber.length; i = i + 2)
			{
			
				if(ccnumber[i] * 2 > 9)
					{
					
						sum = sum + ccnumber[i] * 2 / 10 + ccnumber[i] * 2 % 10;
						System.out.println(sum);
				
					}
				
				else
					{
						
						sum = sum + ccnumber[i] * 2;
					}
			
	
		}

		for(int n = 1; n < ccnumber.length; n = n + 2)
			{
				
				sum = sum + ccnumber[n];
			}
		
		System.out.println(sum);
		
			
		
		if(sum % 10 == 0)
			{
				System.out.println("valid credit card");
			}
		else
			{
				System.out.println("not valid");
			}
		
		}
	
	}
