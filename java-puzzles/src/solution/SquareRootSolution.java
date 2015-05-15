/**
 * 
 */
package solution;

/**
 *  Find integer value of <code> sqrt(N) </code>.<br/> 
 *  Do not use any library functions or any mathematical solution.
 * 
 * @author Jay Fichadia (fichadia.jay@gmail.com)
 *
 */
public class SquareRootSolution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Number"+"\t"+"my"+"\t"+"actual");
		for (int i = 1; i < 1000000000; i++) {	
			int my = SquareRootSolution.sqrt(i);
			int actual = (int)Math.sqrt(i);
			if (my!=actual) {
				System.out.println(i+"\t"+my+"\t"+actual);	
			}
		}
//		System.out.println(sqrt(88412));
	}
	
	/**
	 * Return an integer square root for given number without using <code> Math.sqrt()</code>
	 * 
	 * @param N the number for which square root is required
	 * @return returns the square root of given number
	 */
	static int sqrt(int N)
	{
		double answer = 0;
		/*
		 * dishonor 0 and negative numbers
		 */
		if (N <= 0) 
		{
			return (int) answer;
		}	
		answer = N/2;	
		while (answer*answer > N) {
			answer = (int)answer/2;
		}		
		if (answer*answer == N) {
			/*
			 * Hurray! We got the square root
			 */
			return (int) answer;
		}
		else {
			/*
			 * At this stage we have an answer such that
			 * answer*answer < N
			 * Now we must find an answer such that 
			 * answer*answer < N < (answer+1)*((answer+1))
			 */
			double finalAnswer = ++answer;
			if (finalAnswer*finalAnswer==N) {
				return (int) finalAnswer;
			}
			if (finalAnswer*finalAnswer > N) {
				return (int) (finalAnswer-1);
			}
			while (answer*answer < N ) {
				finalAnswer = answer;
				answer++;
			}

			return (int) (answer*answer != N ? finalAnswer:answer);
		}
	}
}
