package CoreJava;

import java.io.*;

public class FileReaderDemo {
    public static void main(String[] args){
        try{
            FileReader fr = new FileReader("C:\\Users\\root\\Downloads\\Lamda_Expression.pdf");
            BufferedReader br = new BufferedReader(fr);
            System.out.println(br.readLine());
        }
        catch(FileNotFoundException e){
            System.out.println("File not found check the file path");
        }
        catch(IOException e){
            System.out.println("I/O error occured");
        }

        
    }
}
