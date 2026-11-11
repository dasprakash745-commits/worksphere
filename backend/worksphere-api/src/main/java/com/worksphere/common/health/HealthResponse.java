package com.worksphere.common.health;

import java.time.Instant;

public record HealthResponse(String status, String application, Instant timestamp) {
}