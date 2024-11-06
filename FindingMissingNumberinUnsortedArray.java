public class Main{
    public static void main(String[] args){
        int[] arr={2,5,3,4,1,6,8};
        int n=arr.length+1;
        int sum=0;
        int total=n*(n+1)/2;
        for(int k:arr){
            sum+=k;
        }
        int num=total-sum;
        System.out.println(num);
    }
}
