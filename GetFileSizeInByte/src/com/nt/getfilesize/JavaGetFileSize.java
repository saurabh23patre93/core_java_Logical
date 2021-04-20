package com.nt.getfilesize;

import java.io.File;

public class JavaGetFileSize {
	static final String FILE_NAME="E:\\sreenu.txt";
	public static void main(String[] args) {
		File file=new File(FILE_NAME);
		
		if(!file.exists()||!file.isFile())
			return;
		System.out.println(getFileSizeBytes(file));
	}
	
	private static String getFileSizeBytes(File file) {
		return file.length()+" bytes";
	}
}
