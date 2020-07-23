import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(); String s[]=new String [n];
        
        for(int i=0; i<n; i++){
            s[i]=in.next();
        }Arrays.sort(s,new cmp());
        for(int i=0; i<n; i++){
            System.out.print(s[i]);
        }
    }static class cmp implements Comparator<String>{
        public int compare(String a,String b){
            String ab=a+b, ba=b+a;
            return ba.compareTo(ab);
        }
    }
}
