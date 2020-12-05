package coding_test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestApp {

	public static void main(String[] args) {
//		System.out.println("Hello World");
		
		Map<String, Object> map = new HashMap<String, Object>();
		List<String> list = new ArrayList<String>();
		Map<String, Map<String, Object>> steps = new HashMap<String, Map<String,Object>>(7);
		Set<Object> set = new HashSet<Object>();
		Map<String, Long> domainMap = new HashMap<String, Long>();
		map.put("isSaved", true);
		list.add("Domain Status");
		list.add("configure sources");
		map.put("details", list);
		steps.put("Step 1", map);
		steps.put("Step 2", map);
		steps.put("Step 3", map);
		steps.put("Step 4", map);
		domainMap.put("domainId", 123l);
		set.add(domainMap);
		set.add(steps);
		set.forEach(e -> System.out.println(e));
	}
}