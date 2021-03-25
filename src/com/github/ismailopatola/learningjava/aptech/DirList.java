package com.github.ismailopatola.learningjava.aptech;

import java.io.File;

public class DirList {
	public static void main (String[] args) {
//		String dirName = "d:/";
//		String dirName = "foo.txt";
//		FileFilter fileFilter = new FileFilter("txt");
//		System.out.println(fileFilter.accept(null, "foo.txt"));
		
		File file = new File("foo.txt");
		FileFilter fileFilter2 = new FileFilter("java");
		String[] fileNameStrings = file.list(fileFilter2);
		
		for (String string : fileNameStrings) {
			System.out.println(string);
		}
//		for(int ctr =0; ctr < fileNameStrings.length; ctr++) {
//			System.out.println(fileNameStrings[ctr]);
//		}
	}
}