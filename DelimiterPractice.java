import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DelimiterPractice {
	public static void main(String[] args) throws FileNotFoundException {
		String url;

		Scanner fileScan, urlScan;

		fileScan = new Scanner(new File("hiddenmessages.txt"));

		// Read and process each line of the file

		while (fileScan.hasNext())

		{

			url = fileScan.nextLine();

			System.out.println("Line: " + url);

			urlScan = new Scanner(url);

			urlScan.useDelimiter(", ");

			// Print each part of the url

			while (urlScan.hasNext())

				System.out.println(" " + urlScan.next());

			System.out.println();
		}
	}
}