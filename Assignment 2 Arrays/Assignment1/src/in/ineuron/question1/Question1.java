package in.ineuron.question1;
import java. util. Scanner;

import java.util.Arrays;

public class Question1 {
	 public static int pairSum(int[] nums) {
	        Arrays.sort(nums);
	        int total = 0;
	        for (int i = 0; i < nums.length; i += 2) {
	            total += nums[i];
	        }
	        return total;
	    }
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");  

        int n=sc.nextInt();  

        int[] nums = new int[n];  
        System.out.println("Enter the elements of the array nums: ");  
        for(int i=0; i<n; i++)  
        {  
   
            nums[i]=sc.nextInt();  
        } 
        System.out.println(pairSum(nums));
        

	}

}
