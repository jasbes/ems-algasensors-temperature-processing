package com.algaworks.algasensors.temperature.processing.common;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UUIDv7Utils {

    public static OffsetDateTime extractOffsetDateTime(UUID uuid) {
        if (uuid == null) {
            return null;
        }

        long timestamp = uuid.getMostSignificantBits() >>> 16;

        return OffsetDateTime.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault());
    }
}
