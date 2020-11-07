package Exercise1;

import java.util.ArrayList;
import java.util.Arrays;

public class FilterRunner {
	
	public static String[] filter(String[] a, Filter<String> f) {
		ArrayList<String> arr = new ArrayList<>();
		for (String s : a) {
			if (f.accept(s))
				arr.add(s);
		}
		
		String[] s = new String[arr.size()];
		for (int i = 0; i < arr.size(); i ++)
			s[i] = arr.get(i);
			
		return s;
	}
	
	public static int[] filter(int[] a, Filter<Integer> f) {
		ArrayList<Integer> arr = new ArrayList<>();
		for (int s : a) {
			if (f.accept(s))
				arr.add(s);
		}
		
		int[] n = new int[arr.size()];
		for (int i = 0; i < arr.size(); i ++)
			n[i] = arr.get(i);
			
		return n;
	}
	
	public static void main(String[] args) {
		String[] str = new String[] {"bananaman", "applephone", "peachy", "kiwiboy", "mangobreaker"};
		System.out.println(Arrays.toString(str));
		int[] nums = new int[] {12, 40, -15, 7, 99, -1, 0, -123, 123};
		System.out.println(Arrays.toString(nums));
		String[] longString = filter(str, (input) -> input.length() >= 9);
		System.out.println(Arrays.toString(longString));
		int[] positiveNumbers = filter(nums, (input) -> input >= 0);
		System.out.println(Arrays.toString(positiveNumbers));
	}
	
	public static void print(Object[] a) {
		for (Object i : a)
			System.out.print(i + " ");
	}
}
