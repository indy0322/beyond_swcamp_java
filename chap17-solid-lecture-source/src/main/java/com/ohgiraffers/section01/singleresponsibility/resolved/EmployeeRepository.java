package com.ohgiraffers.section01.singleresponsibility.resolved;

public class EmployeeRepository {
    public void save(Employee emp) {
        validateEmployeeDate(emp);
    }

    /* 설명. 유효성 검사 내지는 메소드에서 호출하는 나만 쓰는 메소드는 외부에 노출하지 않는다. */
    private void validateEmployeeDate(Employee emp) {
        if(emp == null){
            throw new IllegalArgumentException("직원 정보가 null일 수 없습니다.");
        }
    }
}
