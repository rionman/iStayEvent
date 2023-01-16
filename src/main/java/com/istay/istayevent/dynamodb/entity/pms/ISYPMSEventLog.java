package com.istay.istayevent.dynamodb.entity.pms;


import com.amazonaws.services.dynamodbv2.datamodeling.*;
import com.istay.istayevent.code.EventStatus;
import com.istay.istayevent.dynamodb.converter.LocalDateDynamoDBConverter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@Setter
@Getter
@DynamoDBTable(tableName = "ISYPMSEventLogBook")
@AllArgsConstructor
@NoArgsConstructor
public class ISYPMSEventLogBook {


    @DynamoDBHashKey(attributeName = "siteid")
    private String siteId;

    @DynamoDBRangeKey(attributeName = "logdate")
    @DynamoDBTypeConverted(converter = LocalDateDynamoDBConverter.class)
    private LocalDateTime logDate;

    @DynamoDBAttribute
    private String dump;

    @DynamoDBAttribute
    private String linkFrom;

    @DynamoDBAttribute
    private String linkType;

    @DynamoDBAttribute
    private Payload payload;

    @Setter
    @Getter
    @DynamoDBDocument
    public static class Payload {
        @DynamoDBAttribute
        private String name;

        @DynamoDBAttribute
        private String stayAfter;

        @DynamoDBAttribute
        private String stayBefore;
    }

    @DynamoDBAttribute
    @DynamoDBTypeConvertedEnum
    private EventStatus status;

    @DynamoDBAttribute
    private String stayAfter;

    @DynamoDBAttribute
    private String stayBefore;
}
