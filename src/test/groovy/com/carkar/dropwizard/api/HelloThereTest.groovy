package com.carkar.dropwizard.api

import static io.dropwizard.testing.FixtureHelpers.*;
import com.fasterxml.jackson.databind.ObjectMapper
import io.dropwizard.jackson.Jackson
import org.junit.Test

import static org.fest.assertions.api.Assertions.assertThat

/**
 * Created by calle on 15/10/14.
 */
class HelloThereTest {

    private static final ObjectMapper MAPPER = Jackson.newObjectMapper();

    @Test
    public void serializesToJSON() throws Exception {
        final HelloThere helloThere = new HelloThere(what: "Hello World!")
        assertThat(MAPPER.writeValueAsString(helloThere))
                .isEqualTo(fixture("fixtures/helloThere.json"));
    }

}
