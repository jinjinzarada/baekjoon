package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {



	public void practice5() {
		
	}
//		아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
//		로그인 성공 시 “로그인 성공”,
//		아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
//		비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요.
		
		

	public void practice4() {
//4. 수업 자료(7page)에서 if문으로 되어있는 봄, 여름, 가을, 겨울 예제를 switch문으로 바꿔서 출력하세요.

		Scanner sc = new Scanner(System.in);
		System.out.print("1~12사이의 정수 입력 : ");

		int month = sc.nextInt();
		String season = "잘못 입력된 달입니다.";

		switch (month) {
		case 1:
		case 2:
		case 12:
			season = "겨울";
			System.out.println(month + "월은 " + season + "입니다.");
			break;
		case 3:
		case 4:
		case 5:
			season = "봄";
			System.out.println(month + "월은 " + season + "입니다.");
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			System.out.println(month + "월은 " + season + "입니다.");
			break;
		case 9:
		case 10:
		case 11:
			season = "가을";
			System.out.println(month + "월은 " + season + "입니다.");
			break;
		default:
			System.out.println(month + "월은 " + "잘못 입력된 달입니다.");
			break;

		}
	}

	public void practice2() {
// 2. 키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고
//짝수가 아니면 “홀수다“를 출력하세요.양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한개 입력해 주세요.");
		int number = sc.nextInt();

		if (number % 2 == 0) {
			System.out.println("짝수다");
		} else if ((number % 2) == 1) {
			System.out.println("홀수다");
		} else {
			System.out.println("양수만 입력해주세요.");

		}

	}

	public void practice1() {
//	1. 아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를, 
//		종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("1.입력 \n" + "2.수정 \n" + "3.조회 \n" + "4.삭제 \n" + "7.종료 \n" + "메뉴 번호를 입력하세요 : ");

		int num = sc.nextInt();
		String menu = "";

		switch (num) {
		case 1:
			menu = "입력";
			System.out.println(menu + " 메뉴입니다.");
			break;
		case 2:
			menu = "수정";
			System.out.println(menu + " 메뉴입니다.");
			break;
		case 3:
			menu = "조회";
			System.out.println(menu + " 메뉴입니다.");
			break;
		case 4:
			menu = "삭제";
			System.out.println(menu + " 메뉴입니다.");
			break;
		case 7:
			menu = "종료";
			System.out.println("프로그램이 " + menu + "됩니다.");
			break;
		default:
			break;
		}

	}

}
