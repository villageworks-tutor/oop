package exercise01;

public class Uweight {

	final static int[][] priceList = {{30, 2800}, {10, 1200}, {0, 480}};
	int uweight;
	int price;
	
	Uweight(int num) {
		this.uweight = num;
	}

	public int getUweight() {
		return uweight;
	}

	public void setUweight(int uweight) {
		this.uweight = uweight;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice() {
		int i;
		for (i = 0; this.uweight < priceList[i][0]; i++) {
			continue;
		}
		this.price = priceList[i][1];
	}
	
}
