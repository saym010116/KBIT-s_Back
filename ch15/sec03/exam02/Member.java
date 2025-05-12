package ch15.sec03.exam02;
// Set에 저장하기 위한 클래스로 만들라 -> 같은 데이터를 가진 객체를 중복저장하지 않게 하라
// why? Set은 중복을 허용하지 않은 컬렉션
// so, 사용자 정의 클래스(Member)을 넣을 때는 "어떤 객체가 같은 객체인지"를 스스로 정의해줘야함 -> equals()와 hashcode()를 오버라이드
public class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // hashCode 재정의
    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    // equals 재정의
    @Override
    public boolean equals(Object obj) { //Object의 equals() 메서드를 오버라이드 하는 것. 모든 객체끼리 비교할 수 있게 하기 위해 Object를 매개변수로 받음
        if(obj instanceof Member target) { // 전달받은 객체가 Member 클래스인지 확인, 패턴 매칭(instanceof MEmber target) 문법을 사용하여 자동으로 형변환 수행
            return target.name.equals(name) && (target.age == age); // 두 객체의 name이 같은지 비교, 두 객체의 age 값이 같은지도 비교
        }else{
            return false;
        }
    }


}
