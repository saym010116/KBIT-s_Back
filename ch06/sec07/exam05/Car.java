package ch06.sec07.exam05;

public class Car { // Car라는 이름의 클래스 선언 (public: 다른 클래스에서도 접근 가능)
    //필드 선언
    String company = "현대자동차"; // 자동차 회사 이름 (기본값: "현대자동차")
    String model; // 자동차 모델명 (초기값 없음)
    String color; // 자동차 색상 (초기값 없음)
    int maxSpeed; // 자동차의 최고 속도 (초기값 없음)

    Car(){
        this.company = "현대자동차";
        this.model = "";
        this.color = "";
        this.maxSpeed = 0;
    }
    // 생성자1: model만 전달받는 생성자
    Car(String model){
        //공통 코드를 한 생성자에만 집중적으로 작성하고, 나머지 생성자는 this를 사용하여 공통 코드 가지고 있는 생성자 호출
        // 공통 생성자 호출: model은 전달받고, color는 "은색", maxSpeed는 250으로 고정
        this(model,"은색",250); // 다른 생성자를 호출함 (this(): 같은 클래스의 다른 생성자 호출)
    }
    // 생성자2: model, color를 전달받는 생성자
    Car(String model, String color){
        // 공통 생성자 호출: 전달받은 model, color를 사용하고, maxSpeed는 250으로 고정
        this(model,color,250);
    }
    // 생성자3: model, color, maxSpeed 모두를 전달받는 생성자
    Car(String model, String color, int maxSpeed){
        this.model=model; // 전달받은 model 값을 필드에 저장
        this.color=color;  // 전달받은 color 값을 필드에 저장
        this.maxSpeed=maxSpeed; // 전달받은 maxSpeed 값을 필드에 저장
    }
}
//example04 와의 차이
//example04: 각 생성자가 직접 필드를 초기화합니다. 중복 코드가 더 많이 발생하지만, 각 생성자에 해당하는 로직이 독립적으로 처리됩니다.
//example05:  this(model, color, maxSpeed) 방식으로 생성자 간 호출을 사용했습니다. 이를 통해 중복 코드를 줄이고, 공통 로직을 한 곳에 집중시켰습니다.