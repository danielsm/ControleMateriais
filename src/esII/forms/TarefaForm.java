/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esII.forms;

import esII.dao.TarefaDAO;
import esII.entidades.Projeto;
import esII.entidades.Tarefa;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author daniel
 */
public class TarefaForm extends javax.swing.JFrame {

    /**
     * Creates new form TarefaForm
     */
    List<Tarefa> localTarefas = new ArrayList<>();
    Projeto projetoLocal;
    public TarefaForm(Projeto p) {
        this.projetoLocal = p;
        setTitle("Projeto "+p.getNome() +"- Tarefas");
        initComponents();
        finalizarTarButton.setEnabled(false);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tarefasJList = new javax.swing.JList();
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
        finalizarTarButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tarefasJList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Nenhuma tarefa cadastrada." };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(tarefasJList);

        jLabel1.setText("Tarefas Cadastradas:");

        addTarefaButton.setText("Adicionar Nova");
        addTarefaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTarefaButtonActionPerformed(evt);
            }
        });

        descricaoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descricaoTextFieldActionPerformed(evt);
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

        finalizarTarButton.setText("Finalizar");
        finalizarTarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarTarButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Semanas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descricaoTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inicioSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)
                                        .addGap(1, 1, 1)
                                        .addComponent(durSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cancelButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(addNewTarButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(finalizarTarButton)))
                                .addGap(20, 20, 20))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(addTarefaButton)))
                .addContainerGap(27, Short.MAX_VALUE))
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addTarefaButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(descricaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(inicioSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(durSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addNewTarButton)
                    .addComponent(cancelButton)
                    .addComponent(finalizarTarButton))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void clear(){
        descricaoTextField.setEnabled(false);
        inicioSpinner.setEnabled(false);
        durSpinner.setEnabled(false);
        addNewTarButton.setEnabled(false); 
        cancelButton.setEnabled(false);
    }
    
    private void descricaoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descricaoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descricaoTextFieldActionPerformed

    private void addTarefaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTarefaButtonActionPerformed
        // TODO add your handling code here:
        addTarefaButton.setEnabled(false);
        descricaoTextField.setEnabled(true);
        inicioSpinner.setEnabled(true);
        durSpinner.setEnabled(true);
        addNewTarButton.setEnabled(true);
        cancelButton.setEnabled(true);
    }//GEN-LAST:event_addTarefaButtonActionPerformed
    
    
    private void listTarefas(){
         DefaultListModel listModel = new DefaultListModel(); 

         for (Tarefa t:localTarefas){
             listModel.addElement(t.getDescricao());
         }
         tarefasJList.setModel(listModel);
    }
    
    private void addNewTarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewTarButtonActionPerformed
        // TODO add your handling code here:
        
        String desc;
        int dur, inicio;
        desc = descricaoTextField.getText();
        
        inicio = (Integer)inicioSpinner.getValue();
        dur = (Integer)durSpinner.getValue();
        
        if(desc.isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor insira uma descrição", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        if (inicio <= 0){
            JOptionPane.showMessageDialog(null, "Tarefa deve iniciar pelo menos na 1ª semana", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        if (dur <= 0){
            JOptionPane.showMessageDialog(null, "Tarefa deve ter no minimo 1 semana de duração", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        if (!desc.isEmpty() && inicio > 0 && dur > 0){
            if (inicio+(dur-1) <= projetoLocal.getDuracao()){
                Tarefa t = new Tarefa();
                t.setDescricao(desc);
                t.setNome_projeto(projetoLocal.getNome());
                t.setSemanaInicio(inicio);
                t.setDuracao(dur);
                localTarefas.add(t);
                listTarefas();
                finalizarTarButton.setEnabled(true);
                clear();
                MateriaisForm matForm = new MateriaisForm();
                matForm.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "Duração da TAREFA excede a duração do PROJETO", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            
        }
        
        
        
        
    }//GEN-LAST:event_addNewTarButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        Object o = (Object)0;
        descricaoTextField.setText(" ");
        inicioSpinner.setValue(o);
        durSpinner.setValue(o);
        
        addTarefaButton.setEnabled(true);
        descricaoTextField.setEnabled(false);
        inicioSpinner.setEnabled(false);
        durSpinner.setEnabled(false);
        addNewTarButton.setEnabled(false);  
        cancelButton.setEnabled(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void finalizarTarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarTarButtonActionPerformed
        // TODO add your handling code here:
        
        for (Tarefa t:localTarefas){
            
            //TarefaDAO.criaTarefa(t);
        }
        dispose();
    }//GEN-LAST:event_finalizarTarButtonActionPerformed

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
    private javax.swing.JTextField descricaoTextField;
    private javax.swing.JSpinner durSpinner;
    private javax.swing.JButton finalizarTarButton;
    private javax.swing.JSpinner inicioSpinner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JList tarefasJList;
    // End of variables declaration//GEN-END:variables
}
