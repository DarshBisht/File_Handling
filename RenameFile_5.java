package com.java.file_handling;

import java.io.File;

public class RenameFile_5 {

	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\hp\\eclipse-workspace\\MyJavaProject\\files\\xyz.txt");
		File f2 = new File("C:\\Users\\hp\\eclipse-workspace\\MyJavaProject\\files\\Hello.txt");
		
		if(f.exists()) {
			System.out.println("File exist..!");
			System.out.println("Rename File: "+f.renameTo(f2));
		}
		else
			System.out.println("File does not exist in this location..!");
	}
}
