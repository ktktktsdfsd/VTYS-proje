/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marketotomasyonu;

import javax.swing.JFrame;

/**
 *
 * @author lenovo
 */
public class YoneticiIslemleri extends javax.swing.JFrame {

    /**
     * Creates new form YoneticiIslemleri
     */
    JFrame frame;
    public YoneticiIslemleri(JFrame frame) {
        initComponents();
        this.frame = frame;
    }

    public YoneticiIslemleri() {
        initComponents();
    }
    
    public void sayfayaGit(JFrame frame){
        frame.setVisible(true);
        this.setVisible(false);
    }
    public void oncekiSayfayaDon(){
        if(frame != null){
           this.setVisible(false);
           frame.setVisible(true);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonPersonelSayfa = new javax.swing.JButton();
        buttonStokSayfa = new javax.swing.JButton();
        buttonMusterıSayfa = new javax.swing.JButton();
        buttonCikisYap = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Yönetici Paneli");

        buttonPersonelSayfa.setText("Personel Sayfası");
        buttonPersonelSayfa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPersonelSayfaActionPerformed(evt);
            }
        });

        buttonStokSayfa.setText("Stok Sayfası");
        buttonStokSayfa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonStokSayfaActionPerformed(evt);
            }
        });

        buttonMusterıSayfa.setText("Müşteri Sayfası");
        buttonMusterıSayfa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMusterıSayfaActionPerformed(evt);
            }
        });

        buttonCikisYap.setText("Çıkış Yap");
        buttonCikisYap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCikisYapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonPersonelSayfa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonMusterıSayfa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonStokSayfa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonCikisYap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonPersonelSayfa)
                    .addComponent(buttonStokSayfa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonMusterıSayfa)
                    .addComponent(buttonCikisYap))
                .addContainerGap(195, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPersonelSayfaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPersonelSayfaActionPerformed
        PersonelIslemleri personelIslemleri = new PersonelIslemleri();
        personelIslemleri.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonPersonelSayfaActionPerformed

    private void buttonCikisYapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCikisYapActionPerformed
        KullaniciGiris kullaniciGiris = new KullaniciGiris();
        kullaniciGiris.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonCikisYapActionPerformed

    private void buttonMusterıSayfaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMusterıSayfaActionPerformed
        MusteriIslemleri musteriIslemleri = new MusteriIslemleri();
        musteriIslemleri.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonMusterıSayfaActionPerformed

    private void buttonStokSayfaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonStokSayfaActionPerformed
        Stoklar stoklar = new Stoklar();
        stoklar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonStokSayfaActionPerformed

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
            java.util.logging.Logger.getLogger(YoneticiIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YoneticiIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YoneticiIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YoneticiIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YoneticiIslemleri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCikisYap;
    private javax.swing.JButton buttonMusterıSayfa;
    private javax.swing.JButton buttonPersonelSayfa;
    private javax.swing.JButton buttonStokSayfa;
    // End of variables declaration//GEN-END:variables
}
