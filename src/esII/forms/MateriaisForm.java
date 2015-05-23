/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esII.forms;

import esII.dao.MaterialDAO;
import esII.entidades.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author daniel
 */
public class MateriaisForm extends javax.swing.JFrame {

    /**
     * Creates new form MateriaisForm
     */
    List<Material> materiais = new ArrayList<>();
    Tarefa localTarefa;
    public MateriaisForm(Tarefa t) {
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.localTarefa = t;
        initComponents();
        nomeMatTxt.setEnabled(false);
        qntdText.setEnabled(false);
        cancelButton.setEnabled(false);
        addNewButton.setEnabled(false);
        confirmButton.setEnabled(false);
        removerButton.setEnabled(false);
        
        
    }
    
    private void listMateriais(){
        DefaultTableModel tableModel = new DefaultTableModel(0,3); 
        tableModel.setColumnIdentifiers(new Object[] {"Id","Nome", "Quantidade"});
        List<Material> bdMateriais = MaterialDAO.getMateriaisByIdTarefa(localTarefa.getId());
        
        for (Material m:bdMateriais){
            tableModel.addRow(new Object[]{m.getId(),m.getNome(),m.getQuantidade()});
            materiaisTable.setModel(tableModel);
        }
        
         //tarefasJList.setModel(listModel);
    }
    
    
    private void clear(){
        nomeMatTxt.setText("");
        qntdText.setText("");
        
        nomeMatTxt.setEnabled(false);
        qntdText.setEnabled(false);
        cancelButton.setEnabled(false);
        addNewButton.setEnabled(false);
        addMaterialButton.setEnabled(true);
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
        materiaisTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        addMaterialButton = new javax.swing.JButton();
        removerButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        nomeMatTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        qntdText = new javax.swing.JTextField();
        addNewButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        confirmButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        materiaisTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nome", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(materiaisTable);

        jLabel1.setText("Materiais Cadastrados:");

        addMaterialButton.setText("Adicionar Novo");
        addMaterialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMaterialButtonActionPerformed(evt);
            }
        });

        removerButton.setText("Remover");
        removerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:");

        nomeMatTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeMatTxtActionPerformed(evt);
            }
        });

        jLabel3.setText("Quantidade:");

        addNewButton.setText("Adicionar");
        addNewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancelar");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        confirmButton.setText("Ok");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(qntdText, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomeMatTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cancelButton)
                                .addGap(18, 18, 18)
                                .addComponent(addNewButton)
                                .addGap(18, 18, 18)
                                .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(removerButton)
                                .addGap(18, 18, 18)
                                .addComponent(addMaterialButton)
                                .addGap(69, 69, 69))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addMaterialButton)
                    .addComponent(removerButton))
                .addGap(13, 13, 13)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeMatTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qntdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmButton)
                    .addComponent(addNewButton)
                    .addComponent(cancelButton))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void nomeMatTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeMatTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeMatTxtActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void addMaterialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMaterialButtonActionPerformed
        // TODO add your handling code here:
        addMaterialButton.setEnabled(false);
        
        nomeMatTxt.setEnabled(true);
        qntdText.setEnabled(true);
        cancelButton.setEnabled(true);
        addNewButton.setEnabled(true);
        
    }//GEN-LAST:event_addMaterialButtonActionPerformed

    private void addNewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewButtonActionPerformed
        // TODO add your handling code here:
       
       if (nomeMatTxt.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Insira o nome do Material", "Erro", JOptionPane.ERROR_MESSAGE);
       }
       if (qntdText.getText().isEmpty() || Integer.parseInt(qntdText.getText()) <= 0){
           JOptionPane.showMessageDialog(null, "A Quantidade deve ser maior que 0", "Erro", JOptionPane.ERROR_MESSAGE);
       }
       
       if (!nomeMatTxt.getText().isEmpty() && !qntdText.getText().isEmpty() && Integer.parseInt(qntdText.getText()) > 0){
             
           Material m = new Material();
           m.setId_tarefa(localTarefa.getId());
           m.setNome(nomeMatTxt.getText());
           m.setQuantidade(Integer.parseInt(qntdText.getText()));
           materiais.add(m);
           MaterialDAO.criaMaterial(m);
                   
           removerButton.setEnabled(true);
           confirmButton.setEnabled(true);
           clear();
           listMateriais();
       }
    }//GEN-LAST:event_addNewButtonActionPerformed

    private void removerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerButtonActionPerformed
        // TODO add your handling code here:
        int index = materiaisTable.getSelectedRow();
        
        List<Material> bdMateriais = MaterialDAO.getMateriaisByIdTarefa(localTarefa.getId());
        
        if (index >= 0){
            int id = Integer.parseInt(materiaisTable.getModel().getValueAt(index, 0).toString());
            for (Material m:bdMateriais){
                if (id == m.getId()){
                    MaterialDAO.deletaMaterial(id);
                }
            }

            JOptionPane.showMessageDialog(null, "Material excluido com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            listMateriais();
        }
        else {
            JOptionPane.showMessageDialog(null,"Nenhuma Material foi selecionado", "Erro", JOptionPane.ERROR_MESSAGE);
        } 
        
        
    }//GEN-LAST:event_removerButtonActionPerformed
    
    

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
            java.util.logging.Logger.getLogger(MateriaisForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MateriaisForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MateriaisForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MateriaisForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new MateriaisForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMaterialButton;
    private javax.swing.JButton addNewButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable materiaisTable;
    private javax.swing.JTextField nomeMatTxt;
    private javax.swing.JTextField qntdText;
    private javax.swing.JButton removerButton;
    // End of variables declaration//GEN-END:variables
}
