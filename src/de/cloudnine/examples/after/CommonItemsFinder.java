package de.cloudnine.examples.after;

import java.util.ArrayList;
import java.util.List;

public class CommonItemsFinder {
	public List<String> getCommonElementNames( List<? extends Named> first, List<? extends Named> second ) {
		return getCommonStringsFromLists( getElementNames( first ), getElementNames( second ) );
	}

	private List<String> getCommonStringsFromLists( List<String> first, List<String> second ) {
		List<String> common = new ArrayList<String>();
		for( String item : first )
			if( second.contains( item ) )
				common.add( item );
		return common;
	}

	private List<String> getElementNames( List<? extends Named> list ) {
		List<String> names = new ArrayList<String>();
		for( Named element : list )
			names.add( element.getName() );
		return names;
	}
}
