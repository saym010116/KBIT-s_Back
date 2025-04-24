package ch12.sec03.exam05;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {
    private String no;
    private String name;
    private int age;
}
// structure 열어 보면 Getter, Setter, equals(), hashCode(), toString() 메서드 모두 있습니다.