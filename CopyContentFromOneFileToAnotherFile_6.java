package com.java.file_handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyContentFromOneFileToAnotherFile_6 {

	public static void main(String[] args) throws IOException {
		
		//Read file data
		FileInputStream r = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\MyJavaProject\\files\\Hello.txt");
		
		//Create file and write content in the file
		FileOutputStream w = new FileOutputStream("C:\\Users\\hp\\eclipse-workspace\\MyJavaProject\\files\\xyz.txt");
		
		//Copy one file data to another file
		int i;
		while((i=r.read())!=-1) {
			w.write((char) i);
		}
		System.out.println("Data copied successfully..!");
		r.close();
		w.close();
		System.out.println("Files closed successfully..!");
	}
}
