package com.juaracoding;

import org.junit.Test;

import static io.restassured.RestAssured.given;

public class TestNowPlaying {
    String endpoint = "https://api.themoviedb.org/3/movie/now_playing";
    @Test
    public void TestNowPlaying() {
        given()
                .queryParam("api_key", "c7555726acdfd5852cbaadf46904d440")
                .when()
                .get(endpoint)
                .then().statusCode(200);
    }
}
