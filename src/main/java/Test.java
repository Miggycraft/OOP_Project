import oop.project.lots.*;
import oop.project.libs.*;
import java.util.*;

public class Test {
    static Scanner input = new Scanner(System.in);
    static Real_Estate RE = new Real_Estate();
    public static void main(String[] args) throws CloneNotSupportedException{
        while (true){
            System.out.println("DEBUG LANG:"
                    + "\n[1]: Add Block"
                    + "\n[2]: Remove Block"
                    + "\n[3]: Get All Block"
                    + "\n[4]: Exit"
                    + "\n[5]: Access Block");
            String s = input.nextLine();
            switch(s){
                case "1":
                    addBlock();
                    break;
                case "2":
                    removeBlock();
                    break;
                case "3":
                    getAll();
                    break;
                case "4":
                    System.exit(0);
                    break;
                case "5":
                    accessBlock();
                    break;
            }
        }
    }
    
    public static void addBlock(){
        RE.addBlock(new Block());
    }
    
    public static void removeBlock(){
        System.out.println("Remove which block location? Block size is " + RE.getBlocks().size() +": [type -1 to cancel]");
        int i = input.nextInt();
        if (i > 0)
            RE.removeBlock(i);
    }
    
    public static void getAll(){
            RE.printBlocks();
    }
    
    public static void accessBlock(){
        System.out.println("Which block to access?");
        int i_block = input.nextInt();
        System.out.println("DO WHAT WITH BLOCK [" + i_block + "]:"
                + "\n[1]: Add Lot"
                + "\n[2]: Remove Lot"
                + "\n[3]: Get All Lot"
                + "\n[4]: Exit"
                + "\n[5]: Access Lot");
        int p = input.nextInt();
        switch(p){
            case 1:
                addLot(i_block);
                break;
            case 2:
                removeLot();
                break;
            case 3:
                getLots(i_block);
                break;
            case 4:
                break;
            case 5:
                accessLot();
                break;
        }
    }
    
    public static void addLot(int i_block){
        LotFactory lf = new LotFactory();
        System.out.println("Create what kind of Lot?"
                + "\n[1]: Pie"
                + "\n[2]: Square"
                + "\n[3]: Rectangle"
                + "\n[4]: Default (should not be used)"
                + "\n[5] Back");
        int i = input.nextInt();
        if (i >= 1 && i <= 4){
            RE.getBlock(i_block).addLot(lf.createLot((i - 1), i_block));
        }
    }
    
    public static void removeLot(){
        
    }
    
    public static void getLots(int i_block){
        RE.getBlock(i_block).printLot();
    }
    
    public static void accessLot(){
        
    }
}
