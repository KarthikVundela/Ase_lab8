import static org.junit.Assert.*;

import org.junit.Test;

public class ctofTest {
	CtoFService celtofah = new CtoFService();
    String result = celtofah.convertCtoFfromInput(100.0);
    String testResult = 100.0+" Output in f:"+212.0;

	@Test
	public void test() {
		System.out.println("Tested value: "+testResult+" =  True value: "+result);
		assertEquals(testResult, result);
		
	}

}
