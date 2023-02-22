


public class isPalindrome {
	
	static boolean isPali(int num){
		int temp= num , reverseNumber=0 ,lastLetter;

		while(temp!=0) {
		temp= num ;
		lastLetter = temp%10;
		reverseNumber = reverseNumber*10 + lastLetter;
		temp /=10;
		}
		if(reverseNumber==num) 
			return true;		
		else 
			return false ;

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.print(isPali(848));

	}


}
