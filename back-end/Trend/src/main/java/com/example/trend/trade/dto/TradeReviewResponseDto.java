package com.example.trend.trade.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TradeReviewResponseDto {
    private int itemId;
    private String itemName;
    private int itemPrice;
    private String address;
    private String thumbnail;
}
