/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author acer
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jmbTelaPrincipal = new javax.swing.JMenuBar();
        jmPrincipalProdutos = new javax.swing.JMenu();
        jmiListaProdutos = new javax.swing.JMenuItem();
        jmPrincipalVendas = new javax.swing.JMenu();
        jmiRealizarVendas = new javax.swing.JMenuItem();
        jmPrincipalBalanço = new javax.swing.JMenu();
        jmiVerBalanco = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 323, Short.MAX_VALUE)
        );

        jmPrincipalProdutos.setText("Produtos");

        jmiListaProdutos.setText("Lista de produtos");
        jmiListaProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiListaProdutosActionPerformed(evt);
            }
        });
        jmPrincipalProdutos.add(jmiListaProdutos);

        jmbTelaPrincipal.add(jmPrincipalProdutos);

        jmPrincipalVendas.setText("Vendas");
        jmPrincipalVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPrincipalVendasActionPerformed(evt);
            }
        });

        jmiRealizarVendas.setText("Realizar venda");
        jmiRealizarVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRealizarVendasActionPerformed(evt);
            }
        });
        jmPrincipalVendas.add(jmiRealizarVendas);

        jmbTelaPrincipal.add(jmPrincipalVendas);

        jmPrincipalBalanço.setText("Balanço");

        jmiVerBalanco.setText("Ver balanço");
        jmiVerBalanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiVerBalancoActionPerformed(evt);
            }
        });
        jmPrincipalBalanço.add(jmiVerBalanco);

        jmbTelaPrincipal.add(jmPrincipalBalanço);

        setJMenuBar(jmbTelaPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmPrincipalVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPrincipalVendasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmPrincipalVendasActionPerformed

    private void jmiRealizarVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRealizarVendasActionPerformed
        
        TelaVendas telaVend = new TelaVendas();
        jDesktopPane1.add(telaVend);
        telaVend.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jmiRealizarVendasActionPerformed

    private void jmiListaProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiListaProdutosActionPerformed
        TelaProdutos telaProd = new TelaProdutos();
        jDesktopPane1.add(telaProd);
        telaProd.setVisible(true);
    }//GEN-LAST:event_jmiListaProdutosActionPerformed

    private void jmiVerBalancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiVerBalancoActionPerformed
        TelaBalanco telaBal = new TelaBalanco();
        jDesktopPane1.add(telaBal);
        telaBal.setVisible(true);
    }//GEN-LAST:event_jmiVerBalancoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jmPrincipalBalanço;
    private javax.swing.JMenu jmPrincipalProdutos;
    private javax.swing.JMenu jmPrincipalVendas;
    private javax.swing.JMenuBar jmbTelaPrincipal;
    private javax.swing.JMenuItem jmiListaProdutos;
    private javax.swing.JMenuItem jmiRealizarVendas;
    private javax.swing.JMenuItem jmiVerBalanco;
    // End of variables declaration//GEN-END:variables
}
