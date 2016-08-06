package com.safkanyazilim.findtop10lines;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindTop10Counts {
	public static List<LineCount>  findTop10Counts(List<String> lines) {
		HashMap<String, Integer> map = new HashMap<>();
		for (String line : lines) {
			if (!map.containsKey(line)) {
				map.put(line, 1);
			} else {
				int count = map.get(line);
				map.put(line, ++count);
			}
		}
		List<LineCount> lineCountList = new ArrayList<LineCount>(map.keySet().size());
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			LineCount lineCount = new LineCount(entry.getKey(), entry.getValue());
			lineCountList.add(lineCount);
		}
		
		Collections.sort(lineCountList);
		List<LineCount> counts = lineCountList.subList(lineCountList.size() - 10, lineCountList.size()); 
		Collections.reverse(counts);
		
		for (int i=0; i<counts.size(); i++) {
			System.out.println(counts.get(i));
		}
		
		return counts; 
	}

}
