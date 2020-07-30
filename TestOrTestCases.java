import java.io.*;
import java.util.*;

public class Main {
    static int N, L; static List<String> set[]=new ArrayList[26], ans=new ArrayList();
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        N=in.nextInt(); L=in.nextInt();
        for(int i=0; i<N; i++){
            set[i]=new ArrayList();
            int k=in.nextInt();
            if(i>0)set[i].add("");
            for(int j=0; j<k; j++)
                set[i].add(in.next());
        }
        fun(0, ""); Collections.sort(ans);
        for(String e: ans)
            System.out.println(e);
    }
    static void fun(int d, String cur){
        if(d==N|| cur.length()==L){ans.add(cur);return;}
        for(String e: set[d])
            fun(d+1, cur+e);
    }
}
