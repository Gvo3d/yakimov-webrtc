package org.yakimovdenis.demoyakimovwebrtc.telemetry;

public interface Loggable {
    default LogRecord getLogRecord(LoggingLevel level, String message, Object object, Throwable throwable) {
        return new LogRecord(this.getClass(), level, message, object, throwable);
    }

    default LogRecord getLogRecord(LoggingLevel level, String message, Throwable throwable) {
        return getLogRecord(level, message, (Object) null, throwable);
    }

    default LogRecord getLogRecord(LoggingLevel level, String message, Object object) {
        return getLogRecord(level, message, object, null);
    }

    default LogRecord getLogRecord(LoggingLevel level, String message) {
        return getLogRecord(level, message, (Object) null, null);
    }
}
