
package uneventos;


import java.sql.Connection;
import java.awt.Image;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    Conexion cc= new Conexion();
    Connection con = cc.conectarMySQL();
    public Login() {
        initComponents();
        this.setLocationRelativeTo(this);
        SetImageLabel(Label, "src/imagenes/Image.png");
        SetImageLabel(Logo, "src/imagenes/Logo.jpg");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    public void ValidarDatos() throws SQLException {
     int resultado = 1;
     String usuario = txtUsuario.getText();
     String contraseña = String.valueOf(txtContraseña.getPassword());
     String SQL = "SELECT * FROM uneventos.login where usuario='"+usuario+"' and contraseña='"+contraseña+"'";
    
     Statement st= con.createStatement();
     ResultSet rs= st.executeQuery(SQL);
     
     if (rs.next()) {
       resultado =1;
       if(resultado==1){
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
       }
     }else{
      JOptionPane.showMessageDialog(null, "Datos Incorrectos");
     }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        Label2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Fondo.setBackground(new java.awt.Color(204, 204, 204));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USUARIO");
        Fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 80, 20));

        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });
        Fondo.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 320, 40));

        Label2.setFont(new java.awt.Font("Britannic Bold", 1, 24)); // NOI18N
        Label2.setForeground(new java.awt.Color(255, 255, 255));
        Label2.setText("INICIAR SESIÓN");
        Fondo.add(Label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 290, 50));

        txtUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(66, 66, 66));
        txtUsuario.setBorder(null);
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        Fondo.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 320, 40));

        jLabel2.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CONTRASEÑA");
        Fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 130, 30));

        jButton1.setBackground(new java.awt.Color(0, 84, 220));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ENTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Fondo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, 120, 40));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.jpg"))); // NOI18N
        Fondo.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 80, 100));

        jButton2.setText("Admin");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Fondo.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, -1));

        Label.setBackground(new java.awt.Color(204, 204, 204));
        Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo2.jpg"))); // NOI18N
        Fondo.add(Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 420, 700));

        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 415, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            ValidarDatos();
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    private void SetImageLabel(JLabel labelName, String root) {
       ImageIcon image = new ImageIcon(root);
       Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
       labelName.setIcon(icon);
       this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel Label;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
