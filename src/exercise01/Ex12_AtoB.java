package exercise01;

class Num {
	int num;
	
	Num(int n) {
		this.num = n;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public int addNum(int n) {
		this.num += n;
		return this.num;
	}
}

public class Ex12_AtoB {

	public static void main(String[] args) {
		Num a = new Num(Integer.parseInt(args[0]));
		Num b = new Num(Integer.parseInt(args[1]));
		Num ans = new Num(0);
		
		for (int i = a.getNum(); i < b.getNum(); i++) {
			ans.addNum(i);
		}
		
		System.out.println(a.getNum() + "から" + b.getNum() + "は" + ans + "です。");
		
	}

}
