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
/**
 *
 * @author User
 */
public class comment extends RealTimeAssignment2{
     String sem, course, group, task, name, matric; 
	    
	    public comment () throws FileNotFoundException, IOException {
	        BufferedReader br = new BufferedReader(new FileReader(FILE));
	        String line;
	            while ((line = br.readLine()) != null){
	                if (line.contains("//Semester:")){
	                    sem = line;
	                    sem = sem.replace("//Semester: #", "");
	                }else if (line.contains("//Course:")){
	                    course = line;
	                    course = course.replace("//Course: #", "");
	                }else if (line.contains("//Group:")){
	                    group = line;
	                    group = group.replace("//Group: #", "");
	                }else if (line.contains("//Task:")){
	                    task = line;
	                    task = task.replace("//Task: #", "");
	                }else if (line.contains("//Name:")){
	                    name = line;
	                    name = name.replace("//Name: #", "");
	                }else if (line.contains("//Matrik:")){
	                    matric = line;
	                    matric = matric.replace("//Matrik: #", "");
	                }
	        } 
	    }
	    
	    public String getSem(){
	        return sem;
	    }
	    
	    public String getCourse(){
	        return course;
	    }
	    
	    public String getGroup(){
	        return group;
	    }
	    
	    public String getTask(){
	        return task;
	    }
	    
	    public String getName(){
	        return name;
	    }
	    
	    public String getMatric(){
	        return matric;
	    }
}
