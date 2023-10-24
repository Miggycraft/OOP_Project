package oop.project.lots;

public class LotFactory implements iLotFactory{

    @Override
    public Lot createLot(int i, int blockLocation) {
        switch(i){
            case 0: // Pie
                return new PieLot(blockLocation);
            case 1: // Square
                return new SquareLot(blockLocation);
            case 2: // Rectangle
                return new RectangleLot(blockLocation);
            default: // default
                return new Lot(blockLocation);
        }
    }

}
