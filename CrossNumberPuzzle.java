import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(8128);
        
        for(int x=1;x<=9;x++){
            for(int y=0; y<=9;y++){
                for(int z=0; z<=9; z++){
                    int sum=x*x*x+y*y*y+z*z*z;
                    int num=100*x+10*y+z;
                    if(sum==num){
                        System.out.print(num+" ");
                    }
                }
            }
                
        }
    }
    
}
