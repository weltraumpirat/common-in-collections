package de.cloudnine.examples.after;

import org.junit.After;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class CommonItemsFinderTest {
	private CommonItemsFinder commonItems;

	@org.junit.Before
	public void setUp() throws Exception {
		commonItems = new CommonItemsFinder();
	}

	@Test
	public void returnsCommonItemNames() throws Exception {
		List<FirstVO> first = createFirstVOList();
		List<SecondVO> second = createSecondVOList();
		assertEquals( 1, commonItems.getCommonElementNames( first, second ).size() );
	}

	private List<FirstVO> createFirstVOList() {
		final ArrayList<FirstVO> list = new ArrayList<FirstVO>();
		list.add( new FirstVO( "one" ) );
		list.add( new FirstVO( "two" ) );
		list.add( new FirstVO( "three" ) );
		return list;
	}

	private List<SecondVO> createSecondVOList() {
		final ArrayList<SecondVO> list = new ArrayList<SecondVO>();
		list.add( new SecondVO( "three" ) );
		list.add( new SecondVO( "four" ) );
		list.add( new SecondVO( "five" ) );
		list.add( new SecondVO( "six" ) );
		return list;
	}

	@After
	public void tearDown() throws Exception {
		commonItems = null;
	}
} 