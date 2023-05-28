package in.ineuron.question5;

import java.util.Arrays;
import java.util.Scanner;

public class Question5 {
	public static void findSumTriplet(int[] A)
    {
        
        Arrays.sort(A);
        int n = A.length;

        if (n <= 2) {
            System.out.print("No triplet exists. The array has less than 3 elements.");
        }
        else if (A[n-1] * A[n-2] * A[n-3] > A[0] * A[1] * A[n-1]) {
            System.out.printf("Triplet is (%d, %d, %d)", A[n-1], A[n-2], A[n-3]);
            System.out.println("The Product of Triplet is   "+ A[n-1]*A[n-2]* A[n-3]);
            
        }
        else {
            System.out.printf("Triplet is (%d, %d, %d)", A[0], A[1], A[n-1]);
            System.out.println("The Product of Triplet is    "+ A[0]* A[1]* A[n-1]);
        }
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
        findSumTriplet(nums);
    }

}
