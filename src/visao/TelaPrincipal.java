/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloConection.ConexaoBD;

/**
 *
 * @author Talles
 */
public class TelaPrincipal extends javax.swing.JFrame {
    
    
    ConexaoBD conecta = new ConexaoBD();
    FormMedico tela  = new FormMedico();
    FormUsuario telaUso = new FormUsuario();
    FormPaciente telaPac = new FormPaciente();
    FormAgendamento telaAgendamento = new FormAgendamento();
    FormAgenda telaAgenda = new FormAgenda();
    FormConsultasRealizadas telaConsultasRealizadas = new FormConsultasRealizadas();
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal(String usuario) {
        initComponents();
        jLabelUsuario.setText(usuario);
        conecta.conexao();
    }

    private TelaPrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameBemVindo = new javax.swing.JInternalFrame();
        jPanelInternal = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButtonCadMedico = new javax.swing.JButton();
        jButtonCadEnfermeiras = new javax.swing.JButton();
        jButtonCadPacientes = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButtonAgenda = new javax.swing.JButton();
        jLabelPainelFundo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonFecharBemVindo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelFundoPrincipal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCadMedicos = new javax.swing.JMenuItem();
        jMenuItemCadPacientes = new javax.swing.JMenuItem();
        jMenuItemCadEnfemeiras = new javax.swing.JMenuItem();
        jMenuItemCadUsuarios = new javax.swing.JMenuItem();
        jMenuRelatorio = new javax.swing.JMenu();
        jMenuItemMarcar = new javax.swing.JMenuItem();
        jMenuItemConsultasDoDia = new javax.swing.JMenuItem();
        jMenuItemConsultasPassadas = new javax.swing.JMenuItem();
        jMenuFerramenta = new javax.swing.JMenu();
        jMenuItemTelaBemVindo = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jInternalFrameBemVindo.setTitle("Bem Vindo");
        jInternalFrameBemVindo.setVisible(true);
        jInternalFrameBemVindo.getContentPane().setLayout(null);

        jPanelInternal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelInternal.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Cadastros -");
        jPanelInternal.add(jLabel2);
        jLabel2.setBounds(10, 0, 100, 50);

        jButtonCadMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/CadMedicos.png"))); // NOI18N
        jButtonCadMedico.setToolTipText("Médicos");
        jButtonCadMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadMedicoActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonCadMedico);
        jButtonCadMedico.setBounds(30, 70, 130, 120);

        jButtonCadEnfermeiras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-infermeira.png"))); // NOI18N
        jButtonCadEnfermeiras.setToolTipText("Enfermeiras");
        jPanelInternal.add(jButtonCadEnfermeiras);
        jButtonCadEnfermeiras.setBounds(160, 70, 120, 120);

        jButtonCadPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadPacientes.png"))); // NOI18N
        jButtonCadPacientes.setToolTipText("Pacientes");
        jButtonCadPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadPacientesActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonCadPacientes);
        jButtonCadPacientes.setBounds(280, 70, 120, 120);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Agenda - ");
        jPanelInternal.add(jLabel3);
        jLabel3.setBounds(20, 210, 70, 20);

        jButtonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Agenda.png"))); // NOI18N
        jButtonAgenda.setToolTipText("Agendamento");
        jButtonAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgendaActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonAgenda);
        jButtonAgenda.setBounds(30, 240, 130, 130);

        jLabelPainelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/internalframe.png"))); // NOI18N
        jPanelInternal.add(jLabelPainelFundo);
        jLabelPainelFundo.setBounds(0, 0, 990, 370);

        jInternalFrameBemVindo.getContentPane().add(jPanelInternal);
        jPanelInternal.setBounds(0, 80, 990, 380);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Sistema de Gerenciamento de: ");
        jInternalFrameBemVindo.getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 20, 270, 40);

        jButtonFecharBemVindo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit.png"))); // NOI18N
        jButtonFecharBemVindo.setToolTipText("Fechar Tela  BemVindo");
        jButtonFecharBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharBemVindoActionPerformed(evt);
            }
        });
        jInternalFrameBemVindo.getContentPane().add(jButtonFecharBemVindo);
        jButtonFecharBemVindo.setBounds(920, 20, 40, 40);

        getContentPane().add(jInternalFrameBemVindo);
        jInternalFrameBemVindo.setBounds(0, 40, 1010, 470);

        jLabel4.setText("Usuario:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 10, 60, 14);
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(70, 0, 140, 20);

        jLabelFundoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo_telaprincipal.jpg"))); // NOI18N
        getContentPane().add(jLabelFundoPrincipal);
        jLabelFundoPrincipal.setBounds(0, 0, 1020, 550);

        jMenuCadastro.setText("Cadastros");

        jMenuItemCadMedicos.setText("Médicos");
        jMenuItemCadMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadMedicosActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadMedicos);

        jMenuItemCadPacientes.setText("Pacientes");
        jMenuItemCadPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadPacientesActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadPacientes);

        jMenuItemCadEnfemeiras.setText("Enfermeiras");
        jMenuItemCadEnfemeiras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadEnfemeirasActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadEnfemeiras);

        jMenuItemCadUsuarios.setText("Usuários");
        jMenuItemCadUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadUsuariosActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadUsuarios);

        jMenuBar1.add(jMenuCadastro);

        jMenuRelatorio.setText("Consultas");

        jMenuItemMarcar.setText("Marcar");
        jMenuItemMarcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMarcarActionPerformed(evt);
            }
        });
        jMenuRelatorio.add(jMenuItemMarcar);

        jMenuItemConsultasDoDia.setText("Consultas do dia");
        jMenuItemConsultasDoDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultasDoDiaActionPerformed(evt);
            }
        });
        jMenuRelatorio.add(jMenuItemConsultasDoDia);

        jMenuItemConsultasPassadas.setText("Passadas");
        jMenuItemConsultasPassadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultasPassadasActionPerformed(evt);
            }
        });
        jMenuRelatorio.add(jMenuItemConsultasPassadas);

        jMenuBar1.add(jMenuRelatorio);

        jMenuFerramenta.setText("Ferramentas");

        jMenuItemTelaBemVindo.setText("Tela Bem Vindo");
        jMenuItemTelaBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTelaBemVindoActionPerformed(evt);
            }
        });
        jMenuFerramenta.add(jMenuItemTelaBemVindo);

        jMenuBar1.add(jMenuFerramenta);

        jMenuSair.setText("Sair");
        jMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1031, 588));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCadPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadPacientesActionPerformed
        try {
            conecta.executaSql("select *from usuarios where usu_nome='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("usu_tipo").equals("Administrador")){
                if(telaPac==null){
                    telaPac=new FormPaciente();
                    telaPac.setVisible(true);
                    telaPac.setResizable(false);
                }else{
                    telaPac.setVisible(true);
                    telaPac.setResizable(false);   
                }
            
            }else{
                JOptionPane.showMessageDialog(null, "Voce nao tem permissao para esta area");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Voce nao tem permissao para esta area"+ex);
        }
    }//GEN-LAST:event_jMenuItemCadPacientesActionPerformed

    private void jMenuItemCadEnfemeirasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadEnfemeirasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemCadEnfemeirasActionPerformed

    private void jButtonCadMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadMedicoActionPerformed
         try {
            conecta.executaSql("select *from usuarios where usu_nome='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("usu_tipo").equals("Administrador")){
                if(tela==null){
                    tela=new FormMedico();
                    tela.setVisible(true);
                    tela.setResizable(false);
                }else{
                    tela.setVisible(true);
                    tela.setResizable(false);   
                }
            
            }else{
                JOptionPane.showMessageDialog(null, "Voce nao tem permissao para esta area");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Voce nao tem permissao para esta area"+ex);
        }
    }//GEN-LAST:event_jButtonCadMedicoActionPerformed

    private void jButtonFecharBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharBemVindoActionPerformed
        jInternalFrameBemVindo.dispose();
    }//GEN-LAST:event_jButtonFecharBemVindoActionPerformed

    private void jMenuItemTelaBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTelaBemVindoActionPerformed
        jInternalFrameBemVindo.setVisible(true);
    }//GEN-LAST:event_jMenuItemTelaBemVindoActionPerformed

    private void jMenuItemCadMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadMedicosActionPerformed
        try {
            conecta.executaSql("select *from usuarios where usu_nome='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("usu_tipo").equals("Administrador")){
                if(tela==null){
                    tela=new FormMedico();
                    tela.setVisible(true);
                    tela.setResizable(false);
                }else{
                    tela.setVisible(true);
                    tela.setResizable(false);   
                }
            
            }else{
                JOptionPane.showMessageDialog(null, "Voce nao tem permissao para esta area");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Voce nao tem permissao para esta area"+ex);
        }
        
    }//GEN-LAST:event_jMenuItemCadMedicosActionPerformed

    private void jMenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenuSairMouseClicked

    private void jMenuItemCadUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadUsuariosActionPerformed
         try {
            conecta.executaSql("select *from usuarios where usu_nome='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("usu_tipo").equals("Administrador")){
                if(telaUso==null){
                    telaUso=new FormUsuario();
                    telaUso.setVisible(true);
                    telaUso.setResizable(false);
                }else{
                    telaUso.setVisible(true);
                    telaUso.setResizable(false);   
                }
            
            }else{
                JOptionPane.showMessageDialog(null, "Voce nao tem permissao para esta area");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Voce nao tem permissao para esta area"+ex);
        }
        
    }//GEN-LAST:event_jMenuItemCadUsuariosActionPerformed

    private void jButtonCadPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadPacientesActionPerformed
        try {
            conecta.executaSql("select *from usuarios where usu_nome='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("usu_tipo").equals("Administrador")){
                if(telaPac==null){
                    telaPac=new FormPaciente();
                    telaPac.setVisible(true);
                    telaPac.setResizable(false);
                }else{
                    telaPac.setVisible(true);
                    telaPac.setResizable(false);   
                }
            
            }else{
                JOptionPane.showMessageDialog(null, "Voce nao tem permissao para esta area");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Voce nao tem permissao para esta area"+ex);
        }
    }//GEN-LAST:event_jButtonCadPacientesActionPerformed

    private void jButtonAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgendaActionPerformed
        try {
            conecta.executaSql("select *from usuarios where usu_nome='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("usu_tipo").equals("Administrador") || conecta.rs.getString("usu_tipo").equals("Recepcionista") ){
                if(telaAgendamento==null){
                    telaAgendamento=new FormAgendamento();
                    telaAgendamento.setVisible(true);
                    telaAgendamento.setResizable(false);
                }else{
                    telaAgendamento.setVisible(true);
                    telaAgendamento.setResizable(false);   
                }
            
            }else{
                JOptionPane.showMessageDialog(null, "Voce nao tem permissao para esta area");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Voce nao tem permissao para esta area"+ex);
        }
    }//GEN-LAST:event_jButtonAgendaActionPerformed

    private void jMenuItemMarcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMarcarActionPerformed
         try {
            conecta.executaSql("select *from usuarios where usu_nome='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("usu_tipo").equals("Administrador") || conecta.rs.getString("usu_tipo").equals("Recepcionista") ){
                if(telaAgendamento==null){
                    telaAgendamento=new FormAgendamento();
                    telaAgendamento.setVisible(true);
                    telaAgendamento.setResizable(false);
                }else{
                    telaAgendamento.setVisible(true);
                    telaAgendamento.setResizable(false);   
                }
            
            }else{
                JOptionPane.showMessageDialog(null, "Voce nao tem permissao para esta area");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Voce nao tem permissao para esta area"+ex);
        }
                               
    }//GEN-LAST:event_jMenuItemMarcarActionPerformed

    private void jMenuItemConsultasDoDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultasDoDiaActionPerformed
        try {
            conecta.executaSql("select *from usuarios where usu_nome='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("usu_tipo").equals("Administrador") || conecta.rs.getString("usu_tipo").equals("Recepcionista") || conecta.rs.getString("usu_tipo").equals("Medico") ){
                if(telaAgenda==null){
                    telaAgenda=new FormAgenda();
                    telaAgenda.setVisible(true);
                    telaAgenda.setResizable(false);
                }else{
                    telaAgenda.setVisible(true);
                    telaAgenda.setResizable(false);   
                }
            
            }else{
                JOptionPane.showMessageDialog(null, "Voce nao tem permissao para esta area");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Voce nao tem permissao para esta area"+ex);
        }
    }//GEN-LAST:event_jMenuItemConsultasDoDiaActionPerformed

    private void jMenuItemConsultasPassadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultasPassadasActionPerformed
       try {
            conecta.executaSql("select *from usuarios where usu_nome='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("usu_tipo").equals("Administrador") || conecta.rs.getString("usu_tipo").equals("Recepcionista") || conecta.rs.getString("usu_tipo").equals("Medico")){
                if(telaConsultasRealizadas==null){
                   telaConsultasRealizadas=new FormConsultasRealizadas();
                    telaConsultasRealizadas.setVisible(true);
                    telaConsultasRealizadas.setResizable(false);
                }else{
                   telaConsultasRealizadas.setVisible(true);
                   telaConsultasRealizadas.setResizable(false);   
                }
            
            }else{
                JOptionPane.showMessageDialog(null, "Voce nao tem permissao para esta area");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Voce nao tem permissao para esta area"+ex);
        }
    }//GEN-LAST:event_jMenuItemConsultasPassadasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgenda;
    private javax.swing.JButton jButtonCadEnfermeiras;
    private javax.swing.JButton jButtonCadMedico;
    private javax.swing.JButton jButtonCadPacientes;
    private javax.swing.JButton jButtonFecharBemVindo;
    private javax.swing.JInternalFrame jInternalFrameBemVindo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelFundoPrincipal;
    private javax.swing.JLabel jLabelPainelFundo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuFerramenta;
    private javax.swing.JMenuItem jMenuItemCadEnfemeiras;
    private javax.swing.JMenuItem jMenuItemCadMedicos;
    private javax.swing.JMenuItem jMenuItemCadPacientes;
    private javax.swing.JMenuItem jMenuItemCadUsuarios;
    private javax.swing.JMenuItem jMenuItemConsultasDoDia;
    private javax.swing.JMenuItem jMenuItemConsultasPassadas;
    private javax.swing.JMenuItem jMenuItemMarcar;
    private javax.swing.JMenuItem jMenuItemTelaBemVindo;
    private javax.swing.JMenu jMenuRelatorio;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanelInternal;
    // End of variables declaration//GEN-END:variables
}
