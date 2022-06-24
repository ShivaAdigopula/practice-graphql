package com.shiva.adigopula.practicegraphql.query;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MovieQuery {
    @QueryMapping
    public String queryMovie() {
        return "test";
    }

    @QueryMapping
    public String fullName(@Argument  String firstName, @Argument  String lastName) {
        return firstName + " " + lastName;
    }
}
