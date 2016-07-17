/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansPacientes;
import modeloConection.ConexaoBD;

/**
 *
 * @author Talles
 */
public class DaoPaciente {
    
    ConexaoBD conex = new ConexaoBD();
    ConexaoBD conexBairro = new ConexaoBD();
    int codBai;
    String nomeBairro;
    
    public void buscaBaiCod(String nome){//busca o codigo dos bairros
        conex.conexao();
            conex.executaSql("select *from bairro where bainome='"+nome+"'");
        try {
            conex.rs.first();
            codBai=conex.rs.getInt("baicodigo");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar bairro" + ex);
        }
        conex.desconecta();
    }
    
    public void salvar(BeansPacientes pac){
        buscaBaiCod(pac.getNomeBairro());
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into pacientes(paci_nome,paci_rg,paci_telefone,paci_rua,paci_cep,paci_complemento,paci_baicodigo,paci_nasc) values(?,?,?,?,?,?,?,?)");
            pst.setString(1, pac.getNomePac());
            pst.setString(2, pac.getRg());
            pst.setString(3, pac.getTelefone());
            pst.setString(4, pac.getRua());
            pst.setString(5, pac.getCep());
            pst.setString(6, pac.getComplemento());
            pst.setInt(7, codBai);
            pst.setString(8, pac.getNasc());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Paciente salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Paciente nao salvo!");
        }
        
        conex.desconecta();
        
    }
    
    public void editar(BeansPacientes pac){
        buscaBaiCod(pac.getNomeBairro());
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update  pacientes set paci_nome=?,paci_rg=?,paci_telefone=?,paci_rua=?,paci_cep=?,paci_complemento=?,paci_baicodigo=?,paci_nasc=? where paci_codigo=?");
            pst.setString(1, pac.getNomePac());
            pst.setString(2, pac.getRg());
            pst.setString(3, pac.getTelefone());
            pst.setString(4, pac.getRua());
            pst.setString(5, pac.getCep());
            pst.setString(6, pac.getComplemento());
            pst.setInt(7, codBai);
            pst.setString(8, pac.getNasc());
            pst.setInt(9, pac.getCodPac());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Paciente alterado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Paciente nao alterado!");
        }
        
        conex.desconecta(); 
    }
    
    public void buscaNomeBairro(int cod){
        conexBairro.conexao();   
        try {
            conexBairro.executaSql("select *from bairro where baicodigo='"+cod+"'");
            conexBairro.rs.first();
            nomeBairro = conexBairro.rs.getString("bainome");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar nome do bairro"+ex);
        }
        
        conexBairro.desconecta();
    }
    
    public BeansPacientes buscaPacientes (BeansPacientes pac) throws SQLException{
        conex.conexao();
            
    
            conex.executaSql("select *from pacientes where paci_nome like'%"+pac.getPesquisa()+"%'");
            conex.rs.first();
            buscaNomeBairro(conex.rs.getInt("paci_baicodigo"));
            pac.setNomePac(conex.rs.getString("paci_nome"));
            pac.setCep(conex.rs.getString("paci_cep"));
            pac.setCodPac(conex.rs.getInt("paci_codigo"));
            pac.setComplemento(conex.rs.getString("paci_complemento"));
            pac.setNasc(conex.rs.getString("paci_nasc"));
            pac.setRg(conex.rs.getString("paci_rg"));
            pac.setTelefone(conex.rs.getString("paci_telefone"));
            pac.setRua(conex.rs.getString("paci_rua"));
            pac.setNomeBairro(nomeBairro);
      
            
     
            
        conex.desconecta();
        return pac;
    }
    
    public void excluir (BeansPacientes pac){
            conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from pacientes where paci_codigo=?");
            pst.setInt(1, pac.getCodPac());
            pst.execute();
            JOptionPane.showMessageDialog(null, "paciente excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir paciente");
        }
    
            conex.desconecta();
    }
    
}
