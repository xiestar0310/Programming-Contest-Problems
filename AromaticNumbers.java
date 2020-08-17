import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        HashMap<Character, Integer>m=new HashMap<Character, Integer>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
        String s=in.nextLine(); int tot=0;
        for(int i=0; i<s.length(); i+=2){
            int a=s.charAt(i)-'0', r=m.get(s.charAt(i+1)), ar=a*r;
            if(i+3<s.length()&& m.get(s.charAt(i+3))>r)tot-=ar;
            else tot +=ar;
        }
        System.out.println(tot);
        
    }
    
}
