//Importing file handling classes and packages 
import java.io.File;          
import java.io.FileInputStream;    //input stream class of io Package
import java.io.FileOutputStream;  //output stream class of io Package
import java.io.IOException;		//importing class f exception
 
public class FileHandling {
	
   public static void main(String[] args) {   //main class declaration
      FileInputStream ins = null;    //input stream is initialized null
      FileOutputStream outs = null;		//output stream is initialized null
      
      try {     //try block to check if there is any exception or not
    	  
         File infile =new File("C:\\Users\\jg185252\\Desktop\\JavaFilesPrograms\\FirstFile.txt");    //given path of input file
         File outfile =new File("C:\\Users\\jg185252\\Desktop\\JavaFilesPrograms\\SecondFile.txt");		//given path of the destination or output file
         ins = new FileInputStream(infile);     //initializing object of FileInputStream, declaring constructor
         outs = new FileOutputStream(outfile);		//initializing object of FileOutputStream, declaring constructor
         
         byte[] buffer = new byte[1024];    //declared buffer
         int length;    //integer type length
         
         while ((length = ins.read(buffer)) > 0) {     //Reading file till it reached to the end of the file
            outs.write(buffer, 0, length);    //Writing the file in another file, using buffer till the length of the first file 
         } 
         
         ins.close();    //Closing the input connection
         outs.close();		//Closing the output connection
         
         System.out.println("File copied successfully!!");
      } 
      
      catch(IOException ioe) {    //Catch class to catch any exception thrown by the try class
         ioe.printStackTrace();    
      } 
   }
}
