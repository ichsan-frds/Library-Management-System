/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import java.awt.Cursor;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Main_Menu4 extends javax.swing.JFrame {

    /**
     * Creates new form Main_Menu
     */
    public Main_Menu4() {
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

        jPanel1 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pinjamPanel = new javax.swing.JPanel();
        pinjamLabel = new javax.swing.JLabel();
        kembalikanPanel = new javax.swing.JPanel();
        kembalikanLabel = new javax.swing.JLabel();
        logoutPanel = new javax.swing.JPanel();
        logoutLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        titleLabel.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        titleLabel.setText("MANAJEMEN PERPUSTAKAAN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(titleLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(102, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        pinjamPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pinjamPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pinjamPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pinjamPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pinjamPanelMouseExited(evt);
            }
        });

        pinjamLabel.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        pinjamLabel.setText("PINJAM BUKU");
        pinjamLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pinjamLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pinjamLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pinjamLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pinjamPanelLayout = new javax.swing.GroupLayout(pinjamPanel);
        pinjamPanel.setLayout(pinjamPanelLayout);
        pinjamPanelLayout.setHorizontalGroup(
            pinjamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pinjamPanelLayout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(pinjamLabel)
                .addContainerGap(154, Short.MAX_VALUE))
        );
        pinjamPanelLayout.setVerticalGroup(
            pinjamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pinjamPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(pinjamLabel)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        kembalikanPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        kembalikanPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kembalikanPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                kembalikanPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kembalikanPanelMouseExited(evt);
            }
        });

        kembalikanLabel.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        kembalikanLabel.setText("KEMBALIKAN BUKU");
        kembalikanLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kembalikanLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                kembalikanLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kembalikanLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout kembalikanPanelLayout = new javax.swing.GroupLayout(kembalikanPanel);
        kembalikanPanel.setLayout(kembalikanPanelLayout);
        kembalikanPanelLayout.setHorizontalGroup(
            kembalikanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kembalikanPanelLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(kembalikanLabel)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        kembalikanPanelLayout.setVerticalGroup(
            kembalikanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kembalikanPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(kembalikanLabel)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        logoutPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logoutPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutPanelMouseExited(evt);
            }
        });

        logoutLabel.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        logoutLabel.setText("LOGOUT");
        logoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout logoutPanelLayout = new javax.swing.GroupLayout(logoutPanel);
        logoutPanel.setLayout(logoutPanelLayout);
        logoutPanelLayout.setHorizontalGroup(
            logoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutPanelLayout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(logoutLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        logoutPanelLayout.setVerticalGroup(
            logoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(logoutLabel)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pinjamPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kembalikanPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(pinjamPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(kembalikanPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(logoutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pinjamPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pinjamPanelMouseClicked
        // TODO add your handling code here:
        new Pinjam().setVisible(true);
        this.dispose(); // Menutup frame Main_Menu1 saat frame Login ditampilkan
    }//GEN-LAST:event_pinjamPanelMouseClicked

    private void kembalikanPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kembalikanPanelMouseClicked
        // TODO add your handling code here:
        new Kembalikan().setVisible(true);
        this.dispose(); // Menutup frame Main_Menu1 saat frame Login ditampilkan
    }//GEN-LAST:event_kembalikanPanelMouseClicked

    private void pinjamLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pinjamLabelMouseClicked
        // TODO add your handling code here:
        new Pinjam().setVisible(true);
        this.dispose(); // Menutup frame Main_Menu1 saat frame Login ditampilkan
    }//GEN-LAST:event_pinjamLabelMouseClicked

    private void pinjamLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pinjamLabelMouseEntered
        // TODO add your handling code here:
        pinjamLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_pinjamLabelMouseEntered

    private void pinjamLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pinjamLabelMouseExited
        // TODO add your handling code here:
        pinjamLabel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_pinjamLabelMouseExited

    private void pinjamPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pinjamPanelMouseEntered
        // TODO add your handling code here:
        pinjamPanel.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_pinjamPanelMouseEntered

    private void pinjamPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pinjamPanelMouseExited
        // TODO add your handling code here:
        pinjamPanel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_pinjamPanelMouseExited

    private void kembalikanLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kembalikanLabelMouseClicked
        // TODO add your handling code here:
        new Kembalikan().setVisible(true);
        this.dispose(); // Menutup frame Main_Menu1 saat frame Login ditampilkan
    }//GEN-LAST:event_kembalikanLabelMouseClicked

    private void kembalikanLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kembalikanLabelMouseEntered
        // TODO add your handling code here:
        kembalikanLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_kembalikanLabelMouseEntered

    private void kembalikanLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kembalikanLabelMouseExited
        // TODO add your handling code here:
        kembalikanLabel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_kembalikanLabelMouseExited

    private void kembalikanPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kembalikanPanelMouseEntered
        // TODO add your handling code here:
        kembalikanPanel.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_kembalikanPanelMouseEntered

    private void kembalikanPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kembalikanPanelMouseExited
        // TODO add your handling code here:
        kembalikanPanel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_kembalikanPanelMouseExited

    private void logoutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLabelMouseClicked
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(null, "Yakin mau logout?", "Konfirmasi Logout", JOptionPane.YES_NO_OPTION);

        if (choice == JOptionPane.YES_OPTION) {
            // Tindakan jika pengguna memilih "Ya"
            new Main_Menu1().setVisible(true);
            this.dispose(); // Menutup frame Main_Menu1 saat frame Login ditampilkan
        } else {
            // Tindakan jika pengguna memilih "Tidak" atau menutup dialog
            JOptionPane.showMessageDialog(null, "Logout dibatalkan.");
        }
    }//GEN-LAST:event_logoutLabelMouseClicked

    private void logoutLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLabelMouseEntered
        // TODO add your handling code here:
        logoutLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_logoutLabelMouseEntered

    private void logoutLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLabelMouseExited
        // TODO add your handling code here:
        logoutLabel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_logoutLabelMouseExited

    private void logoutPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutPanelMouseClicked
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(null, "Yakin mau logout?", "Konfirmasi Logout", JOptionPane.YES_NO_OPTION);

        if (choice == JOptionPane.YES_OPTION) {
            // Tindakan jika pengguna memilih "Ya"
            new Main_Menu1().setVisible(true);
            this.dispose(); // Menutup frame Main_Menu1 saat frame Login ditampilkan
        } else {
            // Tindakan jika pengguna memilih "Tidak" atau menutup dialog
            JOptionPane.showMessageDialog(null, "Logout dibatalkan.");
        }
    }//GEN-LAST:event_logoutPanelMouseClicked

    private void logoutPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutPanelMouseEntered
        // TODO add your handling code here:
        logoutPanel.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_logoutPanelMouseEntered

    private void logoutPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutPanelMouseExited
        // TODO add your handling code here:
        logoutPanel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_logoutPanelMouseExited

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
            java.util.logging.Logger.getLogger(Main_Menu4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Menu4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Menu4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Menu4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Menu4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel kembalikanLabel;
    private javax.swing.JPanel kembalikanPanel;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JPanel logoutPanel;
    private javax.swing.JLabel pinjamLabel;
    private javax.swing.JPanel pinjamPanel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
