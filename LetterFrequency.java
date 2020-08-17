import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String s=in.nextLine(); int Q=in.nextInt(),psa[][]= new int [26][1000001];
        for (int i=1; i<=s.length(); i++){
            for(int j=0; j<26; j++) psa[j][i]= psa[j][i-1];
            char c=s.charAt(i-1);
            if(c !=' ') psa[c-'a'][i]+=1;
        }
        for(int i=1; i<=Q; i++){
            int l=in.nextInt(), r=in.nextInt(); char c=in.next().charAt(0);
            System.out.println(psa[c-'a'][r]-psa[c-'a'][l-1]);
        }
    }
    
}
