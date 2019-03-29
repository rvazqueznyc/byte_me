/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byteme.AdminMode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
/**
 *
 * @author jakeb
 */

public class ClearF {
    
    private final String Rfile;
    
    public ClearF() throws FileNotFoundException, IOException{
        
     AdminCenterPanel fileToR;
        fileToR = new AdminCenterPanel();//calling constructor to get the name of the file for removal. 
        Rfile = fileToR.GetFileRemoved();//gets string of the file. 
 
      File file = new File("Output.txt"); //specified the file
  BufferedReader br = new BufferedReader(new FileReader(file)); //buffered reader to open the file. 
  String st; //string for writing.
  int cont=0;
  PrintWriter temp = new PrintWriter("InTemp.txt");//temporary file for the input. 
  //loop to step through index to get new index. 
  while ((st = br.readLine()) != null) {
      //if statement to test the string
  if (st == null ? Rfile == null : st.equals(Rfile)){ 
  cont++;
  } else {
      temp.write(st);//writing to file
      temp.println();//new line in file
         }
  
  }
  System.out.println("files deleted " + ""+ cont);//tells how many files have been removed. 
  
  temp.close();
  br.close();//close out files
  
 PrintWriter clear = new PrintWriter("Output.txt");//this clears the whole file. 
  clear.close();
  
  File file2 = new File ("InTemp.txt");
  BufferedReader inr;
        inr = new BufferedReader(new FileReader(file2));
  PrintWriter no = new PrintWriter("Output.txt");
  String ns;
  while ((ns = inr.readLine()) != null) {
      no.write(ns);//writes ine. 
      no.println();//breaks line in file
      
  }
  no.close();
  inr.close();//close all the files. 
  
  PrintWriter clearT = new PrintWriter("InTemp.txt");
  clearT.close();//clear the temp file
    }
    
    
}
