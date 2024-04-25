package com.java.file_handling;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadTextFromFile_4 {

	public static void main(String[] args) {

		//1st way to read content from the file
		try {
			FileReader fr = new FileReader("C:\\Users\\hp\\eclipse-workspace\\MyJavaProject\\files\\xyz.txt");

			try {
				int i;
				while ((i = fr.read()) != -1) {
					System.out.print((char) i);
				}
			} finally {
				fr.close();
				System.out.println("\nFile closed..!");
			}
		} catch (IOException e) {
			System.out.println("File not found in this location..!");
		}

		
		//2nd way to read content from the file
//		try {
//			FileReader fr = new FileReader("C:\\Users\\hp\\eclipse-workspace\\MyJavaProject\\files\\xyz.txt");
//			BufferedReader br = new BufferedReader(fr);
//			System.out.println(br.readLine());
//			br.close();
//			System.out.println("File closed..!");
//		}
//		catch (IOException e) {
//			System.out.println("File not found in this location..!");
//		}
		
		
		//3rd way to read content from the file
//		try {
//			FileReader fr = new FileReader("C:\\Users\\hp\\eclipse-workspace\\MyJavaProject\\files\\xyz.txt");
//			Scanner s = new Scanner(fr);
//			while(s.hasNextLine()) {
//				System.out.println(s.nextLine());
//			}
//			s.close();
//			System.out.println("File closed..!");
//		} 
//		catch (FileNotFoundException e) {
//			System.out.println(e);
//		}
		
		
		//4th way to read content from the file
//		try {
//			FileInputStream fis = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\MyJavaProject\\files\\xyz.txt");
//			int i;
//			try {
//				while((i=fis.read())!=-1) {
//					System.out.print((char) i);
//				}
//			}
//			finally {
//				fis.close();
//				System.out.println("File closed..!");
//			}
//		} 
//		catch (IOException e) {
//			System.out.println("File not found in this location..!");
//		}
	}
}
