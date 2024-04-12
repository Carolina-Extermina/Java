
package Objetos;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Carol
 */
public class Obj_pacientes2 {
        
    private int cd_matricula;
    private String nm_nomedopaciente;
    private String ds_convenio;
    private int cd_convenio;
    private Date dt_datadenascimento;
    private double ds_graudegravidade;
    private String ds_emailpaciente;
    private String ds_indicacao;

    public int getCd_matricula() {
        return cd_matricula;
    }

    public void setCd_matricula(int cd_matricula) {
        this.cd_matricula = cd_matricula;
    }

    public String getNm_nomedopaciente() {
        return nm_nomedopaciente;
    }

    public void setNm_nomedopaciente(String nm_nomedopaciente) {
        this.nm_nomedopaciente = nm_nomedopaciente;
    }

    public String getDs_convenio() {
        return ds_convenio;
    }

    public void setDs_convenio(String ds_convenio) {
        this.ds_convenio = ds_convenio;
    }

    public int getCd_convenio() {
        return cd_convenio;
    }

    public void setCd_convenio(int cd_convenio) {
        this.cd_convenio = cd_convenio;
    }

    public Date getDt_datadenascimento() {
        return dt_datadenascimento;
    }

    public void setDt_datadenascimento(Date dt_datadenascimento) {
        this.dt_datadenascimento = dt_datadenascimento;
    }

    public double getDs_graudegravidade() {
        return ds_graudegravidade;
    }

    public void setDs_graudegravidade(double ds_graudegravidade) {
        this.ds_graudegravidade = ds_graudegravidade;
    }

    public String getDs_emailpaciente() {
        return ds_emailpaciente;
    }

    public void setDs_emailpaciente(String ds_emailpaciente) {
        this.ds_emailpaciente = ds_emailpaciente;
    }

    public String getDs_indicacao() {
        return ds_indicacao;
    }

    public void setDs_indicacao(String ds_indicacao) {
        this.ds_indicacao = ds_indicacao;
    }
    
    ///custom
    
    public String isDsgraudegravidadeValido () {
        String saida = " ";
        if ((this.ds_graudegravidade<0)||(this.ds_graudegravidade<10)) {
            saida = "grau de gravidade invalido ";
        }
        
        
        return saida;
    }
    
    public String isNmPacienteValido () {
       String saida = " ";
        if (this.nm_nomedopaciente.length()<8 || (this.nm_nomedopaciente.length()>40)) {
            saida ="Nome do aluno deve ter entre 10 e 40 letras" ;
        }
        
        return saida;
    }
    
    public String isDsEmailValido (){
        String  saida = " ";
        
        if ((this.ds_emailpaciente.length()<9)||(this.ds_emailpaciente.length()>40)){
        saida = "Email do paciente deve ter entre 9 a 40 letras";
        
        }
          if ((!this.ds_emailpaciente.endsWith(".com"))&&(!this.ds_emailpaciente.endsWith(".com.br"))&&(!this.ds_emailpaciente.endsWith(".gov.br"))&&(!this.ds_emailpaciente.endsWith(".net.br")))
         saida = "Email do paciente com dominio invalido";
          
        
        int A1 = this.ds_emailpaciente.indexOf("@");
        int A2 = this.ds_emailpaciente.lastIndexOf("@");
        
        if ((A1!= A2)||(A1==-1)) {
        saida = "Email do Paciente esta invalido";
    
    
}
        
        return saida;
}
/*public void setDt(LocalDate data){
    throw new UnsupportedOperationException("Not supported yet.");

    */
  


}
    

