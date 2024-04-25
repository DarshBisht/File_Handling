package com.java.file_handling;

import java.io.File;

public class DisplayFileInfo_2 {

	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\hp\\eclipse-workspace\\MyJavaProject\\files\\xyz.txt");
		//find file exists or not in the location
		if(f.exists()) {
			System.out.println("File already exist..!");
			//get file name
			System.out.println("File name: "+ f.getName());
			//get file path/location
			System.out.println("File location: "+f.getAbsolutePath());
			//is file writable
			System.out.println("File writable: "+f.canWrite());
			//is file readable
			System.out.println("File readable: "+f.canRead());
			//find content length of the file
			System.out.println("File size: "+f.length());
			//delete file
//			System.out.println("File deleted: "+f.delete());
		}
		else
			System.out.println("File does not exist in this location..!");
		
		
		System.out.println("------------------");
		
		
		//Get all files names which is in the folder
		File f2 = new File("C:\\Users\\hp\\eclipse-workspace\\MyJavaProject\\files");
		File[] files = f2.listFiles();
		
		for(File file: files)
			System.out.println(file.getName());
		
		
		System.out.println("------------------");
		
		
		//Make directory
		File f3 = new File("C:\\Users\\hp\\eclipse-workspace\\MyJavaProject\\files\\New_File");
		//Create new directory
		if(f3.mkdir())
			System.out.println("New directory created successfully..!");
		else
			System.out.println("This named directory already present..!");
		//delete directory
//		System.out.println("Directory delelted successfully: "+f3.delete());
		
	}
}
