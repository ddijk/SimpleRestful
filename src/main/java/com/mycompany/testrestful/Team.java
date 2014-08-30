/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.testrestful;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dick
 */
@XmlRootElement
public class Team {
	
	String naam;
	
	List<Person> members;

	public Team(String naam, List<Person> members) {
		this.naam = naam;
		this.members = members;
	}

	public Team() {
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public List<Person> getMembers() {
		return members;
	}

	public void setMembers(List<Person> members) {
		this.members = members;
	}
	
	
}
