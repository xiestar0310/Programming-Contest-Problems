import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(), k=in.nextInt();
        boolean cross[]=new boolean[n+1];
        for(int i=2; i<=n; i++){
            if(!cross[i]){
                for(int j=i;j<=n; j+=i){
                    if(!cross[j]){cross[j]=true; k--;}
                    if(k==0){System.out.println(j); return;}
                }
            }
        }
    }
    
}
