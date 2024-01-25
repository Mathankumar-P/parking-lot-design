package com.api.parkinglot.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class IssueTicketRequest {
    private String vehicleNumber;
    private Long gateId;
    private VehicleType vehicleType;
}