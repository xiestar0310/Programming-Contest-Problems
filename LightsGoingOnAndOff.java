import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int R=in.nextInt(),C=in.nextInt();
        String light[]=new String[R]; Set<String>p[]=new Set[R];
        for(int i=0; i<R; i++){
            light[i]=""; p[i]=new HashSet();
            for(int j=0; j<C; j++)
                light[i]+=in.next();
            p[i].add(light[i]);
        }
        for(int i=1; i<R; i++){
            for(String j:p[i-1])
                p[i].add(xor(light[i],j));
        }
        System.out.println(p[R-1].size());
    }
    static String xor(String x, String y){
        String z="";
        for(int i=0; i<x.length();i++)
            z+=(x.charAt(i)==y.charAt(i)?"0":"1");
        return z;
    }
    
}
