package com.oop.Main;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.ImageIcon;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.text.DefaultCaret;
import com.oop.Libs.Block;
import com.oop.Libs.ChangeTheme;
import com.oop.Libs.ChangeTheme;
import com.oop.Libs.GenerateData;
import com.oop.Libs.LotFrame;
import com.oop.Libs.Real_Estate;
import com.oop.Lots.Lot;
import com.oop.Lots.ParcelProducer;
import java.io.FileWriter;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UnsupportedLookAndFeelException;

public class App extends javax.swing.JFrame {

    Real_Estate RE;
    LotFrame lf;
    ChangeTheme ct = new ChangeTheme(this);
    
    public App() {
        initComponents();
        initProj();
        lf = new LotFrame();
    }
    
    public void initProj(){
        RE = new Real_Estate();
        ((DefaultCaret)jTextArea1.getCaret()).setUpdatePolicy(DefaultCaret.NEVER_UPDATE);
        
        
        if (RE.getBlocks().size() == 0)
            return;
        refreshBlock();
        refreshLot(false);
    }
    
    public void refreshLot(boolean fromCheckbox){
        int temp = cbox_addLot.getSelectedIndex();
        Block b = RE.getBlock(cbox_addBlock.getSelectedIndex());
        cbox_addLot.setModel(new javax.swing.DefaultComboBoxModel<>(b.toArray()));
        if (temp != -1 && !fromCheckbox && temp < b.getLots().size() ){
            cbox_addLot.setSelectedIndex(temp);
        }
    }

    public void refreshBlock(){
        int temp = cbox_addBlock.getSelectedIndex();
        cbox_addBlock.setModel(new javax.swing.DefaultComboBoxModel<>(RE.toArray()));
        if (temp != -1 && temp < RE.getBlocks().size()){
            cbox_addBlock.setSelectedIndex(temp);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cbox_addBlock = new javax.swing.JComboBox<>();
        btn_addBlock = new javax.swing.JButton();
        btn_removeBlock = new javax.swing.JButton();
        btn_removeLot = new javax.swing.JButton();
        btn_addLot = new javax.swing.JButton();
        cbox_addLot = new javax.swing.JComboBox<>();
        txtarea_report = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        saveItem = new javax.swing.JMenuItem();
        genItem = new javax.swing.JMenuItem();
        exitItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        editItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        themeItem = new javax.swing.JMenu();
        changeTheme = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Real Estate App");
        setResizable(false);

        cbox_addBlock.setPreferredSize(new java.awt.Dimension(75, 50));
        cbox_addBlock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_addBlockActionPerformed(evt);
            }
        });

        btn_addBlock.setText("Add");
        btn_addBlock.setMaximumSize(new java.awt.Dimension(75, 50));
        btn_addBlock.setMinimumSize(new java.awt.Dimension(75, 50));
        btn_addBlock.setPreferredSize(new java.awt.Dimension(75, 50));
        btn_addBlock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addBlockActionPerformed(evt);
            }
        });

        btn_removeBlock.setText("Delete");
        btn_removeBlock.setMaximumSize(new java.awt.Dimension(75, 50));
        btn_removeBlock.setMinimumSize(new java.awt.Dimension(75, 50));
        btn_removeBlock.setPreferredSize(new java.awt.Dimension(75, 50));
        btn_removeBlock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeBlockActionPerformed(evt);
            }
        });

        btn_removeLot.setText("Delete");
        btn_removeLot.setMaximumSize(new java.awt.Dimension(75, 50));
        btn_removeLot.setMinimumSize(new java.awt.Dimension(75, 50));
        btn_removeLot.setPreferredSize(new java.awt.Dimension(75, 50));
        btn_removeLot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeLotActionPerformed(evt);
            }
        });

        btn_addLot.setText("Add");
        btn_addLot.setPreferredSize(new java.awt.Dimension(75, 50));
        btn_addLot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addLotActionPerformed(evt);
            }
        });

        cbox_addLot.setPreferredSize(new java.awt.Dimension(75, 50));
        cbox_addLot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_addLotActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setFocusable(false);
        jTextArea1.setMaximumSize(new java.awt.Dimension(232, 84));
        jTextArea1.setMinimumSize(new java.awt.Dimension(232, 84));
        jTextArea1.setName(""); // NOI18N
        jTextArea1.setRequestFocusEnabled(false);
        txtarea_report.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtarea_report, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbox_addBlock, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(cbox_addLot, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btn_addBlock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_removeBlock, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_addLot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_removeLot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(51, 51, 51)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbox_addLot, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbox_addBlock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_addBlock, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_addLot, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_removeBlock, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_removeLot, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtarea_report, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 264, Short.MAX_VALUE)
        );

        fileMenu.setText("File");

        saveItem.setText("Save Report");
        saveItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveItem);

        genItem.setText("Generate Data");
        genItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genItemActionPerformed(evt);
            }
        });
        fileMenu.add(genItem);

        exitItem.setText("Exit");
        exitItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitItem);

        jMenuBar1.add(fileMenu);

        editMenu.setText("Edit");

        editItem.setText("Edit Lot");
        editItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editItemActionPerformed(evt);
            }
        });
        editMenu.add(editItem);

        jMenuItem1.setText("Create Report");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        editMenu.add(jMenuItem1);

        jMenuBar1.add(editMenu);

        themeItem.setText("Themes");

        changeTheme.setText("Change Theme");
        changeTheme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeThemeActionPerformed(evt);
            }
        });
        themeItem.add(changeTheme);

        jMenuBar1.add(themeItem);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbox_addBlockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_addBlockActionPerformed
        Block b = RE.getBlock(cbox_addBlock.getSelectedIndex());
        refreshLot(true);
    }//GEN-LAST:event_cbox_addBlockActionPerformed

    private void btn_addBlockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addBlockActionPerformed
        RE.addBlock(new Block());
        refreshBlock();
    }//GEN-LAST:event_btn_addBlockActionPerformed

    private void btn_removeBlockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeBlockActionPerformed
        if(cbox_addBlock.getSelectedIndex() == -1) // cannot delete when empty
            return;
        RE.removeBlock(cbox_addBlock.getSelectedIndex());
        refreshBlock();
        refreshLot(true);
    }//GEN-LAST:event_btn_removeBlockActionPerformed

    private void btn_addLotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addLotActionPerformed
        Block b = RE.getBlock(cbox_addBlock.getSelectedIndex());
        b.addLot(new ParcelProducer().createLot(-1, cbox_addBlock.getSelectedIndex())); //default
        refreshLot(false);
    }//GEN-LAST:event_btn_addLotActionPerformed

    private void cbox_addLotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_addLotActionPerformed
    }//GEN-LAST:event_cbox_addLotActionPerformed

    private void btn_removeLotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeLotActionPerformed
        if(cbox_addLot.getSelectedIndex() == -1) // cannot delete when empty
        return;

        RE.getBlock(cbox_addBlock.getSelectedIndex()).removeLot(cbox_addLot.getSelectedIndex());
        refreshLot(false);
    }//GEN-LAST:event_btn_removeLotActionPerformed

    private void exitItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitItemActionPerformed

    private void genItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genItemActionPerformed
        RE = new GenerateData().betterGenerate();
        refreshBlock();
        refreshLot(false);
        jTextArea1.setText(RE.generateReport());
    }//GEN-LAST:event_genItemActionPerformed

    private void editItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editItemActionPerformed
        int blockIndex = cbox_addBlock.getSelectedIndex();
        Lot o = RE.getBlock(blockIndex).getLot(cbox_addLot.getSelectedIndex());
        lf.setLot(o, cbox_addLot.getSelectedIndex());
        lf.setVisible(true);
    }//GEN-LAST:event_editItemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jTextArea1.setText(RE.generateReport());
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void saveItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveItemActionPerformed
        saveReport();
    }//GEN-LAST:event_saveItemActionPerformed

    private void changeThemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeThemeActionPerformed
        ct.setVisible(true);
    }//GEN-LAST:event_changeThemeActionPerformed

    public void setTheme(String laf){
        try {
            javax.swing.UIManager.setLookAndFeel(laf);
            SwingUtilities.updateComponentTreeUI(this);
            this.pack();
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String args[]) {
        try {//Metal, Nimbus, CDE/Motif, Windows, Windows Classic
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                } 
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addBlock;
    private javax.swing.JButton btn_addLot;
    private javax.swing.JButton btn_removeBlock;
    private javax.swing.JButton btn_removeLot;
    private javax.swing.JComboBox<String> cbox_addBlock;
    private javax.swing.JComboBox<String> cbox_addLot;
    private javax.swing.JMenuItem changeTheme;
    private javax.swing.JMenuItem editItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem genItem;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenuItem saveItem;
    private javax.swing.JMenu themeItem;
    private javax.swing.JScrollPane txtarea_report;
    // End of variables declaration//GEN-END:variables

    private void saveReport() {
        try {
          FileWriter output = new FileWriter("report.txt");
          output.write(RE.generateReport()); // dirty but decent.
          output.close();
          JOptionPane.showMessageDialog(this, "File Saved Successfuly!");
        }

        catch (Exception e) {
          e.getStackTrace();
        }
    }
}
