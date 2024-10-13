package exercise01;

public class Ex11_AtoB55 {

	public static void main(String[] args) {
		int num_a = 1;
		int num_b = 10;
		int ans = 0;
		for (int i = num_a; i < num_b; ++i) {
			ans += i;
		}
		System.out.println(num_a + "と" + num_b + "は" + ans + "です。");
	}

}
