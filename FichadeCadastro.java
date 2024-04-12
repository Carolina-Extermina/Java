package Projeto;

import javax.swing.JOptionPane;
import java.util.ArrayList;

import Objetos.Obj_pacientes2;
import Objetos.obj_convenios2;
import DAO.DAO_convenios2;
import DAO.DAO_pacientes2;
import static java.lang.Integer.parseInt;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Carol
 */
public class FichadeCadastro extends javax.swing.JFrame {
    
    private char Operacao = ' ';
    private int cd_matricula;
    
    DAO_convenios2 dao_convenios2 = new DAO_convenios2();
    DAO_pacientes2 dao_pacientes2 = new DAO_pacientes2();
    
    Obj_pacientes2 paciente = new Obj_pacientes2 ();
    ArrayList<Obj_pacientes2> ListaPaciente = new ArrayList ();

    obj_convenios2 convenios = new obj_convenios2 () ;
    ArrayList<obj_convenios2> Listaconvenios = new ArrayList ();
   
    private String nm_nomedopaciente;
    private String ds_convenio;
    private int cd_convenio;  
    private int dt_datadenascimento;
    private double ds_graudegravidade;
    private String ds_emailpaciente;
    private String ds_indicacao = " ";
    

    private String mensagem = " ";
    private int cd_Convenio;
    private String nm_Convenio;
    private Object cb_altamedica;
    private Object tf_grau;
    private obj_convenios2 obj_convenios2;
    private Object listaConvenio;
    private int tf_matricula;
    private Date tf_data;
    
   
    private int anIndex;
   
    public FichadeCadastro() {
       initComponents();
    
        CargaComboBox ();
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ib_matricula = new javax.swing.JLabel();
        Ib_nomedopaciente = new javax.swing.JLabel();
        Ib_datadenascimento = new javax.swing.JLabel();
        Ib_email = new javax.swing.JLabel();
        Ib_convenio = new javax.swing.JLabel();
        Ib_indicacao = new javax.swing.JLabel();
        ck_internacao = new javax.swing.JCheckBox();
        ck_altamedica = new javax.swing.JCheckBox();
        Ib_graudegravidade = new javax.swing.JLabel();
        bt_limpar = new javax.swing.JButton();
        bt_Salvar = new javax.swing.JButton();
        cb_convenio = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tf_nomedopaciente = new javax.swing.JEditorPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        tf_email = new javax.swing.JEditorPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        tf_graudegravidade = new javax.swing.JEditorPane();
        tf_matriculaa = new javax.swing.JTextField();
        bt_Incluir = new javax.swing.JButton();
        bt_Alterar = new javax.swing.JButton();
        bt_Consultar = new javax.swing.JButton();
        bt_Excluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tf_date = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ficha de Cadastro");

        Ib_matricula.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Ib_matricula.setText("Matricula");

        Ib_nomedopaciente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Ib_nomedopaciente.setText("Nome do Paciente");

        Ib_datadenascimento.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Ib_datadenascimento.setText("Data de Nascimento");

        Ib_email.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Ib_email.setText("E-mail");

        Ib_convenio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Ib_convenio.setText("Convênio");

        Ib_indicacao.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Ib_indicacao.setText("Indicação");

        ck_internacao.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ck_internacao.setText("Internação");
        ck_internacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ck_internacaoActionPerformed(evt);
            }
        });

        ck_altamedica.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ck_altamedica.setText("Alta Médica");
        ck_altamedica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ck_altamedicaActionPerformed(evt);
            }
        });

        Ib_graudegravidade.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Ib_graudegravidade.setText("Grau de Gravidade");

        bt_limpar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bt_limpar.setText("Limpar");
        bt_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_limparActionPerformed(evt);
            }
        });

        bt_Salvar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bt_Salvar.setText("Salvar");
        bt_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_SalvarActionPerformed(evt);
            }
        });

        cb_convenio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Santa Helena", "Amil", "Bradesco", "Porto Seguro", "Notre Dame", "Rede Dor" }));
        cb_convenio.setSelectedIndex(-1);
        cb_convenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_convenioActionPerformed(evt);
            }
        });

        tf_nomedopaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jScrollPane2.setViewportView(tf_nomedopaciente);

        tf_email.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jScrollPane4.setViewportView(tf_email);

        tf_graudegravidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jScrollPane5.setViewportView(tf_graudegravidade);

        tf_matriculaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_matriculaaActionPerformed(evt);
            }
        });

        bt_Incluir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bt_Incluir.setText("Incluir ");
        bt_Incluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_IncluirActionPerformed(evt);
            }
        });

        bt_Alterar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bt_Alterar.setText("Alterar");
        bt_Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_AlterarActionPerformed(evt);
            }
        });

        bt_Consultar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bt_Consultar.setText("Consultar");
        bt_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ConsultarActionPerformed(evt);
            }
        });

        bt_Excluir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bt_Excluir.setText("Excluir");
        bt_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ExcluirActionPerformed(evt);
            }
        });

        tf_date.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(tf_date);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Ib_nomedopaciente)
                                    .addComponent(Ib_matricula))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tf_matriculaa, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Ib_email)
                                    .addComponent(Ib_convenio)
                                    .addComponent(Ib_indicacao)
                                    .addComponent(Ib_datadenascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jScrollPane4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(ck_internacao)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ck_altamedica))
                                            .addComponent(cb_convenio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Ib_graudegravidade)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(bt_limpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_Incluir)
                .addGap(18, 18, 18)
                .addComponent(bt_Alterar)
                .addGap(18, 18, 18)
                .addComponent(bt_Consultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_Excluir)
                .addGap(18, 18, 18)
                .addComponent(bt_Salvar)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Ib_matricula)
                    .addComponent(tf_matriculaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Ib_nomedopaciente)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ib_datadenascimento))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ib_email)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ib_convenio)
                    .addComponent(cb_convenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ib_indicacao)
                    .addComponent(ck_internacao)
                    .addComponent(ck_altamedica))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Ib_graudegravidade)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_limpar)
                    .addComponent(bt_Salvar)
                    .addComponent(bt_Incluir)
                    .addComponent(bt_Alterar)
                    .addComponent(bt_Consultar)
                    .addComponent(bt_Excluir))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_SalvarActionPerformed
        
        if(!isCamposPreenchidos()){
             JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios", "Erro", JOptionPane.ERROR_MESSAGE);
         }else {
                  try{
                      paciente =new Obj_pacientes2 ();
                      
                      if(Operacao!= 'I'){
                          paciente.setCd_matricula(Integer.parseInt(tf_matriculaa.getText().trim()));
                      }
                      
                        paciente.setNm_nomedopaciente(tf_nomedopaciente.getText().trim());
                        
            paciente.setDs_graudegravidade(Double.parseDouble(tf_graudegravidade.getText().trim()));
            paciente.setDs_emailpaciente(tf_email.getText().trim() );
            paciente.setDs_convenio(cb_convenio.getSelectedItem().toString());
            
        paciente.setCd_convenio(Listaconvenios.get(cb_convenio.getSelectedIndex()).getCd_Convenio());
       
       /* Date data = tf_data;
                              
            
         GregorianCalendar gc = new GregorianCalendar();
          Date dt;
        
        gc.set(GregorianCalendar.YEAR,Integer.parseInt(data[2]));
        gc.set(GregorianCalendar.MONTH,Integer.parseInt(data[1]));
        gc.set(GregorianCalendar.DAY_OF_MONTH,Integer.parseInt(data[0])); 
         
        dt = gc.getTime();
            
        paciente.setDt_datadenascimento(dt);*/
             
                     
        if( ck_altamedica.isSelected()){
           ds_indicacao = "Internação";
        } else{
            ds_indicacao = "Alta Medica";
        }
        
        paciente.setDs_indicacao(ds_indicacao);
      
        if(!mensagem.isEmpty()){
         throw new Exception(mensagem);
        }
        mensagem = paciente.isDsEmailValido();
        if(!mensagem.isEmpty()){
         throw new Exception(mensagem);
            
        }
        mensagem = paciente.isDsgraudegravidadeValido();
        
        if(!mensagem.isEmpty()){
            throw new Exception (mensagem);
        }
            if(Operacao=='I'){                  
             if(dao_pacientes2.Inclui_paciente(paciente)){
                  
            JOptionPane.showMessageDialog(null,"Paciente salvo com sucesso","Mensagem", JOptionPane.INFORMATION_MESSAGE);
       
                } else
            JOptionPane.showMessageDialog(null,"Paciente não foi salvo.Verifique","Mensagem", JOptionPane.ERROR_MESSAGE);
        }
                  }catch (NumberFormatException erro) {
              JOptionPane.showMessageDialog(null, "Digite apenas numeros no código\n"+erro.toString(), "Erro", JOptionPane.ERROR_MESSAGE);
           }catch (Exception erro1) {
              /*JOptionPane.showMessageDialog(null, "Erro de validação\n"+erro1.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
          */}
                  finally{
        limpar();
        
        }
        }
        
 
    }//GEN-LAST:event_bt_SalvarActionPerformed

    
    private void bt_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_limparActionPerformed
        
     limpar();
    }//GEN-LAST:event_bt_limparActionPerformed

    private void ck_internacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ck_internacaoActionPerformed
       ck_altamedica.setSelected (false);
    }//GEN-LAST:event_ck_internacaoActionPerformed

    private void ck_altamedicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ck_altamedicaActionPerformed
        ck_internacao.setSelected(false);
    }//GEN-LAST:event_ck_altamedicaActionPerformed

    private void cb_convenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_convenioActionPerformed
       
    }//GEN-LAST:event_cb_convenioActionPerformed

    private void tf_matriculaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_matriculaaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_matriculaaActionPerformed

    private void bt_IncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_IncluirActionPerformed
      
       Operacao = 'I';
       tf_matriculaa.setEditable(false);
       tf_nomedopaciente.setEditable(true);
      // tf_data.setInt(true);
       tf_email.setEditable(true);
       cb_convenio.setEditable(true);
       ck_internacao.setEnabled(true);
       ck_altamedica.setEnabled(true);
       tf_graudegravidade.setEditable(true);
       
       bt_Alterar.setEnabled(false);
       bt_Excluir.setEnabled(false);
       bt_Consultar.setEnabled(false);
    }//GEN-LAST:event_bt_IncluirActionPerformed

    private void bt_AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_AlterarActionPerformed
        if (Operacao== ' '){
        Operacao = 'A';
         
       tf_matriculaa.setEditable(true);
       tf_nomedopaciente.setEditable(true);
      // tf_data.setEditable(false);
       tf_email.setEditable(true);
       cb_convenio.setEditable(true);
       ck_internacao.setEnabled(true);
       ck_altamedica.setEnabled(true);
       tf_graudegravidade.setEditable(true);
       
       bt_Incluir.setEnabled(false);
       bt_Excluir.setEnabled(false);
       bt_Consultar.setEnabled(false);
         
         }else{
            
            try{
                         
            cd_matricula = Integer.parseInt(tf_matriculaa.getText().trim());
            
        paciente = dao_pacientes2.Consulta_Pacientes(cd_matricula);
        
            if(paciente.getCd_matricula()==0){
              JOptionPane.showMessageDialog(null, "Codigo não localizado\n", "Erro de Tela", JOptionPane.ERROR_MESSAGE);
              limpar();
            } else{
                MontaTela();
                
            tf_matriculaa.setEditable(false);
            tf_nomedopaciente.setEditable(true);
            //tf_data.setEditable(true);
            tf_email.setEditable(true);
            cb_convenio.setEditable(true);
            ck_internacao.setEnabled(true);
            ck_altamedica.setEnabled(true);
            tf_graudegravidade.setEditable(true);
       
            bt_Incluir.setEnabled(false);
            bt_Excluir.setEnabled(false);
            bt_Consultar.setEnabled(false);
            bt_Alterar.setEnabled(false);
         
            }
            }
            catch (NumberFormatException erro) {
              JOptionPane.showMessageDialog(null, "Digite apenas numeros no código\n"+erro.toString(), "Erro Tela", JOptionPane.ERROR_MESSAGE);
            }catch (Exception ex){
              JOptionPane.showMessageDialog(null, "Erro de Consulta para ALtera Banco de Dados"+ex.toString(), "Erro BD", JOptionPane.ERROR_MESSAGE);
               
           }
        
        }
    }//GEN-LAST:event_bt_AlterarActionPerformed

    private void bt_ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ConsultarActionPerformed
        if (Operacao== ' '){
        Operacao = 'C';
         
       tf_matriculaa.setEditable(true);
       tf_nomedopaciente.setEditable(false);
       // tf_data.setEditable(false);
       tf_email.setEditable(false);
       cb_convenio.setEditable(false);
       ck_internacao.setEnabled(false);
       ck_altamedica.setEnabled(false);
       tf_graudegravidade.setEditable(false);
       
       bt_Incluir.setEnabled(false);
       bt_Excluir.setEnabled(false);
       bt_Alterar.setEnabled(false);
       bt_Salvar.setEnabled(false);
         
         }else{
            
            try{
            
            cd_matricula = Integer.parseInt(tf_matriculaa.getText().trim());
            
            paciente = dao_pacientes2.Consulta_Pacientes(cd_matricula);
                        
            if(paciente.getCd_matricula()==0){
              JOptionPane.showMessageDialog(null, "Codigo não localizado\n", "Erro de Tela", JOptionPane.ERROR_MESSAGE);
              limpar();
            } else{
                MontaTela();
                
            tf_matriculaa.setEditable(false);
            tf_nomedopaciente.setEditable(false);
           // tf_data.setEditable(false);
            tf_email.setEditable(false);
            cb_convenio.setEditable(false);
            ck_internacao.setEnabled(false);
            ck_altamedica.setEnabled(false);
            tf_graudegravidade.setEditable(false);
       
            bt_Incluir.setEnabled(false);
            bt_Excluir.setEnabled(false);
            bt_Consultar.setEnabled(false);
            bt_Alterar.setEnabled(false);
            bt_Salvar.setEnabled(false);
         
            }
            }
            catch (NumberFormatException erro) {
              JOptionPane.showMessageDialog(null, "Digite apenas numeros no código\n"+erro.toString(), "Erro Tela", JOptionPane.ERROR_MESSAGE);
            }catch (Exception ex){
              JOptionPane.showMessageDialog(null, "Erro de Consulta de Banco de Dados"+ex.toString(), "Erro BD", JOptionPane.ERROR_MESSAGE);
               
           }
        
        }
    }//GEN-LAST:event_bt_ConsultarActionPerformed

    private void bt_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ExcluirActionPerformed
          
        int resposta;
        
        if (Operacao== ' '){
        Operacao = 'E';
         
       tf_matriculaa.setEditable(true);
       tf_nomedopaciente.setEditable(false);
       //tf_data.setEditable(false);
       tf_email.setEditable(false);
       cb_convenio.setEditable(false);
       ck_internacao.setEnabled(false);
       ck_altamedica.setEnabled(false);
       tf_graudegravidade.setEditable(false);
       
        bt_Alterar.setEnabled(false);
        bt_Incluir.setEnabled(false);
        bt_Consultar.setEnabled(false);
        bt_Salvar.setEnabled(false);
         
         }else{
            
            try{
            
        cd_matricula = Integer.parseInt(tf_matriculaa.getText().trim());
            
        paciente = dao_pacientes2.Consulta_Pacientes(cd_matricula);
        
            if(paciente.getCd_matricula()==0){
              JOptionPane.showMessageDialog(null, "Codigo não localizado\n", "Erro de Tela", JOptionPane.ERROR_MESSAGE);
              limpar();
            } else{
                MontaTela();
                
            tf_matriculaa.setEditable(false);
            tf_nomedopaciente.setEditable(false);
           // tf_data.setEditable(false);
            tf_email.setEditable(false);
            cb_convenio.setEditable(false);
            ck_internacao.setEnabled(false);
            ck_altamedica.setEnabled(false);
            tf_graudegravidade.setEditable(false);
       
            bt_Incluir.setEnabled(false);
            bt_Excluir.setEnabled(false);
            bt_Consultar.setEnabled(false);
            bt_Alterar.setEnabled(false);
            bt_Salvar.setEnabled(false);
         
            resposta = JOptionPane.showConfirmDialog(null, "Confirma a Exclusão","Confirmação de Exclusão", JOptionPane.YES_NO_OPTION);
               if(resposta==0){   
                   cd_matricula = Integer.parseInt(tf_matriculaa.getText().trim());
                    if(dao_pacientes2.Exclui_Paciente(cd_matricula)){
                 JOptionPane.showMessageDialog(null,"Paciente excluido com sucesso", "Mensagem", JOptionPane.INFORMATION_MESSAGE );
             }else{
            JOptionPane.showMessageDialog(null,"Exclusão não efetuada,verifique", "Erro de Tela", JOptionPane.ERROR_MESSAGE );
             }
            }
               
            }  }
            
           catch (NumberFormatException erro) {
              JOptionPane.showMessageDialog(null, "Digite apenas numeros no código\n"+erro.toString(), "Erro Tela", JOptionPane.ERROR_MESSAGE);
            }
           catch (Exception ex){
             JOptionPane.showMessageDialog(null, "Erro de Consulta excluir Banco de Dados"+ex.toString(), "Erro BD", JOptionPane.ERROR_MESSAGE);
               
           }
            finally{
                   limpar();
                   }
            }
        
    }//GEN-LAST:event_bt_ExcluirActionPerformed
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FichadeCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FichadeCadastro().setVisible(true);
            }
            });
    }
           
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ib_convenio;
    private javax.swing.JLabel Ib_datadenascimento;
    private javax.swing.JLabel Ib_email;
    private javax.swing.JLabel Ib_graudegravidade;
    private javax.swing.JLabel Ib_indicacao;
    private javax.swing.JLabel Ib_matricula;
    private javax.swing.JLabel Ib_nomedopaciente;
    private javax.swing.JButton bt_Alterar;
    private javax.swing.JButton bt_Consultar;
    private javax.swing.JButton bt_Excluir;
    private javax.swing.JButton bt_Incluir;
    private javax.swing.JButton bt_Salvar;
    private javax.swing.JButton bt_limpar;
    private javax.swing.JComboBox<String> cb_convenio;
    private javax.swing.JCheckBox ck_altamedica;
    private javax.swing.JCheckBox ck_internacao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextPane tf_date;
    private javax.swing.JEditorPane tf_email;
    private javax.swing.JEditorPane tf_graudegravidade;
    private javax.swing.JTextField tf_matriculaa;
    private javax.swing.JEditorPane tf_nomedopaciente;
    // End of variables declaration//GEN-END:variables
public void MontaTela(){
    
    tf_matriculaa.setText(String.valueOf(paciente.getCd_matricula()));
    tf_nomedopaciente.setText(String.valueOf(paciente.getNm_nomedopaciente()));
    //tf_data.setInt(String.valueOf(paciente.getDt_datadenascimento()));
    tf_email.setText(paciente.getDs_emailpaciente());
    cb_convenio.setSelectedItem(paciente.getDs_convenio());
    tf_graudegravidade.setText(String.valueOf(paciente.getDs_graudegravidade()));
    if(paciente.getDs_indicacao().equals(ck_internacao)){
        ck_internacao.setSelected(true);
        ck_altamedica.setSelected(false);}
    else{
        ck_internacao.setSelected(false);
        ck_altamedica.setSelected(true);}
        }
       

    private void limpar() {
        tf_matriculaa.setText(null);
        tf_nomedopaciente.setText(null);
      //  tf_data.setText(null);
        tf_email.setText(null);
        cb_convenio.setSelectedIndex(-1);
        ck_internacao.setSelected(false);
        ck_altamedica.setSelected(false);
        tf_graudegravidade.setText(null);
        
       tf_matriculaa.setEditable(false);
       tf_nomedopaciente.setEditable(false);
      // tf_data.setText(null);
       tf_email.setEditable(false);
       cb_convenio.setEditable(false);
       ck_internacao.setEnabled(false);
       ck_altamedica.setEnabled(false);
       tf_graudegravidade.setEditable(false);
       
       bt_Alterar.setEnabled(true);
       bt_Excluir.setEnabled(true);
       bt_Consultar.setEnabled(true);
       bt_Incluir.setEnabled(true);
       
       Operacao = ' ';
    }
    
    private boolean isCamposPreenchidos() {
        boolean saida = false;
        
        if (Operacao =='I'){
            if(
                (!tf_email.getText().isEmpty())&&
                (!tf_graudegravidade.getText().isEmpty())&&
                (!tf_nomedopaciente.getText().isEmpty())&&
                (cb_convenio.getSelectedIndex()>=0)&&
                (!ck_altamedica.isSelected()) || (!ck_internacao.isSelected())  
             ){
            saida =true;
        }
            
     } else{
        if((!tf_matriculaa.getText().isEmpty())&&
           (!tf_email.getText().isEmpty())&&
            (!tf_graudegravidade.getText().isEmpty())&&
            (!tf_nomedopaciente.getText().isEmpty())&&
            (cb_convenio.getSelectedIndex()>=0)&&
            (!ck_altamedica.isSelected()) || (!ck_internacao.isSelected())  
                ){
            saida =true;
        }
        }
                return saida;
    }

private void CargaComboBox() {
      try{
          CargaConvenio ();
      }
      catch (Exception ex){
          JOptionPane.showMessageDialog(null, "ERRO CONEXÃO BD - Carga ComboBox.\n"+ex.getMessage(),"ERRO BD",JOptionPane.ERROR_MESSAGE);
      }
      
      for(int i=0; i<Listaconvenios.size(); i++){
          cb_convenio.addItem(Listaconvenios.get(i).getNm_Convenio());
      }
      cb_convenio.setSelectedIndex( -1);
}
   
    
private void CargaConvenio() throws Exception{
    
    Listaconvenios = dao_convenios2.Consulta_Convenio();
    }


}
 
/* fim da classe*/
