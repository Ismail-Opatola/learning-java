package com.github.ismailopatola.learningjava.fundamentals;

import java.io.FileWriter;

public class FileWriterClass {

	public static void main(String[] args) {
		/**
		 * using File writer to write to a file
		 * ------------------------------------
		 * 
		 */

		try {
			FileWriter writer = new FileWriter("poem.txt");

			// overide content of file
			writer.write("Roses are red \nViolets are blue\nI'm stuck on you!");
			
			// add new content at the end of file content
			writer.append("\n(A peom by Bro)");

			writer.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
