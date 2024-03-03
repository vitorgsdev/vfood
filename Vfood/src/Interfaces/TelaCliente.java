/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Classes.Produto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pichau
 */
public class TelaCliente extends javax.swing.JFrame {

    /**
     * Creates new form TelaCliente
     */
    public TelaCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
         btnCadastrarPedido.setEnabled(false);
        DefaultTableModel dtmTableListaProdutoCliente = (DefaultTableModel) jTableListaProdutosCliente.getModel();
        for (int i = 0; i < Produto.listaProdutos.size(); i++) {
            dtmTableListaProdutoCliente.addRow(new Object[]{
                Produto.listaProdutos.get(i).getNomeProduto(), Produto.listaProdutos.get(i).getPrecoProduto(),
                Produto.listaProdutos.get(i).getCategoria(), Produto.listaProdutos.get(i).getQtdProdutoDisponivel()
            });
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
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTableListaProdutosCliente = new javax.swing.JTable();
        btnVoltarTelaInicial = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        btnCarrinhoCliente = new javax.swing.JButton();
        btnCadastrarPedido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Fira Code", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("SEJA BEM VINDO CLIENTE");

        jLabel4.setFont(new java.awt.Font("Fira Code", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("FAÇA SEU PEDIDO");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 209, 172), 3));
        jPanel5.setPreferredSize(new java.awt.Dimension(504, 240));

        jTableListaProdutosCliente.setBackground(new java.awt.Color(240, 240, 240));
        jTableListaProdutosCliente.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        jTableListaProdutosCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Preço", "Categoria", "Quantidade Disponível"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableListaProdutosCliente.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTableListaProdutosCliente.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTableListaProdutosCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTableListaProdutosClienteMouseReleased(evt);
            }
        });
        jScrollPane10.setViewportView(jTableListaProdutosCliente);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
        );

        btnVoltarTelaInicial.setBackground(new java.awt.Color(0, 0, 0));
        btnVoltarTelaInicial.setFont(new java.awt.Font("Fira Code", 1, 24)); // NOI18N
        btnVoltarTelaInicial.setForeground(new java.awt.Color(45, 209, 172));
        btnVoltarTelaInicial.setText("TELA INICIAL");
        btnVoltarTelaInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarTelaInicialActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(240, 240, 240));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 209, 172), 3));

        btnCarrinhoCliente.setBackground(new java.awt.Color(0, 0, 0));
        btnCarrinhoCliente.setFont(new java.awt.Font("Fira Code", 1, 24)); // NOI18N
        btnCarrinhoCliente.setForeground(new java.awt.Color(45, 209, 172));
        btnCarrinhoCliente.setText("VER CARRINHO");
        btnCarrinhoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarrinhoClienteActionPerformed(evt);
            }
        });

        btnCadastrarPedido.setBackground(new java.awt.Color(0, 0, 0));
        btnCadastrarPedido.setFont(new java.awt.Font("Fira Code", 1, 24)); // NOI18N
        btnCadastrarPedido.setForeground(new java.awt.Color(45, 209, 172));
        btnCadastrarPedido.setText("FAZER PEDIDO");
        btnCadastrarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCarrinhoCliente)
                    .addComponent(btnCadastrarPedido))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCarrinhoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastrarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 458, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(439, 439, 439))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(525, 525, 525))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnVoltarTelaInicial)
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltarTelaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarTelaInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarTelaInicialActionPerformed
        TelaInicial telaInicial = new TelaInicial();
        telaInicial.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarTelaInicialActionPerformed

    private void btnCarrinhoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarrinhoClienteActionPerformed
        TelaPesquisarCodigoMesaCliente telaPesquisarCodigoMesaCliente = new TelaPesquisarCodigoMesaCliente();
        telaPesquisarCodigoMesaCliente.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCarrinhoClienteActionPerformed

    private void btnCadastrarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarPedidoActionPerformed
        int linhaSelecionada = jTableListaProdutosCliente.getSelectedRow();
        int validaQtdDisponivel = (int) jTableListaProdutosCliente.getValueAt(linhaSelecionada, 3);
        if (validaQtdDisponivel <= 0) {
            JOptionPane.showMessageDialog(rootPane, "Produto Indisponível no momento!!!", "Atenção!!!", HEIGHT);
        } else {
            String nomeProduto = (String) jTableListaProdutosCliente.getValueAt(linhaSelecionada, 0);
            double precoProduto = (double) jTableListaProdutosCliente.getValueAt(linhaSelecionada, 1);
            String categoriaProduto = (String) jTableListaProdutosCliente.getValueAt(linhaSelecionada, 2);

            TelaCadastroPedido telaCadastroPedido = new TelaCadastroPedido(nomeProduto, precoProduto, categoriaProduto, linhaSelecionada);
            telaCadastroPedido.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnCadastrarPedidoActionPerformed

    private void jTableListaProdutosClienteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListaProdutosClienteMouseReleased
        int linhaSelecionada = jTableListaProdutosCliente.getSelectedRow();
        if (linhaSelecionada != -1) {
            btnCadastrarPedido.setEnabled(true);
        }
    }//GEN-LAST:event_jTableListaProdutosClienteMouseReleased

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
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarPedido;
    private javax.swing.JButton btnCarrinhoCliente;
    private javax.swing.JButton btnVoltarTelaInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JTable jTableListaProdutosCliente;
    // End of variables declaration//GEN-END:variables
}