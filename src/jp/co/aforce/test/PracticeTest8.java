package jp.co.aforce.test;

public class PracticeTest8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		printHello();
		printRandomMessage();
		//		printMessage("Hello");
		printMessage("Hello", 5);
		printRectangleArea(4.0, 5.0);
		String str = getWeatherForecast();
		boolean bool  = isEvenNumber(50);
		String s = getMessage(true,"まみ");

	}

	//練習問題6
	private static String getWeatherForecast() {
		int r = (int) (4 * Math.random());
		int n = (int) (4 * Math.random());

		String[] day = { "今日", "明日", "明後日" };
		String[] weather = { "晴れ", "曇り", "雨", "雪" };

		String str = day[r] + "の天気は" + weather[n] + "でしょう。";

		System.out.println(day[r] + "の天気は" + weather[n] + "でしょう。");
		return str;
	}
	//練習問題7

	public static boolean isEvenNumber(int value){
		if(value % 2 == 0) {
		return true;
		}else {
		return false;
		}
	}
	//練習問題8
	private static String getMessage(boolean iskid,String name) {
		if(iskid == true) {
			String s = "こんにちは" + name + "ちゃん";
			return s;
		}else {
			String s = "こんにちは" + name + "さん";
			return s;
		}
	}



	//練習問題5
	private static void printRectangleArea(double width, double height) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(width * height);

	}

	private static void printHello() {
		System.out.println("Hello");
	}

	private static void printRandomMessage() {
		int n = (int) (3 * Math.random());
		if (n == 0) {
			System.out.println("こんばんは");
		} else if (n == 1) {
			System.out.println("こんにちは");
		} else {
			System.out.println("おはよう");
		}
	}

	//練習問題3&4
	private static void printMessage(String message, int count) {

		// TODO 自動生成されたメソッド・スタブ
		System.out.println(message);

		for (int i = 0; i < count; i++) {
			System.out.println(message);
		}
	}

}
