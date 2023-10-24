package oop.project.libs;
import oop.project.lots.*;
import java.util.List;
import java.util.ArrayList;

public class Block {
    private List<Lot> lots = new ArrayList<Lot>();
    
    public List<Lot> getLots() {
        return lots;
    }

    public void setLots(List<Lot> lots) {
        this.lots = lots;
    }
    
    public void addLot(Lot lot){
        if (lots.size() < 20) //It only adds new lot if less than 20 (at 0 index)
            lots.add(lot);
    }
    
    public void removeLot(int i){
        lots.remove(i);
    }
    
    public Lot getLot(int i){
        return lots.get(i);
    }
    
    // debugging purpose!! plz delete sa finals!
    public void printLot(){
        for (int i = 0; i < lots.size(); i++){
            System.out.println("LOT[" + i + "]");
            System.out.println(lots.get(i).getDescription());
        }
    }
}
