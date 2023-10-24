package oop.project.lots;

public class PieLot extends Lot{
    	public PieLot(int blockLocation) {
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
        public PieLot clone() throws CloneNotSupportedException{
            return (PieLot)super.clone();
    }
}
