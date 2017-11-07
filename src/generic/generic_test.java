package generic;

import java.util.Arrays;

public class generic_test {

	public static void main(String[] args) {
		Double[] result2 = generic_test.<Double>swap(0, 1, 1.5, (double)2, (double)3);
	}

	public static <K, V> void printGotIt(K key, V value) {
		System.out.println(key + ":" + value);
	}

	public static <K, V> void printGotIt(GotIt<K, V>[] gotIts) {
		for (GotIt<K, V> got : gotIts) {
			System.out.println(got.getKey() + ":" + got.getValue());
		}
	}

	public static <T> T[] swap(int i, int j, T... values) {
		T temp = values[i];
		values[i] = values[j];
		values[j] = temp;
		return values;
	}
}
