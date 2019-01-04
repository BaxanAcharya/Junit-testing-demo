package junit;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class MyMathTest {

	@Test
	void sum_with3Numbers() {
		MyMath mm=new MyMath();
		int result=mm.sum(new int[] {1,2,3});
		//check result is 6
		
		assertEquals(6, result);
		
		System.out.println(result);
	}

}
