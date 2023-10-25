package oop.project.libs;
import oop.project.lots.*;

public class GenerateData {
    LotFactory lf = new LotFactory();
    
    public Real_Estate simpleGenerate(){ // generates 3 blocks
        Real_Estate re = new Real_Estate();
        re.addBlock(new Block());
        re.addBlock(new Block());
        re.addBlock(new Block());
        re.getBlock(0).addLot(lf.createLot(0, 0));
        re.getBlock(0).addLot(lf.createLot(1, 0));
        re.getBlock(1).addLot(lf.createLot(2, 1));
        re.getBlock(1).addLot(lf.createLot(0, 1));
        re.getBlock(1).addLot(lf.createLot(0, 1));
        re.getBlock(1).addLot(lf.createLot(3, 1));
        re.getBlock(2).addLot(lf.createLot(-1, 2));
        re.getBlock(2).addLot(lf.createLot(0, 2));
        re.getBlock(2).addLot(lf.createLot(1, 2));
        re.getBlock(2).addLot(lf.createLot(2, 2));
        re.getBlock(2).addLot(lf.createLot(3, 2));
        re.getBlock(2).addLot(lf.createLot(1, 2));
        re.getBlock(0).getLot(0).setStatus("Sold");
        re.getBlock(0).getLot(1).setStatus("Sold");
        re.getBlock(1).getLot(1).setStatus("Reserved");
        re.getBlock(1).getLot(2).setStatus("Sold");
        re.getBlock(2).getLot(2).setStatus("Sold");
        re.getBlock(2).getLot(0).setStatus("Reserved");
        re.getBlock(2).getLot(3).setStatus("Reserved");
        return re;
    }
}
