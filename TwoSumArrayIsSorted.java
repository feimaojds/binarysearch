package leecode;



public class TwoSumArrayIsSorted {

public int[] twoSum(int[] numbers, int target) {
        
	
	     int left = 0,right = numbers.length-1;
	     while(left<right){
	    	 int sum = numbers[left]+numbers[right];
	    	 if(sum>target){
	    		 right--;
	    	 }else if(sum<target){
	    		 left++;
	    	 }else if(sum==target){
	    		 return new int[]{left+1,right+1};
	    	 }
	     }
	     return new int[]{};
    }

public static void main(String[] args) {
	// TODO Auto-generated method stub

	
	int[] test = new int[]{2,7,9,11};
	System.out.println(new TwoSumArrayIsSorted().twoSum(test, 9)[1]);
	
}
}
