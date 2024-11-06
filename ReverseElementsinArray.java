public class Main
{
	public static void main(String[] args) {
		int[] arr={1,7,2,8,4,6,8,6,9};
		for(int i=0;i<arr.length/2;i++){
		    int temp=arr[i];
		    arr[i]=arr[arr.length-1-i];
		    arr[arr.length-1-i]=temp;
		}
		for(int a:arr){
		   System.out.print(a+" ");
		}
	}
}
