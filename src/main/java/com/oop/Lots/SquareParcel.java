package com.oop.Lots;

public class SquareParcel extends Lot{
    	public SquareParcel(int blockLocation) {
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
        public SquareParcel clone() throws CloneNotSupportedException{
            return (SquareParcel)super.clone();
    }
}
