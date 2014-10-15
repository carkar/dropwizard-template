package com.carkar.dropwizard

import com.carkar.dropwizard.resources.HelloWorldResource
import io.dropwizard.Application
import io.dropwizard.setup.Bootstrap
import io.dropwizard.setup.Environment

class HelloWorld extends Application<HelloWorldConfiguration> {
    public static void main(String[] args) throws Exception {
        new HelloWorld().run(args)
    }

    @Override
    public void initialize(Bootstrap<HelloWorldConfiguration> bootstrap) {

    }

    @Override
    public String getName() {
        return "dropwizard-template";
    }

    @Override
    public void run(HelloWorldConfiguration configuration,
                    Environment environment) throws ClassNotFoundException {

        final HelloWorldResource resource = new HelloWorldResource();
        environment.jersey().register(resource)

    }
}
