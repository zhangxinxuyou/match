package com.zy.match.match;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest {
	@Test
	public void name() {
		assertTrue(true);
	}

	@Test
	public void assertj_should_works() {
		String a = "a";
		assertThat(a).isEqualToIgnoringCase("A");
	}

	@Test
	public void mockito_should_works() {
		List mockedList = mock(List.class);

		mockedList.add("one");
		mockedList.clear();

		verify(mockedList).add("one");
		verify(mockedList).clear();
	}
}
