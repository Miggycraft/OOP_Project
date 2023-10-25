package oop.project.libs;
import java.util.List;
import java.util.ArrayList;
import oop.project.lots.*;

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
            output += "\nLOT\t\t\tPRICE\t\t\tSIZE\t\t\tTYPE\t\t\tSTATUS";
            for (int j = 0; j < blocks.get(i).getLots().size(); j++){
                tempLot = blocks.get(i).getLot(j);
                output += "\n" + j + "\t\t\t" + tempLot.getPrice() + "\t\t\t" + tempLot.getSize() 
                        + "sq.m\t\t" + tempLot.getType() + "\t\t\t" + tempLot.getStatus();
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
    
    // debug lang plz delete sa finals
    public void printBlocks(){
        System.out.println("");
        for (int i = 0; i < blocks.size(); i++){
            System.out.print("BLOCK[" + i + "], ");
        }
        System.out.println("");
    }
}
