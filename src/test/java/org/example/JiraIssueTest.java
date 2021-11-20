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
    @Test
    public String authentication() throws IOException {
        HashMap map=new HashMap();
        map.put("username","pravallikayeldurthi20]]]]011");
        map.put("password","7036828527");
        Response response= given().contentType("application/json").body(map)
                                        .when().post("http://localhost:8080/rest/auth/1/session")
                                        .then().statusCode(200).extract().response();
        response.prettyPrint();
        JsonPath responseData=response.jsonPath();
        String sessionName=responseData.get("username");
        String sessionId=responseData.get("password");
        System.out.println(sessionId+"            "+sessionName);
        return sessionName+"="+sessionId;
    }

}
