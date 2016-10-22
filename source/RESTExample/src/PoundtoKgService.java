
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.json.JSONException;
import org.json.JSONObject;
 
@Path("/poundtokgservice")
public class PoundtoKgService {
 
	  @GET
	  @Produces("application/json")
	  public Response convertFtoC() throws JSONException {
 
		JSONObject jsonObject = new JSONObject();
		Double lbs = 200.0;
		Double kgs;
		kgs = (lbs/2.0); 
		jsonObject.put("Pound Value", lbs); 
		jsonObject.put("kg Value", kgs);
 
		String result = "" + jsonObject;
		return Response.status(200).entity(result).build();
	  }
 
	  @Path("{lb}")
	  @GET
	  @Produces("application/json")
	  public Response convertPoundtoKgfromInput(@PathParam("lbs") Double lbs) throws JSONException {
 
		JSONObject jsonObject = new JSONObject();
		Double kgs;
		
		kgs =  lbs/2.0; 
		jsonObject.put("Pound", lbs); 
		jsonObject.put("Value in kgs", kgs);
		
 
		String result = "" + jsonObject;
		return Response.status(200).entity(result).build();
	  }
}