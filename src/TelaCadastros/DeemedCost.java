/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TelaCadastros;

import conn.ConexaoMySQL;
import tools.FiltrarTabela;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luiz.barcellos
 */
public class DeemedCost extends javax.swing.JInternalFrame {

    private ConexaoMySQL cn;
    private DecimalFormat df = new DecimalFormat("#,##0.00");
    private DateFormat dateIn = new SimpleDateFormat("dd/MM/yyyy");

    /**
     * Creates new form DeemedCost
     */
    public DeemedCost(ConexaoMySQL conn) {
        initComponents();
this.cn = conn;
        montaSetores();

        montaTblAvaliacao();
        montaTblLancamentos();
        pesquisaLancamentos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setClosable(true);
        setTitle("Combinar Lançamentos");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Avaliação"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel1.setText("Pesquisar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel1))
        );

        jButton3.setText("Combinar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Lançamentos de Avaliação");

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField2.setEnabled(false);

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField3.setEnabled(false);

        jLabel3.setText("Lançamentos Contábeis");

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setText("Auto");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton3)
                .addComponent(jLabel2)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel3)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton1)
                .addComponent(jButton4))
        );

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lançamentos Contábeis"));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        new FiltrarTabela(jTable1, jTextField1.getText());        // TODO add your handling code here:
        new FiltrarTabela(jTable2, jTextField1.getText());        // TODO add your handling code here:
        contaLancamentos();
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        gravar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextField1.setText("");
        montaTblAvaliacao();
        montaTblLancamentos();
        pesquisaLancamentos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTable1.setRowSelectionInterval(0, 0);
        jTable2.setRowSelectionInterval(0, 0);
        gravar();
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    private void montaTblAvaliacao() {

        DefaultTableModel avaliacao = (DefaultTableModel) jTable1.getModel();

        avaliacao.setRowCount(0);
        avaliacao.setColumnCount(0);

        avaliacao.addColumn("Item");
        avaliacao.addColumn("Entrada");
        avaliacao.addColumn("Estabelecimento");
        avaliacao.addColumn("Complemento");
        avaliacao.addColumn("Valor");

        jTable1.getColumnModel().getColumn(0).setMaxWidth(40);
        jTable1.getColumnModel().getColumn(0).setMinWidth(40);
        jTable1.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(40);
        jTable1.getTableHeader().getColumnModel().getColumn(0).setMinWidth(40);
        jTable1.getColumnModel().getColumn(1).setMaxWidth(80);
        jTable1.getColumnModel().getColumn(1).setMinWidth(80);
        jTable1.getTableHeader().getColumnModel().getColumn(1).setMaxWidth(80);
        jTable1.getTableHeader().getColumnModel().getColumn(1).setMinWidth(80);
        jTable1.getColumnModel().getColumn(2).setMaxWidth(80);
        jTable1.getColumnModel().getColumn(2).setMinWidth(80);
        jTable1.getTableHeader().getColumnModel().getColumn(2).setMaxWidth(80);
        jTable1.getTableHeader().getColumnModel().getColumn(2).setMinWidth(80);
        jTable1.getColumnModel().getColumn(4).setMaxWidth(80);
        jTable1.getColumnModel().getColumn(4).setMinWidth(80);
        jTable1.getTableHeader().getColumnModel().getColumn(4).setMaxWidth(80);
        jTable1.getTableHeader().getColumnModel().getColumn(4).setMinWidth(80);

    }

    private void montaTblLancamentos() {

        DefaultTableModel lancamentos = (DefaultTableModel) jTable2.getModel();

        lancamentos.setRowCount(0);
        lancamentos.setColumnCount(0);

        lancamentos.addColumn("Código");
        lancamentos.addColumn("Data");
        lancamentos.addColumn("Complemento");
        lancamentos.addColumn("Valor");

        jTable2.getColumnModel().getColumn(0).setMaxWidth(80);
        jTable2.getColumnModel().getColumn(0).setMinWidth(80);
        jTable2.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(80);
        jTable2.getTableHeader().getColumnModel().getColumn(0).setMinWidth(80);
        jTable2.getColumnModel().getColumn(1).setMaxWidth(80);
        jTable2.getColumnModel().getColumn(1).setMinWidth(80);
        jTable2.getTableHeader().getColumnModel().getColumn(1).setMaxWidth(80);
        jTable2.getTableHeader().getColumnModel().getColumn(1).setMinWidth(80);
        jTable2.getColumnModel().getColumn(3).setMaxWidth(80);
        jTable2.getColumnModel().getColumn(3).setMinWidth(80);
        jTable2.getTableHeader().getColumnModel().getColumn(3).setMaxWidth(80);
        jTable2.getTableHeader().getColumnModel().getColumn(3).setMinWidth(80);
    }

    private void pesquisaLancamentos() {
        String sql;
        DefaultTableModel lancamentos = (DefaultTableModel) jTable2.getModel();
        DefaultTableModel avaliacao = (DefaultTableModel) jTable1.getModel();

        // LANCAMENTOS DAS REAVALIAÇÕES
        sql = "select * from fechamento.deemedcost a "
                + "left join fechamento.deemedcost_lctos b on (b.lancamento = a.ctb_lcto) "
                + "where b.lancamento is null ";

        if (!"TODOS".equals(jComboBox1.getSelectedItem().toString())) {
            sql += "AND a.setor = '" + jComboBox1.getSelectedItem().toString() + "' ";
        }

        sql += " ORDER BY a.descricao;";

        if (cn.iniciarTransacao()) {
            try {
                cn.executeConsulta(sql);

                while (cn.rs.next()) {
                    avaliacao.addRow(new String[]{
                        cn.rs.getString("id"),
                        cn.rs.getString("entrada"),
                        cn.rs.getString("estab"),
                        cn.rs.getString("descricao"),
                        df.format(cn.rs.getDouble("vlr_dc"))
                    });
                }
                cn.rs.close();

                sql = "select * from fechamento.deemedcost_lctos b "
                        + "left join fechamento.deemedcost a on (b.lancamento = a.ctb_lcto) "
                        + "where a.id is null AND b.data = '2013-12-31' "
                        + "ORDER BY b.complemento;";
                cn.executeConsulta(sql);
                while (cn.rs.next()) {
                    lancamentos.addRow(new String[]{
                        cn.rs.getString("lancamento"),
                        dateIn.format(cn.rs.getDate("data")),
                        cn.rs.getString("complemento"),
                        df.format(cn.rs.getDouble("debitos") - cn.rs.getDouble("creditos"))
                    });
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {
                cn.finalizarTransacao();
            }
        }

        contaLancamentos();

    }

    private void contaLancamentos() {
        jTextField2.setText(jTable1.getRowCount() + "");
        jTextField3.setText(jTable2.getRowCount() + "");
    }

    private void filtraTabelas() {
        new FiltrarTabela(jTable1, jTextField1.getText());
        new FiltrarTabela(jTable2, jTextField1.getText());
    }

    private void montaSetores() {
        jComboBox1.removeAllItems();

        jComboBox1.addItem("TODOS");

        String sql = "SELECT DISTINCT setor FROM deemedcost ORDER BY setor;";

        if (cn.iniciarTransacao()) {
            try {
                cn.executeConsulta(sql);
                while (cn.rs.next()) {
                    jComboBox1.addItem(cn.rs.getString("setor"));
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            } finally {
                cn.finalizarTransacao();
            }
        }
    }

    private void gravar() {
        int linha1 = jTable1.getSelectedRow();
        int linha2 = jTable2.getSelectedRow();

        if (linha1 >= 0 && linha2 >= 0) {

            String produto = jTable1.getValueAt(linha1, 0).toString();
            String entrada = jTable1.getValueAt(linha1, 1).toString();
            String estabelecimento = jTable1.getValueAt(linha1, 2).toString();
            String complemento1 = jTable1.getValueAt(linha1, 3).toString();
            String valor1 = jTable1.getValueAt(linha1, 4).toString();

            String lancamento = jTable2.getValueAt(linha2, 0).toString();
            String complemento2 = jTable2.getValueAt(linha2, 2).toString();
            String valor2 = jTable2.getValueAt(linha2, 3).toString();

            salvar:
            if (valor1.equals(valor2)) {

                if (!complemento1.replace(" ", "").replace(".", "").equals(complemento2.replace(" ", "").replace(".", ""))) {
                    int x = JOptionPane.showConfirmDialog(this, "Os complementos não são semelhantes."
                            + "\nC1: " + complemento1 + "."
                            + "\nC2: " + complemento2 + "."
                            + "\nDeseja Continuar?", "Verificação de Históricos", JOptionPane.YES_NO_OPTION);
                    if (x == 1) {
                        break salvar;
                    }
                }

                String sql = "UPDATE fechamento.deemedcost SET ctb_lcto = '" + lancamento + "' "
                        + "WHERE id = '" + produto + "' AND entrada = '" + entrada + "' "
                        + "AND estab = '" + estabelecimento + "';";

                if (cn.iniciarTransacao()) {
                    try {
                        cn.executeAtualizacao(sql);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, e);
                    } finally {
                        cn.finalizarTransacao();

                        montaTblAvaliacao();
                        montaTblLancamentos();
                        pesquisaLancamentos();

                        filtraTabelas();

                        if ("0".equals(jTextField2.getText()) || "0".equals(jTextField3.getText())) {
                            jTextField1.setText("");
                            filtraTabelas();
                            contaLancamentos();
                            jTextField1.grabFocus();
                        }
                    }
                }

            } else {
                JOptionPane.showMessageDialog(this, "Valores dos lançamentos não são iguais.");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Você precisa selecionar linhas em ambas as tabelas para combinar.");
        }
    }

}