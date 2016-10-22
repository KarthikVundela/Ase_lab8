import static org.junit.Assert.*;

import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

public class poundtokgTest {
	
	PoundtoKgService lbtokg = new PoundtoKgService();
	Response resp =lbtokg.convertPoundtoKgfromInput((double) 200.0);
	JSONObject jobj1 = new JSONObject();
	

	@Test
	public void test() throws JSONException{
		float lbs=(float)200.0;
		float kgs=(float)100.0;
		
		
		jobj1.put("Pound", lbs);
		jobj1.put("Value in kgs"+ "",kgs );
		String testResult =""+resp.getEntity();
		System.out.println("Test value:"+testResult+"= True value: "+jobj1.toString());
		assertEquals(testResult, jobj1.toString());
		
	}

}
