package com.juaracoding;

import org.junit.Test;

import static io.restassured.RestAssured.given;

public class TestMoviePopular {
    String endpoint = "https://api.themoviedb.org/3/movie/popular?language=en-US&page=1";
    @Test
    public void TestMoviePopular() {
        given()
                .queryParam("api_key", "c7555726acdfd5852cbaadf46904d440")
                .when()
                .get(endpoint)
                .then().statusCode(200);

    }
}
