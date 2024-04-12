/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package Projeto;
import Objetos.Obj_pacientes2;
import Projeto.FichadeCadastro;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import DAO.DAO_pacientes2;
/**
 *
 * @author Carol
 */
public class Menu extends javax.swing.JFrame {

    DAO_pacientes2 dao_pacientes2 = new DAO_pacientes2();
    /** Creates new form Menu */
    public Menu() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        nm_cadastronomenu = new javax.swing.JMenu();
        itemmenu_pacientes = new javax.swing.JCheckBoxMenuItem();
        imn_Relatorio = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu do Projeto");

        nm_cadastronomenu.setText("Ficha de Cadastro");

        itemmenu_pacientes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        itemmenu_pacientes.setSelected(true);
        itemmenu_pacientes.setText("Pacientes");
        itemmenu_pacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemmenu_pacientesActionPerformed(evt);
            }
        });
        nm_cadastronomenu.add(itemmenu_pacientes);

        imn_Relatorio.setText("Relatorio Paciente");
        imn_Relatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imn_RelatorioActionPerformed(evt);
            }
        });
        nm_cadastronomenu.add(imn_Relatorio);

        jMenuBar1.add(nm_cadastronomenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 299, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemmenu_pacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemmenu_pacientesActionPerformed
        
        FichadeCadastro mycard = new FichadeCadastro();
        mycard.setVisible(true);
        
    }//GEN-LAST:event_itemmenu_pacientesActionPerformed

    private void imn_RelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imn_RelatorioActionPerformed
       Relatório myRelat = new Relatório();
       myRelat.setVisible(true);
       MontaTela();
    }//GEN-LAST:event_imn_RelatorioActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater( new RunnableImpl());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu imn_Relatorio;
    private static transient volatile javax.swing.JCheckBoxMenuItem itemmenu_pacientes;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu nm_cadastronomenu;
    // End of variables declaration//GEN-END:variables

    private static class RunnableImpl implements Runnable{
        public void run(){
            new Menu().setVisible(true);
        }
    }
      public void MontaTela() {
            
     ArrayList<Obj_pacientes2> listaPaciente = new ArrayList();
        
     try{         
         listaPaciente = dao_pacientes2.Consulta_Convenio();
              
        String texto = "Relatório de Paciente";
        for (int i=0; i<listaPaciente.size();i++) {
    
        
        texto = texto + "\n\nMatricula:..."       + listaPaciente.get(i).getCd_matricula ();
        texto = texto + "\nNome do Paciente:..."  + listaPaciente.get(i).getNm_nomedopaciente();
        texto = texto + "\nEmail:..."             + listaPaciente.get(i).getDs_emailpaciente();
        texto = texto + "\nConvenio:..."          + listaPaciente.get(i).getCd_convenio();
        texto = texto + " - "                     + listaPaciente.get(i).getDs_convenio();
        texto = texto + "\nIndicação:..."         + listaPaciente.get(i).getDs_indicacao();
        texto = texto + "\nGrau de gravidade:..." + listaPaciente.get(i).getDs_graudegravidade();
        texto = texto + "\nData Aniversário:..."  + listaPaciente.get(i).getDt_datadenascimento();
        texto = texto + "\nConvenio:..."          + listaPaciente.get(i).getDs_convenio();

    }

     }   catch (Exception ex){
   JOptionPane.showMessageDialog(null,"Erro de Consulta BD - Monta Tela Relatório\n" + ex.getMessage(), "ERRO BD", JOptionPane.ERROR_MESSAGE );
            
        }
   
}
}
