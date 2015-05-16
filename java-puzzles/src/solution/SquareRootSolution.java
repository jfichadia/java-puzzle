package solution;

import java.util.Scanner;

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
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter one integer:");
		int N = scanner.nextInt();
		System.out.println("Square root of "+N+"="+sqrt(N));
		scanner.close();

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
		int iteration = 0;
		/*
		 * dishonor 0 and negative numbers
		 */
		if (N <= 0) 
		{
			System.out.println("No. of iteration(s)="+iteration);
			return (int) answer;
		}	
		answer = N/2;	
		while (answer*answer > N) {
			answer = (int)answer/2;
			iteration++;
		}		
		if (answer*answer == N) {
			/*
			 * Hurray! We got the square root
			 */
			System.out.println("No. of iteration(s)="+iteration);
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
				System.out.println("No. of iteration(s)="+iteration);
				return (int) finalAnswer;
			}
			if (finalAnswer*finalAnswer > N) {
				System.out.println("No. of iteration(s)="+iteration);
				return (int) (finalAnswer-1);
			}
			while (answer*answer < N ) {
				finalAnswer = answer;
				answer++;
				iteration++;
			}
			System.out.println("No. of iteration(s)="+iteration);
			return (int) (answer*answer != N ? finalAnswer:answer);
		}
	}
}
