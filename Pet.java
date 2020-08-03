import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int score=0, cont=0;
        Scanner in=new Scanner(System.in);
        for(int i=0; i<5; i++){
            int one=in.nextInt(),two=in.nextInt(),three=in.nextInt(),four=in.nextInt();
            if(one+two+three+four>score)
            {
                score=one+two+three+four;
                cont=i+1;
            }
        }
        System.out.println(cont+" "+score);
    }
    
}
