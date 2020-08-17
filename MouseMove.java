import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int c=in.nextInt(), r=in.nextInt();
        int a=0, b=0;
        while(true){
            int x=in.nextInt(), y=in.nextInt();
            if(x==0&&y==0){break;}
            if(x>=a*-1){
                if(a+x<=c)a=a+x;
                if(a+x>c)a=c;
            }
            if(y>=b*-1){
                if(b+y<=r)b=b+y;
                if(b+y>r)b=r;
            }
            if(x<a*-1){
                a=0;
            if(y<b*-1){
                b=0;
            }
            }
            System.out.println(a+" "+b);
        }
    }
    
}
