package exercise01;

public class SrcNum implements Cloneable{
	int num = 99;

	public SrcNum() {}
	
	public SrcNum(int pnum) {
		this.num = pnum;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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
