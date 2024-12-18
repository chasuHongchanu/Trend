package com.example.trend.item.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ItemRequestDto {
    private Integer itemId;

    @NotBlank(message="이름은 필수 값입니다.")
    private String itemName;

    private String userId;

    private List<MultipartFile> itemImages;

    private int itemPrice;

    private String itemMainCategory;

    private String itemSubCategory;

    private String itemSubsubCategory;

    private double latitude;

    private double longitude;

    private String address;

    private String itemContent;

    @NotBlank(message="시작 날짜는 필수 값입니다.")
    private String availableRentalStartDate;

    @NotBlank(message="종료 날짜는 필수 값입니다.")
    private String availableRentalEndDate;

    private List<String> itemImageNames;

    private String itemStatus;
}
