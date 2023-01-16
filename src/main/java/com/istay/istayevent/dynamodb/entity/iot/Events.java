package com.istay.istayevent.dynamodb.entity;


import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@DynamoDBTable(tableName = "Events")
@AllArgsConstructor
@NoArgsConstructor
public class Events {

    



}
