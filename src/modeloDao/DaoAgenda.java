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
import modeloBeans.BeansAgenda;
import modeloConection.ConexaoBD;

/**
 *
 * @author Talles
 */
public class DaoAgenda {
    BeansAgenda agenda = new BeansAgenda();
    ConexaoBD conex = new ConexaoBD();
    ConexaoBD conexPaciente = new ConexaoBD();
    ConexaoBD  conexMedico = new ConexaoBD();
    
    int codMed;
    int codPac;
    
    public void salvar(BeansAgenda agenda){
        buscarMedico(agenda.getNomeMed());
        buscarPaciente(agenda.getNomePac());
        
        
        conex.conexao();

        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into agenda(agenda_codpac,agenda_codmedico,agenda_motivo,agenda_turno,agenda_data,agenda_status) values(?,?,?,?,?,?)");
                    pst.setInt(1, codPac);
                    pst.setInt(2, codMed);
                    pst.setString(3,agenda.getMotivo());
                    pst.setString(4, agenda.getTurno());
                    pst.setDate(5, new java.sql.Date(agenda.getData().getTime()));
                    pst.setString(6, agenda.getStatus());
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Consulta marcada com sucesso!");
        
                    } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro no agendamento");
        }
        conex.desconecta();
    }
    
    public void buscarMedico(String nomeMedico){
        conexMedico.conexao();
            conexMedico.executaSql("select *from medicos where nome_medico='"+nomeMedico+"'");
        try {
            conexMedico.rs.first();
            codMed = conexMedico.rs.getInt("cod_medico");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Medico nao encontrado!");
        }
        conexMedico.desconecta();
        
    }
    
    public void buscarPaciente(String nomePaciente){
         conexPaciente.conexao();
            conexPaciente.executaSql("select *from pacientes where paci_nome='"+nomePaciente+"'");
        try {
            conexPaciente.rs.first();
            codPac = conexPaciente.rs.getInt("paci_codigo");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Paciente nao encontrado!"+ex);
        }
        conexPaciente.desconecta();
        
    }
    
    public void editarStatus(BeansAgenda agenda){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update agenda set agenda_status=? where agenda_cod=?");
            pst.setString(1, agenda.getStatus());
            pst.setInt(2, agenda.getAgendaCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "consulta feita com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "consulta nao alterada!"+ex);
        }
        
        conex.desconecta(); 
    }
    
       public void editarStatusFaltou(BeansAgenda agenda){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update agenda set agenda_status=? where agenda_cod=?");
            pst.setString(1, agenda.getStatus());
            pst.setInt(2, agenda.getAgendaCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Paciente nao compareceu!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "consulta nao alterada!"+ex);
        }
        
        conex.desconecta(); 
    }

}

    

