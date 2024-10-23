package org.example;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Environment;


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
//        environment.jersey().property(CommonProperties.FEATURE_AUTO_DISCOVERY_DISABLE, Boolean.FALSE);

        environment.jersey().register(new DemoResource());

    }

}
