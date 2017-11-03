package org.yakimovdenis.demoyakimovwebrtc.telemetry.appenders.log4j;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.yakimovdenis.demoyakimovwebrtc.telemetry.LoggingLevel;

@Data
@Configuration
@PropertySource("classpath:application.yml")
@ConfigurationProperties(prefix = "telemetry.log4j")
public class Log4jProperties {
    private Boolean debug;
    private Boolean info;
    private Boolean warn;
    private Boolean error;
    private Boolean fatal;

    boolean isEnabledForLevel(LoggingLevel level){
        switch (level){
            case DEBUG: return debug;
            case INFO: return info;
            case WARN: return warn;
            case ERROR: return error;
            case FATAL: return fatal;
            default: return false;
        }
    }


}
