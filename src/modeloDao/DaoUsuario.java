/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansUsuario;
import modeloConection.ConexaoBD;

/**
 *
 * @author Talles
 */
public class DaoUsuario {
     ConexaoBD conex = new ConexaoBD();
    BeansUsuario mod = new BeansUsuario();
    
    public void salvar (BeansUsuario mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into usuarios(usu_nome,usu_senha,usu_tipo) values(?,?,?)");
            pst.setString(1,mod.getUsuNome());
            pst.setString(2,mod.getUsuSenha());
            pst.setString(3,mod.getUsuTipo());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Usuario inserido com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir usuario" + ex.getMessage());

        }
        
        conex.desconecta();
    }
    
     public BeansUsuario buscaUsuario (BeansUsuario mod) throws SQLException{
        conex.conexao();
        conex.executaSql("select *from usuarios where usu_nome like '%" + mod.getUsuPesquisa()+ "%'");
        
            conex.rs.first();
            mod.setUsuCod(conex.rs.getInt("usu_cod"));
            mod.setUsuNome(conex.rs.getString("usu_nome"));
            mod.setUsuSenha(conex.rs.getString("usu_senha"));
            mod.setUsuTipo(conex.rs.getString("usu_tipo"));

        conex.desconecta();
        return mod;
    }
     
     public void alterar (BeansUsuario mod){
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
     
     public void excluir (BeansUsuario mod) {
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
