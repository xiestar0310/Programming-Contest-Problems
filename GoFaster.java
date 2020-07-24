import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(),cntoff=0;
        int on[]=new int[n],off[]=new int[n];
        for(int i=1;i<n;i++){
            on[i]=in.nextInt();off[i]=in.nextInt();
            cntoff+=off[i];
        }
        int min=Math.max(0,on[1]-cntoff);
        int max=on[1]-off[2];
        int people=on[1];
        for(int i=2;i<n;i++){
            people-=off[i];
            max=Math.min(max, people);
            people+=on[i];
        }
        System.out.println(min);
        System.out.println(max);
        
    }
    
}
