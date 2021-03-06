/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pinjam;

/**
 *
 * @author Kandang
 */

import buku.Buku;
import mainfrom.MainForm;
import member.Member;
import javax.swing.*;
import connection.connection;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

public class Pinjam extends javax.swing.JFrame {

    /**
     * Creates new form Pinjam
     */
    
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    String tampilan = "yyyy-MM-dd";
    SimpleDateFormat fm = new SimpleDateFormat(tampilan);
    
    public Pinjam() {
        conn = connection.getconn();
        initComponents();
        refreshTable();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtKode = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        tbnTampil = new javax.swing.JButton();
        btnCari = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtDenda = new javax.swing.JTextField();
        txtJudul = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jdPeminjaman = new com.toedter.calendar.JDateChooser();
        jdPengembalian = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        txtPeminjaman = new javax.swing.JTextField();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiMainForm = new javax.swing.JMenuItem();
        jmiPinjam = new javax.swing.JMenuItem();
        jmiAnggota = new javax.swing.JMenuItem();
        jmiBuku = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("From Peminjaman");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Form Peminjaman");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("ID Anggota");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Kode Buku");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Tanggal Pinjam");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Tanggal Pengembalian");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Enter untuk menampilkan nama");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Enter untuk menampilkan judul buku");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("YYYY-MM-DD");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("YYYY-MM-DD");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        txtKode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodeActionPerformed(evt);
            }
        });

        btnSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sv.jpg"))); // NOI18N
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ed.jpg"))); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.setEnabled(false);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/dt.jpg"))); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.setEnabled(false);
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        tbnTampil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tm.jpg"))); // NOI18N
        tbnTampil.setText("Tampil");
        tbnTampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnTampilActionPerformed(evt);
            }
        });

        btnCari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cr.jpg"))); // NOI18N
        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("Nama");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setText("Denda");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("Judul");

        txtNama.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNama.setEnabled(false);
        txtNama.setSelectionColor(new java.awt.Color(0, 0, 0));

        txtJudul.setEnabled(false);
        txtJudul.setSelectionColor(new java.awt.Color(0, 0, 0));

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Kode", "Tanggal Pinjam", "Tanggal Pengembalian", "Denda"
            }
        ));
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblData);

        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setText("ID Peminjaman");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tbnTampil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCari)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnEdit)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(139, 139, 139))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(143, 143, 143)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(80, 80, 80)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(txtKode)
                                    .addComponent(jdPeminjaman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jdPengembalian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(89, 89, 89)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDenda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 409, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE))))
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel11)
                        .addComponent(txtDenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jdPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jdPengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(btnSimpan))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnEdit)
                                    .addComponent(btnHapus))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbnTampil)
                            .addComponent(btnCari))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jMenu1.setText("Menu");

        jmiMainForm.setText("Tampilan Awal");
        jmiMainForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiMainFormActionPerformed(evt);
            }
        });
        jMenu1.add(jmiMainForm);

        jmiPinjam.setText("Pinjam Buku");
        jmiPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPinjamActionPerformed(evt);
            }
        });
        jMenu1.add(jmiPinjam);

        jmiAnggota.setText("Anggota");
        jmiAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAnggotaActionPerformed(evt);
            }
        });
        jMenu1.add(jmiAnggota);

        jmiBuku.setText("Buku");
        jmiBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiBukuActionPerformed(evt);
            }
        });
        jMenu1.add(jmiBuku);

        jMenuBar2.add(jMenu1);

        jMenu4.setText("Info");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });
        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiMainFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiMainFormActionPerformed
        new MainForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmiMainFormActionPerformed

    private void jmiPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPinjamActionPerformed
        new Pinjam().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmiPinjamActionPerformed

    private void jmiAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAnggotaActionPerformed
        new Member().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmiAnggotaActionPerformed

    private void jmiBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiBukuActionPerformed
        new Buku().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmiBukuActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed

    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        JOptionPane.showMessageDialog(this, "Klik Menu untuk melihat data Anggota dan data Buku");
    }//GEN-LAST:event_jMenu4MouseClicked

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        String tanggalPinjam = String.valueOf(fm.format(jdPeminjaman.getDate()));
        String tanggalPengembalian = String.valueOf(fm.format(jdPengembalian.getDate()));
        String id_peminjaman = txtPeminjaman.getText();
        String id = txtId.getText();
        String kode = txtKode.getText();
        String denda = txtDenda.getText();
        
        if((txtId.getText().equals("")) || (txtNama.getText().equals("")) || (txtKode.getText().equals("")) || (txtJudul.getText().equals("")) || (tanggalPinjam.equals("")) || (tanggalPengembalian.equals("")) || (txtDenda.getText().equals(""))){
            JOptionPane.showMessageDialog(btnSimpan, "Data tidak boleh kosong", "Informasi", WIDTH, null);
        }else{
            try{
                ps = conn.prepareStatement("Insert into peminjaman(id_peminjaman,Id,Kode,Tgl_pinjam,Tgl_kembali,Denda) values (?,?,?,?,?,?)");
                ps.setString(1, id_peminjaman);
                ps.setString(2, id);
                ps.setString(3, kode);
                ps.setString(4, tanggalPinjam);
                ps.setString(5, tanggalPengembalian);
                ps.setString(6, denda);
                ps.executeUpdate();
                ps.close();
                
                refreshTable();
                JOptionPane.showMessageDialog(this, "Data berhasil disampan", "Informasi", 1);
                
                txtPeminjaman.setText("");
                txtId.setText("");
                txtNama.setText("");
                txtKode.setText("");
                txtJudul.setText("");
                jdPeminjaman.setDateFormatString("");
                jdPengembalian.setDateFormatString("");
                txtDenda.setText("");
                txtId.setEnabled(true);
                txtKode.setEnabled(true);
                btnHapus.setEnabled(true);
                btnEdit.setEnabled(true);
                txtId.requestFocus();
                
            }catch(Exception e){
                System.err.println(e);
                JOptionPane.showMessageDialog(this, "Terjadi Kesalahan");
                
                txtNama.setText("");
                txtKode.setText("");
                txtJudul.setText("");
                txtId.setEnabled(true);
                txtKode.setEnabled(true);
                btnHapus.setEnabled(true);
                btnEdit.setEnabled(true);
                txtId.requestFocus();
            }
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        if(txtId.getText().equals("")){
              JOptionPane.showMessageDialog(this, "Text ID Kosong","Informasi",1);
              txtId.requestFocus();
        }else{
            try {
                String sql = "Select Nama from anggota where Id =" +txtId.getText(); 
                Statement stat = conn.createStatement();
                ResultSet rs=stat.executeQuery(sql);

                while (rs.next()) {
                txtNama.setText(rs.getString("Nama"));
                txtId.setEnabled(false);
                }
            }
              catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Data Tidak Ditemukan ");
            }
        }
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtKodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeActionPerformed
        if(txtKode.getText().equals("")){
              JOptionPane.showMessageDialog(this, "Text Kode Kosong","Informasi",1);
              txtKode.requestFocus();
        }else{
            try {
                String sql = "Select Judul from koleksi where kode =" +txtKode.getText(); 
                Statement stat = conn.createStatement();
                ResultSet rs =stat.executeQuery(sql);

                while (rs.next()) {
                txtJudul.setText(rs.getString("Judul"));
                txtKode.setEnabled(false);
                }
            }
              catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Data Tidak Ditemukan ");
            }
        }
    }//GEN-LAST:event_txtKodeActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        String tanggalPinjam = String.valueOf(fm.format(jdPeminjaman.getDate()));
        String tanggalPengembalian = String.valueOf(fm.format(jdPengembalian.getDate()));
        String id_peminjaman = txtPeminjaman.getText();
        String id = txtId.getText();
        String kode = txtKode.getText();
        String denda = txtDenda.getText();
        
        if((txtId.getText().equals(""))||(txtKode.getText().equals(""))||(txtJudul.getText().equals(""))||(tanggalPinjam.equals(""))||(tanggalPengembalian.equals(""))||(txtDenda.getText().equals(""))){
            JOptionPane.showMessageDialog(this, "Data Ada Yang Kosong", "INFORMASI", WIDTH, null);
        }else{
            try {
                ps = conn.prepareStatement("Update peminjaman SET Id=?, Kode=?, Tgl_pinjam=?, Tgl_kembali=?, Denda=? where id_peminjaman=?");
                ps.setString(1, id);
                ps.setString(2, kode);
                ps.setString(3, tanggalPinjam);
                ps.setString(4, tanggalPengembalian);
                ps.setString(5, denda);
                ps.setString(6, id_peminjaman);
                ps.executeUpdate();
                ps.close();

                JOptionPane.showMessageDialog(this, "Edit Berhasil","Informasi",1);

                txtId.setText("");
                txtNama.setText("");
                txtKode.setText("");
                txtJudul.setText("");
                jdPeminjaman.setDateFormatString("");
                jdPengembalian.setDateFormatString("");
                txtDenda.setText("");
                txtId.requestFocus();
                txtId.setEnabled(true);
                txtKode.setEnabled(true);

                refreshTable();
            }catch(SQLException ex) {
                System.err.println(ex);
                JOptionPane.showMessageDialog(this, "Terjadi kesalahan "+ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        if(txtId.getText().equals("")){
              JOptionPane.showMessageDialog(this, "Text Id Kosong","Informasi",1);
              txtId.requestFocus();
        }else{
            int dialogResult =  JOptionPane.showConfirmDialog(this, "Apakah anda yakin akan menghapus akun ini?", "Warning", JOptionPane.YES_NO_OPTION);
            
            if(dialogResult == JOptionPane.YES_OPTION){
                String sqlkode="Delete from peminjaman "+ "Where id_peminjaman='"+this.txtPeminjaman.getText()+"'";
                try {
                    ps = conn.prepareStatement(sqlkode);
                    ps.executeUpdate();
                    ps.close();

                    txtPeminjaman.setText("");
                    txtId.setText("");
                    txtNama.setText("");
                    txtKode.setText("");
                    txtJudul.setText("");
                    jdPeminjaman.setDateFormatString("");
                    jdPengembalian.setDateFormatString("");
                    txtDenda.setText("");
                    txtId.setEnabled(true);
                    txtKode.setEnabled(true);
                    txtId.requestFocus();

                    refreshTable();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Terjadi kesalahan "+ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tbnTampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnTampilActionPerformed
        refreshTable();
        btnHapus.setEnabled(true);
        btnEdit.setEnabled(true);
        txtId.requestFocus();
    }//GEN-LAST:event_tbnTampilActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        if(txtPeminjaman.getText().equals("")){
              JOptionPane.showMessageDialog(this, "Text Id Peminjaman Kosong","Informasi",1);
              txtPeminjaman.requestFocus();
        }else{
        DefaultTableModel tabelpinjam = new DefaultTableModel();
        tabelpinjam.addColumn("ID Peminjaman");
        tabelpinjam.addColumn("ID Anggota");
        tabelpinjam.addColumn("Kode Buku");
        tabelpinjam.addColumn("Tgl Peminjaman");
        tabelpinjam.addColumn("Tgl Pengembalian");
        tabelpinjam.addColumn("Denda");
        
            try {
                String sql = "select * from peminjaman where id_peminjaman="+txtPeminjaman.getText();
                Statement stat = conn.createStatement();
                rs = stat.executeQuery(sql);
                while (rs.next()) {
                    tabelpinjam.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)});
                }
                    tblData.setModel(tabelpinjam);
                    txtId.setText("");
                    txtNama.setText("");
                    txtKode.setText("");
                    txtJudul.setText("");
                    jdPeminjaman.setDateFormatString("");
                    jdPengembalian.setDateFormatString("");
                    txtDenda.setText("");
                    txtId.setEnabled(true);
                    txtKode.setEnabled(true);
                    txtId.requestFocus();

            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Data Tidak Ditemukan "+e);
            }
        }
    }//GEN-LAST:event_btnCariActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        DefaultTableModel Df = (DefaultTableModel)tblData.getModel();
        int selectedIndex = tblData.getSelectedRow();
        
        txtPeminjaman.setText(Df.getValueAt(selectedIndex, 0).toString());
        txtId.setText(Df.getValueAt(selectedIndex, 1).toString());
        txtKode.setText(Df.getValueAt(selectedIndex, 2).toString());
        txtDenda.setText(Df.getValueAt(selectedIndex, 7).toString());
        btnEdit.setEnabled(true);
        btnHapus.setEnabled(true);
    }//GEN-LAST:event_tblDataMouseClicked

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
            java.util.logging.Logger.getLogger(Pinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pinjam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdPeminjaman;
    private com.toedter.calendar.JDateChooser jdPengembalian;
    private javax.swing.JMenuItem jmiAnggota;
    private javax.swing.JMenuItem jmiBuku;
    private javax.swing.JMenuItem jmiMainForm;
    private javax.swing.JMenuItem jmiPinjam;
    private javax.swing.JTable tblData;
    private javax.swing.JButton tbnTampil;
    private javax.swing.JTextField txtDenda;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtJudul;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtPeminjaman;
    // End of variables declaration//GEN-END:variables

    public void refreshTable() {
        DefaultTableModel tabelpinjam = new DefaultTableModel();
        tabelpinjam.addColumn("ID Peminjaman");
        tabelpinjam.addColumn("ID Anggota");
        tabelpinjam.addColumn("ID Buku");
        tabelpinjam.addColumn("Nama Anggota");
        tabelpinjam.addColumn("Judul Buku");
        tabelpinjam.addColumn("Tgl Peminjaman");
        tabelpinjam.addColumn("Tgl Pengembalian");
        tabelpinjam.addColumn("Denda");
        
        try {
            String sql = "select peminjaman.id_peminjaman, peminjaman.Id, peminjaman.Kode, anggota.Nama, koleksi.Judul, peminjaman.Tgl_pinjam, peminjaman.Tgl_kembali, peminjaman.Denda from ((peminjaman inner join koleksi on peminjaman.Kode=koleksi.Kode) inner join anggota on peminjaman.Id=anggota.Id)";
            Statement stat = conn.createStatement();
            ResultSet res=stat.executeQuery(sql);
            
            while (res.next()) {
                tabelpinjam.addRow(new Object[]{res.getString(1),
                res.getString(2),
                res.getString(3),
                res.getString(4),
                res.getString(5),
                res.getString(6),
                res.getString(7),
                res.getString(8)
                });
            }
           tblData.setModel(tabelpinjam);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
