import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
        
        int large=in.nextInt(), small=in.nextInt();
        int fraction=large%small;
        int number=(int)large/small;
        
        for(int i=2; i<small;i++){
            if(small%i==0&&fraction%i==0){
                small/=i;
                fraction/=i;
            }
        }
        
        if(number==0){
            System.out.println(fraction+"/"+small);
        }
        else if(fraction==0){
            System.out.println(number);
        }
        else if(number!=0&&fraction!=0){
        System.out.println(number+" "+fraction+"/"+small);
        }
    }
}
