package capg_Day8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map=new HashMap<Integer, String>();
		
		//adding value to map
		map.put(1001, "Smita");
		map.put(1002, "Amruta");
		map.put(1003, "Sangita");
		map.put(1004, "Savita");
		System.out.println(map);
		System.out.println(map.get(1003));
		Set<Integer> keys=map.keySet();
		for(Integer key:keys)
		{
			System.out.println("Keys: "+key+"Map: "+map.get(key));
		}
		
		Map<String,Integer> map2=new HashMap<String,Integer>();
	    map2.put("Smita", 10011);
	    System.out.println(map2);
	}

}
