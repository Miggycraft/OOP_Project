package com.oop.Libs;

import com.oop.Main.App;
import javax.swing.JFrame;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;

public class ChangeTheme extends javax.swing.JFrame {
    App a;
    public ChangeTheme(App a) {
        this.a = a;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();

        setResizable(false);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nimbus", "Metal", "CDE/Motif", "Windows", "Windows Classic" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, 0, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String text = "";
        switch(jComboBox1.getSelectedIndex()){
            case 0:
                //javax.swing.plaf.nimbus.NimbusLookAndFeel
                text = "Nimbus";
                break;
            case 1:
                //javax.swing.plaf.metal.MetalLookAndFeel  
                text = "Metal";
                break;
            case 2:
                //com.sun.java.swing.plaf.motif.MotifLookAndFeel
                text = "CDE/Motif";
                break;
            case 3:
                //com.sun.java.swing.plaf.windows.WindowsLookAndFeel
                text = "Windows";
                break;
            case 4:
                text = "Windows Classic";
                break;
                //com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel
            default:
                break;
        }
        try {//Metal, Nimbus, CDE/Motif, Windows, Windows Classic
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if (text.equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    a.setTheme(info.getClassName());
                    break;
                } 
            }
        } catch (Exception ex) {
            // weee
        }

    }//GEN-LAST:event_jComboBox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    // End of variables declaration//GEN-END:variables
}
