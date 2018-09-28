package lab8;

public class Shoe {
	private String color;
    private String designer;
    private double size;
    
    public Shoe() {
    	 color = "";
         designer = "";
         size = 0;
	}
    
    public Shoe(String c, String d, double s){
    	setColor(c);
    	setDesigner(d);
    	setSize(s);
    }
    
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getDesigner() {
		return designer;
	}
	public void setDesigner(String designer) {
		this.designer = designer;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		if (size > 0) {
			this.size = size;
		}
	}
}
