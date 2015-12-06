package com.mycompany.testrestful;

import static com.jayway.restassured.RestAssured.given;
import org.junit.Test;

public class PersonIT {

    @Test
    public void test2InactiveUser() {
        given().header("Accept", "application/json").when().get("http://localhost:7001/TestRestful/res/srv/person").then().statusCode(200);
    }

    @Test
    public void testTeam() {
        given().header("Accept", "application/json").when().get("http://localhost:7001/TestRestful/res/srv/team").then().statusCode(200);
    }

    @Test
    public void testRun() {
        given().header("Accept", "application/json").when().get("http://localhost:7001/TestRestful/res/srv/runs").then().statusCode(200);
    }

//    @Test
//    public void testTeamX() {
//        Team t = new Team("ddd", null);
//
//        Assert.assertEquals("ddd", t.getNaam());
//    }
}
