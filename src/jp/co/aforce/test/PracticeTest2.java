package jp.co.aforce.test;

public class PracticeTest2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int x = 10;
		int y = 28;
		double z = 3.14;

		//練習問題1
		System.out.println(x * y);

		//練習問題2
		System.out.println(y / x);
		System.out.println(y % x);

		//練習問題3
		double total = (x * y);
		System.out.println(total);

		//練習問題4
		System.out.println(total += 1);

		//練習問題5
		int age = 21;
		int randomNumber = new java.util.Random().nextInt(100);

		System.out.println("randomNumber =" +randomNumber);

		if(age > randomNumber) {
			System.out.println("私のほうが年上です");

		}else if(age < randomNumber) {
			System.out.println("私のほうが年下です");
		}else {
		System.out.println("私と同い年です");
		}
	}

}
