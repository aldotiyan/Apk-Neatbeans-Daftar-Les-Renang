/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;

import java.sql.PreparedStatement;
import java.awt.HeadlessException;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author aldot
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Regiister
     */
    public Register() {
        initComponents();
        
        autonumber();
    }
    private void autonumber() {
        
        try{
            Connection c = Koneksi.getkoneksi();
            Statement s = c.createStatement();
            String sql = "SELECT * FROM login ";
            ResultSet r = s.executeQuery(sql);
            /*if (r.next()){
                String NoID = r.getString("id").substring(2);
                String ID = ""+(Integer.parseInt(NoID)+1);
                String Zero = "";
                
                if (ID.length()==1){
                Zero = "00";
                }else if(ID.length()== 2){
                 Zero = "0";
                }else if(ID.length()==3){
                Zero = "";
                }
               
                }else{
                
            }*/
            r.close();
            s.close();
            
        }catch(Exception e){
        System.out.println("Auto Number Eror");
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfuser = new javax.swing.JTextField();
        tfpass = new javax.swing.JPasswordField();
        tfcpass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("REGISTER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel1)
                .addContainerGap(209, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 420, 80);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Username : ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(12, 99, 77, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Password :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(12, 142, 70, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Conf. Password :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(12, 183, 109, 20);

        tfuser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tfuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfuserActionPerformed(evt);
            }
        });
        getContentPane().add(tfuser);
        tfuser.setBounds(133, 98, 170, 24);

        tfpass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(tfpass);
        tfpass.setBounds(133, 141, 170, 24);

        tfcpass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tfcpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfcpassActionPerformed(evt);
            }
        });
        getContentPane().add(tfcpass);
        tfcpass.setBounds(132, 183, 170, 26);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(82, 259, 79, 25);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Batal");
        getContentPane().add(jButton2);
        jButton2.setBounds(204, 259, 107, 25);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\aldot\\OneDrive\\Desktop\\kuliah\\PBO\\Project\\Gambar\\tips-memilih-kolam-renang-club-la-santa-tinajo-800x533.jpg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-3, 80, 370, 240);

        setSize(new java.awt.Dimension(380, 351));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfuserActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String username = tfuser.getText().toString().trim();
        String password = tfpass.getText().toString().trim();
        String conPassword = tfcpass.getText().toString().trim();
        
        if (!password.equals(conPassword)){
        JOptionPane.showMessageDialog(null, "Password Tidak sesuai");
        }else if(password.equals("") || username.equals("")){
        JOptionPane.showMessageDialog(null, "Username dan Password tidak boleh kosong");
        }else{
        try{
            Connection c = Koneksi.getkoneksi();
            String sql = "INSERT INTO login VALUES (?, ?)";
            PreparedStatement p = c.prepareStatement(sql);
            
            p.setString(1, username);
            p.setString(2, password);
            p.executeUpdate();
            p.close();
            JOptionPane.showMessageDialog(null, "Akun Telah Dibuat");
        
        }catch(SQLException e){
        System.out.println("Eror");
        }finally{
        this.dispose();
        Login a = new Login();
        a.setVisible(true);
        }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfcpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfcpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfcpassActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField tfcpass;
    private javax.swing.JPasswordField tfpass;
    private javax.swing.JTextField tfuser;
    // End of variables declaration//GEN-END:variables
}
