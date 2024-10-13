package exercise01;

public class Ex23_ObjectShallowCopy {

	public static void main(String[] args) {
		SrcObject a = new SrcObject(123,"Hello Java World!");
		 SrcObject b = (SrcObject)a.clone();
		
		 System.out.println("\n----- オブジェクトのシャローコピー -----(SrcObject b=a.clone())");
		 System.out.println("オブジェクトa(" + a + ") : [" + "num(" + a.getRefNum() + ")=" + a.getRefNum().getNum() + " , str(" + a.getRefStr() + ")=" + a.getRefStr().getStr() + "]");
		 System.out.println("オブジェクトb(" + b + ") : [" + "num(" + b.getRefNum() + ")=" + b.getRefNum().getNum() + " , str(" + b.getRefStr() + ")=" + b.getRefStr().getStr() + "]");
		 
		 a.getRefNum().setNum(456);
		 a.getRefStr().setStr("I Love Java!");
		 
		 System.out.println("-----オブジェクト a の値を修正(num:123→456,str:Hello Java World!→I Love Java!)、" + "オブジェクトbはそのまま---");
		 System.out.println("オブジェクトa(" + a + ") : [" + "num(" + a.getRefNum() + ")=" + a.getRefNum().getNum() + " , str(" + a.getRefStr() + ")=" + a.getRefStr().getStr() + "]");
		 System.out.println("オブジェクトb(" + b + ") : [" + "num(" + b.getRefNum() + ")=" + b.getRefNum().getNum() + " , str(" + b.getRefStr() + ")=" + b.getRefStr().getStr() + "]");
	}

}
