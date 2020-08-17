import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(), max1=0, max2=0; String name1="", name2="";
        
        //make calculations for the value
        for(int i=0; i<n; i++){
            String str=in.next(); int R=in.nextInt(), S=in.nextInt(), D=in.nextInt();
            int val=2*R+3*S+D;
            
            //compare the value to the different inputs
            if(val>max1||(val==max1&&str.compareTo(name1)<0)){
                max2=max1; name2=name1;
                max1=val; name1=str;
                
            //secondary case
            }else if(val>max2||(val==max2&&str.compareTo(name2)<0)){
                max2=val; name2=str;
            }
        }
        
        //print out
        System.out.println(name1);
        System.out.println(name2);
    }
    
}
