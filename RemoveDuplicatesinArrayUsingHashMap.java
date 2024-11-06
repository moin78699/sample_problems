import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] arr={1,7,2,8,4,6,8,6,9};
		HashMap<Integer,Integer> hs=new HashMap<>();
		for(int k:arr){
		    hs.put(k,hs.getOrDefault(k,0)+1);
		}
		for(int j:hs.keySet()){
		    if(hs.get(j)<=1){
		        System.out.print(j+" ");
		    }
		}
	}
}
