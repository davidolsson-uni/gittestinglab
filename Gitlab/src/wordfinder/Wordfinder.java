package wordfinder;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Wordfinder {

	public static void main(String[] args) {
		
		// See if we have the correct number of input parameters
		if (args.length != 3) {
		    System.out.println ("You must provide a paramater of 3 number.");
		    System.exit (-1);
		}
		
		//Check if we input search
		if(args[0].toLowerCase().equals("search")){
			searchDocForWord(args[1], args[2]);
		}else {
			System.out.println("No valid method was selected, input 'search' as first argument.");
		}

	}
	
	public static void searchDocForWord(String word, String docPath) {
		//try in case doc does not exist
		try {
			System.out.println("Lines containing: " + word);
			int lineNbr = 1;
			
			//Scanner
			Scanner scanner = new Scanner(new File(docPath));
			
			while (scanner.hasNextLine()) {
				if(scanner.nextLine().toLowerCase().contains(word.toLowerCase())) {	//If line contains word, go to next line and print line nbr
					System.out.println(lineNbr);
				}
				lineNbr++;
			}
			
			scanner.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	

}
