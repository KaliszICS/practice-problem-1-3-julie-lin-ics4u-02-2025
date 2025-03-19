import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class PracticeProblem {

	public static void main(String args[]) {

	}
	// This function will open and read a file provided by the parameter filename.
	// Store the entire file in a single string.
	public static String readFile(String filename) {
		BufferedReader inputStream = null; 
		String content = ""; 
		try {
			inputStream = new BufferedReader(new FileReader(filename));
			String line;
			while ((line = inputStream.readLine()) != null){
				content += line + "\n"; 
			}
		}
		catch (IOException e) {
			return "There was an IOException thrown";
		}
		finally {
			try {
				if (inputStream != null) {
					inputStream.close();
				}
			}
			catch (IOException e){
				System.out.println(e); 
			}
		}
		return content; 
	}
	// 2. Write a function named backwardsReadFile(String filename).</br>
	// This function will open and read a file provided by the parameter filename.</br>
	// Store the entire file in a single string but backwards (this means character by character backwards).</br>
	// Return the String.</br>
	public static String backwardsReadFile(String filename) {
		BufferedReader inputStream = null; 
		String content = ""; 
		try {
			inputStream = new BufferedReader(new FileReader(filename));
			String line;
			while ((line = inputStream.readLine()) != null){
				content += line + "\n"; 
			}
		}
		catch (IOException e) {
			return "There was an IOException thrown";
		}
		finally {
			try {
				if (inputStream != null) {
					inputStream.close();
				}
			}
			catch (IOException e){
				System.out.println(e); 
			}
		}
		char [] contentArr = content.toCharArray();
		String reversedContent = "";

		for (int i = contentArr.length - 1; i >= 0; i--){
			reversedContent += contentArr[i];
		}
		return reversedContent;

	}
	

}
