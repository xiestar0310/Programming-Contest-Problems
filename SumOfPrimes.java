import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       int maxv=100000; boolean f[]=new boolean[maxv+1];
       ArrayList<Integer> prime= new ArrayList<Integer>();
       for(int i=2; i<=maxv; i++){
           if(!f[i]){
               prime.add(i);
               for(int j=2*i;j<=maxv;j+=i)
                   f[j]=true;
           }
       }
       for(int k=1; k<=5; k++){
           int n=in.nextInt(), sum=0;
           for(int x: prime){
               if(x<=n)sum+=x;
               else break;
           }
           System.out.println(sum);
           
       }
    }
    
}
