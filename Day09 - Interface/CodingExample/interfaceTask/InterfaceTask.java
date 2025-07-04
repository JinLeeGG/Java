package interfaceTask;

// 취업
// 부모 : Developer 
// Developer extends 이규진(Lee), 채상훈(Chae), 황영진(Hwan), 권노은(kwon), 쏘니(Sonny), 김현우(Kim)

// 회사 
// 구글 : 이규진, 김현우
// 아마존 : 황영진, 권노은
// 토트넘 : 쏘니, 채상훈

// checkJobs(???){} 
// 구글에 입사한 개발자들의 이름만 추출
// 아니라면 타사 직원으로 출력
// 마커 인터페이스 사용
public class InterfaceTask {
	
	
//	public void checkJobs(Developer developer) {
//		if (developer instanceof GoogleMarker) {
//			developer.printName();
//		}
//		else {
//			System.out.println(developer.name + " 님은 타사 직원입니다.");
//		}
//	}
	
	public void checkJobs(Developer[] developers) {
//		빠른 for문
		System.out.println("===========구글 입사자===========");
		for(Developer developer: developers) {
			if(developer instanceof GoogleMarker) {
//				구글에 입사한 사람 2명
				if(developer instanceof Lee) {
					Lee lee = (Lee)developer;
					System.out.println(lee.name + "님은 구글 입사자 입니다.");
					lee.skills();
				}
				else if(developer instanceof Kim) {
					Kim kim = (Kim)developer;
					System.out.println(kim.name + "님은 구글 입사자 입니다.");
					kim.skills();
				}
				
				
			}else {
				System.out.println("타 회사: " + developer.name);
			}
		}
		System.out.println("===========구글 입사자===========");
	}
	
	public static void main(String[] args) {
		InterfaceTask it = new InterfaceTask();
		Developer[] developers = {
				new Chae("채상훈", "대학생", "한국어"),
				new Hwang("황영진", "대학생", "일본어"),
				new Kim("김현우", "대학생", "Python"),
				new Kwon("권노은", "대학생", "Python"),
				new Lee("이규진", "바이브코더", "curser"),
				new Sonny("박정호", "축구선수", "축구")
		};
		it.checkJobs(developers);
	}
}
