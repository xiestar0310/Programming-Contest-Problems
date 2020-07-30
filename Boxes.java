import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int boxNumber=readInt();
        box[] boxes=new box[boxNumber];
        for(int i=0; i<boxNumber;i++){
            boxes[i]=new box(readInt(), readInt(),readInt());
        }
        int packages=readInt();
        Arrays.sort(boxes, new volumeComparator());
        for(int i=0; i<packages;i++){
            box item=new box(readInt(),readInt(),readInt());
            boolean found=false;
            for(int j=0;j<boxNumber;j++){
                if(item.sizeArray[0]<=boxes[j].sizeArray[0] && item.sizeArray[1] <= boxes[j].sizeArray[1] && item.sizeArray[2]<=boxes[j].sizeArray[2]){
                    System.out.println(boxes[j].volume);
                    found=true;
                    break;
                }
            }
            if(!found){
                System.out.println("Item does not fit.");
            }
        }
    }
    
    static String next() throws IOException{
        while(st==null||!st.hasMoreTokens()){
            st=new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }
    static long readLong() throws IOException {
        return Long.parseLong(next());
    }
    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }
    static double readDouble() throws IOException {
        return Double.parseDouble(next());
    }
    static char readCharacter() throws IOException {
        return next().charAt(0);
    }
    static String readLine() throws IOException {
        return br.readLine().trim();
    }
    
    public static class box{
        int[] sizeArray=new int[3];
        long volume;
        box(int x, int y, int z){
            sizeArray[0]=x;
            sizeArray[1]=y;
            sizeArray[2]=z;
            Arrays.sort(sizeArray);
            volume=x*y*z;
        }
    }
    public static class volumeComparator implements Comparator<box>{
        public int compare(box a, box b){
            return Long.compare(a.volume, b.volume);
        }
    }
}
