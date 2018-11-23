/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TelaCadastros;

import conn.ConexaoMySQL;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luiz.barcellos
 */
public class PrecoMercado extends javax.swing.JInternalFrame {
    
    private int var_consulta;
    
    private final DateFormat dateOut = new SimpleDateFormat("yyyy/MM/dd");
    private final DateFormat dateIn = new SimpleDateFormat("dd/MM/yyyy");
    
    private final DecimalFormat df = new DecimalFormat("#0.00");
    
    private ConexaoMySQL cn;

    /**
     * Creates new form PrecoMercado
     */
    public PrecoMercado(ConexaoMySQL conn) {
        initComponents();
        this.cn = conn;
        montaTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPesquisar = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        jTxtPesquisa_Multi = new javax.swing.JTextField();
        jBtnConfirmar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTblConsulta_Multi = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jSpData = new javax.swing.JSpinner();
        jBtnPesquisar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTxtId = new javax.swing.JTextField();
        jTxtNome = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new tools.JNumberFormatField99(tools.MascaraTextField.numeroBR());
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jBtnAdd = new javax.swing.JButton();
        jBtnAddM = new javax.swing.JButton();

        jPesquisar.setTitle("Pesquisar");
        jPesquisar.setMinimumSize(new java.awt.Dimension(700, 400));

        jTxtPesquisa_Multi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTxtPesquisa_Multi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTxtPesquisa_MultiKeyReleased(evt);
            }
        });

        jBtnConfirmar.setText("Adicionar");
        jBtnConfirmar.setEnabled(false);
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jTblConsulta_Multi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTblConsulta_Multi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTblConsulta_Multi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTblConsulta_MultiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTblConsulta_MultiMouseEntered(evt);
            }
        });
        jScrollPane4.setViewportView(jTblConsulta_Multi);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 453, Short.MAX_VALUE)
                        .addComponent(jBtnCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnConfirmar))
                    .addComponent(jTxtPesquisa_Multi)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTxtPesquisa_Multi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnConfirmar)
                    .addComponent(jBtnCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPesquisarLayout = new javax.swing.GroupLayout(jPesquisar.getContentPane());
        jPesquisar.getContentPane().setLayout(jPesquisarLayout);
        jPesquisarLayout.setHorizontalGroup(
            jPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPesquisarLayout.setVerticalGroup(
            jPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setClosable(true);
        setTitle("Preço de Mercado");

        jSpData.setModel(new javax.swing.SpinnerDateModel());
        jSpData.setEditor(new javax.swing.JSpinner.DateEditor(jSpData, "dd/MM/yyyy"));

        jBtnPesquisar.setText("Pesquisar");
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSpData, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnPesquisar))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel1.setText("Produto");

        jTxtId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTxtIdFocusLost(evt);
            }
        });

        jTxtNome.setEnabled(false);

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Valor");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jBtnAdd.setText("(+)");
        jBtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddActionPerformed(evt);
            }
        });

        jBtnAddM.setText("( - )");
        jBtnAddM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnAddM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnAddM)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
        listaProdutos();

    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void jBtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddActionPerformed
        String data = dateOut.format(jSpData.getValue());
        String id = jTxtId.getText();
        Double valor = Double.parseDouble(jTextField1.getText().replace(".", "").replace(",", "."));
        
        if (!"".equals(jTxtNome.getText())) {
            
            String sql = "INSERT INTO preco_mercado (competencia, id_produto, valor) "
                    + "VALUES ('" + data + "','" + id + "','" + valor + "');";
            try {
                cn.iniciarTransacao();
                cn.executeAtualizacao(sql);
                limpaCampos();
                listaProdutos();
            } catch (SQLException e) {
                tools.DefaultMsg.errorMsg(e.getMessage());
            } finally {
                cn.finalizarTransacao();
            }
            
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um produto para cadastar.");
        }
        

    }//GEN-LAST:event_jBtnAddActionPerformed

    private void jBtnAddMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddMActionPerformed
        int linha = jTable1.getSelectedRow();
        
        if (linha > -1) {
            String data = dateOut.format(jSpData.getValue());
            String id = jTable1.getValueAt(linha, 0).toString();
            String sql = "DELETE FROM preco_mercado "
                    + "WHERE competencia = '" + data + "' "
                    + "AND id_produto = '" + id + "';";
            try {
                cn.iniciarTransacao();
                cn.executeAtualizacao(sql);
                listaProdutos();
            } catch (SQLException e) {
                tools.DefaultMsg.errorMsg(e.getMessage());
            } finally {
                cn.finalizarTransacao();
            }
        }
    }//GEN-LAST:event_jBtnAddMActionPerformed

    private void jTxtPesquisa_MultiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtPesquisa_MultiKeyReleased
        montaLista();
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtPesquisa_MultiKeyReleased

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
        incluiPesquisa();
        jPesquisar.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        jPesquisar.setVisible(false);        // TODO add your handling code here:
        jPesquisar.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jTblConsulta_MultiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblConsulta_MultiMouseClicked
        jBtnConfirmar.setEnabled(true);    // TODO add your handling code here:
    }//GEN-LAST:event_jTblConsulta_MultiMouseClicked

    private void jTblConsulta_MultiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblConsulta_MultiMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTblConsulta_MultiMouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        var_consulta = 1;
        
        jPesquisar.setVisible(true);
        
        montaLista();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTxtIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtIdFocusLost
        jTxtNome.setText("");
        if (!"".equals(jTxtId.getText())) {
            
            var_consulta = 11;
            
            incluiPesquisa();
        }
    }//GEN-LAST:event_jTxtIdFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAdd;
    private javax.swing.JButton jBtnAddM;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JFrame jPesquisar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSpinner jSpData;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTblConsulta_Multi;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTxtId;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtPesquisa_Multi;
    // End of variables declaration//GEN-END:variables

    private void incluiPesquisa() {
        
        String data = dateOut.format(jSpData.getValue());
        
        int linha = jTblConsulta_Multi.getSelectedRow();
        
        switch (var_consulta) {
            case 1:
                jTxtId.setText(jTblConsulta_Multi.getValueAt(linha, 0).toString());
            case 11:
                String id = jTxtId.getText();
                String sql = "SELECT * FROM cad_produtos "
                        + "WHERE base is null AND id = " + id + " "
                        + "AND id not in (SELECT id_produto FROM preco_mercado WHERE competencia = '" + data + "') "
                        + "ORDER BY descricao;";
                
                try {
                    cn.iniciarTransacao();
                    cn.executeConsulta(sql);
                    while (cn.rs.next()) {
                        jTxtNome.setText(cn.rs.getString("descricao"));
                    }
                } catch (SQLException ex) {
                    
                    JOptionPane.showMessageDialog(null, "Erro ao consultar o banco de dados: " + ex);
                }
                cn.finalizarTransacao();
                
                break;
        }
    }
    
    private void montaTabela() {
        DefaultTableModel lista = (DefaultTableModel) jTable1.getModel();
        
        lista.setRowCount(0);
        lista.setColumnCount(0);
        
        lista.addColumn("Id");
        lista.addColumn("Produto");
        lista.addColumn("Valor");
        
        jTable1.getColumnModel().getColumn(0).setMaxWidth(50);
        jTable1.getColumnModel().getColumn(0).setMinWidth(50);
        jTable1.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(50);
        jTable1.getTableHeader().getColumnModel().getColumn(0).setMinWidth(50);
        jTable1.getColumnModel().getColumn(2).setMaxWidth(100);
        jTable1.getColumnModel().getColumn(2).setMinWidth(100);
        jTable1.getTableHeader().getColumnModel().getColumn(2).setMaxWidth(100);
        jTable1.getTableHeader().getColumnModel().getColumn(2).setMinWidth(100);
    }
    
    private void montaLista() {
        DefaultTableModel lista = (DefaultTableModel) jTblConsulta_Multi.getModel();
        
        lista.setRowCount(0);
        lista.setColumnCount(0);
        
        lista.addColumn("Id");
        lista.addColumn("Produto");
        
        jTblConsulta_Multi.getColumnModel().getColumn(0).setMaxWidth(50);
        jTblConsulta_Multi.getColumnModel().getColumn(0).setMinWidth(50);
        jTblConsulta_Multi.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(50);
        jTblConsulta_Multi.getTableHeader().getColumnModel().getColumn(0).setMinWidth(50);
        
        String data = dateOut.format(jSpData.getValue());
        
        String sql = "SELECT * FROM cad_produtos "
                + "WHERE base is null "
                + "AND id not in (SELECT id_produto FROM preco_mercado WHERE competencia = '" + data + "') "
                + "ORDER BY descricao;";
        
        try {
            cn.iniciarTransacao();
            cn.executeConsulta(sql);
            while (cn.rs.next()) {
                
                lista.addRow(new String[]{
                    cn.rs.getString("id"),
                    cn.rs.getString("descricao")
                });
            }
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Erro ao consultar o banco de dados: " + ex);
        }
        cn.finalizarTransacao();
        
    }
    
    private void listaProdutos() {
        montaLista();
        
        String data = dateOut.format(jSpData.getValue());
        
        String sql = "SELECT a.id_produto, a.valor, b.descricao "
                + "FROM preco_mercado a "
                + "LEFT JOIN cad_produtos b on (b.id = a.id_produto) "
                + "WHERE competencia = '" + data + "';";
        
        montaTabela();
        
        DefaultTableModel lista = (DefaultTableModel) jTable1.getModel();
        
        try {
            cn.iniciarTransacao();
            cn.executeConsulta(sql);
            while (cn.rs.next()) {
                
                lista.addRow(new String[]{
                    cn.rs.getString("id_produto"),
                    cn.rs.getString("descricao"),
                    df.format(cn.rs.getDouble("valor"))
                });
            }
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Erro ao consultar o banco de dados: " + ex);
        }
        cn.finalizarTransacao();
    }
    
    private void limpaCampos() {
        jTxtId.setText("");
        jTxtNome.setText("");
    }
}