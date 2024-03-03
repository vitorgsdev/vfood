/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Classes.Pedido;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Classes.Produto;

/**
 *
 * @author aluno
 */
public class TelaVerCarrinhoFecharComanda extends javax.swing.JFrame {

    public static int codigoMesaCarrinho;
    public double precoTotalPedido;

    /**
     * Creates new form TelaFuncionario
     */
    public TelaVerCarrinhoFecharComanda(int codigoMesa) {
        initComponents();
        this.setLocationRelativeTo(null);
        codigoMesaCarrinho = codigoMesa;
        DefaultTableModel dtmTableListaPedidosCliente = (DefaultTableModel) jTableListaPedidoCliente.getModel();
        for (int i = 0; i < Pedido.listaPedidos.size(); i++) {
            if (Pedido.listaPedidos.get(i).getCodigoMesa() == codigoMesaCarrinho) {
                precoTotalPedido += Pedido.listaPedidos.get(i).getValorPedido();
                dtmTableListaPedidosCliente.addRow(new Object[]{
                    Pedido.listaPedidos.get(i).getCodigoPedido(), Pedido.listaPedidos.get(i).getCodigoMesa(), Pedido.listaPedidos.get(i).getNomePedido(),
                    Pedido.listaPedidos.get(i).getCategoriaPedido(), Pedido.listaPedidos.get(i).getValorPedido()
                });
            }
        }
        jLabelValorCarrinhoCliente.setText(String.valueOf(precoTotalPedido));
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListaPedidoCliente = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabelValorCarrinhoCliente = new javax.swing.JLabel();
        btnFecharComanda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Fira Code", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Lista de Pedidos");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 209, 172), 3));

        jTableListaPedidoCliente.setBackground(new java.awt.Color(240, 240, 240));
        jTableListaPedidoCliente.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        jTableListaPedidoCliente.setForeground(new java.awt.Color(0, 0, 0));
        jTableListaPedidoCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Pedido", "Código Mesa", "Nome", "Categoria", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableListaPedidoCliente.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTableListaPedidoCliente.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTableListaPedidoCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTableListaPedidoClienteMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTableListaPedidoCliente);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1176, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Fira Code", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));

        btnVoltar.setBackground(new java.awt.Color(0, 0, 0));
        btnVoltar.setFont(new java.awt.Font("Fira Code", 1, 18)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(45, 209, 172));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Fira Code", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Preço Total:");

        jLabelValorCarrinhoCliente.setFont(new java.awt.Font("Fira Code", 1, 24)); // NOI18N
        jLabelValorCarrinhoCliente.setForeground(new java.awt.Color(45, 209, 172));
        jLabelValorCarrinhoCliente.setText("jLabel4");

        btnFecharComanda.setBackground(new java.awt.Color(0, 0, 0));
        btnFecharComanda.setFont(new java.awt.Font("Fira Code", 1, 18)); // NOI18N
        btnFecharComanda.setForeground(new java.awt.Color(45, 209, 172));
        btnFecharComanda.setText("Fechar Comanda");
        btnFecharComanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharComandaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVoltar)
                        .addGap(311, 311, 311)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelValorCarrinhoCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFecharComanda)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(439, 439, 439)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnFecharComanda, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelValorCarrinhoCliente)))
                .addContainerGap())
        );

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

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaFuncionario telaFuncionario = new TelaFuncionario();
        telaFuncionario.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void jTableListaPedidoClienteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListaPedidoClienteMouseReleased

    }//GEN-LAST:event_jTableListaPedidoClienteMouseReleased

    private void btnFecharComandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharComandaActionPerformed
        int confirmarFecharComanda = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente fechar a comanda?", "FECHAR COMANDA!!!", JOptionPane.YES_NO_OPTION);
        if (confirmarFecharComanda == JOptionPane.YES_OPTION) {
            for (int i = Pedido.listaPedidos.size() - 1; i >= 0; i--) {
                if (Pedido.listaPedidos.get(i).getCodigoMesa() == codigoMesaCarrinho) {
                    Pedido.listaPedidos.remove(i);
                }
            }
        }
        TelaFuncionario telaFuncionario = new TelaFuncionario();
        telaFuncionario.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnFecharComandaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaVerCarrinhoFecharComanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVerCarrinhoFecharComanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVerCarrinhoFecharComanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVerCarrinhoFecharComanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new TelaVerCarrinhoFecharComanda(codigoMesaCarrinho).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFecharComanda;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelValorCarrinhoCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListaPedidoCliente;
    // End of variables declaration//GEN-END:variables
}
