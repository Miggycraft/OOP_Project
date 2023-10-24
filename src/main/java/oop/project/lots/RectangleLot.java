package oop.project.lots;

public class RectangleLot extends Lot{
    	public RectangleLot(int blockLocation) {
		super(blockLocation);
		this.setType("Rectangle");
	}
        
        @Override
        public String getDescription(){
            return "This is a Rectangle Lot"
                    + "\nStatus = " + getStatus()
                    + "\nPrice = " + getPrice()
                    + "\nSize = " + getSize();
        }
        
        @Override
        public RectangleLot clone() throws CloneNotSupportedException{
            return (RectangleLot)super.clone();
    }
}
