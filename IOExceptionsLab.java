/**
 * IO Exception Lab
 * @author Bryan Vu
 * @author William Gusmanov
 */

package ioExceptions;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class IOExceptionsLab {
	
	public static void main(String [] args) {
		
		//part 1 of lab (Creating and checking the file object to see if it exists)
		
		//create file object
		File validFile = new File ("D:\\CECS Stuff\\CECS277\\ioLab\\validTriangle.txt");
		//shallow copy of the validFile location (need a shallow copy to see if it exists)
		//if the file does not exist,then, loop until the file does exist
		boolean checkingFile = true;;
		while(checkingFile) {
			try {
			Scanner textFile = new Scanner(validFile);
			System.out.println("Regular File Found!");
			checkingFile = false;
			}
		//throws file does not exist error
		//need help changing file location because the file object is immutable
		catch(FileNotFoundException e) {
			System.out.println("Invalid File!");
			System.out.println("Type new file location here:");
			Scanner in = new Scanner(System.in);
			validFile =new File(in.nextLine());
			in.close();
			}
		}
		System.out.println("Successfully accessed file");
		
		//part 2 of lab(Creating a printwriter and checking to see if printwriter exists)
		
		
		File fileToPrint = new File ("D:\\CECS Stuff\\CECS277\\ioLab\\writingTextFile.txt");
		checkingFile = true;
		while(checkingFile) {
			try {
			PrintWriter print = new PrintWriter(fileToPrint);
			System.out.println("Print File Found!");
			checkingFile = false;
			} catch (FileNotFoundException e) {
			System.out.println("Invalid File!");
			System.out.println("Type new file location here:");
			Scanner in = new Scanner(System.in);
			fileToPrint =new File(in.nextLine());
			in.close();
			}//end of catch 
		}//end of while loop
		
		System.out.println("Successfully accessed output file");
	}
}
