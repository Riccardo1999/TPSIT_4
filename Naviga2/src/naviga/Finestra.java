/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naviga;

import javax.swing.*;

/**
 *
 * @author studente
 */
public class Finestra extends javax.swing.JFrame {
    private Veicoli barca;
    private String tipo;
    /**
     * Creates new form Finestra
     */
    public Finestra(String tipo) {
        initComponents();
        this.tipo=tipo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        avvia = new javax.swing.JButton();
        ferma = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        immagineBarca = new javax.swing.JLabel();
        sopra = new javax.swing.JButton();
        sinistra = new javax.swing.JButton();
        sotto = new javax.swing.JButton();
        destra = new javax.swing.JButton();
        velocità = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        tipoVeicolo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        avvia.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        avvia.setText("AVVIA");
        avvia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avviaActionPerformed(evt);
            }
        });

        ferma.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        ferma.setText("FERMA");
        ferma.setEnabled(false);
        ferma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fermaActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 350));

        immagineBarca.setPreferredSize(new java.awt.Dimension(50, 70));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(immagineBarca, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(240, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(269, Short.MAX_VALUE)
                .addComponent(immagineBarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        sopra.setText("^");
        sopra.setEnabled(false);
        sopra.setPreferredSize(new java.awt.Dimension(50, 30));
        sopra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sopraActionPerformed(evt);
            }
        });

        sinistra.setText("<");
        sinistra.setEnabled(false);
        sinistra.setPreferredSize(new java.awt.Dimension(50, 30));
        sinistra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinistraActionPerformed(evt);
            }
        });

        sotto.setText("v");
        sotto.setEnabled(false);
        sotto.setPreferredSize(new java.awt.Dimension(50, 30));
        sotto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sottoActionPerformed(evt);
            }
        });

        destra.setText(">");
        destra.setEnabled(false);
        destra.setPreferredSize(new java.awt.Dimension(50, 30));
        destra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destraActionPerformed(evt);
            }
        });

        velocità.setMaximum(30);
        velocità.setMinimum(5);
        velocità.setMinorTickSpacing(5);
        velocità.setPaintLabels(true);
        velocità.setPaintTicks(true);
        velocità.setSnapToTicks(true);
        velocità.setToolTipText("");
        velocità.setValue(5);
        velocità.setPreferredSize(new java.awt.Dimension(150, 25));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Velocità barca");
        jLabel2.setEnabled(false);

        tipoVeicolo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tipoVeicolo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(avvia)
                        .addGap(18, 18, 18)
                        .addComponent(tipoVeicolo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(ferma))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(sopra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(velocità, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sinistra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sotto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(destra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avvia)
                    .addComponent(ferma)
                    .addComponent(tipoVeicolo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sopra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(velocità, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sinistra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sotto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(destra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void avviaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avviaActionPerformed
        this.avvia.setEnabled(false);
        this.ferma.setEnabled(true);
        this.sopra.setEnabled(true);
        this.sinistra.setEnabled(true);
        this.sotto.setEnabled(true);
        this.destra.setEnabled(true);
        this.velocità.setEnabled(true);
        this.jLabel2.setEnabled(true);
        
        this.tipoVeicolo.setText(this.tipo);
        String immagine="Nave-"+tipo;
        if(tipo.equals("Barca")){
            immagine+=".gif";
        }else{
            immagine+=".png";
        }
        Icon image = new ImageIcon(getClass().getResource(immagine));
        this.immagineBarca.setIcon(image);
        
        int x=this.immagineBarca.getX();
        int y=this.immagineBarca.getY();
        
        this.barca= new Veicoli(x, y, 0);
    }//GEN-LAST:event_avviaActionPerformed

    private void fermaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fermaActionPerformed
        this.avvia.setEnabled(true);
        this.ferma.setEnabled(false);
        this.sopra.setEnabled(false);
        this.sinistra.setEnabled(false);
        this.sotto.setEnabled(false);
        this.destra.setEnabled(false);
        this.velocità.setEnabled(false);
        this.jLabel2.setEnabled(false);
        this.velocità.setValue(5);
        
        this.immagineBarca.setLocation(this.barca.getdX(), this.barca.getdY());
    }//GEN-LAST:event_fermaActionPerformed

    private void sopraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sopraActionPerformed
        int velocità=this.velocità.getValue();
        this.barca.muoviSopra(velocità);
        
        this.immagineBarca.setLocation(this.barca.getX(), this.barca.getY());
    }//GEN-LAST:event_sopraActionPerformed

    private void sinistraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinistraActionPerformed
        int velocità=this.velocità.getValue();
        this.barca.muoviSinistra(velocità);
        
        this.immagineBarca.setLocation(this.barca.getX(), this.barca.getY());
    }//GEN-LAST:event_sinistraActionPerformed

    private void sottoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sottoActionPerformed
        int velocità=this.velocità.getValue();
        this.barca.muoviSotto(velocità);
        
        this.immagineBarca.setLocation(this.barca.getX(), this.barca.getY());
    }//GEN-LAST:event_sottoActionPerformed

    private void destraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destraActionPerformed
        int velocità=this.velocità.getValue();
        this.barca.muoviDestra(velocità);
        
        this.immagineBarca.setLocation(this.barca.getX(), this.barca.getY());
    }//GEN-LAST:event_destraActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Finestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Finestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Finestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Finestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Finestra(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avvia;
    private javax.swing.JButton destra;
    private javax.swing.JButton ferma;
    private javax.swing.JLabel immagineBarca;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton sinistra;
    private javax.swing.JButton sopra;
    private javax.swing.JButton sotto;
    private javax.swing.JLabel tipoVeicolo;
    private javax.swing.JSlider velocità;
    // End of variables declaration//GEN-END:variables
}
