package com.myproject.mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;

//import static org.mockito.Mockito.mock;


//import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

class ListTest {

	@Test
	void testSize() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(10);
		assertEquals(10, listMock.size());
	}
	
	@Test
	void testSize_multipleReturns() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(12).thenReturn(20);
		assertEquals(12, listMock.size());
		assertEquals(20, listMock.size());
	}

}
