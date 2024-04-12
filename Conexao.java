  package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Carol
 */
public class Conexao {
      
    
	private final Connection Conexao;
	public Conexao() throws Exception{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Projeto";
            Conexao = DriverManager.getConnection(url,"usuario","Mika2908");
        
        }
	public Connection getConexao(){
		return Conexao;
        }
}
    

