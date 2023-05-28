package in.ineuron.question3;
import java.util.*;

public class Question3 {
	public static int harmonious(int[] nums) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                res = Math.max(res, map.get(key) + map.get(key + 1));
            }
        }
        return res;
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
        System.out.println(harmonious(nums));

	}

}
