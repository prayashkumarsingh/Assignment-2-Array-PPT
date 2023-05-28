package in.ineuron.question8;

import java.util.Scanner;

public class Question8 {
	public static int min(int[] A, int K) {
        int min = A[0], max = A[0];
        
        for (int x: A) {
            min = Math.min(min, x);
            max = Math.max(max, x);
        }
        return Math.max(0, max - min - 2 * K);
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
        System.out.println("Enter k Value ");  
        int k = sc.nextInt();
        System.out.println(min(nums,k));
    }

}
