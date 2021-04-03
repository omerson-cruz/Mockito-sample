package com.myproject.mockito;

import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

//import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


// with Mockito annotation in order for those to work we need 
// to add the "RunWith" as well 
@RunWith(MockitoJUnitRunner.class)
class SomeBusinessMockAnnotationsTest {

	@Mock
	DataService dataServiceMock;
	
	@InjectMocks
	SomeBusinessImpl businessImpl;
	
	@Test
	public void testFindTheGreatestFromAllData() {
// using @Mock annotation instead of the statement below
//		DataService dataServiceMock = mock(DataService.class); 
		
		// new int[] {24, 15, 3}
		when(dataServiceMock.retrieveAllData())
			.thenReturn(new int[] {24, 15, 3});
		
		
//		SomeBusinessImpl buiBusinessImpl =
//				new SomeBusinessImpl(new DataServiceStub());
		// So instead of the real Object which is dependency of the class we're currently testing
		// we are going to send the Mocked implementation of the interface

		
// No need for this as well because we have the @InjectMocks annotation above
//		SomeBusinessImpl buiBusinessImpl =
//				new SomeBusinessImpl(dataServiceMock);
//		buiBusinessImpl.findTheGreatestFromAllData();
		
		int result = businessImpl.findTheGreatestFromAllData();
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