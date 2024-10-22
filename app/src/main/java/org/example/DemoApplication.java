package org.example;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Environment;
import org.glassfish.jersey.CommonProperties;


public class DemoApplication extends Application<DemoConfiguration> {

    public static void main(String[] args) throws Exception {
        new DemoApplication().run(args);
    }

    @Override
    public String getName() {
        return "demo";
    }

    @Override
    public void run(DemoConfiguration config, Environment environment) throws Exception {
        environment.jersey().property(CommonProperties.FEATURE_AUTO_DISCOVERY_DISABLE, Boolean.FALSE);

        final var objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        objectMapper.setSerializationInclusion(JsonInclude.Include.ALWAYS);

        environment.jersey().register(DemoResource.class);
    }

}
