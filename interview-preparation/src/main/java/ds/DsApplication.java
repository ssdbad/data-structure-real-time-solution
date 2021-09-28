package ds;

import java.util.HashMap;
import java.util.Map;

public class DsApplication {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("A", "B");
		map.put("B", null);
		map.put(null, null);
		System.out.println(map.size());
	}
}