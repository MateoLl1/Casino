/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import javax.swing.JOptionPane;

/**
 *
 * @author mateo
 */
public class frmInicio extends javax.swing.JFrame {

    public static int inicial=0;
    public frmInicio() {
        initComponents();
        setLocationRelativeTo(null);
        rsscalelabel.RSScaleLabel.setScaleLabel(lblFondo,"src/imagenes/fondo.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblCuadro,"src/imagenes/cuadro.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblJugar,"src/imagenes/play.png");
        
        
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
        txtValor = new javax.swing.JTextField();
        lblCuadro = new javax.swing.JLabel();
        lblJugar = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Ingrese un valor para empezar");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 190, 30));

        txtValor.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                txtValorComponentAdded(evt);
            }
        });
        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });
        jPanel1.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 70, -1));
        jPanel1.add(lblCuadro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 250, 130));

        lblJugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblJugarMouseClicked(evt);
            }
        });
        jPanel1.add(lblJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 160, 150));
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        
    }//GEN-LAST:event_txtValorActionPerformed

    private void txtValorComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txtValorComponentAdded
        
    }//GEN-LAST:event_txtValorComponentAdded

    private void lblJugarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJugarMouseClicked
        if (txtValor.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Ingrese un valor");
        }else{
            inicial =Integer.valueOf(txtValor.getText());
            frmCasino obj1 = new frmCasino();
            obj1.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_lblJugarMouseClicked

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
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCuadro;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblJugar;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
