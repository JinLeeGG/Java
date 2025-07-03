package castingTask1;
// 넷플릭스
// 애니메이션, 영화, 드라마 클래스 선언
// 사용자가 선택한 영상이 애니메이션이라면 "자막 지원" 기능 사용
// 영화라면 "4D" 기능 사용
// 드라마라면 "굿즈" 기능을 사용

public class CastingTask1 {
	
	public void checkVideo(Video video) {
		if(video instanceof Drama) {
			Drama drama = (Drama)video;
			drama.goods();
		}
		else if(video instanceof Animation) {
			Animation animation = (Animation)video;
			animation.subtitle();
		}else if(video instanceof Movie) {
			Movie movie = (Movie)video;
			movie.shakeChair();
		}
	}
	
	public static void main(String[] args) {
      CastingTask1 ct = new CastingTask1();
      ct.checkVideo(new Drama());
      ct.checkVideo(new Animation());
      ct.checkVideo(new Movie());
	}

	
}
