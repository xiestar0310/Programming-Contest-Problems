import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner in= new Scanner(System.in);
    	int T=in.nextInt();
    	for(int t=1; t<=T;t++){
        int n=in.nextInt(), ud=n, ol=0, el=0, round=0;
        System.out.println("Round 0: "+ud+" undefeated, "+ol+" one-loss, "+el+" eliminated");
    	while(true){
        if(ud==0 && ol==1)break;
        if(ud==1 && ol==1){ ud=0; ol=2;}
    	else{
    		el +=ol/2; ol=ol - ol/2+ ud/2; ud -=ud/2;
      }
      round++;
      System.out.println("Round "+round+": "+ud+" undefeated, "+ol+" one-loss, "+el+" eliminated");
    }
  System.out.println("There are "+round+" rounds.");
  }
}
}
