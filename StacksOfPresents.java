import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int amount=in.nextInt();
        int count=0; long sum=0;
        int arr[]=new int[amount];
        for(int i=0;i<amount;i++)
            arr[i]=in.nextInt();
        Arrays.sort(arr);
        for(int i=0; i<amount;i++)
            if(arr[i]>=sum){sum+=arr[i];count++;}
            System.out.println(count);
        }
    }
