/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byteme.SearchBar;

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

public class SearchBar {
   private final String key; 
   public SearchBar() throws IOException{
      SearchPanel Search = new SearchPanel();//constructs the new object
      key = Search.getSearch();//sets the search bar
       SearchE();
   }
   public void SearchE() throws FileNotFoundException, IOException{
        File file = new File("Output.txt"); //specified the file
  BufferedReader br = new BufferedReader(new FileReader(file)); //buffered reader to open the file. 
  String st; //string for writing.
  int cont=0;
  PrintWriter temp = new PrintWriter("Search.txt");//temporary file for the input. 
  //loop to step through index to get new index. 
  while ((st = br.readLine()) != null) {
      if (st == null ? key == null : st.contains(key)){ 
  cont++;
  System.out.println(st);
  temp.write(st);//writing to file
      temp.println();//new line in file
  } else {
      System.out.println(cont);
         }
  }
  temp.close();
  br.close();//close out files
   }
 
}
///notes for 30th of march 
//use array and then compair each terms in the array instead of just one term make it so you can input multiple. 
//and that will filter through the terms selected make it a list. then pass the list to the searchbar. 