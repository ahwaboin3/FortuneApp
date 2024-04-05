package controller;

import service.FortuneService;
import view.FortuneView;

public class FortuneController {
	private FortuneView fortuneView;
	private FortuneService fortuneService;
	
	public FortuneController(FortuneService fortuneService) {
		this.fortuneView=new FortuneView();
		this.fortuneService = fortuneService;
	}
	
	//앱 시작
	public void runApp() {
		int choice;
		while(true) {
			//메뉴 보이기
			choice=fortuneView.getMenu();
			//메뉴에 따라 기능 분기 하기
			switch(choice) {
				case 0:
					return;
				case 1:
					//포춘 쿠키 열기
					System.out.println("준비중...");
					break;
			
			}
		}
	}
	//운세 생성하는 메소드 - Create
	public void createFortune(String fortuneStr) {
		fortuneService.createFortune(fortuneStr);
	}
	
}


















