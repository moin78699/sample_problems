import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] arr={1,3,5,7};
		int[] ar={2,4,6};
		int n=arr.length;
		int m=ar.length;
		int[] a=new int[n+m];
		int i=0,j=0,k=0;
		while(i<n && j<m){
		    if(arr[i] < ar[j]){
		        a[k++]=arr[i++];
		    }else{
		        a[k++] = ar[j++];
		    }
		}
		    while(i<n){
		        a[k++]=arr[i++];
		    }
		    while(j<m){
		        a[k++]=ar[j++];
		    }
		    
		
		for(int num:a){
		        System.out.print(num+" ");
		    }
	}
}
