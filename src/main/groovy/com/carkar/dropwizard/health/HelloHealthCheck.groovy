package com.carkar.dropwizard.health

import com.codahale.metrics.health.HealthCheck
import com.codahale.metrics.health.HealthCheck.Result

class HelloHealthCheck extends HealthCheck {

    @Override
    protected Result check() throws Exception {
        return Result.healthy("Everything OK!")
    }
}
