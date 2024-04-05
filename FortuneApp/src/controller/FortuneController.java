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
	
	//운세를 수정
	public void updateFortune() {
		//수정하고 싶은 운세의 인덱스 값을 받아 옴
		int index=fortuneView.getUpdateIndex();
		//수정하고 싶은 운세 문자열을 받아 옴
		String fortuneStr=fortuneView.getUpdateStr();
		//인덱스 값을 가지고 배열에서 수정
		fortuneService.updateFortune(index, fortuneStr);
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
					//포춘 쿠키 열기(read)
					getFortune();
					break;
				case 2:
					//운세 저장 하기(create)
					putFortune();
					break;
				case 3:
					//운세 전체 출력
					getFortunes();
					break;
				case 4:
					//운세 수정 - 취소 메뉴도 추가하는게 좋다
					updateFortune();
					break;
			}
		}
	}
	
	//운세 저장(create)
	public void putFortune() {
		String fortuneStr=fortuneView.putFortune();
		//포춘 인스턴스 생성 및 배열에 저장
		fortuneService.createFortune(fortuneStr);
	}
	
	//운세 생성하는 메소드 - Create
	public void createFortune(String fortuneStr) {
		fortuneService.createFortune(fortuneStr);
	}
	
	//모든 운세 출력
	public void getFortunes() {
		fortuneView.getFortunes(fortuneService.getFortuneDtos());
	}
	
	//하나의 운세 출력(read)
	public void getFortune() {
		fortuneView.getFortune(fortuneService.getFortuneDtos());
	}
	
}


















