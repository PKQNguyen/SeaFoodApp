/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.customSwing.Designed;

import com.system.customSwing.TextArea.TextArea;

/**
 *
 * @author HP
 */
public class MyTextArea extends javax.swing.JPanel {

    public TextArea getTextArea1() {
        return textArea1;
    }

    
    
    public MyTextArea() {
        initComponents();
        setOpaque(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textAreaScroll2 = new com.system.customSwing.TextArea.TextAreaScroll();
        textArea1 = new com.system.customSwing.TextArea.TextArea();

        textArea1.setColumns(20);
        textArea1.setRows(5);
        textAreaScroll2.setViewportView(textArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textAreaScroll2, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(textAreaScroll2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.system.customSwing.TextArea.TextArea textArea1;
    private com.system.customSwing.TextArea.TextAreaScroll textAreaScroll2;
    // End of variables declaration//GEN-END:variables
}
