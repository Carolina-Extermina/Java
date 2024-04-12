package DAO;

/**
 *
 * @author Carol
 */
import Conexao.Conexao;
import Obj_pacientes2.obj_convenios2;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO_convenios2 {
    
       Conexao con;
    
    ArrayList<Obj_convenio2> lista;
    Obj_convenio2             linha;

    /**
     *
     * @param Codigo
     * @return
     * @throws Exception
     */
    public boolean exclui_Genero (int Codigo) throws Exception{
     boolean saida = false;
     this.con = new Conexao();
     String SQL = "DELETE FROM Obj_convenio WHERE Projeto =?";
     PreparedStatement ps = this.con.getConexao().prepareStatement(SQL);
     ps.setInt(1, Codigo);
     if (0 >ps.executedUpdate()){
     }else {
         saida = true;
     }
     return saida;
 }
 
 public Obj_convenio2 Consulta_Convenio (int codigo) throws Exception{
     this.con = new Conexao();
     String SQL = "SELECT cd_convenio, nm_convenio  FROM Obj_paciente = ?";
     PreparedStatement ps = this.con.getConexao().prepareStatement(SQL);
     ps.setInt(1, codigo);
     ResultSet rs = ps.executeQuery();
    this.lista = new ArrayList();
    
    while(rs.next()){
        this.linha = new Obj_convenio2();
        this.linha.setcd_convenio2(rs.getInt("cd_convenio"));
        this.linha.setNm_convenio2(rs.getString("nm_convenio"));
        
    }
    return this.linha;
    
    
 }
 
    /**
     *
     * @throws Expection
     */
    public void Consulta_Convenio () throws Expection, Exception{
    this.con = new Conexao();
    String SQL = "SELECT cd_convenio, nm_convenio  FROM Obj_concenio ";
    PreparedStatement ps = this.con.getConexao().prepareStatement(SQL);
    ResultSet rs = ps.executeQuery();
    this.lista = new ArrayList();
    
    While(rs.next());
        this.linha = new Obj_convenio2();
        this.linha.setCd_pacientes(rs.getInt("cd_Convenio"));
        this.linha.setNm_nomedopacientes(rs.getString("nm_Convenio"));
        
        
        this.lista.add(this.linha);
    }
    return linha;

    private void While(boolean next) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class Expection extends Exception {

        public Expection() {
        }
    }

    private static class Obj_convenio2 {

        public Obj_convenio2() {
        }
     

        private void setcd_convenio2(int aInt) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void setNm_convenio2(String string) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void setCd_pacientes(int aInt) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void setNm_nomedopacientes(String string) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }


    
}
