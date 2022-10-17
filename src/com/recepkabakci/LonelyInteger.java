package com.recepkabakci;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LonelyInteger {

	public static void main(String[] args) {
		Map<Integer,Integer> map=new HashMap<>();
		List<Integer> array= new ArrayList<>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(3);
		array.add(2);
		array.add(1);
		for(int i=0;i<array.size();i++) {
			if(map.containsKey(array.get(i))) {
				map.put(array.get(i), map.get(array.get(i))+1);
			}else {
				map.put(array.get(i), 1);
			}
		}
		 for (Map.Entry<Integer, Integer> entry :
             map.entrySet()) {
 
            if (entry.getValue() ==1) {
                System.out.println(entry.getKey());
            }
		
		
		 }

	}
	
}
