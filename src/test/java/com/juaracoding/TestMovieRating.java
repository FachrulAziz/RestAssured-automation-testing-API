package com.juaracoding;

import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TestMovieRating {
    String endpoint = "https://api.themoviedb.org/3/movie/603692/rating";
    @Test
    public void testMovieRating() {
        given()
                .get(endpoint)
                .then()
                .statusCode(401);
    }
}

