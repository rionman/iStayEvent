package com.istay.istayevent.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.istay.istayevent.code.EventStatus;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;


@Data
@Builder
public class SmartLinkEvent {
    @NotEmpty
    private String cmd;
    @NotNull
    private EventStatus status;
    @NotEmpty
    private String siteId;
    private String spaceId;
    private String oldSpaceId;
    private String meta;
    @Data
    @Builder
    public static class Payload {
        private String rid;
        private String folioNo;
        private String roomType;
        private String type;
        @NotEmpty
        private String phone;
        @NotNull
        @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
        private LocalDateTime stayAfter;
        @NotNull
        @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
        private LocalDateTime stayBefore;
        private String email;
        private String name;
        private String firstName;
        private String middleName;
        private String lastName;
        private String title;
    }
}
