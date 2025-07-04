/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Backend.Buku;
import Backend.Peminjaman;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Muhammad Ichsan
 */
public class Databuku extends javax.swing.JFrame {

    /**
     * Creates new form Databuku
     */
    public Databuku() {
        initComponents();
        Buku buk = new Buku();
        buk.r = buk.getBuku();
        loaddata(buk);
        kodebukuField.setEnabled(false);
        judulbukuField.setEnabled(false);
        jenisComboBox.setEnabled(false);
        tahunterbitField.setEnabled(false);
        editButton.setEnabled(false);
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
        sectionLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        kodebukuLabel = new javax.swing.JLabel();
        kodebukuField = new javax.swing.JTextField();
        judulbukuLabel = new javax.swing.JLabel();
        judulbukuField = new javax.swing.JTextField();
        jenisLabel = new javax.swing.JLabel();
        jenisComboBox = new javax.swing.JComboBox<>();
        tahunterbitLabel = new javax.swing.JLabel();
        tahunterbitField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        hapusButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bukuTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        titleLabel.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        titleLabel.setText("MANAJEMEN PERPUSTAKAAN");

        sectionLabel.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        sectionLabel.setText("DATA BUKU");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(titleLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sectionLabel)
                .addGap(235, 235, 235))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sectionLabel))
        );

        jPanel2.setBackground(new java.awt.Color(102, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        kodebukuLabel.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        kodebukuLabel.setText("Kode Buku");

        judulbukuLabel.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        judulbukuLabel.setText("Judul Buku");

        judulbukuField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                judulbukuFieldActionPerformed(evt);
            }
        });

        jenisLabel.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jenisLabel.setText("Jenis");

        jenisComboBox.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jenisComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Novel", "Komik", "Jurnal", "Kamus", "Majalah" }));
        jenisComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenisComboBoxActionPerformed(evt);
            }
        });

        tahunterbitLabel.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        tahunterbitLabel.setText("Tahun Terbit");

        saveButton.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        editButton.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        hapusButton.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        hapusButton.setText("Hapus");
        hapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusButtonActionPerformed(evt);
            }
        });

        refreshButton.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        exitButton.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        searchButton.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kodebukuLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(judulbukuLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jenisLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tahunterbitLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kodebukuField)
                    .addComponent(judulbukuField)
                    .addComponent(jenisComboBox, 0, 241, Short.MAX_VALUE)
                    .addComponent(tahunterbitField))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hapusButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(searchButton))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editButton)
                    .addComponent(refreshButton)
                    .addComponent(exitButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kodebukuField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButton)
                    .addComponent(editButton)
                    .addComponent(kodebukuLabel))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(judulbukuField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hapusButton)
                    .addComponent(refreshButton)
                    .addComponent(judulbukuLabel))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jenisComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitButton)
                    .addComponent(searchButton)
                    .addComponent(jenisLabel))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tahunterbitField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tahunterbitLabel))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        bukuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode Buku", "Judul Buku", "Jenis", "Tahun Terbit"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(bukuTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void loaddata(Buku buk){
        DefaultTableModel t = new DefaultTableModel();
        t.addColumn("Kode Buku");
        t.addColumn("Judul Buku");
        t.addColumn("Jenis");
        t.addColumn("Tahun Terbit");
        bukuTable.setModel(t);
        try {
            while (buk.r.next()) {
                    t.addRow(new Object[] {
                        buk.r.getString("id_buku"),
                        buk.r.getString("judul"),
                        buk.r.getString("jenis"),
                        buk.r.getString("tahun_terbit")
                    });
            }
            buk.r.close();
        } catch (Exception e) {
             javax.swing.JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    
    private boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    private boolean hasPeminjaman(String idBuku) throws SQLException {
        Peminjaman pem = new Peminjaman();
        pem.setBuku(idBuku);
        pem.r = pem.getPeminjamanBuku();
        if(pem.r.next()){
            return true;
        }
        else{
            return false;
        }
    }
    
    private void jenisComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenisComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jenisComboBoxActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        kodebukuField.setEnabled(true);
        judulbukuField.setEnabled(true);
        jenisComboBox.setEnabled(true);
        tahunterbitField.setEnabled(true);
        editButton.setEnabled(false);
        hapusButton.setEnabled(false);
        searchButton.setEnabled(false);
        if (kodebukuField.getText().isEmpty() || judulbukuField.getText().isEmpty() || tahunterbitField.getText().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Isi semua kolom yang diperlukan");
            return;
        }
        else{
            Buku buk = new Buku();
            buk.setId(kodebukuField.getText());
            buk.r = buk.getBukuId();
            try {
                if (buk.r.next()) {
                    javax.swing.JOptionPane.showMessageDialog(null, "Terdapat Duplikat Data (id_buku)");
                    kodebukuField.setText(null);
                    kodebukuField.requestFocus();
                    return;
                } 
            } catch (SQLException ex) {
                Logger.getLogger(Databuku.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            buk.setId(kodebukuField.getText());
            buk.setJudul(judulbukuField.getText());
            buk.setJenis((String) jenisComboBox.getSelectedItem());
             
            String Text = tahunterbitField.getText();
            if (isNumeric(Text)) {
                buk.setTahun(Integer.parseInt(Text));
            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "Masukkan Angka Pada Tahun Terbit");
                tahunterbitField.setText(null);
                tahunterbitField.requestFocus();
                return;
            }
            buk.insertBuku();
            buk.r = buk.getBuku();
            loaddata(buk);
            
            javax.swing.JOptionPane.showMessageDialog(null, "Save Success");
        }
        kodebukuField.setText(null);
        judulbukuField.setText(null);
        jenisComboBox.setSelectedIndex(0);
        tahunterbitField.setText(null);
        kodebukuField.setEnabled(false);
        judulbukuField.setEnabled(false);
        jenisComboBox.setEnabled(false);
        tahunterbitField.setEnabled(false);
        hapusButton.setEnabled(true);
        searchButton.setEnabled(true);
    }//GEN-LAST:event_saveButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        if (judulbukuField.getText().isEmpty() || tahunterbitField.getText().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Isi semua kolom yang diperlukan");
            return;
        }      
        else
        {   
            Buku buk = new Buku();
            buk.setId(kodebukuField.getText());
            buk.setJudul(judulbukuField.getText());
            buk.setJenis((String) jenisComboBox.getSelectedItem());
            String Text = tahunterbitField.getText();
            if (isNumeric(Text)) {
                buk.setTahun(Integer.parseInt(Text));
            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "Masukkan Angka Pada Tahun Terbit");
                tahunterbitField.setText(null);
                tahunterbitField.requestFocus();
                return;
            }
            buk.updateBuku();
            javax.swing.JOptionPane.showMessageDialog(null, "Edit Success");
            
            buk.r =  buk.getBuku();
            loaddata(buk);
            
            kodebukuField.setText(null);
            judulbukuField.setText(null);
            tahunterbitField.setText(null);
            kodebukuField.setEnabled(false);
            judulbukuField.setEnabled(false);
            jenisComboBox.setEnabled(false);
            tahunterbitField.setEnabled(false);
            editButton.setEnabled(false);
            saveButton.setEnabled(true);
            hapusButton.setEnabled(true);
            searchButton.setEnabled(true);
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void hapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusButtonActionPerformed
        // TODO add your handling code here:
        editButton.setEnabled(false);
        saveButton.setEnabled(false);
        searchButton.setEnabled(false);
        kodebukuField.setEnabled(true);
        if (kodebukuField.getText().isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(null, "Harap isi semua kolom yang diperlukan");
            return;
        }  
        else
        {
            String idbuku = kodebukuField.getText();
            try {
                if (hasPeminjaman(idbuku)) {
                    javax.swing.JOptionPane.showMessageDialog(null, "Tidak dapat menghapus buku karena buku sedang dipinjam");
                    return;
                }
                else{
                    Buku buk = new Buku();
                    buk.setId(kodebukuField.getText());
                    buk.r = buk.getBukuId();
                    
                    if (!buk.r.next()) {
                        javax.swing.JOptionPane.showMessageDialog(null, "Data Buku tidak ditemukan");
                        kodebukuField.setText(null);
                        kodebukuField.requestFocus();
                        return; 
                    }
                    
                    buk.deleteBuku();

                    javax.swing.JOptionPane.showMessageDialog(null, "Delete Success");
                    
                    buk.r = buk.getBuku();
                    loaddata(buk);

                    kodebukuField.setEnabled(false);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Databuku.class.getName()).log(Level.SEVERE, null, ex);
            }
        kodebukuField.setText(null);
        saveButton.setEnabled(true);
        searchButton.setEnabled(true);
        }
    }//GEN-LAST:event_hapusButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:
        kodebukuField.setText(null);
        judulbukuField.setText(null);
        jenisComboBox.setSelectedIndex(0); // Mengatur combo box kembali ke indeks 0 (Pilih)
        tahunterbitField.setText(null);
        kodebukuField.setEnabled(false);
        judulbukuField.setEnabled(false);
        jenisComboBox.setEnabled(false);
        tahunterbitField.setEnabled(false);
        saveButton.setEnabled(true);
        hapusButton.setEnabled(true);
        searchButton.setEnabled(true);
        Buku buk = new Buku();
        buk.r =  buk.getBuku();
        loaddata(buk);
        
        javax.swing.JOptionPane.showMessageDialog(null, "Refresh Success");
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        new Main_Menu5().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        saveButton.setEnabled(false);
        hapusButton.setEnabled(false);
        kodebukuField.setEnabled(true);
        if(kodebukuField.getText().isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(null, "Isi Kolom Kode Buku");
            kodebukuField.requestFocus();
            return;
        }
        else{
            Buku buk = new Buku();
            buk.setId(kodebukuField.getText());
            try{
                buk.r = buk.getBukuId();
                
                if (!buk.r.next()) {
                        javax.swing.JOptionPane.showMessageDialog(null, "Data Buku tidak ditemukan");
                        kodebukuField.setText(null);
                        kodebukuField.requestFocus();
                        return; 
                    }
                
                buk.r = buk.getBukuId();
                while(buk.r.next()){
                    judulbukuField.setText(buk.r.getString("judul"));
                    jenisComboBox.setSelectedItem(buk.r.getString("jenis"));
                    tahunterbitField.setText(buk.r.getString("tahun_terbit"));
                    javax.swing.JOptionPane.showMessageDialog(null, "Search Success");
                }
                buk.r =  buk.getBukuId();
                loaddata(buk);
                editButton.setEnabled(true);
                saveButton.setEnabled(false);
                hapusButton.setEnabled(false);
                searchButton.setEnabled(false);
                kodebukuField.setEnabled(false);
                judulbukuField.setEnabled(true);
                jenisComboBox.setEnabled(true);
                tahunterbitField.setEnabled(true);
            } catch(Exception e){
                javax.swing.JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
            }
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void judulbukuFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_judulbukuFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_judulbukuFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Databuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Databuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Databuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Databuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Databuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bukuTable;
    private javax.swing.JButton editButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton hapusButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jenisComboBox;
    private javax.swing.JLabel jenisLabel;
    private javax.swing.JTextField judulbukuField;
    private javax.swing.JLabel judulbukuLabel;
    private javax.swing.JTextField kodebukuField;
    private javax.swing.JLabel kodebukuLabel;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel sectionLabel;
    private javax.swing.JTextField tahunterbitField;
    private javax.swing.JLabel tahunterbitLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
