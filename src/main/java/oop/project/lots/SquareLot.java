package oop.project.lots;

public class SquareLot extends Lot{
    	public SquareLot(int blockLocation) {
		super(blockLocation);
		this.setType("Square");
	}
        
        @Override
        public String getDescription(){
            return "This is a Square Lot"
                    + "\nStatus = " + getStatus()
                    + "\nPrice = " + getPrice()
                    + "\nSize = " + getSize();
        }
        
        @Override
        public SquareLot clone() throws CloneNotSupportedException{
            return (SquareLot)super.clone();
    }
}
