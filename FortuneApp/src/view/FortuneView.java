package view;

import java.util.Scanner;

//콘솔 View를 담당하는 클래스
public class FortuneView {
	
	private Scanner scanner=new Scanner(System.in);
	
	public int getMenu() {
		System.out.println("포운 쿠키 콘솔 앱입니다.");
		System.out.println("0.종료");
		System.out.println("1.포춘 쿠키 열기");
		System.out.print("메뉴 선택:");
		int choice=-1;
		choice=scanner.nextInt();
		scanner.nextLine();
		return choice;
	}

}







