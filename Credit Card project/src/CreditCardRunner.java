import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public static void main(String[] args)
	{
		
		
	
		

	}


public class CreditCardRunner
	{
	
		
			Scanner Searcher = new Scanner(new File("CreditCardFile.txt"));
				
		
			
			while(Searcher.hasNext())
					{
					String sentence = Searcher.nextLine();
					System.out.println(sentence);
					
				
					}

	}	
