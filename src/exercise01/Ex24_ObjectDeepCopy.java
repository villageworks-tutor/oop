package exercise01;

public class Ex24_ObjectDeepCopy {

	public static void main(String[] args) {
		SrcObject a = new SrcObject(123, "Hello Java World!");
		SrcObject b = (SrcObject)a.clone();
		
		System.out.println("----- オブジェクトのディープコピー ---（SrcObject b = a.clone()）");
		System.out.println("オブジェクトa(" + a + "):[" + "num(" + a.getRefNum() + ")=" + a.getRefNum().getNum() + ", str(" + a.getRefStr() + ")=" + a.getRefStr().getStr() + "]");
		System.out.println("オブジェクトb(" + b + "):[" + "num(" + b.getRefNum() + ")=" + b.getRefNum().getNum() + ", str(" + b.getRefStr() + ")=" + b.getRefStr().getStr() + "]");
		System.out.println("");
		
		a.getRefNum().setNum(456);
		a.getRefStr().setStr("I Love Java!");
		
		System.out.println("----- オブジェクトのディープコピー ---（SrcObject b = a.clone()）");
		System.out.println("オブジェクトa(" + a + "):[" + "num(" + a.getRefNum() + ")=" + a.getRefNum().getNum() + ", str(" + a.getRefStr() + ")=" + a.getRefStr().getStr() + "]");
		System.out.println("オブジェクトb(" + b + "):[" + "num(" + b.getRefNum() + ")=" + b.getRefNum().getNum() + ", str(" + b.getRefStr() + ")=" + b.getRefStr().getStr() + "]");
		
	}

}
