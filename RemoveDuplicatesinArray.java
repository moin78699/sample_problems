import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] arr={1,7,2,8,4,6,8,6,9};
		Integer[] iar=new Integer[arr.length];
		for(int i=0;i<arr.length;i++){
		    iar[i]=arr[i];
		}
		Set<Integer> set=new LinkedHashSet<>(Arrays.asList(iar));
		Integer[] ar=set.toArray(new Integer[0]);
		for(int a:ar){
		    System.out.print(a+" ");
		}
		
		
	}
}
