/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uum.assignment2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import com.uum.assignment2.keyword;
import com.uum.assignment2.LOC;
import com.uum.assignment2.comment;
import com.uum.assignment2.excel;
/**
 *
 * @author User
 */
public class RealTimeAssignment2 {
    static File FILE = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\RealTimeAssignment2\\FILE\\MyTread1.java");
    final static String FILE_NAME = "test.xlsx";
            
    public static void main(String[] args) throws FileNotFoundException,IOException{
        
        //scan details from comment
        comment scan = new comment();
        String sem = scan.getSem();
        String course = scan.getCourse();
        String group = scan.getGroup();
        String task = scan.getTask();
        String name = scan.getName();
        String matric = scan.getMatric();
        
        //count lines of codes
        LOC count = new LOC();
        int LOC = count.countLineNumber();
        int blankLines = count.countBlankLineNumber();
        int commentLines = count.countCommentLineNumber();
        int actualLOC = LOC - blankLines - commentLines;
        String ttlLines = Integer.toString(LOC);
        String blank = Integer.toString(blankLines);
        String comment = Integer.toString(commentLines);
        String actual = Integer.toString(actualLOC);
        
        //count number of keywords
        keyword key = new keyword();
        Map<String,Integer> map = key.countKeywords();
        
        //count total values
        int counter = key.noKeywords();
        int totalVal = actualLOC + counter;
        String ttlVal = Integer.toString(totalVal);
        
        //display output in Excel
        excel excel = new excel(FILE_NAME);
        excel.Details(sem, course, group, task);
        excel.Data(map, name, matric, ttlLines, blank, comment, actual, ttlVal);
        excel.keyword(map);
        excel.processDataObject().create().write();
    }    
}
