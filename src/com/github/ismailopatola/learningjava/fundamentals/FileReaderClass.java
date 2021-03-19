package com.github.ismailopatola.learningjava.fundamentals;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {

	public static void main(String[] args) {
		/**
		 * FileReader
		 * ----------
		 * read the contents of a file as a stream of characters.
		 * One by one read() returns an int value which contains the byte value
		 * when read() returns -1, there is no more data to be read
		 * 
		 */
		
		try {
			FileReader reader = new FileReader("poem.txt");
			int data = reader.read(); // stream returns -1 if empty
			while(data != -1) {
				System.out.print((char)data);
				data = reader.read();
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 

	}

}
