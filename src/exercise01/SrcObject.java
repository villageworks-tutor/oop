package exercise01;

public class SrcObject implements Cloneable {
	SrcNum num;
	SrcStr str;
	SrcObject() {
		this.num = new SrcNum();
		this.str = new SrcStr();
	}
	public SrcObject(int num, String str) {
		this.num = new SrcNum(num);
		this.str = new SrcStr(str);
	}
	@Override
	protected Object clone() {
		try {
			SrcObject work = (SrcObject)super.clone();
			work.num = (SrcNum)(num.clone());
			work.str = (SrcStr)(str.clone());
			return work;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			throw new InternalError(e.getMessage());
		}
	}
	
	public SrcNum getRefNum() {
		return this.num;
	}
	public SrcStr getRefStr() {
		return this.str;
	}
	
}
