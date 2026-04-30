package CoreJava;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException{
        System.out.println("Please input a number: ");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        int a = Integer.parseInt(bf.readLine());
        System.out.println(a);
        bf.close();
    }
}
