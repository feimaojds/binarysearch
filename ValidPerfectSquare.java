package leecode;

public class ValidPerfectSquare {

public boolean isPerfectSquare(int num) {
        long left = 1,right = num;
        while(left<=right){
        	long mid = left+(right-left)/2;
        	if(mid*mid>num){
        		right = mid-1;
        	}else if(mid*mid<num){
        		left = mid+1;
        	}else{
        		return true;
        	}
        }
        return false;
    }
public static void main(String[] args) {
	System.out.println(Long.MAX_VALUE);
	int a = 222222222;
	System.out.println(a*a);
}
}
