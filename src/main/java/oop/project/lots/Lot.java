package oop.project.lots;

public class Lot implements Cloneable{
    private int blockLocation;
    private double size;
    private String type; // default
    private double price;
    private String status; // whether sold, reserved, or free..
    
    public Lot(int blockLocation){
        this.blockLocation = blockLocation;
        this.type = "Unsold";
    }
    
    public String getDescription(){
        return "This is a default Lot"
                + "\nStatus = " + getStatus()
                + "\nPrice = " + getPrice()
                + "\nSize = " + getSize();
    }
    
    public Lot clone() throws CloneNotSupportedException{
        return (Lot)super.clone();
    }

    public int getBlockLocation() {
        return blockLocation;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
