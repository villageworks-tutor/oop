package exercise01;

public class Ukyori {

	final static int[][] rateList = {{900, 200}, {500, 30}, {300, 20}, {100, 10}, {50, 5}, {0, 100}};
	int ukyori;
	double rate;
	
	Ukyori(int num) {
		this.ukyori = num;
	}

	public int getUkyori() {
		return ukyori;
	}

	public void setUkyori(int ukyori) {
		this.ukyori = ukyori;
	}

	public double getRate() {
		return this.rate;
	}

	public void setRate() {
		int i = 0;
		for (i = 0; this.ukyori < rateList[i][0]; i++) {
			continue;
		}
		this.rate = rateList[i][1] / 100l; 
	}
	
}
