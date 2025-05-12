package ch15.sec06.exam01;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor // 모든 필드 초기화 생성자 자동 생성
@Getter              // 모든 필드의 getter 자동 생성
public class Coin {
    private int value;
}
