package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansUsuario;
import modeloConection.ConexaoBD;

/**
 * Classe que representa um DaoUsuario no dominio da aplicação. DAO - Data
 * Access Object
 *
 * @author Allan Gomes
 * @author Daniel Nunes
 * @author Luis Eduardo
 * @author Talles Felix
 */
public class DaoUsuario {
    
    /**
     * Conexão com o banco
     */
    ConexaoBD conex = new ConexaoBD();
    
    /**
     * Modelo de Usuario
     */
    BeansUsuario mod = new BeansUsuario();

    
    /** metodo responsável por salvar um usuario 
     * @param mod  modelo de Usuario
     */
    public void salvar(BeansUsuario mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into usuarios(usu_nome,usu_senha,usu_tipo) values(?,?,?)");
            pst.setString(1, mod.getUsuNome());
            pst.setString(2, mod.getUsuSenha());
            pst.setString(3, mod.getUsuTipo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuario inserido com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir usuario" + ex.getMessage());

        }

        conex.desconecta();
    }

    
    /** metodo responsável por buscar um usuario no banco 
     * @param mod  modelo de usuario
     * @return um usuario
     * @throws java.sql.SQLException 
     */
    public BeansUsuario buscaUsuario(BeansUsuario mod) throws SQLException {
        conex.conexao();
        conex.executaSql("select *from usuarios where usu_nome like '%" + mod.getUsuPesquisa() + "%'");

        conex.rs.first();
        mod.setUsuCod(conex.rs.getInt("usu_cod"));
        mod.setUsuNome(conex.rs.getString("usu_nome"));
        mod.setUsuSenha(conex.rs.getString("usu_senha"));
        mod.setUsuTipo(conex.rs.getString("usu_tipo"));

        conex.desconecta();
        return mod;
    }

    /** metodo responsável por editar um usuario no banco 
     * @param mod  modelo de usuario
     * 
     */
    public void alterar(BeansUsuario mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update usuarios set usu_nome=?,usu_senha=?,usu_tipo=? where usu_cod=?");
            pst.setString(1, mod.getUsuNome());
            pst.setString(2, mod.getUsuSenha());
            pst.setString(3, mod.getUsuTipo());
            pst.setInt(4, mod.getUsuCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuario alterado com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração do usuario");
        }
        conex.desconecta();
    }

    
    /** metodo responsável por excluir um usuario no banco 
     * @param mod  modelo de usuario
     * 
     */
    public void excluir(BeansUsuario mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from usuarios where usu_cod=?");
            pst.setInt(1, mod.getUsuCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuario excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir usuario!");
        }
        conex.desconecta();
    }
}
