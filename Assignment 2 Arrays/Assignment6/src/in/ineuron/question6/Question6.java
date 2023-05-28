package in.ineuron.question6;

import java.util.Scanner;

public class Question6 {
	public static int indexIs(int[] nums, int target) {
        int low = 0, high = nums.length -1, mid;
        while(low <= high){
            mid = (low + high)/2;
            if (nums[mid] == target)
                return mid;
            if(target < nums[mid]){
                high = mid-1;
            }else
                low = mid+1;
        }
        return -1;
    }
	public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");  

        int n=sc.nextInt();  

        int[] nums = new int[n];  
        System.out.println("Enter the elements of the array nums: ");  
        for(int i=0; i<n; i++)  
        {  
   
            nums[i]=sc.nextInt();  
        } 
        System.out.println("Enter Target Value ");  
        int target = sc.nextInt();
        System.out.println(indexIs(nums,target));
    }

}
