/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testrestful;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author DickD
 */
public class PersonTest {

    public PersonTest() {
    }

    @Test
    public void testGetNaam() {
        Person p = new Person("myname", 10);

        Assert.assertEquals("myname", p.getNaam());
    }

    @Test
    public void testSetNaam() {
    }

    @Test
    public void testGetAge() {
    }

    @Test
    public void testSetAge() {
    }

    @Test
    public void testToString() {
    }

}
