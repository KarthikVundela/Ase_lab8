import static org.junit.Assert.*;

import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

public class ftocTest {
	
	FtoCService fahtocel = new FtoCService();
	Response resp =fahtocel.convertFtoCfromInput((float) 212);
	JSONObject jobj = new JSONObject();

	@Test
	public void test() throws JSONException{
		float c=(float)100;
		float f=(float)212;
		
		
		jobj.put("C Value", c);
		jobj.put("F Value", f);
		String testResult =""+resp.getEntity();
		System.out.println("Test value:"+testResult+"= True value: "+jobj.toString());
		assertEquals(testResult, jobj.toString());
		
	}

}
