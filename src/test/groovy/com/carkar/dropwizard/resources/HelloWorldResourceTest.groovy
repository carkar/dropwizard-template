package com.carkar.dropwizard.resources

import com.carkar.dropwizard.api.HelloThere
import io.dropwizard.testing.junit.ResourceTestRule
import org.junit.Test

import static org.fest.assertions.api.Assertions.assertThat;
import org.junit.Before
import org.junit.ClassRule

class HelloWorldResourceTest {

    @ClassRule
    public static final ResourceTestRule resources = ResourceTestRule.builder()
            .addResource(new HelloWorldResource())
            .build();


    @Before
    public void setup() {

    }

    @Test
    public void testSomething() {
        assertThat(resources.client().resource("/hello").get(HelloThere.class).what)
                .isEqualTo("Hello world!");

    }
}
