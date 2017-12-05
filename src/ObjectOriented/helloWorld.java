package ObjectOriented;

public class helloWorld {
	public static void main(String[] args) {
		int n = 12;
		String s = Integer.toBinaryString(n);
		int count = 0;
		for(int i = 0;i<s.length();i++)
		{
			if (s.charAt(i)=='0') {
				count++;
			}
		}
		System.out.println(count);
	}
}
