package com.codestates.coffee;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.*;

public class CoffeePostDto {
    @NotBlank(message = "한글 이름은 공백이 아니어야 합니다.")
    private String korName;

    @NotBlank(message = "영어 이름은 공백이 아니어야 합니다.")
    @Pattern(regexp = "^[A-Za-z](\\s?[A-Za-z])*$",
            message = "영문자만 가능하며, 단어 사이 한 칸 공백만 포함됩니다.")
    private String engName;

    @Range(min = 100, max = 50000,
            message = "100원 이상 50000원 이하 가격을 입력해주세요.")
    private int price;

    public String getKorName() {
        return korName;
    }

    public void setKorName(String korName) {
        this.korName = korName;
    }

    public String getEngName() {
        return engName;
    }

    public void setEngName(String engName) {
        this.engName = engName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
