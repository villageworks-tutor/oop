package exercise01;

public class Ex13_Upack {

	public static void main(String[] args) {
		
		int size = Integer.parseInt(args[0]);
		int weight = Integer.parseInt(args[1]);
		int  price = 0;
		Usize usize = new Usize(size);
		Uweight uweight = new Uweight(weight);
		
		usize.setPrice();
		uweight.setPrice();
		
		if (usize.getPrice() > uweight.getPrice()) {
			price = usize.getPrice();
		} else {
			price = uweight.getPrice();
		}
		
		System.out.println(args[0] + "cm, " + args[1] + "kgのUパック配送料金は" + price + "円です。");

	}

}
