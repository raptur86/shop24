package com.shop.Dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemImgDto {
    private Long id;
    private String imgName; // 이미지 이름 ( DB저장)
    private String imgUrl; // 이미지 경로
    private String originalName;// 이미지 원본 이름
    private String repImgYn; // 대표이미지 설정


}
