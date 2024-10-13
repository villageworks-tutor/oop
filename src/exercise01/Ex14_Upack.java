package exercise01;

public class Ex14_Upack {

	
	public static void main(String[] args) {
		
		int size = Integer.parseInt(args[0]);
		int weight = Integer.parseInt(args[1]);
		int distance = Integer.parseInt(args[2]);
		
		int  price = 0;
		Usize usize = new Usize(size);
		Uweight uweight = new Uweight(weight);
		Ukyori ukyori = new Ukyori(distance);
		
		usize.setPrice();
		uweight.setPrice();
		
		if (usize.getPrice() > uweight.getPrice()) {
			price = usize.getPrice();
		} else {
			price = uweight.getPrice();
		}
		
		price *= ukyori.getRate();
		
		System.out.println(args[0] + "cm, " + args[1] + "kg, 距離" + args[2] + "のUパック配送料金は" + price + "円です。");

	}

}
