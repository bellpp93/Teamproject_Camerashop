package com.shop.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import com.shop.validate.registNumberValid;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Getter @Setter
public class MemberFormDto {

    @NotBlank(message = "이름은 필수 입력 값입니다.")
    private String name;

    @NotEmpty(message = "이메일은 필수 입력 값입니다.")
    @Email(message = "이메일 형식으로 입력해주세요.")
    private String email;

    @NotEmpty(message = "비밀번호는 필수 입력 값입니다.")
    @Length(min=8, max=16, message = "비밀번호는 8자 이상, 16자 이하로 입력해주세요")
    private String password;

    @NotEmpty(message = "주소는 필수 입력 값입니다.")
    private String address;

    @NotEmpty(message = "상세주소는 필수 입력 값입니다.")
    private String addressDetail;

    @NotEmpty(message = "주민등록번호 필수 입력 값입니다.")
    @registNumberValid(message = "올바른 주민등록번호가 아닙니다.")
    private String registNumber;

    @NotEmpty(message = "닉네임 필수 입력 값입니다.")
    private String nickname;

    @NotEmpty(message = "성별 필수 입력 값입니다.")
    private String sex;
}
