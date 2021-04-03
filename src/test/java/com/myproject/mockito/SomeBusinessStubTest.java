package com.myproject.mockito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessStubTest {

	@Test
	void testFindTheGreatestFromAllData() {
		SomeBusinessImpl buiBusinessImpl =
				new SomeBusinessImpl(new DataServiceStub());
		buiBusinessImpl.findTheGreatestFromAllData();
		
		int result = buiBusinessImpl.findTheGreatestFromAllData();
		assertEquals(24, result);
	}

}


class DataServiceStub implements DataService  {
	
	@Override
	public int[] retrieveAllData() {
		return new int[] {24, 6, 15}; // stubbing the function and returning some dummy data here
	}
}