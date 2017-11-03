package org.yakimovdenis.demoyakimovwebrtc.telemetry.appenders;

import org.yakimovdenis.demoyakimovwebrtc.telemetry.LogRecord;
import org.yakimovdenis.demoyakimovwebrtc.telemetry.LoggingLevel;

public interface Telemetry {
    String NEW_LINE_CHAR = System.lineSeparator();
    int STRING_BUILDER_SIZE = 200;

    String getTelemetryName();
    void log(LogRecord record);
    boolean isEnabledForLevel(LoggingLevel level);

    default String getMessageString(String message, Object object){
        StringBuilder builder = new StringBuilder(STRING_BUILDER_SIZE);
        if (message!=null){
            builder.append(message);
        }
        if (object!=null){
            builder.append(NEW_LINE_CHAR).append(object.toString());
        }
        return builder.toString();
    }
}
