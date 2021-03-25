package com.github.ismailopatola.learningjava.aptech;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamApp {
 public static void main(String[] args) {
	 FileInputStream inputStream = null;
	 FileOutputStream outputStream = null;
	 
	 try {
		inputStream = new FileInputStream("poem.txt");
		outputStream = new FileOutputStream("outagain.txt");
		
		int ch;
		while ((ch = inputStream.read()) != -1) {
			outputStream.write(ch);
//			System.out.print(ch);
			System.out.printf("%c", ch);
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		try {
			
			if(inputStream != null) {
				inputStream.close();
			}
			if(outputStream != null) {
				outputStream.close();
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
 }
}
