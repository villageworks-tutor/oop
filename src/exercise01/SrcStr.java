package exercise01;

public class SrcStr implements Cloneable {
	String str = "???";
	SrcStr() {}
	SrcStr(String pstr) {
		this.str = pstr;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	@Override
	protected Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			throw new InternalError(e.getMessage());
		}
	}
	
}
