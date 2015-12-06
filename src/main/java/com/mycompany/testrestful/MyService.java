package com.mycompany.testrestful;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 *
 * @author Dick
 */
@Path("srv")
public class MyService {

    @Path("/person")
    @Produces({"application/xml", "application/json", "text/html"})
    // @Produces({"application/json"})
    @GET
    public Person getPerson() {
        return new Person("dick", 41);
    }

    @Path("/person")
    // @Consumes({"application/xml", MediaType.APPLICATION_FORM_URLENCODED})
    @Produces({"application/json", "application/xml", "text/html"})
    @POST
    public Response create(@FormParam("naam") String n, @FormParam("age") int leeftijd, String content) {
        System.out.println("naam:" + n + ", leeftijd=" + leeftijd);
        System.out.println("content:" + content);
        Person p = new Person(n, leeftijd);

        if (n.startsWith("jeff")) {
            return Response.status(404).entity("foutje bedankt").build();
        }
        if (n.startsWith("dave")) {
            return Response.status(500).entity("server erreur bedankt").build();
        }

        return Response.ok(p).build();
    }

    @Path("/team")
    @Produces({"application/json", "application/xml", "text/html"})
    @GET

    public Team getTeam() {
        Person p1 = new Person("dick", 41);
        Person p2 = new Person("lieve", 6);

        return new Team("pearl", Arrays.asList(p1, p2));
    }

    @Path("/persons")
    @Produces({"application/json", "application/xml", "text/html"})
    @GET

    public Response getPersons() {
        Person p1 = new Person("dick", 41);
        Person p2 = new Person("lieve", 6);

        Person[] pa = new Person[2];
        pa[0] = p1;
        pa[1] = p2;

        List<Person> lijst = Arrays.asList(p1, p2);
        //return Response.ok(lijst).build();
        return Response.ok(pa).build();
    }

    @Path("/runs")
    @Produces({"application/json", "application/xml", "application/xhtml+xml"})
    @GET

    public Response getRuns() {
        Run p1 = new Run(new BigDecimal(99), "dick", new Date());
        Run p2 = new Run(new BigDecimal(153), "dick4", new Date());

        List<Run> lijst = new ArrayList<>();
        lijst.add(p1);
        lijst.add(p2);
        //        Run[] pa = new Run[2];
        //        pa[0] = p1;
        //        pa[1] = p2;

        ;

        //return Response.ok(lijst).build();
        return Response.ok(lijst.toArray(new Run[0])).build();
    }
}
