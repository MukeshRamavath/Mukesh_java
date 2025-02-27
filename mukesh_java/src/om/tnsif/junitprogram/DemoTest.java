package om.tnsif.junitprogram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DemoTest {

	@Test
	void testAdd() {
		Demo d1=new Demo();
		int actual=d1.add(7, 9);
		int expected=16;
		if (expected==actual) {
			
			System.out.println("pass");
		}
			else{
				System.out.println("fail");
			}
		}
		
	}


