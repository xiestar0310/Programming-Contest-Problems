import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(true){
            int n=in.nextInt();
            if(n==0)break;
            int a[]=new int[n], x=in.nextInt();
            for(int i=0; i<n-1; i++){
                int y=in.nextInt();
                a[i]=y-x; x=y;
            }
            if(n==1){System.out.println(0);continue;}
            int cycle=0;
            for(cycle=1; cycle<n-1;cycle++){
                boolean flag=true;
                for(int i=0; i<n-1;i++){
                    if(a[i] !=a[i%cycle]) flag=false;
                }
                if(flag){ System.out.println(cycle);break;}
            }
            if(cycle==n-1)System.out.println(n-1);
        }
    }
}
