/* Author: Jingwei Zhang
 * Purpose: CS673 Assignment 1
 */
import java.util.ArrayList;
import java.util.List;

public class Assignment1 {
	
	public static void main(String[] args) {
		Assignment1 a = new Assignment1();
		a.print_helloWorld();
		List<String> l1 = new ArrayList<>();
		List<String> l2 = new ArrayList<>();
		a.is_palindrome("anna");
		a.is_palindrome("apple");
		a.multi_table_12();
		l1.add("a");
		l1.add("b");
		l1.add("c");
		l2.add("1");
		l2.add("2");
		l2.add("3");
		List<String> l3 = a.combine(l1, l2);
		System.out.print("list 1: ");
		for (String s: l3) 
			System.out.print(s + " ");
		System.out.println();
		System.out.print("list 2: ");
		for (String s: l3) 
			System.out.print(s + " " );
		System.out.println();
		System.out.print("new list: ");
		for (String s: l3) 
			System.out.print(s + " ");
		System.out.println();
		a.fibonacci_to_100th();
		a.is_leapYear(1900);
	}
	
	public void print_helloWorld() {
		System.out.println("Hello World");
	}
	
	public void multi_table_12() {
		System.out.print("  X ");
		for (int i = 0; i < 13; i++)
			System.out.printf("%3d ", i);
		for (int i = 0; i < 13; i++) {
			System.out.printf("\n%3d", i);
			for (int j = 0; j < 13; j++)
				System.out.printf(" %3d", i * j);
		}
		System.out.println();
		
	}
	
	public void is_palindrome(String s) {
		int i = 0, j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i++) != s.charAt(j--)) {
				System.out.println(s + " is not a palindrome");
				return;
			}
		}
		System.out.println(s + " is a palindrome");
	}
	
	public <E> List<E> combine(List<E> a, List<E> b) {
		List<E> res = new ArrayList<>();
		int l = 0, r = 0, m = a.size(), n = b.size();
		while (l < m || r < n) {
			if (l < m)
				res.add(a.get(l++));
			if (r < n)
				res.add(b.get(r++));
		}
		return res;
	}
	
	public void fibonacci_to_100th() {
		long a = 1, b = 1;
		System.out.print("1 ");
		for (int i = 1; i < 100; i++) {
			System.out.print(a + " ");
			a = a + b;
			b = a - b;
		}
		System.out.println();
	}
	
	public void is_leapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 400 == 0)) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is NOT a leap year.");
		}
	}
}
