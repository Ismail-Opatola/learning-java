package com.github.ismailopatola.learningjava.aptech;

import java.util.zip.Deflater;

public class DeflaterApplication {

	public static void main(String[] args) {
		try {
			String inputString = "The deflater class compresses the data";
			byte[] inputObj = inputString.getBytes("UTF-8");
			byte[] output = new byte[100];
	
			Deflater deflater = new Deflater();
			deflater.setInput(inputObj);
			deflater.finish();
			int compressDataLength = deflater.deflate(output);
			
			System.out.println(compressDataLength);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
