package com.example.dotheG.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ActivityResponseDto {
    private Long activityId;
    private String activityName;
    private byte[] activityImage;
}
