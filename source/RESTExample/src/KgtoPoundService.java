
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
 
@Path("/kgtopoundservice")

public class KgtoPoundService {
	@GET
	@Produces("application/xml")
	public String convertCtoF() {
 
		Double lbs;
		Double kgs = 100.0;
		lbs = kgs *0.454;
 
		String result = "Output in pounds:" + lbs;
		return "<ctofservice>" + "<kgs>" + kgs + "</kgs>" + "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";
	}
 
	@Path("{kg}")
	@GET
	@Produces("application/xml")
	public String convertKgtoPoundfromInput(@PathParam("kg") Double kgs) {
		Double lbs;
		
		lbs =kgs *0.454;
 
		String result = " Output in pounds:" + lbs;
		String kg = Double.toString(kgs);
		return  kg+ ""+ result ;
	}
} 