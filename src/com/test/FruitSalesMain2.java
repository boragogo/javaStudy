package com.test;

public class FruitSalesMain2 {

	public static void main(String[] args) {
		
		FruitsSeller seller1 = new FruitsSeller();
		seller1.initMembers(0, 30, 1500);
		
		FruitsSeller seller2 = new FruitsSeller();
		seller2.initMembers(0, 20, 1000);
		
		FruitsBuyer buyer = new FruitsBuyer();
		buyer.buyApple(seller1, 4500);
		buyer.buyApple(seller2, 2000);
		
		System.out.println("# 판매자1");
		seller1.showSaleResult();
		System.out.println();
		
		System.out.println("# 판매자2");
		seller2.showSaleResult();
		System.out.println();
		
		System.out.println("# 구매자 현황");
		buyer.showBuyResult();
	}
}

class FruitsSeller {
	int numOfApple;
	int myMoney;
	int APPLE_PRICE;
	
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	
	public void showSaleResult() {
		System.out.println("남은 사과 : " + numOfApple);
		System.out.println("판매 수익 : " + myMoney);
	}
	
	public void initMembers(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;
	}
}

class FruitsBuyer {
	int myMoney = 10000;
	int numOfApple = 0;
	
	public void buyApple(FruitsSeller seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	
	public void showBuyResult() {
		System.out.println("사과 개수 : " + numOfApple);
		System.out.println("현재 잔액 : " + myMoney);
	}
}