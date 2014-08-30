/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.testrestful;

import java.util.Arrays;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author Dick
 */
@Path("srv")
public class MyService {
	
	@Path("/person")
	@Produces({"application/json", "application/xml"})
	@GET
	public Person getPerson() {
		return new Person("dick", 41);
	}
	
	@Path("/team")
	@Produces({"application/json", "application/xml"})
	@GET
	
	public Team getTeam() {
		Person p1 = new Person("dick", 41);
		Person p2 = new Person("lieve", 6);
		
		return new Team("pearl", Arrays.asList(p1, p2));
	}
	
	
}
