import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int I=in.nextInt(), N=in.nextInt(), J=in.nextInt();
        int dif[]= new int[I+2];
        for(int j=1; j<=J; j++){
            int a=in.nextInt(), b=in.nextInt(), v=in.nextInt();
            dif[a]+=v; dif[b+1]-=v;
        }
        int ans=0;
        for(int i=1; i<=I; i++){
            dif[i]+= dif[i-1];
            if(dif[i]<N)ans++;
        }
        System.out.println(ans);
        
    }
    
}
