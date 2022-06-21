package gui;

import java.awt.Toolkit;

/**
 *
 * @author dougbruno
 */
public class HomeGui extends javax.swing.JFrame {

    public HomeGui() {
        initComponents();
        Seticon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHome = new javax.swing.JPanel();
        lblBack = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblSep = new javax.swing.JLabel();
        lblDepartament = new javax.swing.JLabel();
        menuHome = new javax.swing.JMenuBar();
        menuRegister = new javax.swing.JMenu();
        menuHelp = new javax.swing.JMenu();
        menuAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ERP - SYSTEM");
        setPreferredSize(new java.awt.Dimension(720, 480));
        setResizable(false);

        pnlHome.setPreferredSize(new java.awt.Dimension(720, 440));

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/background.jpg"))); // NOI18N

        lblUser.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblUser.setText("User");

        lblSep.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblSep.setText("-");

        lblDepartament.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblDepartament.setText("Departament");

        javax.swing.GroupLayout pnlHomeLayout = new javax.swing.GroupLayout(pnlHome);
        pnlHome.setLayout(pnlHomeLayout);
        pnlHomeLayout.setHorizontalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addComponent(lblBack)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblUser)
                .addGap(18, 18, 18)
                .addComponent(lblSep)
                .addGap(18, 18, 18)
                .addComponent(lblDepartament)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlHomeLayout.setVerticalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addComponent(lblBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser)
                    .addComponent(lblSep)
                    .addComponent(lblDepartament))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        menuRegister.setText("Register");
        menuRegister.setEnabled(false);
        menuRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuRegisterMouseClicked(evt);
            }
        });
        menuRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegisterActionPerformed(evt);
            }
        });
        menuHome.add(menuRegister);

        menuHelp.setText("Help");
        menuHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuHelpMouseClicked(evt);
            }
        });

        menuAbout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F11, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuAbout.setText("About");
        menuAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAboutMouseClicked(evt);
            }
        });
        menuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAboutActionPerformed(evt);
            }
        });
        menuHelp.add(menuAbout);

        menuHome.add(menuHelp);

        setJMenuBar(menuHome);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHome, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(736, 508));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegisterActionPerformed
        // TODO add your handling code here:
        UserGui user = new UserGui();
        user.setVisible(true);
    }//GEN-LAST:event_menuRegisterActionPerformed

    private void menuRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuRegisterMouseClicked
        // TODO add your handling code here:
        UserGui user = new UserGui();
        user.setVisible(true);
    }//GEN-LAST:event_menuRegisterMouseClicked

    private void menuHelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuHelpMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menuHelpMouseClicked

    private void menuAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAboutMouseClicked
        // TODO add your handling code here:
        AboutGui about = new AboutGui();
        about.setVisible(true);
    }//GEN-LAST:event_menuAboutMouseClicked

    private void menuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAboutActionPerformed
        // TODO add your handling code here:
        AboutGui about = new AboutGui();
        about.setVisible(true);
    }//GEN-LAST:event_menuAboutActionPerformed

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
            java.util.logging.Logger.getLogger(HomeGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBack;
    public static javax.swing.JLabel lblDepartament;
    private javax.swing.JLabel lblSep;
    public static javax.swing.JLabel lblUser;
    private javax.swing.JMenuItem menuAbout;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenuBar menuHome;
    public static javax.swing.JMenu menuRegister;
    private javax.swing.JPanel pnlHome;
    // End of variables declaration//GEN-END:variables

    private void Seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/icon.png")));
    }
}
