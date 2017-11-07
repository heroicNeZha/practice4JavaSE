package collection;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		Map<String,Integer> article = new HashMap<>();
		article.put("word", 4);
		article.put("sentences", 2);
		System.out.println(article);
		System.out.println(article.keySet().remove("word"));
		System.out.println(article);
	}

}
