package lab8;

public class DressShoe extends Shoe {
	private HeelType type;

	public HeelType getType() {
		return type;
	}

	public void setType(HeelType type) {
		this.type = type;
	}

	public DressShoe() {
		super();
		type = HeelType.HEELS;
	}

	public DressShoe(String c, String d, double s, HeelType t) {
		super(c, d, s);
		setType(t);
	}

	@Override
	public String toString() {
		return "Dress shoe designed by " + this.getDesigner() + "\nColor: " + this.getColor() + "\nSize: " + getSize()
				+ "\nType: " + getType();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		} else if (obj.getClass() != getClass()) {
			return false;
		} else {
			DressShoe shoe = (DressShoe) obj;
			return (getDesigner().equals(shoe.getDesigner()) && getColor().equals(shoe.getClass())
					&& (getSize() == shoe.getSize()) && getType().equals(shoe.getType()));
		}
	}
}
