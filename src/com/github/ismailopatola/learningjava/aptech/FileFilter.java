package com.github.ismailopatola.learningjava.aptech;

import java.io.FilenameFilter;
import java.io.File;

public class FileFilter implements FilenameFilter{

	String ext;
	
	public FileFilter(String ext) {
		this.ext = "." + ext;
	}
	
	public boolean accept(File dir, String filename) {
		return filename
				.endsWith(ext);
	}
	
}

// asignment - create a form, save form to a text file in system storage
