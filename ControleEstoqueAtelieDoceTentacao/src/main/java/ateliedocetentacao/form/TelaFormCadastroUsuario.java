/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ateliedocetentacao.form;

import ateliedocetentacao.model.Dados;
import ateliedocetentacao.model.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author 202203206631
 */
public class TelaFormCadastroUsuario extends javax.swing.JFrame {
    private Dados msDados;
    private int usuAtual = 0;
    private boolean novo = false;
    
    public void setDados(Dados msDados) {
        this.msDados = msDados;
    }
    
    public TelaFormCadastroUsuario() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCadIdUsuario = new javax.swing.JTextField();
        txtCadNome = new javax.swing.JTextField();
        txtCadEmail = new javax.swing.JTextField();
        txtCadUsername = new javax.swing.JTextField();
        txtCadSenha = new javax.swing.JPasswordField();
        txtCadConfSenha = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        cmbCadPerfil = new javax.swing.JComboBox<>();
        btnCadCriar = new javax.swing.JButton();
        btnCadSalvar = new javax.swing.JButton();
        btnCadCancelar = new javax.swing.JButton();
        btnCadVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Usuario");
        setBackground(new java.awt.Color(255, 204, 204));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("ID Usuario :");

        jLabel2.setBackground(new java.awt.Color(255, 204, 204));
        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("Nome :");

        jLabel3.setBackground(new java.awt.Color(255, 204, 204));
        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("Email :");

        jLabel4.setBackground(new java.awt.Color(255, 204, 204));
        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setText("Nome de Usuario :");

        jLabel5.setBackground(new java.awt.Color(255, 204, 204));
        jLabel5.setForeground(new java.awt.Color(255, 102, 102));
        jLabel5.setText("Senha:");

        jLabel7.setBackground(new java.awt.Color(255, 204, 204));
        jLabel7.setForeground(new java.awt.Color(255, 102, 102));
        jLabel7.setText("Confirmar Senha:");

        txtCadIdUsuario.setEnabled(false);

        txtCadNome.setEnabled(false);

        txtCadEmail.setEnabled(false);

        txtCadUsername.setEnabled(false);

        txtCadSenha.setEnabled(false);

        txtCadConfSenha.setEnabled(false);

        jLabel6.setBackground(new java.awt.Color(255, 204, 204));
        jLabel6.setForeground(new java.awt.Color(255, 102, 102));
        jLabel6.setText("Perfil :");

        cmbCadPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Administrador", "Funcionario" }));
        cmbCadPerfil.setEnabled(false);

        btnCadCriar.setText("Criar");
        btnCadCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadCriarActionPerformed(evt);
            }
        });

        btnCadSalvar.setText("Salvar");
        btnCadSalvar.setEnabled(false);
        btnCadSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadSalvarActionPerformed(evt);
            }
        });

        btnCadCancelar.setText("Cancelar");
        btnCadCancelar.setEnabled(false);
        btnCadCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadCancelarActionPerformed(evt);
            }
        });

        btnCadVoltar.setText("Voltar");
        btnCadVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCadNome, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCadIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(cmbCadPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCadConfSenha)
                                    .addComponent(txtCadSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnCadSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCadCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtCadUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtCadEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(btnCadCriar)
                .addGap(18, 18, 18)
                .addComponent(btnCadVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCadIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cmbCadPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCadNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCadEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCadUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCadSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCadConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadSalvar)
                    .addComponent(btnCadCancelar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadCriar)
                    .addComponent(btnCadVoltar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadCriarActionPerformed
        btnCadCriar.setEnabled(false);
        btnCadSalvar.setEnabled(true);
        btnCadCancelar.setEnabled(true);
        cmbCadPerfil.setEnabled(true);
        btnCadVoltar.setEnabled(false);
        //Caixa de texto
        txtCadIdUsuario.setEnabled(true);
        txtCadNome.setEnabled(true);
        txtCadEmail.setEnabled(true);
        txtCadUsername.setEnabled(true);
        txtCadSenha.setEnabled(true);
        txtCadConfSenha.setEnabled(true);
        //limpar caixas de texto
        txtCadIdUsuario.setText("");
        txtCadNome.setText("");
        txtCadEmail.setText("");
        txtCadUsername.setText("");
        txtCadSenha.setText("");
        txtCadConfSenha.setText("");
        cmbCadPerfil.setSelectedIndex(0);
        novo = true;
        txtCadIdUsuario.requestFocus();
        
    }//GEN-LAST:event_btnCadCriarActionPerformed

    private void btnCadSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadSalvarActionPerformed
        if (txtCadIdUsuario.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"Favor inserir um numero de ID");
            txtCadIdUsuario.requestFocusInWindow();
            return;
        }
        if (cmbCadPerfil.getSelectedIndex()== 0){
            JOptionPane.showMessageDialog(rootPane,"Favor selecione um Perfil");
            cmbCadPerfil.requestFocusInWindow();
            return;
        }
        if (txtCadNome.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"Favor inserir um Nome");
            txtCadNome.requestFocusInWindow();
            return;
        }
        if (txtCadEmail.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"Favor inserir um Email");
            txtCadEmail.requestFocusInWindow();
            return;
        }
        if (txtCadUsername.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"Favor inserir um Username");
            txtCadUsername.requestFocusInWindow();
            return;
        }
        
        String senha = new String(txtCadSenha.getPassword());
        String confsenha = new String(txtCadConfSenha.getPassword());
        
        if (senha.equals("")){
            JOptionPane.showMessageDialog(rootPane,"Favor inserir uma Senha");
            txtCadSenha.requestFocusInWindow();
            return;
        }
        if (confsenha.equals("")){
            JOptionPane.showMessageDialog(rootPane,"Favor inserir uma Confirmação de Senha");
            txtCadConfSenha.requestFocusInWindow();
            return;
        }
        
        if(!senha.equals(confsenha)){
            JOptionPane.showMessageDialog(rootPane,"A sua senha está diferente");
            txtCadSenha.requestFocusInWindow();
            return;
        }
        int pos = msDados.posicaoUsuario(txtCadIdUsuario.getText());
        if(novo){
            if(pos!=-1){
                JOptionPane.showMessageDialog(rootPane,"Este Usuario Ja Existe");
                txtCadIdUsuario.requestFocusInWindow();
                return;
            }    
            }else{
                if(pos == -1){
                    JOptionPane.showMessageDialog(rootPane,"Este Usuario Ainda Não Existe");
                    txtCadIdUsuario.requestFocusInWindow();
                    return;
                }
            }
        Usuario msUsuario = new Usuario(txtCadIdUsuario.getText(), txtCadNome.getText(), txtCadEmail.getText(), txtCadUsername.getText(), senha, cmbCadPerfil.getSelectedIndex());
        String msg = msDados.adicionarUsuario(msUsuario);
        JOptionPane.showMessageDialog(rootPane, msg);
        

        btnCadCriar.setEnabled(true);
        btnCadSalvar.setEnabled(false);
        btnCadCancelar.setEnabled(false);
        cmbCadPerfil.setEnabled(false);
        btnCadVoltar.setEnabled(true);
        //Caixa de texto
        txtCadIdUsuario.setEnabled(false);
        txtCadNome.setEnabled(false);
        txtCadEmail.setEnabled(false);
        txtCadUsername.setEnabled(false);
        txtCadSenha.setEnabled(false);
        txtCadConfSenha.setEnabled(false);
    }//GEN-LAST:event_btnCadSalvarActionPerformed

    private void btnCadCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadCancelarActionPerformed
        btnCadCriar.setEnabled(true);
        btnCadSalvar.setEnabled(false);
        btnCadCancelar.setEnabled(false);
        cmbCadPerfil.setEnabled(false);
        btnCadVoltar.setEnabled(true);
        //Caixa de texto
        txtCadIdUsuario.setEnabled(false);
        txtCadNome.setEnabled(false);
        txtCadEmail.setEnabled(false);
        txtCadUsername.setEnabled(false);
        txtCadSenha.setEnabled(false);
        txtCadConfSenha.setEnabled(false);
        //limpar caixas de texto
        txtCadIdUsuario.setText("");
        txtCadNome.setText("");
        txtCadEmail.setText("");
        txtCadUsername.setText("");
        txtCadSenha.setText("");
        txtCadConfSenha.setText("");
        cmbCadPerfil.setSelectedIndex(0);
    }//GEN-LAST:event_btnCadCancelarActionPerformed

    private void btnCadVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadVoltarActionPerformed
        this.dispose();
        TelaFormLogin frmLogin = new TelaFormLogin();
        frmLogin.setDados(msDados);
        frmLogin.setVisible(true);
        
    }//GEN-LAST:event_btnCadVoltarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(TelaFormCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFormCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFormCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFormCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFormCadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadCancelar;
    private javax.swing.JButton btnCadCriar;
    private javax.swing.JButton btnCadSalvar;
    private javax.swing.JButton btnCadVoltar;
    private javax.swing.JComboBox<String> cmbCadPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField txtCadConfSenha;
    private javax.swing.JTextField txtCadEmail;
    private javax.swing.JTextField txtCadIdUsuario;
    private javax.swing.JTextField txtCadNome;
    private javax.swing.JPasswordField txtCadSenha;
    private javax.swing.JTextField txtCadUsername;
    // End of variables declaration//GEN-END:variables
}
