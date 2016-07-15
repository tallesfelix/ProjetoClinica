/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Talles
 */
public class ConexaoBD {
    public Statement stm; //preparar e realizar pesquisa no banco de dados
    public ResultSet rs; // armazena resultado buscado na pesquisa
    private String driver = "org.postgresql.Driver"; // padrao postgre identifica serviço do bd
    private String caminho = "jdbc:postgresql://localhost:5432/projetoclinica"; //caminho do bd, setar o local
    private String usuario = "postgres"; //usuario do bd padrao
    private String senha = "admin"; //senha do bd criada
    public Connection con; // conexão com bd
    
    public void conexao (){
        //conexao com banco de dados
       try {
            System.setProperty("jdbc.Drivers", driver);
            con = DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null, "Conexão efetuada com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao se conectar com o banco de dados: \n"+ ex.getMessage());
        }
    }
    
    public void desconecta (){
        try {
            con.close();
            //JOptionPane.showMessageDialog(null, "Desconectado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexao com banco de dados:\n"+ ex.getMessage());
        }
    }
    
}
