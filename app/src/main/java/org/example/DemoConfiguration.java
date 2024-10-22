package org.example;

import io.dropwizard.core.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DemoConfiguration extends Configuration {

    @JsonProperty("server")
    private ServerConfiguration server;

    @JsonProperty("logging")
    private LoggingConfiguration logging;

    public ServerConfiguration getServer() {
        return server;
    }

    public void setServer(ServerConfiguration server) {
        this.server = server;
    }

    public LoggingConfiguration getLogging() {
        return logging;
    }

    public void setLogging(LoggingConfiguration logging) {
        this.logging = logging;
    }

    public static class ServerConfiguration {
        @JsonProperty("applicationConnectors")
        private ConnectorConfiguration[] applicationConnectors;

        @JsonProperty("adminConnectors")
        private ConnectorConfiguration[] adminConnectors;

        public ConnectorConfiguration[] getApplicationConnectors() {
            return applicationConnectors;
        }

        public void setApplicationConnectors(ConnectorConfiguration[] applicationConnectors) {
            this.applicationConnectors = applicationConnectors;
        }

        public ConnectorConfiguration[] getAdminConnectors() {
            return adminConnectors;
        }

        public void setAdminConnectors(ConnectorConfiguration[] adminConnectors) {
            this.adminConnectors = adminConnectors;
        }
    }

    public static class ConnectorConfiguration {
        @JsonProperty("type")
        private String type;

        @JsonProperty("port")
        private int port;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getPort() {
            return port;
        }

        public void setPort(int port) {
            this.port = port;
        }
    }

    public static class LoggingConfiguration {
        @JsonProperty("level")
        private String level;

        @JsonProperty("appenders")
        private AppenderConfiguration[] appenders;

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public AppenderConfiguration[] getAppenders() {
            return appenders;
        }

        public void setAppenders(AppenderConfiguration[] appenders) {
            this.appenders = appenders;
        }
    }

    public static class AppenderConfiguration {
        @JsonProperty("type")
        private String type;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
}
