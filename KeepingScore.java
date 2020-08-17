import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine(), suit[]={"Clubs", "Diamonds","Hearts","Spades"};
        int pos[]=new int [5], tot=0;
        for(int i=0;i<4; i++)
            pos[i]=s.indexOf(suit[i].substring(0,1));
        pos[4]=s.length();
        System.out.println("Cards Dealt Points");
        for(int i=0; i<4; i++){
            System.out.print(suit[i]+" ");
            int point =0, cnt= pos[i+1]-pos[i]-1;
            for(int j=pos[i]+1; j<pos[i+1]; j++){
                char c=s.charAt(j); System.out.print(c+" ");
                if(c=='J') point +=1;
                if(c=='Q') point +=2;
                if(c=='K') point +=3;
                if(c=='A') point +=4;
            }
            if(cnt==0)point +=3;
            if(cnt==1)point +=2;
            if(cnt==2)point +=1;
            System.out.println(point); tot += point;
        }
        System.out.println("Total "+ tot);
    }
    
}
