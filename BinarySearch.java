 https:import java.util.Scanner;
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr= {100,244,355,356,600,5400,30000,42000,335000,338000};
        Scanner sc=new Scanner(System.in);
        int target=338000;
        int ans=binarysearch(arr, target);
        System.out.println("the given element index in the array is that"+"-"+ans);

        
    }
    static int binarysearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
                else if(target>arr[mid]){
                    start=mid+1;

                }
                else{
                    return mid;
                }

            
        }
        return -1;

    }
}




