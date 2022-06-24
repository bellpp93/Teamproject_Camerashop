package com.shop.validate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class registNumberValidator implements ConstraintValidator<registNumberValid, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return false;
        }

        boolean isValid = true;

        // 곱해지는 수 배열 구성
        int[] chk = { 2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5 };

        // - check~!!!
        // 곱셈 연산 후 누적합
        int tot = 0;

        if (value.length() != 14) {
            return false;
        }

        // 확인
        // System.out.println(">> 자릿수 적합~!!!");

        for (int i = 0; i < chk.length; i++) {
            if (i == 6)
                continue;

            tot += chk[i] * Integer.parseInt(value.substring(i, (i + 1)));
        }

        // -- 여기까지 수행하면 ① 과 ② 를 모두 끝낸 상황이며
        // 규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한 값은
        // 변수 tot 에 담겨있는 상태가 된다.
        int su = 11 - tot % 11;

        // -------
        // ----------
        // 확인
        // System.out.println(su);
        // --==>> 11

        // 최종 결과 출력 이전에 추가 연산 필요~!!!
        // -> su에 대한 연산 결과가 두 자리로 나올 경우
        // 주민번호 마지막 자릿수와 비교할 수 없는 상황
        if (su >= 10) {
            su %= 10;
        }

        // -- 여기까지 수행하면 ③ 과 ④ 를 모두 끝낸 상황이며
        // 최종 연산 결과는 변수 su 에 담겨있는 상황이 된다.
        // 최종 결과 출력
        if (su != Integer.parseInt(value.substring(13))) {
            isValid = false;
        }

        return isValid;
    }
}
