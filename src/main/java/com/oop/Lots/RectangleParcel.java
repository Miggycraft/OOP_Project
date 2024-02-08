package com.oop.Lots;

public class RectangleParcel extends Lot{
    	public RectangleParcel(int blockLocation) {
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
        public RectangleParcel clone() throws CloneNotSupportedException{
            return (RectangleParcel)super.clone();
    }
}
