/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloBeans.ModeloTabela;
import modeloConection.ConexaoBD;

/**
 *
 * @author Talles
 */
public class FormConsultasRealizadas extends javax.swing.JFrame {
    
    ConexaoBD conex = new ConexaoBD();

    /**
     * Creates new form FormConsultasRealizadas
     */
    public FormConsultasRealizadas() {
        
        initComponents();
        preencherTabela("select agenda_cod,paci_nome,agenda_turno,nome_medico,agenda_motivo,agenda_status,agenda_data from agenda inner join pacientes on (agenda_codpac=paci_codigo) inner join medicos on (agenda_codmedico=cod_medico) order by agenda_data");
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableConsultasRealizadas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableConsultasRealizadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableConsultasRealizadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableConsultasRealizadasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableConsultasRealizadas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Consultas Realizadas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(341, 341, 341))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(863, 557));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTableConsultasRealizadasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableConsultasRealizadasMouseClicked
        preencherTabela("select agenda_cod,paci_nome,agenda_turno,nome_medico,agenda_motivo,agenda_status,agenda_data from agenda inner join pacientes on (agenda_codpac=paci_codigo) inner join medicos on (agenda_codmedico=cod_medico) order by agenda_data");
    }//GEN-LAST:event_jTableConsultasRealizadasMouseClicked
    
    String aberto = "Aberto";
     public void preencherTabela(String Sql){
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID","Paciente","Turno","Medico","Motivo","Status","Data"};
        conex.conexao();
        conex.executaSql(Sql);
        try{
            conex.rs.first();
           
            do{
                if(conex.rs.getString("agenda_status").equals(aberto)){
               }else{
                   dados.add(new Object[]{conex.rs.getInt("agenda_cod"),conex.rs.getString("paci_nome"),conex.rs.getString("agenda_turno"),conex.rs.getString("nome_medico"),conex.rs.getString("agenda_motivo"),conex.rs.getString("agenda_status"),conex.rs.getDate("agenda_data")});
                
                }
            }while(conex.rs.next());
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher a tabela, consultas nao encontradas");
        }
        
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTableConsultasRealizadas.setModel(modelo);
        jTableConsultasRealizadas.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTableConsultasRealizadas.getColumnModel().getColumn(0).setResizable(false);
        jTableConsultasRealizadas.getColumnModel().getColumn(1).setPreferredWidth(250);
        jTableConsultasRealizadas.getColumnModel().getColumn(1).setResizable(false);
        jTableConsultasRealizadas.getColumnModel().getColumn(2).setPreferredWidth(120);
        jTableConsultasRealizadas.getColumnModel().getColumn(2).setResizable(false);
        jTableConsultasRealizadas.getColumnModel().getColumn(3).setPreferredWidth(150);
        jTableConsultasRealizadas.getColumnModel().getColumn(3).setResizable(false);
        jTableConsultasRealizadas.getColumnModel().getColumn(4).setPreferredWidth(135);
        jTableConsultasRealizadas.getColumnModel().getColumn(4).setResizable(false);
        jTableConsultasRealizadas.getColumnModel().getColumn(5).setPreferredWidth(80);
        jTableConsultasRealizadas.getColumnModel().getColumn(5).setResizable(false);
        jTableConsultasRealizadas.getColumnModel().getColumn(6).setPreferredWidth(80);
        jTableConsultasRealizadas.getColumnModel().getColumn(6).setResizable(false);
        jTableConsultasRealizadas.getTableHeader().setReorderingAllowed(false);    
        jTableConsultasRealizadas.setAutoResizeMode(jTableConsultasRealizadas.AUTO_RESIZE_OFF);// tabela nao vai poder se redimensionada
        jTableConsultasRealizadas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//selecionar um por vez
        conex.desconecta();
        
    }
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
            java.util.logging.Logger.getLogger(FormConsultasRealizadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormConsultasRealizadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormConsultasRealizadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormConsultasRealizadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormConsultasRealizadas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableConsultasRealizadas;
    // End of variables declaration//GEN-END:variables
}
