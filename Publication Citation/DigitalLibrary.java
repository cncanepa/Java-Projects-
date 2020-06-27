package bookstore;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList; 
import java.util.Collections;
import java.util.Scanner;
import java.io.PrintWriter;

//Enumeration with all allowed publisher names
enum Publisher{ELSEVIER, SPRINGER, IEEE, TAYLORFRANCIS, WILEY, ACM}; 

public class DigitalLibrary {
    
   private ArrayList<Publication> publications = new ArrayList<>();
   
   public void loadPublications() throws FileNotFoundException
    {
        
        File input = new  File("publications.txt"); 
        Scanner in = new Scanner(input);
        
        while(in.hasNext())
        {
           //COMPLETE: read each line of the file, based on the number of fields, decide whether it is a journal or a proceeding. Extarct the fields and add the publication to the publications ArrayList
        }
    }
   
   
   
   public void listPublications()
   {
       //COMPLETE: sort publications and print them. Add the numbers [1], [2], etc. at the begining of each line 
	   
   }
   
   
   
   public void saveCitations(String fileName) throws FileNotFoundException
   {
       PrintWriter prw = new PrintWriter(fileName + ".txt");
       
       //COMPLETE: Save citations to the file "fileName"
	   
       System.out.println(number + " citations have been saved to the file " + filePath);
       
   }
   
   
   
   
}
