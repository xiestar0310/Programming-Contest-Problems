import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        String[]word=new String[3];
        for(int i=0; i<N; i++){
            for(int j=0; j<3; j++)
                word[j]=in.next();
        if(word[0].startsWith(word[1]) ||
		    word [0].startsWith (word [2]) ||
		    word [1].startsWith (word [2]) ||
		    word [1].startsWith (word [0]) ||
		    word [2].startsWith (word [0]) ||
		    word [2].startsWith (word [1]) ||
		    word [0].endsWith (word [1]) ||
		    word [0].endsWith (word [2]) ||
		    word [1].endsWith (word [2]) ||
		    word [1].endsWith (word [0]) ||
		    word [2].endsWith (word [0]) ||
		    word [2].endsWith (word [1]))
        System.out.print("No\n");
        else
            System.out.print("Yes\n");
        }
        }
    }
