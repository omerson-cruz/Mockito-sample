package com.myproject.mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class SomeBusinessMockTest {

	@Test
	public void testFindTheGreatestFromAllData() {
		DataService dataServiceMock = mock(DataService.class);
		
		// new int[] {24, 15, 3}
		when(dataServiceMock.retrieveAllData())
			.thenReturn(new int[] {24, 15, 3});
		
		
//		SomeBusinessImpl buiBusinessImpl =
//				new SomeBusinessImpl(new DataServiceStub());
		// So instead of the real Object which is dependency of the class we're currently testing
		// we are going to send the Mocked implementation of the interface
		SomeBusinessImpl buiBusinessImpl =
				new SomeBusinessImpl(dataServiceMock);
		
		
		buiBusinessImpl.findTheGreatestFromAllData();
		
		int result = buiBusinessImpl.findTheGreatestFromAllData();
		assertEquals(24, result);
	}

}


/* Using some Mock Testing instead */
//class DataServiceStub implements DataService  {
//	
//	@Override
//	public int[] retrieveAllData() {
//		return new int[] {24, 6, 15}; // stubbing the function and returning some dummy data here
//	}
//}