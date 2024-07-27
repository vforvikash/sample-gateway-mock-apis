package com.mock.api.config.props;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "mock")
@Data
public class MockResponseConfigProperties {

    private Map<String, String> response;

}
