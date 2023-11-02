package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoMySql {

    private Connection con = null;              //Variável para conexao
    
    private String servidor = "177.11.146.74:9898";      //Localização de servidor
    private String nomeDoBanco = "controle_frotas";      //Nome do banco de dados
    private String usuario = "root";            //Nome do usuário
    private String senha = "unip@7496";          //Senha do usuário
    
    public ConexaoMySql(){}
    
    public ConexaoMySql(String pServidor, String pNomeDoBanco, String pUsuario, String pSenha){
        this.servidor = pServidor;
        this.nomeDoBanco = pNomeDoBanco;
        this.usuario = pUsuario;
        this.senha = pSenha;
    }

    /**
     * Abre uma conexao com o banco
     * @return Connection
     */
    public Connection conectar(){
        try {
            //Driver do Mysql
            Class.forName("com.mysql.jdbc.Driver").newInstance();

            //local do banco, nome do banco, usuario e senha
            String url = "jdbc:mysql://" + servidor + "/" + nomeDoBanco;
            this.setCon((Connection) DriverManager.getConnection(url, usuario, senha));
        }
        catch(ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return this.getCon();
        
    }

 
    /**
     * encerra a conexão corrente
     * @return boolean
     */
    public boolean fecharConexao(){
       try {
           this.getCon().close();
           return true;
       } catch(SQLException e) {
           JOptionPane.showMessageDialog(null, e.getMessage());
       }
       return false;
    }
    
    /**
     * @return the con
     */
    public Connection getCon() {
        return con;
    }

    /**
     * @param con the con to set
     */
    public void setCon(Connection con) {
        this.con = con;
    }
}