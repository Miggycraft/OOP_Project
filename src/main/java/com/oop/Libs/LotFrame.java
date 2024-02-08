package com.oop.Libs;

import javax.swing.ImageIcon;
import com.oop.Lots.Lot;

public class LotFrame extends javax.swing.JFrame {
    public void setLot(Lot o, int lotIndex){
        lotPanel2.customInit(o, lotIndex);
    }
    
    
    
    public LotFrame() {        
        initComponents();
        this.setTitle("Lot Property");
    }
    
    public LotPanel getLotPanel(){
        return lotPanel2;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lotPanel2 = new com.oop.Libs.LotPanel(this);

        setTitle("LOT PROPERTY");
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lotPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lotPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.oop.Libs.LotPanel lotPanel2;
    // End of variables declaration//GEN-END:variables
}
