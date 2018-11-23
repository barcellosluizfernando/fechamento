/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TelaCadastros;

import conn.ConexaoMySQL;
import tools.ManipulaData;
import java.text.DecimalFormat;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author luiz.barcellos
 */
public class DeemedCost_Resumo extends javax.swing.JInternalFrame {

    private MaskFormatter data;
    private MaskFormatter competencia;
    private ConexaoMySQL cn;
    private DecimalFormat df = new DecimalFormat("#,##0.00");
    private ManipulaData mData = new ManipulaData();

    /**
     * Creates new form DeemedCost_Resumo
     */
    public DeemedCost_Resumo(ConexaoMySQL conn) {

        try {
            competencia = new javax.swing.text.MaskFormatter("##/####");
            data = new javax.swing.text.MaskFormatter("##/##/####");
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jFormattedTextField1 = new javax.swing.JFormattedTextField(competencia);
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setTitle("Resumo dos Lançamentos");

        jLabel1.setText("Competência");

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton1)
                .addComponent(jLabel1)
                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        pesquisaResumo();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void pesquisaResumo() {
        String sql = " SELECT a.setor, round(sum(a.vlr_dc),2) as valor_dc, "
                + "round(sum(b.valor),2) as valor_parcelas, "
                + "round((sum(a.vlr_dc) - sum(b.valor)),2) as dif "
                + "FROM fechamento.deemedcost a "
                + "left join (select z.id,z.estab, z.entrada, sum(z.valor) as valor from fechamento.deemedcost_det z group by z.id, z.estab, z.entrada) b on (b.id = a.id and b.estab = a.estab and b.entrada = a.entrada) "
                + "where a.ctb_lcto is not null "
                + "group by a.setor;";

        if (cn.iniciarTransacao()) {
            try {

                DefaultTableModel lista = montaTabela();

                cn.executeConsulta(sql);

                while (cn.rs.next()) {
                    lista.addRow(new String[]{
                        cn.rs.getString("setor"),
                        df.format(cn.rs.getDouble("valor_dc")),
                        df.format(cn.rs.getDouble("valor_parcelas")),
                        df.format(cn.rs.getDouble("dif"))                    
                    });
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            } finally {
                cn.finalizarTransacao();
            }
        }

    }

    /**
     * Monta uma tabela em Branco.
     * @return 
     */
    private DefaultTableModel montaTabela() {

        DefaultTableModel lista = (DefaultTableModel) jTable1.getModel();

        lista.setRowCount(0);
        lista.setColumnCount(0);

        lista.addColumn("Setor");
        lista.addColumn("Reavaliado");
        lista.addColumn("Parcelas");
        lista.addColumn("Diferença");
        lista.addColumn("Saldo");
        lista.addColumn("Balancete");
        lista.addColumn("Diferença");

        return lista;
    }

}
