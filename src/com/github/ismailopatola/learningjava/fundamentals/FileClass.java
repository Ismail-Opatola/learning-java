package com.github.ismailopatola.learningjava.fundamentals;

import java.io.File;
import java.io.IOException;

public class FileClass {

	public static void main(String[] args) throws IOException {
		/**
		 * File
		 * -----
		 * An abstract representation of file 
		 * and directory pathnames
		 * 
		 */
		
//	    if file is in root i.e fundamentals/secret_message.txt 
//		File file = new File("secret_message.txt");
//		relative path, project dir as root
		File file = new File("src/secret_message.txt");
//		absolute system path
//		File file = new File("C:\\Users\\Ismail\\OneDrive\\Desktop\\Workspace\\learning-java\\src\\secret_message.txt");
		
		if(file.exists()) {
			System.out.println("The file exists! :O!");
			System.out.println("Relative path: " + file.getPath());
			System.out.println("Absolute path: " + file.getAbsolutePath());
			System.out.println("Is a file not a folder?: " + file.isFile());
			file.delete();
		} else {
			file.createNewFile();
			System.out.println("That file doesn't exist :(!");
		}

	}

}
