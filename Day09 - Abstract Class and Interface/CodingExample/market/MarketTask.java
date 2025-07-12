package market;

public class MarketTask {
	
//	이름	: User1, User2, User3, User4, User5
//	각각 20_000원을 가지고 있다.
//	할인율: 5%	 10%	20%	 	50%		15%
//	마켓에 tomato의 가격이 3_000원이다. 각각 유저의 할인율을 적용해서 판매하시오
//	public void sell() {}
//	각 유저의 잔액을 출력하시오 
	
	public static void main(String[] args) {
		Market market = new Market(3000);
		
		User1 user1 = new User1("홍길동", 20, 20000, 5);
		User2 user2 = new User2("장보고", 32, 20000, 20);
		User3 user3 = new User3("이순신", 25, 20000, 50);
		
		
		market.sell(user1);
		market.sell(user2);
		market.sell(user3);
		
		System.out.println(user1.money);
		System.out.println(user2.money);
		System.out.println(user3.money);
		
	}
	
}