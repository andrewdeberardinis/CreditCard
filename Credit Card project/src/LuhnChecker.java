import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class LuhnChecker
	{

		static long [] cardFile = new long [16];
		static long ccNumber;
		static long displayNumber;
		static int counter = 0;

		
		public static void reader() throws IOException
			{
				
				Scanner Searcher = new Scanner(new File("CreditCardFile.txt"));
						
				
					
					while(Searcher.hasNext())
							{
							ccNumber = Searcher.nextLong();
							ccNumber = displayNumber;
							algorithm();
						
							}
			
			System.out.println(counter);
			}
		
		
		public static void algorithm()
			{

		int index = 15;
		while(ccNumber > 0 )
			{
				cardFile[index] = ccNumber % 10;
				
				ccNumber = ccNumber / 10;
				
				index--;
			}
		
		
		
		for(int i = 0; i < cardFile.length; i = i + 2)
			{
			
				if(cardFile[i] * 2 > 9)
					{
					
						cardFile[i] = cardFile[i] + cardFile[i] * 2 / 10 + cardFile[i] * 2 % 10;
						System.out.println(cardFile);
				
					}
				
				else
					{
						
						cardFile[i] = cardFile[i] + cardFile[i] * 2;
					}
			
	
		}

		for(int n = 1; n < cardFile.length; n = n + 2)
			{
				
				cardFile[n] = cardFile[n] + cardFile[n];
			}
		
		System.out.println(counter);
		
			
		
		if(counter % 10 == 0)
			{
				System.out.println("valid credit card");
			}
		else
			{
				System.out.println("not valid");
			}
		
		}
	
	}
