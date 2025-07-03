package castingTask;

import java.util.Scanner;

// 업 캐스팅, 다운 캐스팅
// 캐릭터, 오크, 요정, 휴먼 클래스를 생성
// 캐릭터는 몬스터를 사냥하는 메서드가 존재
// 몬스터 마다 각각 다른 전리품을 얻는다.
// 오크 : 가죽을 얻는다
// 요정 : 날개를 얻는다
// 휴먼 : 갑옷을 얻는다

// GameTask에서 사용자에게 몬스터를 입력 받아서 사냥을 수행하고,
// 몬스터에 맞는 전리품을 얻는다.

public class GameTask {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		Character hyunZzang = new Character("현우", "자동차 딜러");
		Monster[] monsters = {
			new Fairy("요정", 10, 1000),
			new Orc("오크", 100, 50),
			new Human("휴먼", 5, 10000)
		};
		String message = "사냥할 몬스터를 선택하세요.\n1.요정\n2.오크\n3.휴먼\n4.사냥 종료";
		
//		게임 제작 -> while문으로 교체
		System.out.println(message);
		choice = sc.nextInt();
		hyunZzang.hunt(monsters[choice - 1]);
		
		
	}
}

















