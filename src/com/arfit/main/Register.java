/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arfit.main;


import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.io.File;
import javax.swing.JButton;


public class Register extends javax.swing.JFrame {

   
    Font Poppins;
    
    public Register() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        
        /*try {
            Poppins = Font.createFont(Font.TRUETYPE_FONT, new File("Poppins-Regular.ttf")).deriveFont(30f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("Poppins-Regular.ttf")));
            this.setFont(Poppins);
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        halfbg1 = new javax.swing.JPanel();
        nuidtxt = new javax.swing.JTextField();
        fntxt = new javax.swing.JTextField();
        registerBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lntxt = new javax.swing.JTextField();
        emailtxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        halfbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        halfbg1.setBackground(new java.awt.Color(255, 255, 255));
        halfbg1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nuidtxt.setBackground(new java.awt.Color(246, 246, 246));
        nuidtxt.setForeground(java.awt.Color.gray);
        nuidtxt.setText("Student ID");
        nuidtxt.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(246, 246, 246)));
        nuidtxt.setMargin(new java.awt.Insets(10, 10, 10, 10));
        nuidtxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nuidtxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nuidtxtFocusLost(evt);
            }
        });
        halfbg1.add(nuidtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 290, 50));

        fntxt.setBackground(new java.awt.Color(246, 246, 246));
        fntxt.setForeground(java.awt.Color.gray);
        fntxt.setText("First Name");
        fntxt.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(246, 246, 246)));
        fntxt.setMargin(new java.awt.Insets(10, 10, 10, 10));
        fntxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fntxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fntxtFocusLost(evt);
            }
        });
        halfbg1.add(fntxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 290, 50));

        registerBtn.setText("Register");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });
        halfbg1.add(registerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 600, 250, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arfit/canva/images/register-txt1 (2).png"))); // NOI18N
        halfbg1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 300, 180));

        lntxt.setBackground(new java.awt.Color(246, 246, 246));
        lntxt.setForeground(java.awt.Color.gray);
        lntxt.setText("Last Name");
        lntxt.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(246, 246, 246)));
        lntxt.setMargin(new java.awt.Insets(10, 10, 10, 10));
        lntxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lntxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lntxtFocusLost(evt);
            }
        });
        halfbg1.add(lntxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 290, 50));

        emailtxt.setBackground(new java.awt.Color(246, 246, 246));
        emailtxt.setForeground(java.awt.Color.gray);
        emailtxt.setText("NU Email");
        emailtxt.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(246, 246, 246)));
        emailtxt.setMargin(new java.awt.Insets(10, 10, 10, 10));
        emailtxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailtxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailtxtFocusLost(evt);
            }
        });
        halfbg1.add(emailtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, 290, 50));

        getContentPane().add(halfbg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 550, 700));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arfit/canva/images/login-txt2.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 570, 360, 80));

        halfbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arfit/canva/images/half-bg-new.jpg"))); // NOI18N
        getContentPane().add(halfbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 580, 700));

        setSize(new java.awt.Dimension(1100, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerBtnActionPerformed

    private void nuidtxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nuidtxtFocusGained
        //placeholder
        if (nuidtxt.getText().equals("Student ID")) {
            nuidtxt.setText("");
            nuidtxt.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_nuidtxtFocusGained

    private void nuidtxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nuidtxtFocusLost
        if (nuidtxt.getText().equals("")) {
            nuidtxt.setText("Student ID");
            nuidtxt.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_nuidtxtFocusLost

    private void fntxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fntxtFocusGained
        if (fntxt.getText().equals("First Name")) {
            fntxt.setText("");
            fntxt.setForeground(Color.BLACK);
        } 
    }//GEN-LAST:event_fntxtFocusGained

    private void fntxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fntxtFocusLost
        if (fntxt.getText().equals("")) {
            fntxt.setText("First Name");
            fntxt.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_fntxtFocusLost

    private void lntxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lntxtFocusGained
        if (lntxt.getText().equals("Last Name")) {
            lntxt.setText("");
            lntxt.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_lntxtFocusGained

    private void lntxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lntxtFocusLost
        if (lntxt.getText().equals("")) {
            lntxt.setText("Last Name");
            lntxt.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_lntxtFocusLost

    private void emailtxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailtxtFocusGained
        if (emailtxt.getText().equals("NU Email")) {
            emailtxt.setText("");
            emailtxt.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_emailtxtFocusGained

    private void emailtxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailtxtFocusLost
        if (emailtxt.getText().equals("")) {
            emailtxt.setText("NU Email");
            emailtxt.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_emailtxtFocusLost

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
    private javax.swing.JTextField emailtxt;
    private javax.swing.JTextField fntxt;
    private javax.swing.JLabel halfbg;
    private javax.swing.JPanel halfbg1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField lntxt;
    private javax.swing.JTextField nuidtxt;
    private javax.swing.JButton registerBtn;
    // End of variables declaration//GEN-END:variables
}
