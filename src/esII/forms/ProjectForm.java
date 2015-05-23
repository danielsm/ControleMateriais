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
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author daniel
 */
public class ProjectForm extends javax.swing.JFrame {

    /**
     * Creates new form ProjectForm
     */
    List<Projeto> localProjetos = new ArrayList<>();
    List<Projeto> todosProjetos;
    
    public ProjectForm() {
        
        initComponents();
        listProjects();
        projectNameTxtField.setEnabled(false);
        duracaoSpinner.setEnabled(false);
        addNewButton.setEnabled(false);
        cancelarButton.setEnabled(false);
        
        verificarButton.setEnabled(false);
        deleteButton.setEnabled(false);
        //setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ProjectScrollPane = new javax.swing.JScrollPane();
        ProjectsList = new javax.swing.JList();
        ProjectsLabel = new javax.swing.JLabel();
        criarProjectButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        verificarButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        projectNameTxtField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        duracaoSpinner = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        addNewButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ProjectsList.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ProjectsList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Nenhum Projeto Cadastrado." };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        ProjectsList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ProjectsList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ProjectsList.setName(""); // NOI18N
        ProjectScrollPane.setViewportView(ProjectsList);

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

        verificarButton.setText("Verificar");
        verificarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificarButtonActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ProjectScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProjectsLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(projectNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(duracaoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(287, 287, 287)
                                .addComponent(cancelarButton)
                                .addGap(18, 18, 18)
                                .addComponent(addNewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(72, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(verificarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(criarProjectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProjectsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ProjectScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(verificarButton)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addNewButton)
                    .addComponent(cancelarButton))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void criarProjectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarProjectButtonActionPerformed
          // TODO add your handling code here:
        
        ProjectsList.setEnabled(false);
        criarProjectButton.setEnabled(false);
        verificarButton.setEnabled(false);
        deleteButton.setEnabled(false);
        
        projectNameTxtField.setEnabled(true);
        duracaoSpinner.setEnabled(true);
        addNewButton.setEnabled(true);
        cancelarButton.setEnabled(true);
//        setEnabled(false);
//        NewProjectForm criaNovoProjeto = new NewProjectForm();
//        criaNovoProjeto.setVisible(true);
//        while (criaNovoProjeto.isActive()){ 
//            setEnabled(false); 
//        }
//        setEnabled(true);
//        
    }//GEN-LAST:event_criarProjectButtonActionPerformed

    private void projectNameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectNameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_projectNameTxtFieldActionPerformed

    private void addNewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewButtonActionPerformed
        // TODO add your handling code here:
       
        String name;
        int dur = (Integer)duracaoSpinner.getValue();
        
        if (projectNameTxtField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor insira um nome para o projeto", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        if (dur <= 0){
            JOptionPane.showMessageDialog(null, "Projeto deve ter no minimo 1 semana", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        if(!projectNameTxtField.getText().isEmpty() && dur > 0){
            Projeto p = new Projeto();
            p.setNome(projectNameTxtField.getText());
            p.setDuracao(dur);
            localProjetos.add(p);
            //ProjetoDAO.criarProjeto(p);
            //dispose();
            listProjects();
            
            TarefaForm tarefaForm = new TarefaForm(p);
            tarefaForm.setVisible(true);
            
            verificarButton.setEnabled(true);
            deleteButton.setEnabled(true);
            clear();
           // setTempProj;
        }
    }//GEN-LAST:event_addNewButtonActionPerformed

    private void verificarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificarButtonActionPerformed
        // TODO add your handling code here:
        int index = ProjectsList.getSelectedIndex();
        if (index >=0){
            Object o = ProjectsList.getModel().getElementAt(index);
            System.out.println(o);
        }
    }//GEN-LAST:event_verificarButtonActionPerformed

    private void clear(){
        Object o = (Object)0;
        
        projectNameTxtField.setText(" ");
        duracaoSpinner.setValue(o);
        ProjectsList.setEnabled(true);
        verificarButton.setEnabled(true);
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
        int index = ProjectsList.getSelectedIndex();
        
        if (index >= 0){
            Object o = ProjectsList.getModel().getElementAt(index);
            //System.out.println(o); 
             //ProjetoDAO.deletaProjeto(o.toString());
            
            JOptionPane.showMessageDialog(null, "Projeto excluido com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            listProjects();
        }
        else {
            JOptionPane.showMessageDialog(null,"Nenhum Projeto foi selecionado", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_deleteButtonActionPerformed

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
        
        
        // Listar os projetos existentes, se houverem
        
    }
    
    
    private void listProjects(){
       DefaultListModel listModel = new DefaultListModel(); 
       
       todosProjetos = ProjetoDAO.getAllProjetos();
       if (!todosProjetos.isEmpty()){
            for (Projeto p:todosProjetos){
                listModel.addElement(p.getNome());
            }
            ProjectsList.setModel(listModel);
       }
       else {
           listModel.addElement("Nenhum Projeto Criado.");
           ProjectsList.setModel(listModel);
       }
       
      
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ProjectScrollPane;
    private javax.swing.JLabel ProjectsLabel;
    private javax.swing.JList ProjectsList;
    private javax.swing.JButton addNewButton;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JButton criarProjectButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JSpinner duracaoSpinner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField projectNameTxtField;
    private javax.swing.JButton verificarButton;
    // End of variables declaration//GEN-END:variables
}
