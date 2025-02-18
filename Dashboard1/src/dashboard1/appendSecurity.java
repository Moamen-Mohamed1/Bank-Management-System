/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dashboard1;
import dashboard1.BankSystem;
import dashboard1.SignUp;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Moemen Mohamed
 */
public class appendSecurity extends javax.swing.JFrame {
    /**
     * Creates new form appendSecurity
     */
    
    public appendSecurity() throws SQLException {
        initComponents();
        firstQuestion.setText(SignUp.sq1);
        secondQuestion.setText(SignUp.sq2);
        thirdQuestion.setText(SignUp.sq3);
//        SignUp.sqa1=firstQuestion.getText();
//        SignUp.sqa2=secondQuestion.getText();
//        SignUp.sqa3=thirdQuestion.getText();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel21 = new dashboard1.GrandientPanel();
        jPanel1 = new javax.swing.JPanel();
        firstQuestion = new javax.swing.JLabel();
        jPanel22 = new dashboard1.GrandientPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        answerq1 = new javax.swing.JFormattedTextField();
        thirdQuestion = new javax.swing.JLabel();
        answerq3 = new javax.swing.JFormattedTextField();
        answerq2 = new javax.swing.JFormattedTextField();
        secondQuestion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel21.setColorEnd(new java.awt.Color(0, 204, 204));
        jPanel21.setColorStart(new java.awt.Color(204, 0, 204));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        firstQuestion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        firstQuestion.setForeground(new java.awt.Color(51, 204, 255));
        jPanel1.add(firstQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 530, 30));

        jPanel22.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel22.setColorEnd(new java.awt.Color(0, 204, 204));
        jPanel22.setColorStart(new java.awt.Color(204, 0, 204));
        jPanel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel22MouseClicked(evt);
            }
        });
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("                                                  SUBMIT");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel22.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 50));

        jPanel1.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 560, 50));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 204, 255));
        jLabel25.setText("     FOR SECURITY PURPOSE FILL THOSE QUESTIONS");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 500, 60));

        answerq1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        answerq1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerq1ActionPerformed(evt);
            }
        });
        answerq1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                answerq1KeyReleased(evt);
            }
        });
        jPanel1.add(answerq1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 540, 20));

        thirdQuestion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        thirdQuestion.setForeground(new java.awt.Color(51, 204, 255));
        jPanel1.add(thirdQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 550, 30));

        answerq3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        answerq3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerq3ActionPerformed(evt);
            }
        });
        answerq3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                answerq3KeyReleased(evt);
            }
        });
        jPanel1.add(answerq3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 550, 20));

        answerq2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        answerq2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerq2ActionPerformed(evt);
            }
        });
        answerq2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                answerq2KeyReleased(evt);
            }
        });
        jPanel1.add(answerq2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 540, 20));

        secondQuestion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        secondQuestion.setForeground(new java.awt.Color(51, 204, 255));
        jPanel1.add(secondQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 540, 30));

        jPanel21.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 900, 460));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Understanding Customers  And Make their life Easy With One Click");
        jPanel21.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 820, 60));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/Moemen%20Mohamed/Documents/NetBeansProjects/Dashboard1/test/Images/53620-200.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jLabel2.setText("     Maze Bank");
        jPanel21.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 310, 100));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 204, 255));
        jLabel3.setText("       Banking Software");
        jPanel21.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, 280, 60));

        jLabel7.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/Moemen%20Mohamed/Documents/NetBeansProjects/Dashboard1/test/Images/Bankeeeeeeeees.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jPanel21.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 520, 530));

        getContentPane().add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1650, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void answerq1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerq1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answerq1ActionPerformed

    private void answerq2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerq2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answerq2ActionPerformed

    private void jPanel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel22MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel22MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
       JOptionPane.showMessageDialog(null, "Thank You.");
        try {
            SignUp signUp=new SignUp();
            signUp.signup();
        } catch (SQLException ex) {
            Logger.getLogger(appendSecurity.class.getName()).log(Level.SEVERE, null, ex);
        }
       setVisible(false);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void answerq3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerq3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answerq3ActionPerformed

    private void answerq1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_answerq1KeyReleased
        SignUp.sqa1=answerq1.getText();
    }//GEN-LAST:event_answerq1KeyReleased

    private void answerq2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_answerq2KeyReleased
        SignUp.sqa2=answerq2.getText();
    }//GEN-LAST:event_answerq2KeyReleased

    private void answerq3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_answerq3KeyReleased
        SignUp.sqa3=answerq3.getText();
    }//GEN-LAST:event_answerq3KeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
//        SignUp.sqa1=new appendSecurity().answerq1.getText();
//          System.out.println(SignUp.sq1);
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
            java.util.logging.Logger.getLogger(appendSecurity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(appendSecurity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(appendSecurity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(appendSecurity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                try {
//                    new appendSecurity().setVisible(true);
//                } catch (SQLException ex) {
//                    Logger.getLogger(appendSecurity.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField answerq1;
    private javax.swing.JFormattedTextField answerq2;
    private javax.swing.JFormattedTextField answerq3;
    private javax.swing.JLabel firstQuestion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private dashboard1.GrandientPanel jPanel21;
    private dashboard1.GrandientPanel jPanel22;
    private javax.swing.JLabel secondQuestion;
    private javax.swing.JLabel thirdQuestion;
    // End of variables declaration//GEN-END:variables
}
