package chapter06.q6;

public class Card {

	// 필드
	private int cardNumber;
	private static int serialNum = 10000;
	
	// 생성자
	Card(){
		serialNum++;		// 카드번호 증가
		cardNumber = serialNum;
	}

	// getter & setter
	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

}