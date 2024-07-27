package com.mock.api.config.props;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "mockgateway")
@Data
public class GatewayMockConfigProperties {

    private String name;

    private String apiGatewayHost;
    private String mockServiceHost;

    private List<Api> apis;

    @Data
    public static class Api {
        private String mockName;
        private int order;
        private int delay;
        private boolean mockEnabled;
        private boolean responseFile;
        private String mockResponse;
        private int mockResponseStatus;
        private String endpointCheck;
        private HttpMethod httpMethod;
        private MockResponseByMethod mockResponseByMethod;
        private MockResponseMapper mockResponseMapper;
    }

    @Data
    public static class MockResponseByMethod {
        private String[] delete;
        private String[] put;
        private String[] post;
    }

    @Data
    public static class MockResponseMapper {
        // body, param, path
        private String type;
        private String mapperKey;
        private String path;

    }

}
