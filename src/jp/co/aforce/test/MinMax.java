package jp.co.aforce.test;

public class MinMax {

	int getMaxValue(int a, int b, int c) {
		int ans;

		ans = a;
		if(ans < b)ans = b;
		if(ans < c)ans = c;

		return ans;
	}
	int getMinValue(int a, int b, int c) {
		int ans ;

		ans = a;
		if(ans > b)ans = b;
		if(ans > c)ans = c;

		return ans;

	}



}
