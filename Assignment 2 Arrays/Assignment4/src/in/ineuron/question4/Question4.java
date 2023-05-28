package in.ineuron.question4;

public class Question4 {
	 public static boolean flower(int[] flowerbed, int n) {
	        int count = 0;
	        int first = -2;
	        int second = 0;
	        while(second < flowerbed.length){
	            while(second < flowerbed.length && flowerbed[second] != 1){
	                second ++;
	            }
	            if(second >= flowerbed.length){break;}
	            count += (second-first-2)/2;
	            
	            first = second;
	            
	            second ++;
	        }
	        System.out.println(second);
	        count += (second-first-1)/2;
	        return count >= n;
	 }
	    

	public static void main(String[] args) {
		int flowerbed [] = {1,0,0,0,1};
	    int n = 1;
	    System.out.println(flower(flowerbed,n));

	}

}
