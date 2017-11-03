package org.yakimovdenis.demoyakimovwebrtc.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.yakimovdenis.demoyakimovwebrtc.telemetry.LoggingLevel;
import org.yakimovdenis.demoyakimovwebrtc.telemetry.TelemetryService;
import org.yakimovdenis.demoyakimovwebrtc.telemetry.appenders.Telemetry;
import org.yakimovdenis.demoyakimovwebrtc.telemetry.appenders.log4j.Log4jTelemetryImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
public class TelemetriesConfiguration {

    @Bean
    TelemetryService telemetryService(){
        List<Telemetry> telemetries = new ArrayList<>();
        telemetries.add(log4jTelemetry());
        return new TelemetryService(telemetries);
    }

    @Bean
    Log4jTelemetryImpl log4jTelemetry(){
        return new Log4jTelemetryImpl();
    }
}
