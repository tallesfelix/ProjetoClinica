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
    int codBai;
    
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
}
