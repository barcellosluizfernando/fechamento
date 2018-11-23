/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financiamentos;

import conn.ConexaoMySQL;
import tools.ColorRender;
import tools.FinContratosJuros;
import tools.FinIntegracao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ferna
 */
public class Fin_Juros extends javax.swing.JInternalFrame {

    private String sql;

    private final ConexaoMySQL cn;

    private FinContratosJuros juros;
    private FinIntegracao integ;

    /**
     * Creates new form Fin_Juros
     *
     * @param conn
     */
    public Fin_Juros(ConexaoMySQL conn) {

        initComponents();
        this.cn = conn;
        juros = new FinContratosJuros(conn);
        integ = new FinIntegracao(conn);
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

        jPanel1 = new javax.swing.JPanel();
        jTxtCompetencia = new javax.swing.JFormattedTextField(tools.MascaraTextField.competenceBR());
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setTitle("Apropriar Juros nos Contratos");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa de Contratos"));

        jLabel1.setText("Competência");

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setEnabled(false);

        jLabel2.setText("Juros Calculados");

        jLabel3.setText("Quantidade");

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField2.setEnabled(false);

        jButton2.setText("Gravar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Calculados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtCompetencia, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jTxtCompetencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel1)
                .addComponent(jButton1)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2)
                .addComponent(jLabel3)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton2)
                .addComponent(jCheckBox1))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Contratos em Aberto"));

        jTable1.setAutoCreateRowSorter(true);
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
        jTable1.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String competencia = jTxtCompetencia.getText();

        int importar = JOptionPane.showConfirmDialog(this, "Deseja importar os movimentos do Mês?", "Cálculo de juros", JOptionPane.YES_NO_OPTION);

        try {

            if (importar == 0 && jCheckBox1.isSelected() == false) {
                //JOptionPane.showMessageDialog(null, "Importado. Data Inicial: 01/" + competencia + ". Data Final: " + tools.FormatNumbers.dateBrDefault(tools.ManipulaData.lastDay(competencia)));

                integ.buscaMovimentos("01/" + competencia, tools.FormatNumbers.dateBrDefault(tools.ManipulaData.lastDay(competencia)));

            }

            buscaContratos(competencia);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            gravaDados(jCheckBox1.isSelected());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private static javax.swing.JTextField jTxtCompetencia;
    // End of variables declaration//GEN-END:variables

    private void buscaContratos(String competencia) {
        DefaultTableModel lista = montaTabela();
        Double jurosAcumulados = 0.00;
        int linha = 0;
        jTextField1.setText("");

        if (cn.iniciarTransacao()) {
            try {
                sql = "call fechamento.fin_endividamento('" + tools.FormatNumbers.dateUsDefault(tools.ManipulaData.lastDay(competencia)) + "');";
                cn.executeAtualizacao(sql);
                sql = "SELECT * FROM tmp_endividamento WHERE liquidado IS FALSE and autoupd IS TRUE;";
                cn.executeConsulta(sql);
                while (cn.rs.next()) {
                    juros.calculaContrato(cn.rs.getString("numero"), cn.rs.getString("fornecedor"), competencia, null);
                    lista.addRow(new String[]{
                        cn.rs.getString("numero"),
                        cn.rs.getString("fornecedor"),
                        tools.FormatNumbers.dateBrDefault(cn.rs.getDate("liberacao")),
                        tools.FormatNumbers.numUsToBr(juros.getSaldoInicial()),
                        tools.FormatNumbers.numUsToBr(juros.getJurosAcumulados()),
                        tools.FormatNumbers.numUsToBr(juros.getSaldoFinal()),
                        cn.rs.getString("id")
                    });
                }
                cn.rs.close();

                sql = "SELECT a.numero, a.fornecedor, a.liberacao, a.id, a.saldo, b.juros  "
                        + "FROM tmp_endividamento a "
                        + "LEFT JOIN fechamento.fin_contratos_juros_padrao b "
                        + "     ON (b.competencia = '" + tools.FormatNumbers.dateUsDefault(tools.ManipulaData.lastDay(competencia)) + "' "
                        //+ "         AND b.apropriado is FALSE "
                        + "         AND b.numero = a.numero) "
                        + "WHERE autoupd IS FALSE and round(a.saldo,2) > 0.00;";
                cn.executeConsulta(sql);
                while (cn.rs.next()) {
                    lista.addRow(new String[]{
                        cn.rs.getString("numero"),
                        cn.rs.getString("fornecedor"),
                        tools.FormatNumbers.dateBrDefault(cn.rs.getDate("liberacao")),
                        tools.FormatNumbers.numUsToBr(cn.rs.getDouble("saldo")),
                        tools.FormatNumbers.numUsToBr(cn.rs.getDouble("juros")),
                        tools.FormatNumbers.numUsToBr(cn.rs.getDouble("saldo") + cn.rs.getDouble("juros")),
                        cn.rs.getString("id")
                    });
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {
                cn.finalizarTransacao();
            }
        }

        for (int i = 0; i < jTable1.getRowCount(); i++) {
            jurosAcumulados += Double.parseDouble(jTable1.getValueAt(i, 4).toString().replace(".", "").replace(",", "."));
            jTextField2.setText(i + "");
        }

        jTextField1.setText(tools.FormatNumbers.numUsToBr(jurosAcumulados));

    }

    private DefaultTableModel montaTabela() {
        DefaultTableModel lista = (DefaultTableModel) jTable1.getModel();

        lista.setColumnCount(0);
        lista.setRowCount(0);

        lista.addColumn("Contrato");
        lista.addColumn("Banco");
        lista.addColumn("Emissão");
        lista.addColumn("Saldo Inicial");
        lista.addColumn("Juros");
        lista.addColumn("Saldo Final");
        lista.addColumn("lancamento");

        jTable1.getColumnModel().getColumn(0).setMaxWidth(120);
        jTable1.getColumnModel().getColumn(0).setMinWidth(120);
        jTable1.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(120);
        jTable1.getTableHeader().getColumnModel().getColumn(0).setMinWidth(120);
        jTable1.getColumnModel().getColumn(1).setMaxWidth(80);
        jTable1.getColumnModel().getColumn(1).setMinWidth(80);
        jTable1.getTableHeader().getColumnModel().getColumn(1).setMaxWidth(80);
        jTable1.getTableHeader().getColumnModel().getColumn(1).setMinWidth(80);
        jTable1.getColumnModel().getColumn(6).setMaxWidth(0);
        jTable1.getColumnModel().getColumn(6).setMinWidth(0);
        jTable1.getTableHeader().getColumnModel().getColumn(6).setMaxWidth(0);
        jTable1.getTableHeader().getColumnModel().getColumn(6).setMinWidth(0);

        jTable1.setDefaultRenderer(Object.class, new ColorRender());

        return lista;
    }

    private void gravaDados(boolean selected) throws Exception {
        FinIntegracao integ = new FinIntegracao(cn);

        boolean resposta = false;

        //DELETA DADOS LANÇADOS ANTERIORMENTE E AINDA NÃO INTEGRADOS
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            if (cn.iniciarTransacao()) {
                try {
                    sql = "DELETE FROM fechamento.fin_contratos_movimentos "
                            + "WHERE id = '" + jTable1.getValueAt(i, 6).toString() + "' "
                            + "AND lancamento = 0 "
                            + "AND data = '" + tools.FormatNumbers.dateUsDefault(tools.ManipulaData.lastDay(jTxtCompetencia.getText())) + "';";
                    resposta = cn.executeAtualizacao(sql);
                } catch (Exception e) {
                    throw new Exception(e);
                } finally {
                    cn.finalizarTransacao();
                }
            }
        }

        ArrayList lista = new ArrayList();

        //VERIFICA QUAIS CONTRATOS JÁ FORAM INTEGRADOS COM O FINANCEIRO
        if (cn.iniciarTransacao() && resposta) {
            try {
                sql = "SELECT id FROM fechamento.fin_contratos_movimentos "
                        + "WHERE lancamento != 0 "
                        + "AND data = '" + tools.FormatNumbers.dateUsDefault(tools.ManipulaData.lastDay(jTxtCompetencia.getText())) + "';";
                cn.executeConsulta(sql);
                while (cn.rs.next()) {
                    lista.add(cn.rs.getString("id"));
                }
            } catch (Exception e) {
                throw new Exception(e);
            } finally {
                cn.finalizarTransacao();
            }
        }

        for (int i = 0; i < jTable1.getRowCount(); i++) {

            if (lista.contains(jTable1.getValueAt(i, 6)) == false) {

                if (!"0,00".equals(jTable1.getValueAt(i, 4).toString())) {
                    integ.setAmortizacao(0.00);
                    integ.setData(tools.ManipulaData.lastDay(jTxtCompetencia.getText()));
                    integ.setDescontos(0.00);
                    integ.setImportado(false);
                    integ.setJuros(Double.parseDouble(jTable1.getValueAt(i, 4).toString().replace(".", "").replace(",", ".")));
                    integ.setLancamento("0");
                    integ.setId(jTable1.getValueAt(i, 6).toString());
                    integ.setOrigem("PROVISAO");

                    resposta = integ.gravaDados(selected);

                    if (resposta == false) {
                        break;
                    }
                }
            }

        }

        if (resposta) {

            JOptionPane.showMessageDialog(null, "Dados gravados com sucesso!");
            montaTabela();

        } else {

            JOptionPane.showMessageDialog(null, "Não foi possível gravar todos os dados.");
        }

    }
}
