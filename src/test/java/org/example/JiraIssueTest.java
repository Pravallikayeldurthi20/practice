package org.example;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class JiraIssueTest {
    public static String session="";
    @Test(priority = 1)
    public void authentication(){
//        HashMap map=new HashMap();
//        map.put("username","pravallikayeldurthi2010");
//        map.put("password","7036828527");
        Response response= given().contentType("application/json").body("{ \"username\": \"pravallikayeldurthi2010\", \"password\": \"7036828527\" }")
                                        .when().post("http://localhost:8080/rest/auth/1/session")
                                        .then().extract().response();
        response.prettyPrint();
        JsonPath responseData=response.jsonPath();
        String sessionName=responseData.get("username");
        String sessionId=responseData.get("password");
        System.out.println(sessionId+"            "+sessionName);
        session= session+sessionName+"="+sessionId;
        System.out.println(session);
       // return "hh";
    }


}
