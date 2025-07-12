package market;

public class Market {
	
	int tomatoPrice;
	
	public Market() {;}

	public Market(int tomatoPrice) {
		this.tomatoPrice = tomatoPrice;
	}
	
	// 각 유저의 할인율별 토마토의 가격을 계산해주는 메서드
	// 모든 유저를 받을 수 있게 Person을 받게 한다.
	public void sell(Person person) {
		person.money = (int)(person.money - this.tomatoPrice * ((100 - person.discount) / (double)100));
	}
	
}
