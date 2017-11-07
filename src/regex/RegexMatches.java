package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {

	public static void main(String[] args) {
		String content = "I am a student in ShenYang for 4 years! I'm 21.5 years old.";
		String regex = "\\d+\\.?\\d*";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(content);
		StringBuffer sb = new StringBuffer();
		while(matcher.find()) {
			matcher.appendReplacement(sb, "*");
		}
		//sb = `I am a student in ShenYang for * years! I'm *`
		
		matcher.appendTail(sb);
		//sb = I am a student in ShenYang for * years! I'm * years old.
		System.out.println(sb);
	}
}
