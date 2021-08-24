package com.basicjavamain;
import com.basiccore.*;

public class BasicJavaMain {

	public static void main(String[] args) {
		System.out.println("Welcome to basic java main");
		System.out.println("----------------------------------------");
		
		System.out.println("Flip Coin");
		FlipCoin flipCoin = new FlipCoin();
		flipCoin.flipCoinMethod();
		System.out.println("----------------------------------------");
		
		
	}

}
