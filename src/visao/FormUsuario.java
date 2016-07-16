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
import modeloBeans.BeansUsuario;
import modeloBeans.ModeloTabela;
import modeloConection.ConexaoBD;
import modeloDao.DaoUsuario;

/**
 *
 * @author Talles
 */
public class FormUsuario extends javax.swing.JFrame {

    BeansUsuario mod = new BeansUsuario();
    DaoUsuario dao = new DaoUsuario();
    ConexaoBD conex = new ConexaoBD();
    
    int flag =0;
    /**
     * Creates new form FormUsuario
     */
    public FormUsuario() {
        initComponents();
        preencherTabela("select *from usuarios order by usu_nome");
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jPasswordFieldConfirmarSenha = new javax.swing.JPasswordField();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUsuario = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCod = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Usuario");

        jLabel4.setText("Senha");

        jLabel5.setText("Confirmar Senha");

        jLabel6.setText("Tipo");

        jTextFieldUsuario.setEnabled(false);

        jPasswordFieldSenha.setEnabled(false);

        jPasswordFieldConfirmarSenha.setEnabled(false);

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Medico", "Recepcionista" }));
        jComboBoxTipo.setEnabled(false);

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.setEnabled(false);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jTableUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableUsuario);

        jLabel2.setText("COD");

        jTextFieldCod.setEnabled(false);
        jTextFieldCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                            .addComponent(jButtonAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonNovo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonBuscar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(67, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                                            .addComponent(jPasswordFieldConfirmarSenha)
                                            .addComponent(jTextFieldUsuario))
                                        .addGap(67, 67, 67)
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(62, 62, 62))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jButtonNovo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPasswordFieldConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExcluir)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonCancelar)
                            .addComponent(jButtonBuscar)
                            .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Cadastro de Usuarios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(332, 332, 332)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(904, 528));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        flag = 1;
        jTextFieldUsuario.setEnabled(true);
        jComboBoxTipo.setEnabled(true);
        jPasswordFieldSenha.setEnabled(true);
        jPasswordFieldConfirmarSenha.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jTextFieldPesquisar.setEnabled(false);
        jButtonBuscar.setEnabled(false);
        jButtonNovo.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonAlterar.setEnabled(false);
        jTextFieldUsuario.setText("");
        jPasswordFieldSenha.setText("");
        jPasswordFieldConfirmarSenha.setText("");
        jTextFieldCod.setText("");
        
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if(jTextFieldUsuario.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo Usuario vazio!");
            jTextFieldUsuario.requestFocus();
        }else if(jPasswordFieldConfirmarSenha.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo Confirmar Senha vazio!");
            jPasswordFieldConfirmarSenha.requestFocus();
        }else if(jPasswordFieldSenha.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo Senha vazio!");
            jPasswordFieldSenha.requestFocus();
        }else if(jPasswordFieldSenha.getText().equals(jPasswordFieldConfirmarSenha.getText()) ){
            if(flag == 1 ){
                mod.setUsuNome(jTextFieldUsuario.getText());
                mod.setUsuTipo((String) jComboBoxTipo.getSelectedItem());
                mod.setUsuSenha(jPasswordFieldSenha.getText());
                dao.salvar(mod);
                jTextFieldUsuario.setText("");
                jPasswordFieldSenha.setText("");
                jPasswordFieldConfirmarSenha.setText("");
                jTextFieldCod.setText("");

                jComboBoxTipo.setEnabled(false);
                jTextFieldUsuario.setEnabled(false);
                jPasswordFieldConfirmarSenha.setEnabled(false);
                jPasswordFieldSenha.setEnabled(false);
                jButtonSalvar.setEnabled(false);
                jButtonNovo.setEnabled(true);
                jButtonCancelar.setEnabled(false);
                jButtonAlterar.setEnabled(false);
                jTextFieldPesquisar.setEnabled(true);
                jButtonBuscar.setEnabled(true);
                preencherTabela("select *from usuarios order by usu_nome");
        } else{
            mod.setUsuCod(Integer.parseInt(jTextFieldCod.getText()));
             mod.setUsuNome(jTextFieldUsuario.getText());
            mod.setUsuTipo((String) jComboBoxTipo.getSelectedItem());
            mod.setUsuSenha(jPasswordFieldSenha.getText());
            dao.alterar(mod);
            jTextFieldUsuario.setText("");
            jPasswordFieldSenha.setText("");
            jPasswordFieldConfirmarSenha.setText("");
            jTextFieldCod.setText("");

            jButtonNovo.setEnabled(true);
            jComboBoxTipo.setEnabled(false);
            jTextFieldUsuario.setEnabled(false);
            jPasswordFieldConfirmarSenha.setEnabled(false);
            jPasswordFieldSenha.setEnabled(false);
            jButtonSalvar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jButtonAlterar.setEnabled(false);
            preencherTabela("select *from usuarios order by usu_nome");
        }   
        }else{
            JOptionPane.showMessageDialog(null, "Senhas diferentes, por favor digite novamente");
            jPasswordFieldSenha.requestFocus();
            jPasswordFieldConfirmarSenha.setText("");
            jPasswordFieldSenha.setText("");
            
        }
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        try{ 
            mod.setUsuPesquisa(jTextFieldPesquisar.getText());
            BeansUsuario model = dao.buscaUsuario(mod);
            jTextFieldUsuario.setText(model.getUsuNome());
            jPasswordFieldSenha.setText(model.getUsuSenha());
            jPasswordFieldConfirmarSenha.setText((model.getUsuSenha()));
            jTextFieldCod.setText(String.valueOf(model.getUsuCod()));
            jComboBoxTipo.setSelectedItem(model.getUsuTipo());
            jButtonExcluir.setEnabled(true);
            jButtonAlterar.setEnabled(true);
            jButtonCancelar.setEnabled(true);
            jButtonNovo.setEnabled(false);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Usuario nao encontrado");
            jButtonAlterar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            jButtonExcluir.setEnabled(false);
            jTextFieldUsuario.setText("");
            jPasswordFieldSenha.setText("");
            jPasswordFieldConfirmarSenha.setText("");
            jTextFieldCod.setText("");
        }
 
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        flag =2;
        jTextFieldUsuario.setEnabled(true);
        jComboBoxTipo.setEnabled(true);
        jPasswordFieldSenha.setEnabled(true);
        jPasswordFieldConfirmarSenha.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonExcluir.setEnabled(false);
        jButtonAlterar.setEnabled(false);
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int resposta = 0;
        resposta= JOptionPane.showConfirmDialog(rootPane, "Deseja realmente exlcuir?");
        if(resposta == JOptionPane.YES_OPTION){
            mod.setUsuCod(Integer.parseInt(jTextFieldCod.getText()));
            dao.excluir(mod);
            jTextFieldUsuario.setText("");
            jPasswordFieldSenha.setText("");
            jPasswordFieldConfirmarSenha.setText("");
            jTextFieldCod.setText("");
            jButtonAlterar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            jButtonExcluir.setEnabled(false);
            preencherTabela("select *from usuarios order by usu_nome");
            
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTextFieldCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodActionPerformed

    private void jTableUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsuarioMouseClicked
        String nome_usuario = ""+jTableUsuario.getValueAt(jTableUsuario.getSelectedRow(), 1);
        conex.conexao();
        conex.executaSql("select *from usuarios where usu_nome='"+nome_usuario+"'");
        try {
            conex.rs.first();
            jTextFieldCod.setText(String.valueOf(conex.rs.getInt("usu_cod")));
            jTextFieldUsuario.setText(conex.rs.getString("usu_nome"));
            jComboBoxTipo.setSelectedItem(conex.rs.getString("usu_tipo"));
            jPasswordFieldSenha.setText(conex.rs.getString("usu_senha"));
            jPasswordFieldConfirmarSenha.setText(conex.rs.getString("usu_senha"));
            jButtonAlterar.setEnabled(true);
            jButtonExcluir.setEnabled(true);
            jButtonNovo.setEnabled(false);
            jButtonCancelar.setEnabled(true);
            jButtonSalvar.setEnabled(false);
            jTextFieldUsuario.setEnabled(false);
            jPasswordFieldConfirmarSenha.setEnabled(false);
            jPasswordFieldSenha.setEnabled(false);
            jComboBoxTipo.setEnabled(false);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar os dados do usuario!"+ ex);
        }
        conex.desconecta();
        
        
    }//GEN-LAST:event_jTableUsuarioMouseClicked

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTextFieldUsuario.setEnabled(!true);
        jComboBoxTipo.setEnabled(!true);
        jPasswordFieldSenha.setEnabled(!true);
        jPasswordFieldConfirmarSenha.setEnabled(!true);
        jButtonSalvar.setEnabled(!true);
        jButtonCancelar.setEnabled(!true);
        jTextFieldPesquisar.setEnabled(!false);
        jButtonBuscar.setEnabled(!false);
        jButtonNovo.setEnabled(true);
        jButtonExcluir.setEnabled(false);
        jButtonAlterar.setEnabled(false);
        
        jTextFieldUsuario.setText("");
        jPasswordFieldSenha.setText("");
        jPasswordFieldConfirmarSenha.setText("");
        jTextFieldCod.setText("");
    }//GEN-LAST:event_jButtonCancelarActionPerformed
    
    public void preencherTabela(String Sql){
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID","Usuario","Senha","Tipo"};
        conex.conexao();
        conex.executaSql(Sql);
        try{
            conex.rs.first();
            do{
                 dados.add(new Object[]{conex.rs.getInt("usu_cod"),conex.rs.getString("usu_nome"),conex.rs.getString("usu_senha"),conex.rs.getString("usu_tipo")});
            }while(conex.rs.next());
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher a tabela de usuarios"+ex);
        }
        
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTableUsuario.setModel(modelo);
        jTableUsuario.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTableUsuario.getColumnModel().getColumn(0).setResizable(false);
        jTableUsuario.getColumnModel().getColumn(1).setPreferredWidth(220);
        jTableUsuario.getColumnModel().getColumn(1).setResizable(false);
        jTableUsuario.getColumnModel().getColumn(2).setPreferredWidth(110);
        jTableUsuario.getColumnModel().getColumn(2).setResizable(false);
        jTableUsuario.getColumnModel().getColumn(3).setPreferredWidth(115);
        jTableUsuario.getColumnModel().getColumn(3).setResizable(false);
        jTableUsuario.getTableHeader().setReorderingAllowed(false);
        jTableUsuario.setAutoResizeMode(jTableUsuario.AUTO_RESIZE_OFF);// tabela nao vai poder se redimensionada
        jTableUsuario.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//selecionar um por vez
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
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldConfirmarSenha;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUsuario;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldPesquisar;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}