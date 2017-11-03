package org.yakimovdenis.demoyakimovwebrtc.telemetry;

import lombok.Data;

import java.util.Date;

@Data
public class LogRecord {
    private Class clazz;
    private LoggingLevel level;
    private String message;
    private Object object;
    private Throwable throwable;
    private Date timestamp;

    public LogRecord(Class clazz, LoggingLevel level, String message, Object object, Throwable throwable) {
        this.clazz = clazz;
        this.level = level;
        this.message = message;
        this.object = object;
        this.throwable = throwable;
        this.timestamp = new Date(System.currentTimeMillis());
    }
}
