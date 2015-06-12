/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esII.forms;

import esII.dao.*;
import esII.entidades.Projeto;
import esII.entidades.Tarefa;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author daniel
 */
public class TarefaForm extends javax.swing.JFrame {

    /**
     * Creates new form TarefaForm
     */
    List<Tarefa> bdTarefas;
    Projeto projetoLocal; // Projeto que esta sendo criado, vindo do form anterior, ProjectForm.
    public TarefaForm(Projeto p) {
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.projetoLocal = p;
        setTitle("Projeto "+p.getNome() +" - Tarefas");
        initComponents();
        listTarefas();
        clear();
    }
    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        addTarefaButton = new javax.swing.JButton();
        descricaoTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inicioSpinner = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        durSpinner = new javax.swing.JSpinner();
        addNewTarButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        cancelButton = new javax.swing.JButton();
        voltarButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tarefasTable = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        updateTarButton = new javax.swing.JButton();
        inserirMatButton = new javax.swing.JButton();
        editarTarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tarefas Cadastradas:");

        addTarefaButton.setText("Adicionar Nova");
        addTarefaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTarefaButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Descrição:");

        jLabel3.setText("Semana de inicio:");

        jLabel4.setText("Duração:");

        addNewTarButton.setText("Adicionar");
        addNewTarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewTarButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancelar");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        voltarButton.setText("Voltar");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Semanas");

        deleteButton.setText("Remover");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        tarefasTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Descrição", "Inicio (Semana)", "Duração"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tarefasTable);

        updateTarButton.setText("Atualizar");
        updateTarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateTarButtonActionPerformed(evt);
            }
        });

        inserirMatButton.setText("Editar/Inserir Material");
        inserirMatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirMatButtonActionPerformed(evt);
            }
        });

        editarTarButton.setText("Editar");
        editarTarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarTarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(135, 135, 135)
                                    .addComponent(deleteButton)
                                    .addGap(18, 18, 18)
                                    .addComponent(editarTarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(addTarefaButton))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(descricaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inicioSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(durSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cancelButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(inserirMatButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(updateTarButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addNewTarButton)
                                    .addComponent(jLabel5))))))
                .addContainerGap(20, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteButton)
                            .addComponent(addTarefaButton)
                            .addComponent(editarTarButton))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(descricaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(inicioSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(durSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addNewTarButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cancelButton)
                        .addComponent(updateTarButton)
                        .addComponent(inserirMatButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(voltarButton)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Metodo para desabilitar a area de edicao e criacao de nova tarefa
    private void clear(){
        Object o = (Object)0;
        descricaoTextField.setText("");
        inicioSpinner.setValue(o);
        durSpinner.setValue(o);
        if (!bdTarefas.isEmpty()){
            deleteButton.setEnabled(true);
            editarTarButton.setEnabled(true);
        }
        descricaoTextField.setEnabled(false);
        inicioSpinner.setEnabled(false);
        durSpinner.setEnabled(false);
        addNewTarButton.setEnabled(false); 
        cancelButton.setEnabled(false);
        updateTarButton.setEnabled(false);
        inserirMatButton.setEnabled(false);
        addTarefaButton.setEnabled(true);
    }
    
    // Habilita a area de criacao de nova tarefa quando pressionado o botao Adicionar Nova
    private void addTarefaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTarefaButtonActionPerformed
        // TODO add your handling code here:
        descricaoTextField.setText(" ");
        inicioSpinner.setValue((Object)0);
        durSpinner.setValue((Object)0);
        addTarefaButton.setEnabled(false);
        editarTarButton.setEnabled(false);
        deleteButton.setEnabled(false);
        descricaoTextField.setEnabled(true);
        inicioSpinner.setEnabled(true);
        durSpinner.setEnabled(true);
        addNewTarButton.setEnabled(true);
        cancelButton.setEnabled(true);
    }//GEN-LAST:event_addTarefaButtonActionPerformed
    
    // Lista as tarefas existentes ou ja criadas para o projeto atual.
    private void listTarefas(){
         DefaultTableModel tableModel = new DefaultTableModel(0,4); 
         tableModel.setColumnIdentifiers(new Object[]{"Id","Descrição","Inicio(Semana)","Duração"});
         bdTarefas = TarefaDAO.getTarefasByNomeProjeto(projetoLocal.getNome());
         
         if (!bdTarefas.isEmpty()){
            for (Tarefa t:bdTarefas){
               tableModel.addRow(new Object[]{t.getId(),t.getDescricao(),t.getSemanaInicio(),t.getDuracao()});
               tarefasTable.setModel(tableModel);
               deleteButton.setEnabled(true);
               editarTarButton.setEnabled(true);
            }
         }
         else{
             
           deleteButton.setEnabled(false);
           editarTarButton.setEnabled(false);  
         }
    }
    
    //Adiciona uma nova tarefa ao banco, ligada ao projeto atual
    private void addNewTarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewTarButtonActionPerformed
        // TODO add your handling code here:
        String desc;
        int dur, inicio;
        desc = descricaoTextField.getText().trim();
        
        inicio = (Integer)inicioSpinner.getValue();
        dur = (Integer)durSpinner.getValue();
        
        if(desc.isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor insira uma descrição", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        else if (inicio <= 0){
            JOptionPane.showMessageDialog(null, "Tarefa deve iniciar pelo menos na 1ª semana", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        else if (dur <= 0){
            JOptionPane.showMessageDialog(null, "Tarefa deve ter no minimo 1 semana de duração", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        else if (!desc.isEmpty() && inicio > 0 && dur > 0){
            if (inicio+(dur-1) <= projetoLocal.getDuracao()){
                Tarefa t = new Tarefa();
                t.setDescricao(desc);
                t.setNome_projeto(projetoLocal.getNome());
                t.setSemanaInicio(inicio);
                t.setDuracao(dur);                
                TarefaDAO.criaTarefa(t);
                listTarefas();
                
                deleteButton.setEnabled(false);
                editarTarButton.setEnabled(false);
                addNewTarButton.setEnabled(false);
                voltarButton.setEnabled(true);
                inserirMatButton.setEnabled(true);
                addTarefaButton.setEnabled(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "Duração da TAREFA excede a duração do PROJETO", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            
        }
       
    }//GEN-LAST:event_addNewTarButtonActionPerformed
    
    // Desabilitar a area de criaca de tarefa
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_cancelButtonActionPerformed
    
    // quando pelo menos 1 tarefa eh criada, o usuario pode sair do form de criacao de tarefas.
    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        // TODO add your handling code here:
       
        dispose();
    }//GEN-LAST:event_voltarButtonActionPerformed
    
    //Deletar uma tarefa criada
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        int index = tarefasTable.getSelectedRow();
        bdTarefas = TarefaDAO.getTarefasByNomeProjeto(projetoLocal.getNome());

        if (index >= 0){
            int id = Integer.parseInt(tarefasTable.getModel().getValueAt(index, 0).toString());
            for (Tarefa t:bdTarefas){
                if (id == t.getId()){
                    TarefaDAO.deletaTarefa(id);
                }
            }
            DefaultTableModel tableModel = (DefaultTableModel)tarefasTable.getModel();
            tableModel.setNumRows(0);
            listTarefas();
            JOptionPane.showMessageDialog(null, "Tarefa excluida com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            
        }
        else {
            JOptionPane.showMessageDialog(null,"Nenhuma Tarefa foi selecionada", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void inserirMatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirMatButtonActionPerformed
        // TODO add your handling code here:
        String desc = descricaoTextField.getText().trim();
        int inicio = (Integer)inicioSpinner.getValue();
        int dur = (Integer)durSpinner.getValue();
        
        
       if (desc.isEmpty() || desc.equals(" ")){
           JOptionPane.showMessageDialog(null, "Nenhuma Tarefa selecionada","Erro",JOptionPane.ERROR_MESSAGE);
       }
       else if(inicio <=0){
            JOptionPane.showMessageDialog(null, "Tarefa deve iniciar pelo menos na 1ª semana", "Erro", JOptionPane.ERROR_MESSAGE);
       }
       else if(dur <=0){
            JOptionPane.showMessageDialog(null, "Tarefa deve ter no minimo 1 semana de duração", "Erro", JOptionPane.ERROR_MESSAGE);
       }
       else {
           bdTarefas = TarefaDAO.getTarefasByNomeProjeto(projetoLocal.getNome());
           
           for (Tarefa t:bdTarefas){
               if (t.getDescricao().equals(desc)){
                   
                   MateriaisForm mat = new MateriaisForm(t);
                   mat.setVisible(true);
               }
           }
       }
    }//GEN-LAST:event_inserirMatButtonActionPerformed

    private void editarTarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarTarButtonActionPerformed
        // TODO add your handling code here:
        int index = tarefasTable.getSelectedRow();
        
        if (index >= 0){
            addTarefaButton.setEnabled(false);
            editarTarButton.setEnabled(false);
            deleteButton.setEnabled(false);
            descricaoTextField.setEnabled(true);
            descricaoTextField.setText(tarefasTable.getModel().getValueAt(index, 1).toString());
            inicioSpinner.setEnabled(true);
            inicioSpinner.setValue((Object)Integer.parseInt(tarefasTable.getModel().getValueAt(index, 2).toString()));
            durSpinner.setEnabled(true);
            durSpinner.setValue((Object)Integer.parseInt(tarefasTable.getModel().getValueAt(index, 3).toString()));
            cancelButton.setEnabled(true);
            inserirMatButton.setEnabled(true);
            updateTarButton.setEnabled(true);
        }
        else {
            JOptionPane.showMessageDialog(null,"Nenhuma Tarefa foi selecionada", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_editarTarButtonActionPerformed

    private void updateTarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateTarButtonActionPerformed
        // TODO add your handling code here:
        int index = tarefasTable.getSelectedRow();
        if (index >=0){
            int id = Integer.parseInt(tarefasTable.getModel().getValueAt(index, 0).toString());
            String desc = tarefasTable.getModel().getValueAt(index, 1).toString();
            int ini = Integer.parseInt(tarefasTable.getModel().getValueAt(index, 2).toString());
            int dur = Integer.parseInt(tarefasTable.getModel().getValueAt(index, 3).toString());
            
            String selDesc = descricaoTextField.getText();
            int selIni = Integer.parseInt(inicioSpinner.getValue().toString());
            int selDur = Integer.parseInt(durSpinner.getValue().toString());
            if(!selDesc.equals(desc) || selIni != ini || selDur != dur){
                if (selIni > 0){
                    if (selDur > 0){
                        Tarefa t = TarefaDAO.getTarefaById(id);
                        t.setDescricao(selDesc);
                        t.setSemanaInicio(selIni);
                        t.setDuracao(selDur);
                        TarefaDAO.updateTarefa(t);
                        listTarefas();
                        clear();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Tarefa deve ter no minimo 1 semana de duração", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Tarefa deve iniciar pelo menos na 1ª semana", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        else {
            JOptionPane.showMessageDialog(null,"Nenhuma Tarefa foi selecionada", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateTarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TarefaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TarefaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TarefaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TarefaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new TarefaForm(Pr).setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewTarButton;
    private javax.swing.JButton addTarefaButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField descricaoTextField;
    private javax.swing.JSpinner durSpinner;
    private javax.swing.JButton editarTarButton;
    private javax.swing.JSpinner inicioSpinner;
    private javax.swing.JButton inserirMatButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tarefasTable;
    private javax.swing.JButton updateTarButton;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
