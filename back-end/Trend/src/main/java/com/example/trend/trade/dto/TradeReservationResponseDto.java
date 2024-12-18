package com.example.trend.trade.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class TradeReservationResponseDto {
    private int itemId;
    private String availableRentalStartDate;
    private String availableRentalEndDate;
    private String itemName;
    private int itemPrice;
    private String address;
    private String thumbnail;
    private String lessorNickname;
    private String lesseeNickname;
}
