package in.ineuron.question2;
import java.util.*;

public class Question2 {
	 public static int candies(int[] nums) {
	        Set<Integer> numset = new HashSet<>();
	        for (int num : nums) numset.add(num);
	        return Math.min(numset.size(), nums.length / 2);
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
        System.out.println(candies(nums));

	}

}
