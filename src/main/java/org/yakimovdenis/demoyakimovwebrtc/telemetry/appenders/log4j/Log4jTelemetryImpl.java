package org.yakimovdenis.demoyakimovwebrtc.telemetry.appenders.log4j;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.yakimovdenis.demoyakimovwebrtc.telemetry.LogRecord;
import org.yakimovdenis.demoyakimovwebrtc.telemetry.LoggingLevel;
import org.yakimovdenis.demoyakimovwebrtc.telemetry.appenders.Telemetry;

import java.util.HashMap;
import java.util.Map;

@Component
public class Log4jTelemetryImpl implements Telemetry {
    private static final String NAME = "LOG4J";
    private Map<Class, Logger> loggers = new HashMap<>();

    @Autowired
    private Log4jProperties log4jProperties;

    @Override
    public String getTelemetryName() {
        return NAME;
    }

    public Log4jTelemetryImpl() {
        System.out.println(log4jProperties);
    }

    @Override
    public void log(LogRecord record) {
        Logger logger = getService(record.getClazz());
        Level level = Level.toLevel(record.getLevel().name(), Level.ALL);
        if (level != Level.ALL || logger.isEnabledFor(level)) {
            logger.log(level, getMessageString(record.getMessage(), record.getObject()), record.getThrowable());
        }
    }

    @Override
    public boolean isEnabledForLevel(LoggingLevel level) {
        return log4jProperties.isEnabledForLevel(level);
    }

    private Logger getService(Class clazz) {
        Logger logger = loggers.get(clazz);
        if (null == logger) {
            logger = Logger.getLogger(clazz);
            loggers.put(clazz, logger);
        }
        return logger;
    }
}
