package homework2;

import java.math.BigDecimal;
import java.util.List;

public class Recursion {

	public static void main(String[] args) {
		System.out.println(fibonacci(2));
	}

	/**
	 * Remove duplicate consecutive items from a list, changing the list parameter.
	 * For example, if list = { a, b, b, b, c, b, c, c} then after calling unique
	 * the list will contain {a, b, c, b, c}. Only consecutive duplicates are
	 * removed. Objects are compared using their own equals method.
	 * 
	 * @param list
	 *            of any kind of object. The elements are not null.
	 * @return reference to the list parameter with consecutive duplicates removed.
	 */
	public static List unique(List list) {
		if (list.size() > 1) {
			if (list.get(0).equals(list.get(1))) {
				list.remove(0);
				unique(list);
			} else {
				unique(list.subList(1, list.size()));
			}
		}
		return list;
	}

	/**
	 * The effective fibonacci method.
	 * 
	 * @param n
	 *            that is the position of fibonacci.
	 * @return the fibonacci number.
	 */
	public static long fibonacci(int n) {
		// the base case
		if (n < 2)
			return 1;
		// the recursive step
		return helperFibonacci(n, 0, 1);
	}

	/**
	 * The helper method of fibonacci to compute faster.
	 * 
	 * @param n
	 *            is the position of the fibonacci.
	 * @param first
	 *            fibonacci n-2
	 * @param second
	 *            fibonacci n-1
	 * @return the fibonacci number.
	 */
	public static long helperFibonacci(int n, int first, int second) {
		if (n == 0)
			return 0;
		if (n == 1)
			return second;
		return helperFibonacci(n - 1, second, first + second);
	}
}