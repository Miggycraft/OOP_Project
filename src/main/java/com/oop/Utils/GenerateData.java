package com.oop.Utils;
import com.oop.Libs.Block;
import com.oop.Libs.Real_Estate;
import com.oop.Lots.ParcelProducer;
import java.util.Random;

public class GenerateData {
    ParcelProducer lf = new ParcelProducer();
    Random r = new Random();
    
    public Real_Estate betterGenerate(){
        int blockRNG = r.nextInt(5) + 1; // generates 1 - 5 blocks
        Real_Estate re = new Real_Estate();
        for (int i = 0; i < blockRNG; i++){
            re.addBlock(new Block());
            int innerRNG = r.nextInt(5); // generates 0 - 4 lots
            for (int j = 0; j < innerRNG; j++){
                int pStyle = r.nextInt(4);
                boolean statusRandom = r.nextBoolean();
                re.getBlock(i).addLot(lf.createLot(pStyle, i));
                String status = (statusRandom) ? "Sold" : "Reserved";
                re.getBlock(i).getLot(j).setStatus(status);
            }
        }
        fillData(re);
        return re;
    }
    
    public void fillData(Real_Estate re){
        for (int i = 0; i < re.getBlocks().size(); i++){
            for (int j = 0; j < re.getBlock(i).getLots().size(); j++){
                re.getBlock(i).getLot(j).setPrice(generatePrice());
                re.getBlock(i).getLot(j).setSize(generateSize());
            }
        }
    }
    
    public int generatePrice(){
        return 1000 + r.nextInt(5000);
    }
    
    public int generateSize(){
        return 100 + r.nextInt(900);
    }
}
