/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uum.assignment2;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
/**
 *
 * @author User
 */
public class LOC extends RealTimeAssignment2{
     public int countLineNumber() {
	        int lines = 0;
	        
	        try{
	            LineNumberReader lineReader = new LineNumberReader(new FileReader(FILE));
	            lineReader.skip(Long.MAX_VALUE);
	            lines = lineReader.getLineNumber()+1;
	            lineReader.close();
	        }catch(FileNotFoundException e){
	            System.out.println("FileNotFoundException Occurred" + e.getMessage());
	        }catch(IOException e){
	            System.out.println("IOException Occurred" + e.getMessage());
	        }
	        return lines;
	    }

	    public int countBlankLineNumber() {
	        String line;
	        int empty = 0;

	        try{
	            BufferedReader br = new BufferedReader(new FileReader(FILE));
	            while ((line = br.readLine()) != null) {
	                if (line.trim().isEmpty()) {
	                  empty++;
	                }
	            }
	        }catch(FileNotFoundException e){
	            System.out.println("FileNotFoundException Occurred" + e.getMessage());
	        }catch(IOException e){
	            System.out.println("IOException Occurred" + e.getMessage());
	        }
	        return empty;
	    }

	    public int countCommentLineNumber() {
	        String line;
	        int count = 0;

	        try{
	            BufferedReader br = new BufferedReader(new FileReader(FILE));
	            while ((line = br.readLine()) != null) {
	                if (line.startsWith("//")) 
	                  count++;
	                if (line.startsWith("/*")) {
	                    count++;
	                    while (!(line = br.readLine()).endsWith("'*\'")) {
	                        count++; break;
	                    }
	                }
	            }
	            br.close();
	        }catch(FileNotFoundException e){
	            System.out.println("FileNotFoundException Occurred" + e.getMessage());
	        }catch(IOException e){
	            System.out.println("IOException Occurred" + e.getMessage());
	        }
	        return count;
	    }
}
