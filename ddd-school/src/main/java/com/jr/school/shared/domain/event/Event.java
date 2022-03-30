package com.jr.school.shared.domain.event;

import java.time.LocalDateTime;
import java.util.Map;

public interface Event {

    LocalDateTime moment();

    EventType type();

    Map<String, Object> informations();
}
