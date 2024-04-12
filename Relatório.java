package Projeto;

/**
 *
 * @author Carol
 */
import Objetos.Obj_pacientes2;
import java.util.ArrayList;
import DAO.DAO_pacientes2;
import javax.swing.JOptionPane;

public class Relatório extends javax.swing.JFrame {

    DAO_pacientes2 dao_pacientes2 = new DAO_pacientes2();
        public Relatório() {
        initComponents();
        
       MontaTela();
    }

       @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ta_relatorio = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(ta_relatorio);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Relatório.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatório.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatório.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatório.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
                new Relatório().setVisible(true);
            }
        });
        }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JEditorPane ta_relatorio;
    // End of variables declaration//GEN-END:variables

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

    ta_relatorio.setText(texto);
    }
   catch (Exception ex){
   JOptionPane.showMessageDialog(null,"Erro de Consulta BD - Monta Tela Relatório\n" + ex.getMessage(), "ERRO BD", JOptionPane.ERROR_MESSAGE );
            
        }
    
    }
    

  }
