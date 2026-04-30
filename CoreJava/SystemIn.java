package CoreJava;

import java.io.IOException;

public class SystemIn {
    public static void main(String[] args) throws IOException{
        int a = System.in.read();
        System.out.println(a - 48);
    }
}
