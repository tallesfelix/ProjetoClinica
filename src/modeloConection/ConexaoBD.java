package modeloConection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Classe que representa uma conexão com o banco PostgreSql.
 *
 * @author Allan Gomes
 * @author Daniel Nunes
 * @author Luis Eduardo
 * @author Talles Felix
 */
public class ConexaoBD {

    /**
     * Realiza uma pesquisa no banco
     */
    public Statement stm;

    /**
     * Armazena resultado buscado na pesquisa
     */
    public ResultSet rs;

    /**
     * Identificador do Banco PostegreSql
     */
    private String driver = "org.postgresql.Driver";

    /**
     * Caminho da base de dados
     */
    private String caminho = "jdbc:postgresql://localhost:5432/projetoclinica";

    /**
     * Usuario do banco de dados(Padrão)
     */
    private String usuario = "postgres";

    /**
     * Senha do Usuario
     */
    private String senha = "admin";

    /**
     * Variável de conexão com o banco de dados
     */
    public Connection con;

    /**
     * Cria a conexão com a base de dados
     */
    public void conexao() {
        //conexao com banco de dados
        try {
            System.setProperty("jdbc.Drivers", driver);
            con = DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null, "Conexão efetuada com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao se conectar com o banco de dados: \n" + ex.getMessage());
        }
    }

    /**
     * Execulta um comando sql no banco de dados
     *
     * @param sql string - comando sql
     */
    public void executaSql(String sql) {
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executaSql \n" + ex.getMessage());
        }
    }

    /**
     * desconecta a conexão com a base de dados
     */
    public void desconecta() {
        try {
            con.close();
            //JOptionPane.showMessageDialog(null, "Desconectado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexao com banco de dados:\n" + ex.getMessage());
        }
    }

}
