package exercise01;

public class Usize {
	
	final static int[][] priceList = {{120, 1280}, {60, 900}, {0, 400}};
	int usize;
	int price;
	
	Usize(int num) {
		this.usize = num;
	}
	
	int getUsize() {
		return this.usize;
	}
	
	void setUsize(int num) {
		this.usize = num;
	}
	
	int getPrice() {
		return this.price;
	}
	
	void setPrice() {
		int i;
		// テキストではforブロックが省略されているが、誤解を招きやすいので、以下に書き換えておく
		
		for (i = 0; this.usize < priceList[i][0]; i++) {
			continue;
		}
		this.price = priceList[i][1];
	}
	
}
