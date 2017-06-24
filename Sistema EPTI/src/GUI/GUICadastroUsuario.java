
package GUI;

import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.PermissoesVO;
import modelo.UsuarioVO;
import servicos.PermissoesServicos;
import servicos.ServicosFactory;
import servicos.UsuarioServicos;
import utilidades.Criptografia;
import utilidades.Tratamento;
import utilidades.Validacao;

/**
 * @author Maikel Maciel Rönnau
 * @since 1.0
 * @version 10/01/2015
 */
public class GUICadastroUsuario extends javax.swing.JInternalFrame {

    //Instanciando objeto das classes base:
    UsuarioVO user = new UsuarioVO();
    PermissoesVO per = new PermissoesVO();
    
    /**
     * Creates new form GUICadastroUsuario
     */
    public GUICadastroUsuario() {
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

        jlCadastrarUsuario = new javax.swing.JLabel();
        jlNome = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jlLogin = new javax.swing.JLabel();
        jpSenha = new javax.swing.JPasswordField();
        jtLogin = new javax.swing.JTextField();
        jlSenha = new javax.swing.JLabel();
        jcRealizarManutencao = new javax.swing.JCheckBox();
        jcEditarPermissoes = new javax.swing.JCheckBox();
        jSeparator = new javax.swing.JSeparator();
        jlPermissoesDoUsuario = new javax.swing.JLabel();
        jcCadastrarComputador = new javax.swing.JCheckBox();
        jcConsultarComputador = new javax.swing.JCheckBox();
        jcEditarComputador = new javax.swing.JCheckBox();
        jcExcluirComputador = new javax.swing.JCheckBox();
        jcCadastrarSecretaria = new javax.swing.JCheckBox();
        jcConsultarSecretaria = new javax.swing.JCheckBox();
        jcEditarSecretaria = new javax.swing.JCheckBox();
        jcExcluirSecretaria = new javax.swing.JCheckBox();
        jcCadastrarSetor = new javax.swing.JCheckBox();
        jcConsultarSetor = new javax.swing.JCheckBox();
        jcEditarSetor = new javax.swing.JCheckBox();
        jcExcluirSetor = new javax.swing.JCheckBox();
        jcCadastrarUsuario = new javax.swing.JCheckBox();
        jcConsultarUsuario = new javax.swing.JCheckBox();
        jcEditarUsuario = new javax.swing.JCheckBox();
        jcExcluirUsuario = new javax.swing.JCheckBox();
        jbCadastar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jpRepetir = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de usuários");

        jlCadastrarUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlCadastrarUsuario.setText("Cadastrar usuário");

        jlNome.setText("Nome:");

        jlLogin.setText("Login:");

        jlSenha.setText("Senha:");

        jcRealizarManutencao.setText("Realizar manutenção");

        jcEditarPermissoes.setText("Editar permissões");

        jSeparator.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jlPermissoesDoUsuario.setText("Permissões do usuário");

        jcCadastrarComputador.setText("Cadastrar computador");

        jcConsultarComputador.setText("Consultar computador");

        jcEditarComputador.setText("Editar computador");

        jcExcluirComputador.setText("Excluir computador");

        jcCadastrarSecretaria.setText("Cadastrar secretaria");

        jcConsultarSecretaria.setText("Consultar secretaria");

        jcEditarSecretaria.setText("Editar secretaria");

        jcExcluirSecretaria.setText("Excluir secretaria");

        jcCadastrarSetor.setText("Cadastrar setor");

        jcConsultarSetor.setText("Consultar setor");

        jcEditarSetor.setText("Editar setor");

        jcExcluirSetor.setText("Excluir setor");

        jcCadastrarUsuario.setText("Cadastrar usuário");

        jcConsultarUsuario.setText("Consultar usuário");

        jcEditarUsuario.setText("Editar usuário");

        jcExcluirUsuario.setText("Excluir usuário");

        jbCadastar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/confirmar.png"))); // NOI18N
        jbCadastar.setText("Cadastrar");
        jbCadastar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastarActionPerformed(evt);
            }
        });
        jbCadastar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbCadastarKeyPressed(evt);
            }
        });

        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cancelar.png"))); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        jbCancelar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbCancelarKeyPressed(evt);
            }
        });

        jLabel1.setText("Repetir:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jlCadastrarUsuario))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlNome)
                                    .addComponent(jlLogin)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jlSenha))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jpRepetir)
                                                .addComponent(jpSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                            .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jcEditarPermissoes)
                                        .addGap(18, 18, 18)
                                        .addComponent(jcRealizarManutencao)))))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbCadastar)
                        .addGap(18, 18, 18)
                        .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)))
                .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlPermissoesDoUsuario)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcCadastrarComputador)
                            .addComponent(jcConsultarComputador)
                            .addComponent(jcEditarComputador)
                            .addComponent(jcExcluirComputador)
                            .addComponent(jcCadastrarSetor)
                            .addComponent(jcConsultarSetor)
                            .addComponent(jcEditarSetor)
                            .addComponent(jcExcluirSetor))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcCadastrarUsuario)
                            .addComponent(jcConsultarUsuario)
                            .addComponent(jcEditarUsuario)
                            .addComponent(jcExcluirUsuario)
                            .addComponent(jcCadastrarSecretaria)
                            .addComponent(jcConsultarSecretaria)
                            .addComponent(jcEditarSecretaria)
                            .addComponent(jcExcluirSecretaria))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jlPermissoesDoUsuario)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jcCadastrarSecretaria)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jcConsultarSecretaria)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jcEditarSecretaria)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jcExcluirSecretaria))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jcCadastrarComputador)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jcConsultarComputador)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jcEditarComputador)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jcExcluirComputador)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jcCadastrarSetor)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jcConsultarSetor)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jcEditarSetor)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jcExcluirSetor))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jcCadastrarUsuario)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jcConsultarUsuario)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jcEditarUsuario)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jcExcluirUsuario))))
                        .addComponent(jSeparator))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlCadastrarUsuario)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlNome)
                            .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlLogin)
                            .addComponent(jtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlSenha)
                            .addComponent(jpSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jpRepetir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcEditarPermissoes)
                            .addComponent(jcRealizarManutencao))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbCadastar)
                            .addComponent(jbCancelar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*** Métodos da classe ****************************************************/
    
    /**
     * @author Maikel Maciel Rönnau
     * @since 1.0
     * @version 10/01/2015
     */
    private void cadastrar(){
        
        try {

            //Recebendo dados da interface:
            Validacao.validarNomeProprio(jtNome.getText());
            Validacao.validarLogin(jtLogin.getText());
            Validacao.validarSenha(new String(jpSenha.getPassword()), new String(jpRepetir.getPassword()));
            
            /*** Verificando permissões do usuário ****************************/
            
            if(jcCadastrarComputador.isSelected()){
                per.setCadastrarComputador((byte)1);
            }//Fecha if.
            
            if(jcConsultarComputador.isSelected()){
                per.setConsultarComputador((byte)1);
            }//Fecha if.
            
            if(jcEditarComputador.isSelected()){
                per.setEditarComputador((byte)1);
            }//Fecha if.
            
            if(jcExcluirComputador.isSelected()){
                per.setExcluirComputador((byte)1);
            }//Fecha if.
            
            if(jcCadastrarSecretaria.isSelected()){
                per.setCadastrarSecretaria((byte)1);
            }//Fecha if.
            
            if(jcConsultarSecretaria.isSelected()){
                per.setConsultarSecretaria((byte)1);
            }//Fecha if.
            
            if(jcEditarSecretaria.isSelected()){
                per.setEditarSecretaria((byte)1);
            }//Fecha if.
            
            if(jcExcluirSecretaria.isSelected()){
                per.setExcluirSecretaria((byte)1);
            }//Fecha if.
            
            if(jcCadastrarSetor.isSelected()){
                per.setCadastrarSetor((byte)1);
            }//Fecha if.
            
            if(jcConsultarSetor.isSelected()){
                per.setConsultarSetor((byte)1);
            }//Fecha if.
            
            if(jcEditarSetor.isSelected()){
                per.setEditarSetor((byte)1);
            }//Fecha if.
            
            if(jcExcluirSetor.isSelected()){
                per.setExcluirSetor((byte)1);
            }//Fecha if.
            
            if(jcCadastrarUsuario.isSelected()){
                per.setCadastrarUsuario((byte)1);
            }//Fecha if.
            
            if(jcConsultarUsuario.isSelected()){
                per.setConsultarUsuario((byte)1);
            }//Fecha if.
            
            if(jcEditarUsuario.isSelected()){
                per.setEditarUsuario((byte)1);
            }//Fecha if.
            
            if(jcExcluirUsuario.isSelected()){
                per.setExcluirUsuario((byte)1);
            }//Fecha if.
            
            if(jcEditarPermissoes.isSelected()){
                per.setEditarPermissoes((byte)1);
            }//Fecha if.
            
            if(jcRealizarManutencao.isSelected()){
                per.setRealizarManutencao((byte)1);
            }//Fecha if.
            
            //Enviando status padrão (ativado):
            user.setStatusUsuario((byte)0);
            
            //Enviando permissões para o usuário:
            user.setPermissoes(per);
            
            //Instanciando objeto para acessar o método de insersão:
            PermissoesServicos ps = ServicosFactory.getPermissoesServicos();
            
            //Cadastrando permissões e recebendo o ID gerado:
            long idPermissao = ps.cadastrarPermissoes(per);

            //Enviando ID para o objeto:
            per.setIdPermissoes(idPermissao);
            
            /*** Fim da verificação de permissões do usuário ******************/
            
            //Enviando informações para o objeto:
            user.setNomeUsuario(Tratamento.converterInicialDeCadaPalavraMaiucula(jtNome.getText().toLowerCase()));
            user.setLoginUsuario(jtLogin.getText().toLowerCase());
            user.setSenhaUsuario(Criptografia.criptografarSenha(new String(jpSenha.getPassword())));
            user.setPermissoes(per);
            
            //Instanciando objeto para acessar o método de insersão:
            UsuarioServicos us = ServicosFactory.getUsuarioServicos();
            
            //Cadastrando usuário:
            us.cadastrarUsuario(user);
            
            //Mensagem de confirmação:
            JOptionPane.showMessageDialog(
                this,
                "Usuário cadastrado com sucesso!",
                "Cadastro concluído",
                JOptionPane.INFORMATION_MESSAGE);
            //Fim da mensagem de confirmação.
            
            //Fechando janela:
            cancelar();
        } catch (SQLException e) {
            
            //Mensagem de erro:
            JOptionPane.showMessageDialog(
                this,
                "Falha ao atualizar usuário! "
              + "\n\nNome ou login já cadastrados.",
                "Erro",
                JOptionPane.WARNING_MESSAGE);
            //Fim da mensagem de erro.
        } catch (Exception e) {
            
            //Mensagem de erro:
            JOptionPane.showMessageDialog(
                this,
                e.getMessage(),
                "Erro",
                JOptionPane.WARNING_MESSAGE);
            //Fim da mensagem de erro.
        }//Fecha catch.
    }//Fecha método cadastrar.
    
    /**
     * @author Maikel Maciel Rönnau
     * @version 1.0
     * @since 06/01/2015
     */
    private void cancelar(){
        
        //Fechando a janela:
        dispose();
    }//Fecha método cancelar.
    
    /*** Fim dos métodos da classe ********************************************/
    
    private void jbCadastarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastarActionPerformed
        
        //Método cadastar:
        cadastrar();
    }//GEN-LAST:event_jbCadastarActionPerformed

    private void jbCadastarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbCadastarKeyPressed
        
        //Verificando se o usuário utilizou o teclado para selecionar a opção:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            cadastrar();
        }//Fecha if.
    }//GEN-LAST:event_jbCadastarKeyPressed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        
        //Método cancelar:
        cancelar();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbCancelarKeyPressed
        
        //Verificando se o usuário utilizou o teclado para selecionar a opção:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            cancelar();
        }//Fecha if.
    }//GEN-LAST:event_jbCancelarKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JButton jbCadastar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JCheckBox jcCadastrarComputador;
    private javax.swing.JCheckBox jcCadastrarSecretaria;
    private javax.swing.JCheckBox jcCadastrarSetor;
    private javax.swing.JCheckBox jcCadastrarUsuario;
    private javax.swing.JCheckBox jcConsultarComputador;
    private javax.swing.JCheckBox jcConsultarSecretaria;
    private javax.swing.JCheckBox jcConsultarSetor;
    private javax.swing.JCheckBox jcConsultarUsuario;
    private javax.swing.JCheckBox jcEditarComputador;
    private javax.swing.JCheckBox jcEditarPermissoes;
    private javax.swing.JCheckBox jcEditarSecretaria;
    private javax.swing.JCheckBox jcEditarSetor;
    private javax.swing.JCheckBox jcEditarUsuario;
    private javax.swing.JCheckBox jcExcluirComputador;
    private javax.swing.JCheckBox jcExcluirSecretaria;
    private javax.swing.JCheckBox jcExcluirSetor;
    private javax.swing.JCheckBox jcExcluirUsuario;
    private javax.swing.JCheckBox jcRealizarManutencao;
    private javax.swing.JLabel jlCadastrarUsuario;
    private javax.swing.JLabel jlLogin;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlPermissoesDoUsuario;
    private javax.swing.JLabel jlSenha;
    private javax.swing.JPasswordField jpRepetir;
    private javax.swing.JPasswordField jpSenha;
    private javax.swing.JTextField jtLogin;
    private javax.swing.JTextField jtNome;
    // End of variables declaration//GEN-END:variables
}