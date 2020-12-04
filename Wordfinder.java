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
			
			//Scanner
			Scanner scanner = new Scanner(new File(docPath));
			
			while (scanner.hasNextLine()) {
	String line = scanner.nextline();		if(line.toLowerCase().contains(word.toLowerCase())) {	
					System.out.println(line);
				}
			}
			
			scanner.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	

}
