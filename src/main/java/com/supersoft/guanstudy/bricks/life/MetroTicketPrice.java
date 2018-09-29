package com.supersoft.guanstudy.bricks.life;

public class MetroTicketPrice {

	public static float calculateMonthlyFee(float singlePrice) {
		float sumMoney = 0;
		for (int i = 1; i <= 60; i++) {
			if (sumMoney <= 100) {
				sumMoney += singlePrice;
			} else if (sumMoney >= 100 && sumMoney <= 150) {
				sumMoney += singlePrice * 0.8;
			} else if (sumMoney >= 150 && sumMoney <= 400) {
				sumMoney += singlePrice * 0.5;
			} else {
				sumMoney += singlePrice;
			}
		}
		return sumMoney;
	}
}
