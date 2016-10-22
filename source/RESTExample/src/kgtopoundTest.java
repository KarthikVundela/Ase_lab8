import static org.junit.Assert.*;

import org.junit.Test;

public class kgtopoundTest {
	KgtoPoundService kgtopound = new KgtoPoundService();
    String result = kgtopound.convertKgtoPoundfromInput(100.0);
    String testResult = 100.0+" Output in pounds:"+45.4;

	@Test
	public void test() {
		System.out.println("Tested value:"+testResult+" =  True value: "+result);
		assertEquals(testResult, result);
		
	}

}
