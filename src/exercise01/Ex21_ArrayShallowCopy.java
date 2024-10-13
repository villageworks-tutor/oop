package exercise01;

public class Ex21_ArrayShallowCopy {

	public static void main(String[] args) {
	
		int[] a = {1,2,3};
		int[] b = a;
		String[] c = {"Hello ","Java ","World!"};
		String[] d = c;
		
		System.out.println("----- 配列参照（数値）のコピー -----(int[]b=a;)");
		System.out.println("配列a(" + a + ") : [" + a[0] + "," + a[1] + "," + a[2] + "]");
		System.out.println("配列b(" + b + ") : [" + b[0] + "," + b[1] + "," + b[2] + "]");
		
		a[0] = 9;
		a[1] = 8;
		a[2] = 7;
		
		System.out.println("-----配列 a の値を修正([1,2,3] → [9,8,7])、" + "配列 b はそのまま---");
		System.out.println("配列a(" + a + ") : [" + a[0] + "," + a[1] + "," + a[2] + "]");
		System.out.println("配列b(" + b + ") : [" + b[0] + "," + b[1] + "," + b[2] + "]");
		
		
		System.out.println("\n----- 配列参照（文字列）のコピー -----(String[]d=c;)");
		System.out.println("配列c(" + c + ") : [" + c[0] + "," + c[1] + "," + c[2] + "]");
		System.out.println("配列d(" + d + ") : [" + d[0] + "," + d[1] + "," + d[2] + "]");
		
		c[0] = "I ";
		c[1] = "Love ";
		c[2] = "Java!";
		
		System.out.println("-----配列 c の値を修正(Hello Java World! → " + "I love Java!)、配列 d はそのまま---");
		System.out.println("配列c(" + c + ") : [" + c[0] + "," + c[1] + "," + c[2] + "]");
		System.out.println("配列d(" + d + ") : [" + d[0] + "," + d[1] + "," + d[2] + "]");
	}
}
