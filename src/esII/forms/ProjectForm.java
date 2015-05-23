/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esII.forms;

import esII.dao.ProjetoDAO;
import esII.entidades.Projeto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author daniel
 */
public class ProjectForm extends javax.swing.JFrame {

    /**
     * Creates new form ProjectForm
     */
    List<Projeto> localProjetos = new ArrayList<>();
    List<Projeto> bdProjetos;

    public ProjectForm() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        initComponents();
        listProjects();
        projectNameTxtField.setEnabled(false);
        duracaoSpinner.setEnabled(false);
        addNewButton.setEnabled(false);
        cancelarButton.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ProjectsLabel = new javax.swing.JLabel();
        criarProjectButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        consultarButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        projectNameTxtField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        duracaoSpinner = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        addNewButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        sairButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        projetosTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ProjectsLabel.setText("Projetos Existentes:");

        criarProjectButton.setText("Criar Novo");
        criarProjectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarProjectButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Remover");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        consultarButton.setText("Consultar");
        consultarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        projectNameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectNameTxtFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Duração:");

        jLabel3.setText("Semanas");

        addNewButton.setText("Adicionar");
        addNewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewButtonActionPerformed(evt);
            }
        });

        cancelarButton.setText("Cancelar");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        sairButton.setText("Sair");
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });

        projetosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "Duração"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(projetosTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(consultarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(criarProjectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ProjectsLabel)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(projectNameTxtField))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(duracaoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(sairButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(26, 26, 26)
                                            .addComponent(cancelarButton)
                                            .addGap(24, 24, 24)
                                            .addComponent(addNewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 56, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProjectsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(consultarButton)
                    .addComponent(criarProjectButton))
                .addGap(7, 7, 7)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(projectNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(duracaoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sairButton)
                    .addComponent(cancelarButton)
                    .addComponent(addNewButton))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void criarProjectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarProjectButtonActionPerformed
          // TODO add your handling code here:

        projetosTable.setEnabled(false);
        criarProjectButton.setEnabled(false);
        consultarButton.setEnabled(false);
        deleteButton.setEnabled(false);

        projectNameTxtField.setEnabled(true);
        duracaoSpinner.setEnabled(true);
        addNewButton.setEnabled(true);
        cancelarButton.setEnabled(true);

    }//GEN-LAST:event_criarProjectButtonActionPerformed

    private void projectNameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectNameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_projectNameTxtFieldActionPerformed

    private void addNewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewButtonActionPerformed
        // TODO add your handling code here:

        int dur = (Integer) duracaoSpinner.getValue();

        if (projectNameTxtField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor insira um nome para o projeto", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        if (dur <= 0) {
            JOptionPane.showMessageDialog(null, "Projeto deve ter no minimo 1 semana", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        if (!projectNameTxtField.getText().isEmpty() && dur > 0) {
            Projeto p = new Projeto();
            p.setNome(projectNameTxtField.getText());
            p.setDuracao(dur);
            localProjetos.add(p);
            ProjetoDAO.criarProjeto(p);
            //dispose();
            listProjects();

            TarefaForm tarefaForm = new TarefaForm(p);
            tarefaForm.setVisible(true);

            consultarButton.setEnabled(true);
            deleteButton.setEnabled(true);
            clear();
            // setTempProj;
        }
    }//GEN-LAST:event_addNewButtonActionPerformed

    private void consultarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarButtonActionPerformed
        // TODO add your handling code here:
        int semaCons;
        int index = projetosTable.getSelectedRow();
        if (index >= 0) {
            String nome = projetosTable.getModel().getValueAt(index, 0).toString();
            
            for (Projeto p : bdProjetos) {
                if (nome.equals(p.getNome())) {
                    while (true){
                        try {
                            semaCons = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a semana de interesse: ","Semana para Consulta",JOptionPane.INFORMATION_MESSAGE));
                            break;
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null,"Digite um número de 1 a " + p.getDuracao(), "Erro",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    ConsultaForm consulta = new ConsultaForm(ProjetoDAO.getProjetoByNome(nome),semaCons);
                    consulta.setVisible(true);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum Projeto foi selecionado", "Erro", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_consultarButtonActionPerformed

    private void clear() {
        Object o = (Object) 0;

        projectNameTxtField.setText(" ");
        duracaoSpinner.setValue(o);
        projetosTable.setEnabled(true);
        consultarButton.setEnabled(true);
        deleteButton.setEnabled(true);
        criarProjectButton.setEnabled(true);

        projectNameTxtField.setEnabled(false);
        duracaoSpinner.setEnabled(false);
        addNewButton.setEnabled(false);
        cancelarButton.setEnabled(false);
    }


    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        // TODO add your handling code here:
        clear();

    }//GEN-LAST:event_cancelarButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here: 
        int index = projetosTable.getSelectedRow();
        if (index >= 0) {
            String nome = projetosTable.getModel().getValueAt(index, 0).toString();
            
            for (Projeto p : bdProjetos) {
                if (nome.equals(p.getNome())) {
                    ProjetoDAO.deletaProjeto(nome);
                    DefaultTableModel tableModel = (DefaultTableModel) projetosTable.getModel();
                    tableModel.setNumRows(0);
                    listProjects();
                    JOptionPane.showMessageDialog(null, "Projeto excluido com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum Projeto foi selecionado", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_deleteButtonActionPerformed

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        System.exit(1);
    }//GEN-LAST:event_sairButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ProjectForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjectForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjectForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjectForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjectForm().setVisible(true);
            }
        });

    }

    private void listProjects() {
        DefaultTableModel tableModel = new DefaultTableModel(0, 2);
        tableModel.setColumnIdentifiers(new Object[]{"Nome", "Duração"});

        bdProjetos = ProjetoDAO.getAllProjetos();
        if (!bdProjetos.isEmpty()) {
            for (Projeto p : bdProjetos) {
                tableModel.addRow(new Object[]{p.getNome(), p.getDuracao()});
            }
            projetosTable.setModel(tableModel);
            consultarButton.setEnabled(true);
            deleteButton.setEnabled(true);
        } else {

            consultarButton.setEnabled(false);
            deleteButton.setEnabled(false);
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ProjectsLabel;
    private javax.swing.JButton addNewButton;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JButton consultarButton;
    private javax.swing.JButton criarProjectButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JSpinner duracaoSpinner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField projectNameTxtField;
    private javax.swing.JTable projetosTable;
    private javax.swing.JButton sairButton;
    // End of variables declaration//GEN-END:variables
}
