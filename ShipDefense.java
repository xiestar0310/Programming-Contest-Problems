import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double H=in.nextDouble(); int D=in.nextInt(), E=in.nextInt();
        int a[]=new int[D], s[]=new int[D], dif[]=new int[1002];
        for(int i=0; i<D; i++){
            a[i]=in.nextInt(); s[i]=in.nextInt();
        }
        for(int i=0; i<E; i++){
            int t=in.nextInt(), len=in.nextInt(), val=in.nextInt();
            dif[t]+=val; dif[t+len]-=val;
        }
        for(int t=0; t<=1000; t++){
        if(t>0)dif[t]+= dif[t-1];
        if(dif[t]>0){
            double damage=dif[t];
            for(int i=0; i<D; i++){
                if(s[i]>= dif[t]){damage=0; break;}
                else damage=Math.min(damage, (dif[t]-s[i])*(100.0-a[i])/100.0);
            }
            H-=damage;
            }
        }
        if(H<=0) System.out.println("DO A BARREL ROLL!");
        else System.out.printf("%.2f", H);
    }
    }
