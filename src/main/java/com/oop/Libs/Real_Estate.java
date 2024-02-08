package com.oop.Libs;
import com.oop.Lots.Lot;
import java.util.List;
import java.util.ArrayList;

public class Real_Estate {
    private List<Block> blocks = new ArrayList<Block>();
    
    public void addBlock(Block block){
        if (blocks.size() < 5) // only adds if less than 5 ang blocks, else wala
            blocks.add(block);
    }
    
    public void removeBlock(int i){
        blocks.remove(i);
    }
    
    public Block getBlock(int i){
        return blocks.get(i);
    }
    
    public String generateReport(){
        Lot tempLot;
        String output = "";
        for (int i = 0; i < blocks.size(); i++){
            output += "BLOCK " + i;
            output += "\n-----------------------------------------------------------------";
            output += "\nLOT    PRICE\tSIZE\tTYPE\tSTATUS";
            for (int j = 0; j < blocks.get(i).getLots().size(); j++){
                tempLot = blocks.get(i).getLot(j);
                if (j > 9)
                    output += "\n" + j + "       " + tempLot.getPrice() + "\t" + tempLot.getSize() 
                        + "sq.m\t" + tempLot.getType() + "\t" + tempLot.getStatus();
                else
                    output += "\n" + j + "        " + tempLot.getPrice() + "\t" + tempLot.getSize() 
                        + "sq.m\t" + tempLot.getType() + "\t" + tempLot.getStatus();
            }
            output += "\n\n";
        }
        return output;
    }
    
    public List<Block> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<Block> blocks) {
        this.blocks = blocks;
    }
    
    public String[] toArray(){
        String[] output = new String[blocks.size()];
        for (int i = 0; i < blocks.size(); i++) {
            output[i] = "BLOCK " + i;
        }
        return output;
    }
}
