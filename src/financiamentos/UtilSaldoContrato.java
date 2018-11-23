/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financiamentos;

import conn.ConexaoFB;
import conn.ConexaoMySQL;
import tools.ColorRender;
import tools.ManipulaData;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tabelasMySQL.FinContratos;

/**
 *
 * @author ferna
 */
public class UtilSaldoContrato extends javax.swing.JInternalFrame {

    private String sql;
    private final ConexaoMySQL cn;
    private final ConexaoFB cnfb = new ConexaoFB();
    private String fornecedor;
    private FinContratos contrato;

    private String banco;

    /**
     * Creates new form UtilSaldoContrato
     *
     * @param conn
     */
    public UtilSaldoContrato(ConexaoMySQL conn) {

        initComponents();
        this.cn = conn;
        montaTabela();

        somaBalancete();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTxtLocalAmortizacoes = new javax.swing.JTextField();
        jTxtLocalSaldo = new javax.swing.JTextField();
        jTxtLocalJuros = new javax.swing.JTextField();
        jTxtLocalLiberacoes = new javax.swing.JTextField();
        jTxtLocalContrato = new javax.swing.JTextField();
        jTxtLocalBanco = new javax.swing.JTextField();
        jLblLocalStatus = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTxtFinAmortizacoes = new javax.swing.JTextField();
        jTxtFinLiquido = new javax.swing.JTextField();
        jTxtFinJuros = new javax.swing.JTextField();
        jTxtFinLiberacoes = new javax.swing.JTextField();
        jTxtFinContrato = new javax.swing.JTextField();
        jTxtFinBanco = new javax.swing.JTextField();
        jLblFinStatus = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLblValida = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTxtDataBase = new javax.swing.JFormattedTextField(tools.MascaraTextField.dataBR());
        jLabel12 = new javax.swing.JLabel();
        jTxtContratos = new javax.swing.JTextField();
        jTxtBalancete = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Saldo dos Contratos");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Contratos Importados"));

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Resumo Local"));

        jLabel1.setText("Contrato");

        jLabel2.setText("Liberações");

        jLabel3.setText("Juros");

        jLabel4.setText("Amortizações");

        jLabel5.setText("Saldo a pagar");

        jTxtLocalAmortizacoes.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTxtLocalAmortizacoes.setEnabled(false);

        jTxtLocalSaldo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTxtLocalSaldo.setEnabled(false);

        jTxtLocalJuros.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTxtLocalJuros.setEnabled(false);

        jTxtLocalLiberacoes.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTxtLocalLiberacoes.setEnabled(false);

        jTxtLocalContrato.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTxtLocalContrato.setEnabled(false);

        jTxtLocalBanco.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTxtLocalBanco.setEnabled(false);

        jLblLocalStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblLocalStatus.setBorder(javax.swing.BorderFactory.createTitledBorder("Status"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTxtLocalContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTxtLocalLiberacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTxtLocalJuros, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTxtLocalAmortizacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jTxtLocalSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtLocalBanco)
                    .addComponent(jLblLocalStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtLocalContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtLocalBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTxtLocalLiberacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTxtLocalJuros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTxtLocalAmortizacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTxtLocalSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLblLocalStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Resumo Financeiro"));

        jLabel7.setText("Contrato");

        jLabel8.setText("Liberações");

        jLabel9.setText("Juros");

        jLabel10.setText("Amortizações");

        jLabel11.setText("Saldo a pagar");

        jTxtFinAmortizacoes.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTxtFinAmortizacoes.setEnabled(false);

        jTxtFinLiquido.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTxtFinLiquido.setEnabled(false);

        jTxtFinJuros.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTxtFinJuros.setEnabled(false);

        jTxtFinLiberacoes.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTxtFinLiberacoes.setEnabled(false);

        jTxtFinContrato.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTxtFinContrato.setEnabled(false);

        jTxtFinBanco.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTxtFinBanco.setEnabled(false);

        jLblFinStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblFinStatus.setBorder(javax.swing.BorderFactory.createTitledBorder("Status"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTxtFinContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTxtFinLiberacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTxtFinJuros, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTxtFinAmortizacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jTxtFinLiquido, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtFinBanco)
                    .addComponent(jLblFinStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTxtFinContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtFinBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTxtFinLiberacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTxtFinJuros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTxtFinAmortizacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTxtFinLiquido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLblFinStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Validação"));

        jLblValida.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLblValida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLblValida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLblValida, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Resumo"));

        jLabel6.setText("Data Base");

        jLabel12.setText("Contratos");

        jTxtContratos.setEnabled(false);

        jTxtBalancete.setEnabled(false);

        jLabel13.setText("Balancete");

        jButton1.setText("Atualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtDataBase, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTxtContratos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTxtBalancete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTxtDataBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jTxtContratos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtBalancete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jButton1))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        somaContratos();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        somaContratos();        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        somaBalancete();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLblFinStatus;
    private javax.swing.JLabel jLblLocalStatus;
    private javax.swing.JLabel jLblValida;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTxtBalancete;
    private javax.swing.JTextField jTxtContratos;
    private javax.swing.JFormattedTextField jTxtDataBase;
    private javax.swing.JTextField jTxtFinAmortizacoes;
    private javax.swing.JTextField jTxtFinBanco;
    private javax.swing.JTextField jTxtFinContrato;
    private javax.swing.JTextField jTxtFinJuros;
    private javax.swing.JTextField jTxtFinLiberacoes;
    private javax.swing.JTextField jTxtFinLiquido;
    private javax.swing.JTextField jTxtLocalAmortizacoes;
    private javax.swing.JTextField jTxtLocalBanco;
    private javax.swing.JTextField jTxtLocalContrato;
    private javax.swing.JTextField jTxtLocalJuros;
    private javax.swing.JTextField jTxtLocalLiberacoes;
    private javax.swing.JTextField jTxtLocalSaldo;
    // End of variables declaration//GEN-END:variables

    private void montaTabela() {
        DefaultTableModel lista = (DefaultTableModel) jTable1.getModel();

        lista.setColumnCount(0);
        lista.setRowCount(0);

        lista.addColumn("Contrato");
        lista.addColumn("Instituição");
        lista.addColumn("codFornecedor");
        lista.addColumn("banco");

        jTable1.getColumnModel().getColumn(0).setMaxWidth(80);
        jTable1.getColumnModel().getColumn(0).setMinWidth(80);
        jTable1.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(80);
        jTable1.getTableHeader().getColumnModel().getColumn(0).setMinWidth(80);
        jTable1.getColumnModel().getColumn(2).setMaxWidth(0);
        jTable1.getColumnModel().getColumn(2).setMinWidth(0);
        jTable1.getTableHeader().getColumnModel().getColumn(2).setMaxWidth(0);
        jTable1.getTableHeader().getColumnModel().getColumn(2).setMinWidth(0);
        jTable1.getColumnModel().getColumn(3).setMaxWidth(0);
        jTable1.getColumnModel().getColumn(3).setMinWidth(0);
        jTable1.getTableHeader().getColumnModel().getColumn(3).setMaxWidth(0);
        jTable1.getTableHeader().getColumnModel().getColumn(3).setMinWidth(0);

        jTable1.setDefaultRenderer(Object.class, new ColorRender());

        sql = "SELECT distinct a.fornecedor, b.title as nome, a.numero, a.banco "
                + "FROM fechamento.fin_contratos a "
                + "LEFT JOIN fechamento.cad_bancos b on (b.id = a.banco) "
                + "ORDER BY b.title, a.numero;";

        if (cn.iniciarTransacao()) {
            try {
                cn.executeConsulta(sql);
                while (cn.rs.next()) {
                    lista.addRow(new String[]{
                        cn.rs.getString("numero"),
                        cn.rs.getString("nome"),
                        cn.rs.getString("fornecedor"),
                        cn.rs.getString("banco")
                    });
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {
                cn.finalizarTransacao();
            }
        }

    }

    private void somaContratos() {
        int linha = jTable1.getSelectedRow();

        jLblValida.setText("");

        jTxtLocalContrato.setText(jTable1.getValueAt(linha, 0).toString());
        jTxtLocalBanco.setText(jTable1.getValueAt(linha, 1).toString());
        fornecedor = jTable1.getValueAt(linha, 2).toString();
        banco = jTable1.getValueAt(linha, 3).toString();

        contrato = new FinContratos(jTxtLocalContrato.getText(), Integer.parseInt(banco), cn);

        jTxtLocalJuros.setText(tools.FormatNumbers.numUsToBr(contrato.getJuros()));
        jTxtLocalAmortizacoes.setText(tools.FormatNumbers.numUsToBr(contrato.getAmortizacoes()));
        jTxtLocalLiberacoes.setText(tools.FormatNumbers.numUsToBr(contrato.getLiberacoes()));
        jTxtLocalSaldo.setText(tools.FormatNumbers.numUsToBr(contrato.getJuros() - contrato.getAmortizacoes() + contrato.getLiberacoes()));

        sql = "with fluxos as ( "
                + "select a.doc as contrato, c.nome as banco, "
                + "case when b.planoconta != '6256' and b.tipo_plano = 'D'then b.valor else 0.00 end as liberacoes, "
                + "case when b.planoconta = '6256' and b.tipo_plano = 'D' then b.valor else 0.00 end as juros, "
                + "0.00 as amortizacoes, "
                + "0.00 as descontos "
                + "from fin_contas_pagar a "
                + "left join fin_contas_pagar_detalhe b on (b.empresa = a.empresa and b.codigo = a.codigo) "
                + "left join cad_terceiros c on (c.empresa = a.empresa and c.codigo = a.fornecedor) "
                + "where a.empresa = 1 and a.doc = '" + jTxtLocalContrato.getText() + "' and a.fornecedor = '" + fornecedor + "' "
                + "union all "
                + "select a.doc as contrato, c.nome as banco, "
                + "0.00 as liberacoes, "
                + "case when aa.tipo_plano = 'D' and d.ecd_cod_nat = '04' then aa.valor else 0.00 end as juros, "
                + "case when aa.tipo_plano = 'C' and d.ecd_cod_nat = '01' then aa.valor else 0.00 end as amortizacoes, "
                + "case when aa.tipo_plano = 'C' and d.ecd_cod_nat = '04' then aa.valor else 0.00 end as descontos "
                + "from fin_contas_pagar a "
                + "left join fin_contas_pagar_baixas_detalhe aa on (a.empresa = aa.empresa and a.codigo = aa.codigo_pagar) "
                + "left join cad_terceiros c on (c.empresa = a.empresa and c.codigo = a.fornecedor) "
                + "left join cad_planocontas d on (d.empresa = aa.empresa and d.codigo = aa.planoconta) "
                + "where a.empresa = 1 and a.doc = '" + jTxtLocalContrato.getText() + "' and a.fornecedor = '" + fornecedor + "'  ) "
                + "select contrato,banco,sum(liberacoes) as liberacoes,"
                + "sum(juros) as juros,sum(amortizacoes)as amortizacoes,"
                + "sum(descontos) as descontos "
                + "from fluxos "
                + "group by 1,2;";
        if (cnfb.conecta()) {
            try {
                cnfb.executeConsulta(sql);
                while (cnfb.rs.next()) {
                    jTxtFinContrato.setText(cnfb.rs.getString("contrato"));
                    jTxtFinBanco.setText(cnfb.rs.getString("banco"));
                    jTxtFinLiberacoes.setText(tools.FormatNumbers.numUsToBr(cnfb.rs.getDouble("liberacoes")));
                    jTxtFinJuros.setText(tools.FormatNumbers.numUsToBr(cnfb.rs.getDouble("juros")));
                    jTxtFinAmortizacoes.setText(tools.FormatNumbers.numUsToBr(cnfb.rs.getDouble("amortizacoes")));
                    jTxtFinLiquido.setText(tools.FormatNumbers.numUsToBr(cnfb.rs.getDouble("liberacoes") + cnfb.rs.getDouble("juros") - cnfb.rs.getDouble("amortizacoes")));
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não foi possível preencher os campos do financeiro.\n" + e);
            } finally {
                cnfb.desconecta();
            }
        }

        if (jTxtFinLiquido.getText().equals(jTxtLocalSaldo.getText())) {
            jLblValida.setText("Sincronizado");
        } else {
            jLblValida.setText("*.* Ajustar lançamentos *.*");

        }

    }

    private void somaBalancete() {

        try {
            if ("  /  /    ".equals(jTxtDataBase.getText())) {
                ManipulaData mData = new ManipulaData();
                String lastDate = tools.FormatNumbers.dateBrDefault(mData.ultimoDiaMesAnterior(tools.ManipulaData.getCompetenceBR(new Date())));
                jTxtDataBase.setText(lastDate);
            }
            Fin_SaldoBalanco saldo = new Fin_SaldoBalanco(jTxtDataBase.getText());
            jTxtBalancete.setText(tools.FormatNumbers.numUsToBr(saldo.getVlr_total()));

            FinContratos contr = new FinContratos(cn, jTxtDataBase.getText());

            jTxtContratos.setText(tools.FormatNumbers.numUsToBr(contr.getVlr_total()));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }
}