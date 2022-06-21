package gui;

import connect.Connect;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author dougbruno
 */
public class LoginGui extends javax.swing.JFrame {

    Connection connection = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void login() {
        String sql = "select * from user where login=? and password=?";
        try {
            pst = connection.prepareStatement(sql);
            pst.setString(1, txtUser.getText());
            String cap = new String(txtPass.getPassword());
            pst.setString(2, cap);
            rs = pst.executeQuery();

            if (rs.next()) {

                String departament = rs.getString(5);
                if (departament.equals("admin")) {
                    HomeGui home = new HomeGui();
                    home.setVisible(true);
                    HomeGui.menuRegister.setEnabled(true);
                    HomeGui.lblUser.setText(rs.getString(2));
                    HomeGui.lblDepartament.setText(rs.getString(5));
                    this.dispose();
                } else {
                    HomeGui home = new HomeGui();
                    home.setVisible(true);
                    HomeGui.lblUser.setText(rs.getString(2));
                    HomeGui.lblDepartament.setText(rs.getString(5));
                    this.dispose();
                }

            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password!");
            }

        } catch (Exception e) {
            System.out.println("ERROR:" + e);
        }
    }

    public LoginGui() {
        initComponents();
        Seticon();
        connection = Connect.getConexao();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLogin = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        lblPass = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setResizable(false);

        lblUser.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        lblUser.setText("User");

        txtUser.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblPass.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        lblPass.setText("Password");

        txtPass.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblUser)
                    .addComponent(lblPass))
                .addGap(18, 18, 18)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUser)
                    .addComponent(txtPass, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogin)
                .addGap(96, 96, 96))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPass)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        login();
    }//GEN-LAST:event_btnLoginActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    private void Seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/icon.png")));
    }

}
