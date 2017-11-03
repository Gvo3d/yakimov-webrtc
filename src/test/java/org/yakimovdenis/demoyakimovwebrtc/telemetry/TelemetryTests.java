package org.yakimovdenis.demoyakimovwebrtc.telemetry;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.yakimovdenis.demoyakimovwebrtc.WebRtcApplication;
import org.yakimovdenis.demoyakimovwebrtc.WebrtcApplicationTests;
import org.yakimovdenis.demoyakimovwebrtc.telemetry.appenders.log4j.Log4jProperties;
import org.yakimovdenis.demoyakimovwebrtc.telemetry.appenders.log4j.Log4jTelemetryImpl;

import static org.junit.Assert.*;

@ContextConfiguration(classes = WebRtcApplication.class)
public class TelemetryTests extends WebrtcApplicationTests {

    @Autowired
    private TelemetryService telemetryService;

    @Autowired
    private Log4jTelemetryImpl log4jTelemetry;

    @Autowired
    private Log4jProperties log4jProperties;

    @Test
    public void doLog4JPropertiesTest(){
        System.out.println(SEPARATOR);
        assertNotNull(log4jProperties);
        System.out.println("Properties: "+log4jProperties);
        assertNotNull(log4jTelemetry);
        assertEquals("LOG4J",log4jTelemetry.getTelemetryName());
        System.out.println("Name:"+log4jTelemetry.getTelemetryName());
        System.out.println("Debug level is enabled:"+log4jTelemetry.isEnabledForLevel(LoggingLevel.DEBUG));
        System.out.println("Info level is enabled:"+log4jTelemetry.isEnabledForLevel(LoggingLevel.INFO));
        System.out.println("Warn level is enabled:"+log4jTelemetry.isEnabledForLevel(LoggingLevel.WARN));
        System.out.println("Error level is enabled:"+log4jTelemetry.isEnabledForLevel(LoggingLevel.ERROR));
        System.out.println("Fatal level is enabled:"+log4jTelemetry.isEnabledForLevel(LoggingLevel.FATAL));
    }
}
