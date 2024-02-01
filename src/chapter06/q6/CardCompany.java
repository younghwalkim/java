package chapter06.q6;

public class CardCompany {

	// 필드
	private static CardCompany instance = new CardCompany();
	
	// 생성자
	private CardCompany() {}
	
	public static CardCompany getInstance() {
		if(instance == null )
			instance = new CardCompany();
		return instance;
	}
	
	// 카드번호 리턴 메소드
	public Card createCard() {
		
		Card card = new Card();
		return card;
	}
	
	
}