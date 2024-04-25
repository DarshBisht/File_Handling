/*File handling:- File handling defines how we can read and write data on a file.
 *				  Java IO package contains all the classes through which we can perform
 *				  all input and output operations in the file.
 *
 *Stream:- Stream is a sequence of data on the basis of java.io package all the classes
 *		   divided into two stream. 1)Byte 2)Character.
 *
 *File handling methods:-
 *1) canRead();		//returns boolean value.
 *2) canWrtie();	//returns boolean value.
 *3) createNewFile();	//It creates the file and return the boolean value.
 *4) delete();	//returns boolean value.
 *5) Exists();	//returns boolean value.
 *6) length();	//provides the length of the content available in the file in the form of integer. 
 *7) getName();	//provides the name of the file.
 *8) getAbsolutePath();	//provides the path/location of the file.
 *9) mkdir();	//create new folder
 *10) List();	//Get all files names which is in the folder
 *11) Read();	//provide the character's unicode value one by one in int form.
 *12) Write();	//write content in the file through this method. 
 *13) renameTo();	//provide file destination and it returns the boolean value.
 *
 *File handling classes:-
 *1) File
 *2) FileReader
 *3) FileWriter
 *4) FileInputStream	//you can read the data in the form of byte
 *5) FileOutputStream	//you can write the data in the form of byte
 *6) BufferInputStream	//Buffer is a temporary storage area
 *7) BufferOutputStream
 *
 *Operation of file:-
 *1) Create file
 *2) Get file information
 *3) Read
 *4) Write
 *
 **/

package com.java.file_handling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Create file
public class FileHandlingInJava_1 {

	public static void main(String[] args) throws IOException {
		
		String path	= "C:\\Users\\hp\\eclipse-workspace\\MyJavaProject\\files\\xyz.txt";
		
		//provide file url
		File f = new File(path);
		//create file
		if(f.createNewFile())	//it throws the IOException
			System.out.println("File is created..!");
		else
			System.out.println("File is already exist..!");
		
		//write content in the file 
		FileWriter w = new FileWriter(f);
		w.write("Hi welcome to Java programming world..!");
		w.close();
		long l = f.length();	//find the length of the content available in the file
		if(l>0)
			System.out.println("Wrote content successfully..!");
		else
			System.out.println("Content not wrote successfully..!");
		
		//1st way to read content in the file by using FileReader class
		FileReader r = new FileReader(f);
		int i;
		while((i=r.read())!=-1) {
			System.out.print((char) i);	//type casting int to char
		}
		r.close();
		
		System.out.println();
		
		//2nd way to read content in the file by Scanner class
		Scanner r1 = new Scanner(f);
		while(r1.hasNextLine()) {
			System.out.print(r1.nextLine());
		}
		r1.close();
		
	}
}
