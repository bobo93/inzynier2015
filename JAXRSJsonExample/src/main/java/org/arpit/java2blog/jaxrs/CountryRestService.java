package org.arpit.java2blog.jaxrs;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.arpit.java2blog.bean.Trasa;
/* 
 * author: Arpit Mandliya
 * */
@Path("")
public class CountryRestService {
	
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//	public List<Trasa> getCountries()
//	{
//		List<Trasa> listOfCountries = new ArrayList<Trasa>();
//		listOfCountries=createCountryList();
//		return listOfCountries;
//	}

	@GET
    @Path("{przystA}/{przystB}/{godz}")
    @Produces(MediaType.APPLICATION_JSON)
	public Trasa getCountryById(@PathParam("przystA") String przystA,
			@PathParam("przystB") String przystB,
			@PathParam("godz") String godz )
	{
		Trasa a = algorytm(przystA,przystB,godz);
	
		return a;
	}

	
	
public Trasa algorytm(String przystA, String przystB, String godz){
Trasa a = new Trasa(przystA,przystB,godz); 
return a;
}
}
