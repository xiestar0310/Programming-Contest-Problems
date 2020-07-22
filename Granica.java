import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(),a[]=new int[n],g=0;
      
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        Arrays.sort(a); g=a[1]-a[0];
        
        for(int i=2;i<n;i++)
            g=gcd(g,a[i]-a[i-1]);
        for(int i=2;i<=Math.sqrt(g);i++){
            if(g%i==0){
                System.out.print(i+" ");
                if(i*i!=g)System.out.print(g/i+" ");
            }
        }
        System.out.println(g);
        
    }
    static int gcd(int a,int b){
        if(a==0)
            return b;
        return gcd(b%a,a);
    }
}
