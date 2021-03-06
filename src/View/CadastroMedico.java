
package View;

import Control.MedicoControl;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class CadastroMedico extends javax.swing.JFrame {

    private MedicoControl controlador; 
    
    public CadastroMedico() {
        initComponents();
        
        this.controlador = new MedicoControl(); 
        this.carregaTabela();
        
        
       
        
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
        jTableMedicos = new javax.swing.JTable();
        b_excluir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t_especialidade = new javax.swing.JTextField();
        t_telefone = new javax.swing.JTextField();
        t_nome = new javax.swing.JTextField();
        b_novo1 = new javax.swing.JButton();
        b_cancelar = new javax.swing.JButton();
        b_editar1 = new javax.swing.JButton();
        t_crm = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        j_periodo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();

        jTableMedicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nome", "Telefone", "Especialidade", "CRM", "Periodo Atendimento"
            }
        ));
        jTableMedicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMedicosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMedicos);

        b_excluir.setText("Excluir");
        b_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_excluirActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setToolTipText("");

        jLabel2.setText("Nome:");

        jLabel3.setText("Telefone:");

        jLabel4.setText("Especialidade:");

        t_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_nomeActionPerformed(evt);
            }
        });

        b_novo1.setText("Novo");
        b_novo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_novo1ActionPerformed(evt);
            }
        });

        b_cancelar.setText("Cancelar");
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });

        b_editar1.setText("Editar");
        b_editar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_editar1ActionPerformed(evt);
            }
        });

        jLabel7.setText("CRM:");

        jLabel8.setText("Periodo Atendimento:");

        j_periodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matutino", "Vespertino" }));
        j_periodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_periodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t_especialidade)
                            .addComponent(t_nome)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(t_crm, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(t_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(j_periodo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_novo1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_editar1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(b_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(t_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(t_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(j_periodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(t_especialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_crm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_novo1)
                    .addComponent(b_cancelar)
                    .addComponent(b_editar1))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel1.setText("Paciente");

        jButton6.setText("Pesquisar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addGap(40, 40, 40)
                        .addComponent(b_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_excluir)
                    .addComponent(jButton6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void t_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_nomeActionPerformed
       
    }//GEN-LAST:event_t_nomeActionPerformed

    private void b_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_excluirActionPerformed
     try {
            
            int id = 0;
            if (this.jTableMedicos.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione um M??dico para APAGAR");
            } else {
                id = Integer.parseInt(this.jTableMedicos.getValueAt(this.jTableMedicos.getSelectedRow(), 0).toString());
            }

            
            int resposta_usuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja APAGAR este M??dico ?");

            if (resposta_usuario == 0) {

               
                if (this.controlador.Apagar(id)) {

                   
                    this.t_nome.setText("");
                    this.t_telefone.setText("");
                    this.t_especialidade.setText("");
                    this.t_crm.setText("");
                    
                    JOptionPane.showMessageDialog(rootPane, "M??dico Apagado com Sucesso!");

                }

            }

            System.out.println(this.controlador.getMinhaLista().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            
            carregaTabela();
        }
    }//GEN-LAST:event_b_excluirActionPerformed

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
                    this.t_nome.setText("");
                    this.t_telefone.setText("");
                    this.t_especialidade.setText("");
                    this.t_crm.setText("");  
                    
    }//GEN-LAST:event_b_cancelarActionPerformed

    private void b_novo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_novo1ActionPerformed
       
       
        try {
            
            String nome = "";
            int telefone = 0;
            int crm = 0;
            String especialidade = "";
            String periodoatendimento = "";
            
            
            if (this.t_nome.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.t_nome.getText();
            }

            if (this.t_telefone.getText().length() <= 0) {
                throw new Mensagens("Telefone deve ser n??mero e maior que zero.");
            } else {
                telefone = Integer.parseInt(this.t_telefone.getText());
            }

            if (this.t_especialidade.getText().length() < 2) {
                throw new Mensagens("Especialidade deve conter ao menos 2 caracteres.");
            } else {
                especialidade = this.t_especialidade.getText();
            }
            if (this.t_crm.getText().length() <= 0) {
                throw new Mensagens("CRM deve ser n??mero e maior que zero.");
            } else {
                crm = Integer.parseInt(this.t_crm.getText());
            }

            
            if (this.controlador.Cadastrar(especialidade, crm, periodoatendimento, nome, telefone)) {
                JOptionPane.showMessageDialog(rootPane, "M??dico Cadastrado com Sucesso!");

                
                this.t_nome.setText("");
                this.t_telefone.setText("");
                this.t_especialidade.setText("");
                this.t_crm.setText("");


            }

            System.out.println(this.controlador.getMinhaLista().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um n??mero.");
        } catch (SQLException ex) {
        
        } 
            carregaTabela();
    }//GEN-LAST:event_b_novo1ActionPerformed

    private void b_editar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_editar1ActionPerformed
       try {
            int id = 0;
            String nome = "";
            int telefone = 0;
            int crm = 0;
            String especialidade = "";
            String periodoatendimento = "";
            
            if (this.t_nome.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.t_nome.getText();
            }

            if (this.t_telefone.getText().length() <= 0) {
                throw new Mensagens("Telefone deve ser n??mero e maior que zero.");
            } else {
                telefone = Integer.parseInt(this.t_telefone.getText());
            }

            if (this.t_especialidade.getText().length() < 2) {
                throw new Mensagens("Especialidade deve conter ao menos 2 caracteres.");
            } else {
                especialidade = this.t_especialidade.getText();
            }
            if (this.t_crm.getText().length() <= 0) {
                throw new Mensagens("CRM deve ser n??mero e maior que zero.");
            } else {
                crm = Integer.parseInt(this.t_crm.getText());
            }

            if (this.jTableMedicos.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione um M??dico para Alterar");
            } else {
                id = Integer.parseInt(this.jTableMedicos.getValueAt(this.jTableMedicos.getSelectedRow(), 0).toString());
            }

            
            if (this.controlador.Editar(especialidade, crm, periodoatendimento, id, nome, telefone)) {

               
                this.t_nome.setText("");
                this.t_telefone.setText("");
                this.t_especialidade.setText("");
                this.t_crm.setText("");
                
                JOptionPane.showMessageDialog(rootPane, "M??dico Alterado com Sucesso!");

            }
            System.out.println(this.controlador.getMinhaLista().toString());
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um n??mero.");
        } finally {
            carregaTabela(); 
        }
    }//GEN-LAST:event_b_editar1ActionPerformed

    private void jTableMedicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMedicosMouseClicked
          if (this.jTableMedicos.getSelectedRow() != -1) {

            String nome = this.jTableMedicos.getValueAt(this.jTableMedicos.getSelectedRow(), 1).toString();
            String telefone = this.jTableMedicos.getValueAt(this.jTableMedicos.getSelectedRow(), 2).toString();
            String especialidade = this.jTableMedicos.getValueAt(this.jTableMedicos.getSelectedRow(), 3).toString();
            String crm = this.jTableMedicos.getValueAt(this.jTableMedicos.getSelectedRow(), 4).toString();
            String periodoatendimento = this.jTableMedicos.getValueAt(this.jTableMedicos.getSelectedRow(), 5).toString();

            this.t_nome.setText(nome);
            this.t_telefone.setText(telefone);
            this.t_especialidade.setText(especialidade);
            this.t_crm.setText(crm);

        }
    }//GEN-LAST:event_jTableMedicosMouseClicked

    private void j_periodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_periodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_periodoActionPerformed

   public void carregaTabela() {

        DefaultTableModel modelo = (DefaultTableModel) this.jTableMedicos.getModel();
        modelo.setNumRows(0);
        
        

        String linhasMatriz[][] = controlador.getMinhaMatrizTexto();
        for (int i = 0; i < linhasMatriz.length; i++) {
            modelo.addRow(
                    
            new Object[]{
                linhasMatriz[i][0],
                linhasMatriz[i][1],
                linhasMatriz[i][2],
                linhasMatriz[i][3],
                linhasMatriz[i][4],
                linhasMatriz[i][5]
             }
            
            
            );

        }


    }

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
            java.util.logging.Logger.getLogger(CadastroMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new CadastroMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cancelar;
    private javax.swing.JButton b_editar1;
    private javax.swing.JButton b_excluir;
    private javax.swing.JButton b_novo1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMedicos;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JComboBox<String> j_periodo;
    private javax.swing.JTextField t_crm;
    private javax.swing.JTextField t_especialidade;
    private javax.swing.JTextField t_nome;
    private javax.swing.JTextField t_telefone;
    // End of variables declaration//GEN-END:variables
}
