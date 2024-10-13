package exercise01;

public class Ex22_ArrayShallowCopy {

	public static void main(String[] args) {
		
		int[] a = {1,2,3};
		int[] b = (int[])a.clone();
		String[] c = {"Hello ","Java ","World!"};
		String[] d = (String[])c.clone();
		SrcNum[] e = {new SrcNum(4), new SrcNum(5), new SrcNum(6)};
		SrcNum[] f = (SrcNum[])e.clone();

		System.out.println("----- 配列参照（数値）のシャローコピー -----(int[]b=a.clone();)");
		System.out.println("配列a(" + a + ") : [" + a[0] + "," + a[1] + "," + a[2] + "]");
		System.out.println("配列b(" + b + ") : [" + b[0] + "," + b[1] + "," + b[2] + "]");
		
		a[0] = 9;
		a[1] = 8;
		a[2] = 7;
		
		System.out.println("-----配列 a の値を修正([1,2,3] → [9,8,7])、" + "配列 b はそのまま---");
		System.out.println("配列a(" + a + ") : [" + a[0] + "," + a[1] + "," + a[2] + "]");
		System.out.println("配列b(" + b + ") : [" + b[0] + "," + b[1] + "," + b[2] + "]");
		
		
		System.out.println("\n----- 配列参照（文字列）のシャローコピー -----(String[]d=c.clone();)");
		System.out.println("配列c(" + c + ") : [" + c[0] + "," + c[1] + "," + c[2] + "]");
		System.out.println("配列d(" + d + ") : [" + d[0] + "," + d[1] + "," + d[2] + "]");
		
		c[0] = "I ";
		c[1] = "Love ";
		c[2] = "Java!";
		
		System.out.println("-----配列 c の値を修正(Hello Java World! → " + "I love Java!)、配列 d はそのまま---");
		System.out.println("配列c(" + c + ") : [" + c[0] + "," + c[1] + "," + c[2] + "]");
		System.out.println("配列d(" + d + ") : [" + d[0] + "," + d[1] + "," + d[2] + "]");
		
		System.out.println("\n----- オブジェクト配列のシャローコピー -----(SrcNum[]f=e.clone())");
		System.out.println("オブジェクト配列e(" + e + ") : " + "e[0](" + e[0] + ")=" + e[0].getNum() + " , e[1](" + e[1] + ")=" + e[1].getNum() + " , e[2](" + e[2] + ")=" + e[2].getNum());
		System.out.println("オブジェクト配列f(" + f + ") : " + "f[0](" + f[0] + ")=" + f[0].getNum() + " , f[1](" + f[1] + ")=" + f[1].getNum() + " , f[2](" + f[2] + ")=" + f[2].getNum());
		
		e[0].setNum(7);
		e[1].setNum(8);
		e[2].setNum(9);
		
		System.out.println("-----オブジェクト配列 e の値を修正(e[].num:4,5,6→7,8,9)、オブジェクト配列fはそのまま---");
		System.out.println("オブジェクト配列e(" + e + ") : " + "e[0](" + e[0] + ")=" + e[0].getNum() + " , e[1](" + e[1] + ")=" + e[1].getNum() + " , e[2](" + e[2] + ")=" + e[2].getNum());
		System.out.println("オブジェクト配列f(" + f + ") : " + "f[0](" + f[0] + ")=" + f[0].getNum() + " , f[1](" + f[1] + ")=" + f[1].getNum() + " , f[2](" + f[2] + ")=" + f[2].getNum());
		
	}

}
