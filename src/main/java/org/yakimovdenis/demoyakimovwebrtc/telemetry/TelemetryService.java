package org.yakimovdenis.demoyakimovwebrtc.telemetry;

import org.springframework.stereotype.Service;
import org.yakimovdenis.demoyakimovwebrtc.telemetry.appenders.Telemetry;

import java.util.*;

@Service
public class TelemetryService {
    private List<Telemetry> telemetries;

    public TelemetryService(List<Telemetry> telemetries) {
        this.telemetries = telemetries;
    }

    public void log(LogRecord record) {
        telemetries.stream().filter(x->x.isEnabledForLevel(record.getLevel())).forEach(telemetry -> telemetry.log(record));
    }

    public void log(LogRecord record, String[] telemetryNamesForExclusion) {
        telemetries.stream().filter(telemetry -> {
            boolean result = true;
            for (String exclusion : telemetryNamesForExclusion) {
                if (telemetry.getTelemetryName().equals(exclusion)) {
                    result = false;
                }
            }
            return result;
        }).forEach(telemetry -> telemetry.log(record));
    }
}
