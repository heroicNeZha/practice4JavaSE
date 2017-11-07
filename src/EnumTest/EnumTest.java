package EnumTest;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EnumTest {
	public enum Size{
		
		MONDAY("MON"),TUESDAY("TUES"),WEDENSDAY("WED"),
		THURSDAY("TUES"),FRIDAY("FRI"),SATURDAY("SAT"),SUNDAY("SUN");
		private String abbreviation;

		private Size(String abbr) {
			this.abbreviation = abbr;
		}
	
		public String getAbbreviation() {
			return abbreviation;
		}
		
		private static int week;
		
		static{
			week = 7;
		}
	}
	
	
	public static void main(String[] args) {
		Size notMySize = Size.valueOf("MONDAY");
		System.out.println(notMySize);
		Size[] allValues = Size.values();
		System.out.println(Arrays.toString(allValues));
	}
}
