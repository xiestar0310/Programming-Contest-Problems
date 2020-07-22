import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int T=in.nextInt(), MAXN=10000002;
        int[]p=new int[MAXN];
        for(int i=2;i<MAXN;i++){
            if(p[i]==0){
                for(int j=i; j<MAXN;j+=i)
                    p[j]++;
            }
        }
        for(int i=1;i<=T;i++){
            int A=in.nextInt(),B=in.nextInt(),K=in.nextInt(), cnt=0;
            for(int j=A;j<=B;j++)
                if(p[j]==K)cnt++;
            System.out.println("Case #"+i+": "+cnt);
        }
    }
}
