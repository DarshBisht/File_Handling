package com.java.file_handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteIntoFile_3 {

	public static void main(String[] args) {
		
		//1st way to write content in the file
		try {
			FileWriter fw = new FileWriter("C:\\Users\\hp\\eclipse-workspace\\MyJavaProject\\files\\xyz.txt");
			 try {
				 fw.write("Hello welcome to Java language");
			 }
			 finally {
				 fw.close();
				 System.out.println("Content wrote successfully in the file..!");
			 }
		}
		catch(IOException e) {
			System.out.println("File not found in the location..!");
		}
		
		
		//2nd way to write the content in the file
//		try {
//			FileWriter fw = new FileWriter("C:\\Users\\hp\\eclipse-workspace\\MyJavaProject\\files\\xyz.txt");
//			BufferedWriter bw = new BufferedWriter(fw);
//			bw.write("Hi learner");
//			bw.close();
//			System.out.println("Content wrote successfully by BufferedWriter class..!");
//		} catch (IOException e) {
//			System.out.println("File not found in the location..!");
//		}
		
		
//		3rd way to write the content in the file
//		try {
//			FileOutputStream fos = new FileOutputStream("C:\\Users\\hp\\eclipse-workspace\\MyJavaProject\\files\\xyz.txt");
//			try {
//				String st = "Bye Bye";
//				char ch[] = st.toCharArray();
//				for(int i=0; i<ch.length; i++) {
//					fos.write(ch[i]);
//				}
//			}
//			finally {
//				fos.close();
//				System.out.println("content wrote successfully by FileOutputStream..!");
//			}
//		}
//		catch (IOException e) {
//			System.out.println("File not found in the location..!");
//		}
		
		
		//4th way to write the content in the file
//		try {
//			PrintWriter pw = new PrintWriter("C:\\Users\\hp\\eclipse-workspace\\MyJavaProject\\files\\xyz.txt");
//			try{
//				pw.write("Hello Darshan");
//			}
//			finally {
//				pw.close();
//				System.out.println("Content wrote by PrintWriter class successfully..!");
//			}
//		} catch (FileNotFoundException e) {
//			System.out.println(e);
//		}
	}
}
