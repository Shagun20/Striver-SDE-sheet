import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner sc=new Scanner(System.in);
        String str= sc.next();
        printSS(str, "");

    }

    public static void printSS(String str, String ans) 
    {
        
        if(str.length()==0){
             System.out.println(ans);
             return;
            
        }
       
        
        //first add the character to answer
         printSS(str.substring(1),ans+str.charAt(0));
         
         printSS(str.substring(1),ans);
        
        
        
        
        
        
    }

}
