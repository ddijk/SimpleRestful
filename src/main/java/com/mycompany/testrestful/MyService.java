package com.mycompany.testrestful;

import com.mycompany.testrestful.interceptor.Logging;
import java.util.Arrays;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Dick
 */
@Path("srv")
@Logging()
public class MyService {

    @Path("/person")
    @Produces({"application/json", "application/xml", "text/html"})
    @GET
    public Person getPerson() {
        return new Person("dick", 41);
    }

    @Path("/person")
    @Consumes({"application/xml", MediaType.APPLICATION_FORM_URLENCODED})
    @Produces({"application/json", "application/xml", "text/html"})
    @POST
    public Person create(@FormParam("naam") String n, @FormParam("age") int leeftijd, String content) {
        System.out.println("naam:" + n + ", leeftijd=" + leeftijd);
        System.out.println("content:" + content);
        return new Person("dick", 41);
    }

    @Path("/team")
    @Produces({"application/json", "application/xml", "text/html"})
    @GET

    public Team getTeam() {
        Person p1 = new Person("dick", 41);
        Person p2 = new Person("lieve", 6);

        return new Team("pearl", Arrays.asList(p1, p2));
    }

}
