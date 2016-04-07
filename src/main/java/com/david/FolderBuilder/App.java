package com.david.FolderBuilder;

import java.io.File;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	for (String s:args){
	        File file = new File(s);
	        boolean exists=file.exists();
	        boolean result=false;
	        if (!exists){
	        	result=file.mkdirs();
	        }
	    	System.out.println("Folder Creation ["+s+"] folder exists ["+exists+"] folder create ["+result+"]");
    	}
    }
}
