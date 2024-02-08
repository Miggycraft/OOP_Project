package com.oop.Lots;

public class ParcelProducer implements ParcelFactory{

    @Override
    public Lot createLot(int i, int blockLocation) {
        switch(i){
            case 0: // Pie
                return new CircularParcel(blockLocation);
            case 1: // Square
                return new SquareParcel(blockLocation);
            case 2: // Rectangle
                return new RectangleParcel(blockLocation);
            default: // default
                return new Lot(blockLocation);
        }
    }

}
