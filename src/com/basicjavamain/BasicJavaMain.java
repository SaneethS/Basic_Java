package com.basicjavamain;
import com.basiccore.*;

public class BasicJavaMain {

	public static void main(String[] args) {
		System.out.println("Welcome to basic java main");
		System.out.println("----------------------------------------");
		
		//only one can program can run at a time so comment others while running.
		//Eg : while running flipcoin comment leapyear
		
//		FlipCoin flipCoin = new FlipCoin();
//		flipCoin.flipCoinMethod();
		
		
		LeapYear leapYear = new LeapYear();
		leapYear.leapYearMethod();
		
	}

}
