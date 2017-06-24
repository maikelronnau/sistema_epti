
package GUI;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import modelo.UsuarioVO;
import servicos.UsuarioServicos;
import servicos.ServicosFactory;
import utilidades.Login;

/**
 * @author Maikel Maciel Rönnau
 * @version 1.0
 * @since 11/01/2015
 */
public class GUILogin extends javax.swing.JFrame {

    //Variável para contar as tentativas do usuário:
    static byte tentativas = 5;
    
    //Variáveis para receber as informações do banco de dados:
    public static String endereco;// = "localhost";
    public static String banco;// = "epti";
    public static String usuario;// = "root";
    public static String senha;// = "root";
    
    /**
     * Creates new form GUILogin
     */
    public GUILogin() {
        
        //Definindo ícone:
        definirIcone();
        
        //Selecionando Look&Feel:
        selecionarLookAndFeel();
        
        initComponents();
        
        //Verificando configurações de banco de dados:
        buscarInformacoesBancoDeDados();
        
        //Método para verificar se o usuário tem um login a ser lembrado:
        buscarLoginLembrado();
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
        jlSistemaEPTI = new javax.swing.JLabel();
        jlLogin = new javax.swing.JLabel();
        jtLogin = new javax.swing.JTextField();
        jlSenha = new javax.swing.JLabel();
        jbEntrar = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jlIcone = new javax.swing.JLabel();
        jlMensagemAviso = new javax.swing.JLabel();
        jpSenha = new javax.swing.JPasswordField();
        jcLembraLogin = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(255, 255, 255));

        jlSistemaEPTI.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlSistemaEPTI.setText("Sistema EPTI");

        jlLogin.setText("Login:");

        jtLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtLoginKeyPressed(evt);
            }
        });

        jlSenha.setText("Senha:");

        jbEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/confirmar.png"))); // NOI18N
        jbEntrar.setText("Entrar");
        jbEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEntrarActionPerformed(evt);
            }
        });
        jbEntrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbEntrarKeyPressed(evt);
            }
        });

        jbSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cancelar.png"))); // NOI18N
        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });
        jbSair.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbSairKeyPressed(evt);
            }
        });

        jlIcone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/login.png"))); // NOI18N

        jlMensagemAviso.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlMensagemAviso.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jpSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jpSenhaKeyPressed(evt);
            }
        });

        jcLembraLogin.setText("Lembrar meu login");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlSistemaEPTI)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlSenha)
                                    .addComponent(jlLogin))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcLembraLogin)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jtLogin, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jpSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(25, 25, 25)
                        .addComponent(jlIcone)
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jbEntrar)
                        .addGap(18, 18, 18)
                        .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(216, 216, 216))
                    .addComponent(jlMensagemAviso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlSistemaEPTI)
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlLogin)
                            .addComponent(jtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlSenha)
                            .addComponent(jpSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcLembraLogin))
                    .addComponent(jlIcone, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEntrar)
                    .addComponent(jbSair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlMensagemAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /*** Métodos da classe ****************************************************/
    
    /**
     * @author Maikel Maciel Rönnau
     * @version 1.0
     * @since 05/01/2015
     */
    private void selecionarLookAndFeel(){
        
        /*** Selecionando Look & Feel *****************************************/
        
        try {
            
            //Selecionando Look & Feel:
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            
            JOptionPane.showMessageDialog(
                this,
                "Erro ao inicializar interface. Procure o administrador do sistema "
              + "para resolver este problema.",
                "Erro",
                JOptionPane.ERROR);
            //Fim da mensagem de erro.
        }//Fecha catch.
        
        /*** Fim da seleção do Look & Feel ************************************/
    }//Fecha método selecionarLookAndFeel.
    
    /**
     * @author Maikel Maciel Rönnau
     * @version 1.0
     * @since 12/04/2014
     */
    private void definirIcone(){
        
        //Criando objeto com a imagem:
        ImageIcon icon = new ImageIcon(this.getClass().getResource("/icones/icone_sistema.png"));
        
        //Definindo imagem:
        setIconImage(icon.getImage());
    }//Fecha método definirIcone.
    
    /**
     * @author Maikel Maciel Rönnau
     * @version 1.0
     * @since 03/02/2014
     */
    private void buscarInformacoesBancoDeDados(){
        
        try {
            
            //Instanciando arquivo:
            File file = new File("database/database_path.txt");
            
            //Verificando se o arquivo existe:
            if(file.exists()){
            
                //Instanciando Scanner para leitura do arquivo:
                Scanner scanner = new Scanner(new FileReader("database/database_path.txt")).useDelimiter("\\||\\n");

                //Lendo informações do banco de dados:
                endereco = scanner.next();
                banco = scanner.next()+scanner.next();
                usuario = scanner.next()+scanner.next()+scanner.next();
                senha = scanner.next();
            } else {
                
                //Mensagem de erro:
                JOptionPane.showMessageDialog(
                    this,
                    "O arquivo de configuração do banco de dados não foi encontrado. Execute o"
                  + "utilitario de configuração do banco de dados para restaurá-lo.",
                    "Arquivo não encontrado",
                    JOptionPane.ERROR_MESSAGE);
                //Fim da menagem de erro.
                
                //Fechando sistema:
                System.exit(EXIT_ON_CLOSE);
            }//Fecha else.
        } catch (FileNotFoundException | HeadlessException e) {
            
            //Mensagem de erro:
            JOptionPane.showMessageDialog(
                this,
                "Falha ao verificar arquivo de banco de dados!",
                "Erro",
                JOptionPane.ERROR_MESSAGE);
            //Fim da mensagem de erro.
        }//Fecha catch.
    }//Fecha método buscarInformacoesBancoDeDados.
    
    /**
     * @author Maikel Maciel Rönnau
     * @version 1.0
     * @since 04/02/2014
     */
    private void buscarLoginLembrado(){
        
        try {
            
            //Instanciando arquivo:
            File file = new File("remembered_login.txt");
            
            //Verificando se o arquivo existe:
            if(file.exists()){
                
                //Instanciando Scanner para leitura do arquivo:
                Scanner scanner = new Scanner(new FileReader("remembered_login.txt")).useDelimiter("\\||\\n");
                
                //Lendo informações:
                String verificador = scanner.next();
                String login = scanner.next()+scanner.next();
                
                //Verificando se o login deve ser lembrado:
                if(verificador.equals("true")){
                    
                    //Enviando login lembrado para a interface:
                    jtLogin.setText(login);
                    
                    //Marcando caixa de seleção:
                    jcLembraLogin.setSelected(true);
                }//Fecha else.
            } else {
                
                /*** Criando arquivo de configuração do banco de dados ********/
                
                //Criando novo arquivo:
                FileWriter fl = new FileWriter(new File("remembered_login.txt"));

                //Escrevendo informações:
                fl.write("false||login_forgot");

                //Fechando arquivo:
                fl.close();
            }//Fecha else.
        } catch (IOException e) {
            
            /*
                Não deve lançar nada.
            */
        }//Fecha catch.        
    }//Fecha método buscarLoginLembrado.
    
    /**
     * @author Maikel Maciel Rönnau
     * @version 1.0
     * @since 04/02/2014
     */
    private void lembrarEsquecerLogin(){
        
        try {
            
            //Verificando se o usuário deseja lembrar o esquecer o login:
            if(jcLembraLogin.isSelected()){

                /*** Sobreescrevendo arquivo para lembrar login *******************/

                //Criando novo arquivo:
                FileWriter fl = new FileWriter(new File("remembered_login.txt"));

                //Escrevendo informações:
                fl.write("true||"+jtLogin.getText());

                //Fechando arquivo:
                fl.close();
            } else {
                
                /*** Sobreescrevendo arquivo para esquecer login *******************/

                //Criando novo arquivo:
                FileWriter fl = new FileWriter(new File("remembered_login.txt"));

                //Escrevendo informações:
                fl.write("false||login_forgot");

                //Fechando arquivo:
                fl.close();
            }//Fecha else.
        } catch (IOException e) {
            
            /*
                Não deve lançar nada.
            */
        }//Fecha catch.
    }//Fecha método lembrarEsquecerLogin.
    
    /**
     * @author Maikel Maciel Rönnau
     * @version 1.0
     * @since 12/04/2014
     */
    private void logar(){
        
        //Variável para receber a senha:
        String senha = new String(jpSenha.getPassword());
        
        //Verificando se o usuário preencheu os campos:
        if(jtLogin.getText().isEmpty() | senha.isEmpty()){
        
            //Enviando mensagem para o usuário:
            jlMensagemAviso.setText("Preencha todos os campos para efetuar login!");
        } else {
        
            try {
        
                //Instanciando objeto para acessar o método de busca:
                UsuarioServicos us = ServicosFactory.getUsuarioServicos();
        
                //ArrayList para receber os dados da busca:
                ArrayList<UsuarioVO> usuario;
        
                //Filtrando usuário:
                usuario = us.buscarUsuarioParaLogin(jtLogin.getText().toLowerCase());
        
                //Verificando se retornou algum resultado:
                if(usuario.isEmpty()){
        
                    //Decrementando tentativas:
                    tentativas--;
        
                    //Enviando menssagem para o usuário:
                    jlMensagemAviso.setText("Login ou senha inválidos! Apenas " + tentativas + " tentativas restantes.");
        
                    //Redirecionando foco:
                    jtLogin.grabFocus();
                    
                    //Verificando se as tentativas esgotaram:
                    if(tentativas == 0){

                        //Fechando sistema:
                        System.exit(EXIT_ON_CLOSE);
                    }//Fecha if.
                } else {

                    /*
                     Verificando se a senha está correta. Se estiver, o algoritmo
                     criará o objeto principal do sistema (GUIMenu) e enviará pelo
                     construtor as permissões do usuário.
                     */
                    if (!Login.validarSenha(usuario.get(0).getSenhaUsuario(), senha)) {

                        //Decrementando tentativas:
                        tentativas--;

                        //Enviando menssagem para o usuário:
                        jlMensagemAviso.setText("Senha inválida! Apenas " + tentativas + " tentativas restantes.");

                        //Redirecionando foco:
                        jtLogin.grabFocus();

                        //Verificando se as tentativas esgotaram:
                        if (tentativas == 0) {

                            //Fechando sistema:
                            System.exit(EXIT_ON_CLOSE);
                        }//Fecha if.
                    } else {

                        //Verificando se o usuário está ativado:
                        if(usuario.get(0).getStatusUsuario() == 0){

                            //Decrementando tentativas:
                            tentativas--;

                            //Enviando menssagem para o usuário:
                            jlMensagemAviso.setText("Usuário desativado! Apenas " + tentativas + " tentativas restantes.");

                            //Redirecionando foco:
                            jtLogin.grabFocus();

                            //Verificando se as tentativas esgotaram:
                            if(tentativas == 0){

                                //Fechando sistema:
                                System.exit(EXIT_ON_CLOSE);
                            }//Fecha if.
                        } else {
                            
                            //Verificando se o sistema deve lembrar o login do usuário:
                            lembrarEsquecerLogin();
                            
                            //Instanciando objeto da classe GUIMenu:
                            GUIMenu gm = new GUIMenu(usuario.get(0));

                            //Abrindo sistema:
                            gm.setVisible(true);

                            //Fechando a tela de login:
                            this.dispose();
                        }//Fecha else.
                    }//Fecha else.
                }//Fecha else.
            } catch (SQLException e) {
                
                //Mensagem de erro:
                JOptionPane.showMessageDialog(
                    this,
                    "Falha ao buscar usuário! " + e.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
                //Fim da mensagem de erro.
            } catch (Exception e) {
                
                //Mensagem de erro:
                JOptionPane.showMessageDialog(
                    this,
                    "Falha ao efetuar login!",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
                //Fim da mensagem de erro.
            }//Fecha catch.
        }//Fecha else.        
    }//Fecha método logar.
    
    /**
     * @author Maikel Maciel Rönnau
     * @version 1.0
     * @since 09/01/2015
     */
    private void fecharSistema() {
        
        //Fechando sistema:
        System.exit(EXIT_ON_CLOSE);
    }//Fecha método fecharSistema.
    
    /*** Fim do  métodos da classe ********************************************/
    
    private void jbEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEntrarActionPerformed
        
        //Método logar:
        logar();
    }//GEN-LAST:event_jbEntrarActionPerformed

    private void jbEntrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbEntrarKeyPressed
        
        //Verificando se o usuário utilizou o teclado para selecionar a opção:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            logar();
        }//Fecha if.
    }//GEN-LAST:event_jbEntrarKeyPressed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        
        //Método fecharSistema:
        fecharSistema();
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbSairKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbSairKeyPressed
        
        //Verificando se o usuário utilizou o teclado para selecionar a opção:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            fecharSistema();
        }//Fecha if.
    }//GEN-LAST:event_jbSairKeyPressed

    private void jtLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtLoginKeyPressed
        
        //Verificando se o usuário utilizou o teclado para selecionar a opção:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            logar();
        }//Fecha if.
    }//GEN-LAST:event_jtLoginKeyPressed

    private void jpSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpSenhaKeyPressed
        
        //Verificando se o usuário utilizou o teclado para selecionar a opção:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            logar();
        }//Fecha if.
    }//GEN-LAST:event_jpSenhaKeyPressed

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
            java.util.logging.Logger.getLogger(GUILogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUILogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUILogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUILogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUILogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbEntrar;
    private javax.swing.JButton jbSair;
    private javax.swing.JCheckBox jcLembraLogin;
    private javax.swing.JLabel jlIcone;
    private javax.swing.JLabel jlLogin;
    private javax.swing.JLabel jlMensagemAviso;
    private javax.swing.JLabel jlSenha;
    private javax.swing.JLabel jlSistemaEPTI;
    private javax.swing.JPasswordField jpSenha;
    private javax.swing.JTextField jtLogin;
    // End of variables declaration//GEN-END:variables
}
