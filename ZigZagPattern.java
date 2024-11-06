//Prints Largest Element followed by Smallest, Second Largest followed by Second Smallest....
import java.util.*;
public class Main{
    public static void main(String[] args){
        int[] arr={2,5,3,4,1,6,8};
        int[] ar=new int[arr.length];
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                ar[i]=arr[right--];
            }else{
                ar[i]=arr[left++];
            }
        }
        for(int i:ar){
            System.out.print(i+" ");
        }
    }
}
