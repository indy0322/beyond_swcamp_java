package com.ohgiraffers.section04.testapp.run;

import com.ohgiraffers.section04.testapp.aggregate.AccountStatus;
import com.ohgiraffers.section04.testapp.aggregate.BloodType;
import com.ohgiraffers.section04.testapp.aggregate.Member;
import com.ohgiraffers.section04.testapp.service.MemberService;

import java.io.File;
import java.util.Scanner;

public class Application {

    private static final MemberService ms = new MemberService();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("======= 회원 관리 프로그램 ======");
            System.out.println("1. 모든 회원 정보 보기");
            System.out.println("2. 회원 찾기");
            System.out.println("3. 회원 가입");
            System.out.println("4. 회원 정보 수정");
            System.out.println("5. 회원 탈퇴");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴를 선택해 주세요: ");
            int input = sc.nextInt();

            /* 설명.
             *  조회: find
             *  추가: regist
             *  수정: modify
             *  삭제: remove
            * */

            switch (input){
                case 1: ms.findAllMembers(); break;
                case 2: ms.findMemberBy(chooseMemNo()); break;
                case 3: ms.registMember(signup()); break;
                case 4: break;
                case 5: break;
                case 9:
                    System.out.println("프로그램을 종료하겠습니다.");
                    return;
                default:
                    System.out.println("번호를 잘못 입력하셨습니다.");
            }
        }
    }

    private static int chooseMemNo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("해당 회원 번호를 입력하세요: ");
        return sc.nextInt();
    }

    private static Member signup() {
        Member member = null;

        Scanner sc = new Scanner(System.in);
        System.out.print("아이디를 입력해 주세요: ");
        String id = sc.nextLine();

        System.out.print("패스워드를 입력하세요: ");
        String password = sc.nextLine();

        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();

        System.out.print("입력할 취미의 객수를 입력하세요(숫자는 1이상): ");
        int length = sc.nextInt();
        sc.nextLine(); // 버퍼 재거용
        String[] hobbies = new String[length];
        for(int i = 0;i < length;i++){
            System.out.println((i + 1) + " 번째 취미를 입력하세요.");
            hobbies[i] = sc.nextLine();
        }

        System.out.println("혈액형을 일벽하세요(A, AB, B, O): ");
        String bType = sc.nextLine();
        BloodType bt = null;
        switch (bType){
            case "A": bt = BloodType.A; break;
            case "AB": bt = BloodType.AB; break;
            case "B": bt = BloodType.B; break;
            case "O": bt = BloodType.O; break;
        }

        member = new Member(id, password, age, hobbies, bt);

        return member;
    }
}
