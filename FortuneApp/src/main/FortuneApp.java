package main;

import controller.FortuneController;
import service.FortuneRepository;

public class FortuneApp {
	
	public static void main(String[] args) {
		//앱 시작
		FortuneController fController=
				new FortuneController(new FortuneRepository());
//				new FortuneController(new FRepoFile());
		
		fController.runApp();
		
		//포춘 쿠키 열기
		//운세들을 많이 저장하고 랜덤으로 하나의 운세를 출력
		
	}

}
