package client.gui;


import client.service.dao.userDao;
import client.service.impl.userImpl;
import client.gui.util.frameUtil;

import javax.swing.*;

/**
 *
 * @author tinysean
 */
public class loginFrame extends javax.swing.JFrame {


    /**
     * Creates new form loginFrame
     */
    public loginFrame() {
        initComponents();
        frameUtil.setCenter(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userNameText = new javax.swing.JTextField();
        userPasswordText = new javax.swing.JPasswordField();
        logIn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("网吧计费系统");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("用户名");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("密码");

        logIn.setText("登录");
        logIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(logIn)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(53, 53, 53)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(userNameText, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                                        .addComponent(userPasswordText))))
                                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(userNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(userPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addComponent(logIn)
                                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>


    private void logInActionPerformed(java.awt.event.ActionEvent evt) {
        String userName = userNameText.getText();
        String passWord = String.valueOf(userPasswordText.getPassword());
        userDao userdao = new userImpl();
        int result = userdao.signin(userName, passWord);
        if(result > 0){
            MainJFrame jFrame = new MainJFrame(userName);
            jFrame.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(this, "用户名或密码错误","登录失败",JOptionPane.ERROR_MESSAGE);
        }
    }

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
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton logIn;
    private javax.swing.JTextField userNameText;
    private javax.swing.JPasswordField userPasswordText;
    // End of variables declaration
}

