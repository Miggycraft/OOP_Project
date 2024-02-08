package com.oop.Lots;

public class CircularParcel extends Lot{
    	public CircularParcel(int blockLocation) {
		super(blockLocation);
		this.setType("Pie");
	}
        
        @Override
        public String getDescription(){
            return "This is a Pie Lot"
                    + "\nStatus = " + getStatus()
                    + "\nPrice = " + getPrice()
                    + "\nSize = " + getSize();
        }
        
        @Override
        public CircularParcel clone() throws CloneNotSupportedException{
            return (CircularParcel)super.clone();
    }
}
