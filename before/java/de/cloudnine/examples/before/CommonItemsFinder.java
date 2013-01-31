package de.cloudnine.examples.before;

import java.util.ArrayList;
import java.util.List;

public class CommonItemsFinder {
	public List<String> getCommonElementNames( List<FirstVO> first, List<SecondVO> second ) {
		List<String> commonNames = new ArrayList<String>();
		for( FirstVO f : first )
			for( SecondVO s : second )
				if( f.getName().equals(s.getName())) {
					commonNames.add( f.getName());
					break;
				}
		return commonNames;
	}
}
