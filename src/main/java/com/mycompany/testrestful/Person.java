/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.testrestful;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dick
 */
@XmlRootElement 
public class Person {
	
	String naam;
	int age;

	public Person(String naam, int age) {
		this.naam = naam;
		this.age = age;
	}

	public Person() {
	}
	
	

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
